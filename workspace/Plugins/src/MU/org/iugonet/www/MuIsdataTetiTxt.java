package org.iugonet.www;

import java.io.BufferedInputStream;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.time.Second;
import org.jfree.data.time.TimeSeriesCollection;

public class MuIsdataTetiTxt extends Tplot {

	private BufferedReader bufferedReader;

	MuIsdataTetiTxt() {
		super(1);
		//timeSeries[0].setKey("MU ionosphere power");
	}

	@Override
	void readData(String arg0) {

		String line;
		Second second = new Second(0, 0, 0, 1, 1, 2000);

		int line_num = 0;
		int numc = 12;
		int channel = 0; // select 0 to numc-1

		double[] ti = new double[numc];
		double[] te = new double[numc];
		int[] icon = new int[numc];
		double[] er_ti = new double[numc];
		double[] er_te = new double[numc];
		double[] er_tr = new double[numc];
		double[] snr = new double[numc];

		try {
			FileReader fileReader = new FileReader("/tmp" + arg0);
			bufferedReader = new BufferedReader(fileReader);

			while ((line = bufferedReader.readLine()) != null) {
				if (line_num == 0) {
					int numd = Integer.parseInt(line.replace(" ", ""));
					// System.out.println(numd);
				} else if (line_num == 1) {
					double[] altitude = new double[numc];
					for (int i = 0; i < numc; i++) {
						altitude[i] = Double.parseDouble(line.substring(7 * i,
								7 * i + 7));
					}
					System.out.println("channel : " + channel);
					System.out
							.println("altitude : " + altitude[channel] + "km");
				} else {
					int ch = (line_num - 2) % (numc + 1) - 1;
					if (ch == -1) {
						int yyyy = Integer.parseInt(line.substring(0, 4));
						int month = Integer.parseInt(line.substring(5, 7));
						int day = Integer.parseInt(line.substring(8, 10));
						int hour = Integer.parseInt(line.substring(11, 13));
						int min = Integer.parseInt(line.substring(14, 16));
						int sec = Integer.parseInt(line.substring(17, 19));
						second = new Second(sec, min, hour, day, month, yyyy);
					} else {
						ti[ch] = Double.parseDouble(line.substring(0, 8)
								.replace(" ", ""));
						te[ch] = Double.parseDouble(line.substring(8, 16)
								.replace(" ", ""));
						icon[ch] = Integer.parseInt(line.substring(16, 20)
								.replace(" ", ""));
						er_ti[ch] = Double.parseDouble(line.substring(20, 28)
								.replace(" ", ""));
						er_te[ch] = Double.parseDouble(line.substring(28, 36)
								.replace(" ", ""));
						er_tr[ch] = Double.parseDouble(line.substring(36, 48)
								.replace(" ", ""));
						snr[ch] = Double.parseDouble(line.substring(48, 60)
								.replace(" ", ""));
						if (icon[ch] != 3 && ch == channel) {
							this.add(second, ti[channel], 0);
						}
					}
				}
				line_num++;
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	void file_http_copy(String arg0, String arg1) {
		// TODO Auto-generated method stub

	}

	public void file_http_copy(String arg0) {
		URL url;
		try {
			url = new URL(arg0);

			String[] strArray = url.getPath().split("/");
			String strDir = "/tmp";
			for (int i = 0; i < strArray.length - 1; i++) {
				strDir = strDir + "/" + strArray[i];
			}

			File fileDir = new File(strDir);

			if (fileDir.exists()) {
				System.out.println(fileDir + "Directory exists.");
			} else {
				if (fileDir.mkdirs()) {
					System.out.println(fileDir.getPath()
							+ " Created directories to store data.");
				} else {
					System.out.println(fileDir.getPath()
							+ " Couldn't created directories to store data.");
				}
			}

			String charset = "UTF-8";

			URLConnection conn = url.openConnection();
			BufferedInputStream bis = new BufferedInputStream(
					conn.getInputStream());
			BufferedReader bufferedReader = new BufferedReader(
					new InputStreamReader(bis, charset));
			FileWriter fileWriter = new FileWriter("/tmp" + url.getPath());
			String line;

			while ((line = bufferedReader.readLine()) != null) {
				fileWriter.write(line + "\n");
			}

			fileWriter.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public ChartPanel getChartPanel() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public JFreeChart getChart() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TimeSeriesCollection loadData(String strUrl) {
		// TODO Auto-generated method stub
		return null;
	}
}
