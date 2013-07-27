package org.iugonet.www;

import java.io.BufferedReader;
import java.io.FileReader;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;

import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.time.Minute;
import org.jfree.data.time.TimeSeriesCollection;

public class AceLoc1h extends Tplot {

	private BufferedReader bufferedReader;

	public AceLoc1h() {
		super(1);
		//timeSeries[0].setKey("ACE Location (GSE Coordinates)");
	}

	@Override
	void readData(String arg) {
		try {
			URL url = new URL(arg);
			readData(url);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Override
	void readData(URL url) {

		String line;

		try {
			FileReader fileReader = new FileReader("/tmp" + arg0);
			bufferedReader = new BufferedReader(fileReader);

			while ((line = bufferedReader.readLine()) != null) {
				if (!line.substring(0, 1).equals(":")
						&& !line.substring(0, 1).equals("#")) { // skip header
					int yyyy = Integer.parseInt(line.substring(0, 4));
					int month = Integer.parseInt(line.substring(5, 7));
					int day = Integer.parseInt(line.substring(8, 10));
					int hour = Integer.parseInt(line.substring(12, 14));
					int min = Integer.parseInt(line.substring(14, 16));

					double loc_x = Double.parseDouble(line.substring(37, 42));
					double loc_y = Double.parseDouble(line.substring(42, 51));
					double loc_z = Double.parseDouble(line.substring(51, 60));

					Minute minute = new Minute(min, hour, day, month, yyyy);

					this.add(minute, loc_x, 0);
				}
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	void readData(URI uri) {
		String resolver = "http://search.iugonet.org";
		System.out.println(uri);
		/*
		System.out.println(uri);
		System.out.println(uri.getSchemeSpecificPart());
		System.out.println(uri.getScheme());
		*/
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
