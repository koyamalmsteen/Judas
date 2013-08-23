package org.iugonet.www;

import java.io.BufferedReader;
import java.io.FileReader;
import java.net.URL;

import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.time.Minute;
import org.jfree.data.time.TimeSeriesCollection;

public class AceMag extends Tplot {

	private BufferedReader bufferedReader;

	public AceMag() {
		super(1);
		//timeSeries[0].setKey("ACE Magnetometer");
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
					int stat = Integer.parseInt(line.substring(36, 37));

					double bx = Double.parseDouble(line.substring(37, 45)); // IMF
																			// Bx
																			// [nT]
					double by = Double.parseDouble(line.substring(45, 53)); // IMF
																			// By
																			// [nT]
					double bz = Double.parseDouble(line.substring(53, 61)); // IMF
																			// Bz
																			// [nT]
					double bt = Double.parseDouble(line.substring(61, 69)); // IMF
																			// Bt
																			// [nT]
					double lat = Double.parseDouble(line.substring(69, 77)); // Latitude
																				// [degrees
																				// +/-
																				// 90.0]
					double lon = Double.parseDouble(line.substring(77, 85)); // Longitude
																				// [degrees
																				// 0.0
																				// -
																				// 360.0]

					if (stat == 0) {
						Minute minute = new Minute(min, hour, day, month, yyyy);

						this.add(minute, bz, 0);
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
