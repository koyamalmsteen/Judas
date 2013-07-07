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

public class PoesTxt extends Tplot {

	private BufferedReader bufferedReader;

	PoesTxt() {
		super(34);
	}

	@Override
	void readData(String arg0) {

		String line;
		String[] param_name = null;

		try {
			FileReader fileReader = new FileReader("/tmp" + arg0);
			bufferedReader = new BufferedReader(fileReader);

			int n = 0;
			while ((line = bufferedReader.readLine()) != null) {
				if (n == 0) {
					param_name = line.split("\\s+");
					for (int i = 0; i < 34; i++) {
						//timeSeries[i].setKey(param_name[i + 7]);
					}
				} else {
					String[] data = line.split("\\s+");

					int yyyy = Integer.parseInt(data[0]);
					int month = Integer.parseInt(data[1]);
					int day = Integer.parseInt(data[2]);
					int hour = Integer.parseInt(data[3]);
					int min = Integer.parseInt(data[4]);
					int sec = (int) Float.parseFloat(data[5]);

					Second second = new Second(sec, min, hour, day, month, yyyy);
					for (int i = 0; i < 34; i++) {
						this.add(second, Double.parseDouble(data[i + 7]), i);
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

			System.out.println(System.getenv("ROOT_DATA_DIR"));
			System.out.println(System.getenv("THEMIS_DATA_DIR"));
			System.out.println(System.getenv("THEMIS_REMOTE_DATA_DIR"));

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
