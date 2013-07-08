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

public class MuTroposphereWindTxt extends Tplot {

	private BufferedReader bufferedReader;

	public MuTroposphereWindTxt() {
		super(118);
	}

	@Override
	void readData(String arg0) {

		String line;

		try {
			FileReader fileReader = new FileReader("/tmp" + arg0);
			bufferedReader = new BufferedReader(fileReader);

			int n = 0;
			while ((line = bufferedReader.readLine()) != null) {
				if (n == 0) {
					double[] channel = new double[118];
					for (int i = 0; i < 118; i++) {
						channel[i] = Double.parseDouble(line.substring(
								12 + i * 8, 18 + i * 8));
						/*timeSeries[i].setKey("MU Radar Observation Data - "
								+ channel[i] + "km");
								*/
					}
				} else {
					int yyyy = Integer.parseInt(line.substring(0, 4).replace(
							" ", ""));
					int mm = Integer.parseInt(line.substring(5, 7).replace(" ",
							""));
					int dd = Integer.parseInt(line.substring(8, 10).replace(
							" ", ""));
					int hh = Integer.parseInt(line.substring(11, 13).replace(
							" ", ""));
					int min = Integer.parseInt(line.substring(14, 16).replace(
							" ", ""));

					double[] data = new double[118];
					for (int i = 0; i < 118; i++) {
						data[i] = Double.parseDouble(line.substring(17 + i * 8,
								24 + i * 8));
						Second second = new Second(0, min, hh, dd, mm, yyyy);
						this.add(second, data[i], i);
					}
				}
				n++;
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
