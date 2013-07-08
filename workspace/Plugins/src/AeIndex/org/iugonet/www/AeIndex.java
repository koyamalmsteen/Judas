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
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.time.Minute;
import org.jfree.data.time.TimeSeries;
import org.jfree.data.time.TimeSeriesCollection;

public class AeIndex extends Tplot {

	private BufferedReader bufferedReader;
	private String strUrl = "http://wdc-data.iugonet.org/data/hour/index/ae/1957/ae.5707.ngdc5";
	
	public AeIndex() {
		super(1);
		//timeSeries[0].setKey("AE index");
	}

	void readData(String arg0) {

		String line;

		try {
			FileReader fileReader = new FileReader("/tmp/ae.8210");
			bufferedReader = new BufferedReader(fileReader);

			while ((line = bufferedReader.readLine()) != null) {
				// System.out.print(line.substring(0,12)); // Filler
				// (identifier) value 'AEALAOAU'
				int yy = Integer.parseInt(line.substring(12, 14)); // The last
																	// two
																	// digits of
																	// the year
				int yyyy;
				if (yy < 57) {
					yyyy = 2000 + yy;
				} else {
					yyyy = 1900 + yy;
				}
				int month = Integer.parseInt(line.substring(14, 16)); // Month
																		// '01'
																		// TO
																		// '12'
				int day = Integer.parseInt(line.substring(16, 18)); // Day of
																	// the month
																	// '01' to
																	// '31'
				// System.out.print(line.substring(18,19)); // Component 'E' for
				// AE/'L' AL/'O' AO/'U' AU index
				int hour = Integer.parseInt(line.substring(19, 21)); // Hour ut,
																		// '00'
																		// to
																		// '23'
				// System.out.print(line.substring(21,24)); // NAME OF INDEX,
				// 'AE'/'AL'/'AO'/'AU'
				// System.out.print(line.substring(24,34)); // Filler (edition
				// number) value
				// 'KYOTO/E02' for final and 'PRVAE/E02' for provisional data
				// 60 one minute values, unit 1nT. Value'99999' for missing data
				// (35 40 One minute value for the first minute of the hour)
				// (389 394 One minute value for the last minute of the hour)
				for (int i = 0; i < 60; i++) {
					int data = Integer.parseInt(line.substring(34 + 6 * i,
							34 + 6 * (i + 1)).trim());
					if (data == 99999) {
						data = (Integer) null;
					}
					Minute minute = new Minute(i, hour, day, month, yyyy);

					this.add(minute, data, 0);
				}

				// System.out.println(line.substring(394,400)); // Hourly mean
				// value. Value '99999' for the missing data
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
		JFreeChart chart = getChart();

		ChartPanel cpanel = new ChartPanel(chart);
		return cpanel;
	}

	@Override
	public JFreeChart getChart() {
		JFreeChart chart = null;

		String xlabel = "UTC";
		String ylabel = "Dst index [nT]";

		chart = ChartFactory.createTimeSeriesChart(null, xlabel, ylabel,
				loadData(strUrl), false, true, false);

		return chart;
	}

	@Override
	public TimeSeriesCollection loadData(String strUrl) {
		TimeSeriesCollection timeSeriesCollection = new TimeSeriesCollection();

		AeIndex aeIndex = new AeIndex();
		try {
			aeIndex.file_http_copy(strUrl);
			aeIndex.readData(strUrl);
		} catch (Exception e) {
			e.printStackTrace();
		}

		TimeSeries[] timeSeries = new TimeSeries[1];
		timeSeries[0] = aeIndex.getTimeSeries(0);

		timeSeriesCollection.addSeries(aeIndex.getTimeSeries(0));

		return timeSeriesCollection;
	}
}
