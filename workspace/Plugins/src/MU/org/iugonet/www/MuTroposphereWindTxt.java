package org.iugonet.www;

import java.io.BufferedReader;
import java.io.FileReader;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;

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
