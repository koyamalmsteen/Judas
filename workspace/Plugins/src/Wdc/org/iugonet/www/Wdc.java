package org.iugonet.www;

import java.io.BufferedInputStream;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

import org.iugonet.www.Tplot;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.time.Minute;
import org.jfree.data.time.TimeSeriesCollection;

public class Wdc extends Tplot {

	private BufferedReader bufferedReader;

	public Wdc() {
		super(4);
		// getTimeSeries(1).setKey("Geomagnetic Data");
	}

	void readData(String arg0) {

		String line;

		try {
			/* wget http://wdc-data.iugonet.org/data/min/nur/2006/nur0603.wdc */
			FileReader fileReader = new FileReader("/tmp/nur0603.wdc");
			bufferedReader = new BufferedReader(fileReader);

			while ((line = bufferedReader.readLine()) != null) {
				int yy = Integer.parseInt(line.substring(12, 14)); // The last
																	// two
																	// digits of
																	// the year
				int yyyy = 0;
				if (yy < 57) {
					yyyy = 2000 + yy;
				} else {
					yyyy = 1900 + yy;
				}
				int month = Integer.parseInt(line.substring(14, 16));
				int day = Integer.parseInt(line.substring(16, 18));
				String flag = line.substring(18, 19);
				int hour = Integer.parseInt(line.substring(19, 21));
				int dim_num = 0;

				if (flag.equals("X")) {
					dim_num = 0;
				} else if (flag.equals("Y")) {
					dim_num = 1;
				} else if (flag.equals("Z")) {
					dim_num = 2;
				} else if (flag.equals("F")) {
					dim_num = 3;
				}

				for (int i = 0; i < 60; i++) {
					int data = Integer.parseInt(line.substring(34 + 6 * i,
							34 + 6 * (i + 1)).trim());
					if (data == 99999) {
						// data = (Integer) null;
					}
					Minute minute = new Minute(i, hour, day, month, yyyy);

					System.out.println("i=" + i + ",hour" + hour + ",day" + day
							+ ",month" + month + ",yyyy" + yyyy + ",dim_num="
							+ dim_num);
					this.add(minute, (double) data, dim_num);
				}
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

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
