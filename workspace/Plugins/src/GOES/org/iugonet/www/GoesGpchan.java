package org.iugonet.www;

import java.io.BufferedReader;
import java.io.FileReader;
import java.net.URL;

import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.time.Minute;
import org.jfree.data.time.TimeSeriesCollection;

public class GoesGpchan extends Tplot {

	private BufferedReader bufferedReader;

	public GoesGpchan() {
		super(1);
		//timeSeries[0].setKey("GOES Energetic Proton Flux Channels");
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

					// Particles = Protons/cm2-s-sr-MeV
					double p1 = Double.parseDouble(line.substring(31, 41)); // 0.7
																			// -
																			// 4
																			// MeV
					double p2 = Double.parseDouble(line.substring(41, 51)); // 4
																			// -
																			// 9
																			// MeV
					double p3 = Double.parseDouble(line.substring(51, 61)); // 9
																			// -
																			// 15
																			// MeV
					double p4 = Double.parseDouble(line.substring(61, 71)); // 15
																			// -
																			// 40
																			// MeV
					double p5 = Double.parseDouble(line.substring(71, 81)); // 38
																			// -
																			// 82
																			// MeV
					double p6 = Double.parseDouble(line.substring(81, 91)); // 84
																			// -
																			// 200
																			// MeV
					double p7 = Double.parseDouble(line.substring(91, 101)); // 110
																				// -
																				// 900
																				// MeV
					double p8 = Double.parseDouble(line.substring(101, 111)); // 350
																				// -
																				// 420
																				// MeV
					double p9 = Double.parseDouble(line.substring(111, 121)); // 420
																				// -
																				// 510
																				// MeV
					double p10 = Double.parseDouble(line.substring(121, 131)); // 510
																				// -
																				// 700
																				// MeV
					double p11 = Double.parseDouble(line.substring(131, 141)); // >
																				// 700
																				// MeV

					Minute minute = new Minute(min, hour, day, month, yyyy);

					this.add(minute, p1, 0);

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
