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

public class NoaaBi extends Tplot {

	private BufferedReader bufferedReader;

	public NoaaBi() {
		super(1);
		//timeSeries[0].setKey("NOAA POES (Energetic Particle Belt Indices)");
	}

	@Override
	void readData(String arg0) {

		String line;
		int sensor = 21; // select sensor
							// http://www.swpc.noaa.gov/ftpdir/lists/bi/README

		try {
			FileReader fileReader = new FileReader("/tmp" + arg0);
			bufferedReader = new BufferedReader(fileReader);

			while ((line = bufferedReader.readLine()) != null) {

				if (line.length() != 0 && !line.substring(0, 1).equals(":")
						&& !line.substring(0, 1).equals("#")) { // skip header
					int day = Integer.parseInt(line.substring(0, 2).replace(
							" ", ""));
					int month = Integer.parseInt(line.substring(2, 5).replace(
							" ", ""));
					int yyyy = Integer.parseInt(line.substring(5, 10).replace(
							" ", ""));

					int sn = Integer.parseInt(line.substring(10, 14).replace(
							" ", "")); // Sensor Number
					double tbi = Double.parseDouble(line.substring(14, 27)); // Total
																				// Belt
																				// Index
					double ibi = Double.parseDouble(line.substring(27, 40)); // Inner
																				// Belt
																				// Index
					double sbi = Double.parseDouble(line.substring(40, 53)); // Slot
																				// Belt
																				// Index
					double obi = Double.parseDouble(line.substring(53, 66)); // Outer
																				// Belt
																				// Index

					if (sn == sensor) {
						Second second = new Second(0, 0, 0, day, month, yyyy);
						this.add(second, tbi, 0);
						// this.add(second, ibi, 0);
						// this.add(second, ibi, 0);
						// this.add(second, ibi, 0);
					}
				}
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
