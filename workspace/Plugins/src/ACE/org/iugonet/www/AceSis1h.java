package org.iugonet.www;

import java.io.BufferedReader;
import java.io.FileReader;
import java.net.URL;

import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.time.Minute;
import org.jfree.data.time.TimeSeriesCollection;

public class AceSis1h extends Tplot {

	private BufferedReader bufferedReader;

	public AceSis1h() {
		super(1);
		//timeSeries[0].setKey("ACE Solar Isotope Spectrometer (1hour)");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	@Override
	void read(URL url) {

		String line;

		try {
			FileReader fileReader = new FileReader("/tmp" + url.getPath());
			bufferedReader = new BufferedReader(fileReader);

			while ((line = bufferedReader.readLine()) != null) {
				if (!line.substring(0, 1).equals(":")
						&& !line.substring(0, 1).equals("#")) { // skip header
					int yyyy = Integer.parseInt(line.substring(0, 4));
					int month = Integer.parseInt(line.substring(5, 7));
					int day = Integer.parseInt(line.substring(8, 10));
					int hour = Integer.parseInt(line.substring(12, 14));
					int min = Integer.parseInt(line.substring(14, 16));

					int stat10 = Integer.parseInt(line.substring(38, 39));
					double flux10 = Double.parseDouble(line.substring(39, 51)); // proton
																				// flux
																				// >
																				// 10MeV
																				// [p/cs2-sec-ster]

					int stat30 = Integer.parseInt(line.substring(55, 56));
					double flux30 = Double.parseDouble(line.substring(60, 68)); // proton
																				// flux
																				// >
																				// 30MeV
																				// [p/cs2-sec-ster]

					if (stat10 == 0) {
						Minute minute = new Minute(min, hour, day, month, yyyy);
						// this.add(minute, flux10);
					}
					if (stat30 == 0) {
						Minute minute = new Minute(min, hour, day, month, yyyy);

						this.add(minute, flux30, 0);
					}

				}
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public TimeSeriesCollection load(URL url) {
		// TODO Auto-generated method stub
		return null;
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
	
}
