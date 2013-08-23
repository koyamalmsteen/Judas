package org.iugonet.www;

import java.io.BufferedReader;
import java.io.FileReader;
import java.net.URL;
import java.util.Calendar;

import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.time.Second;
import org.jfree.data.time.TimeSeriesCollection;

public class MuMeteorTxt extends Tplot {

	private BufferedReader bufferedReader;

	public MuMeteorTxt() {
		super(41);
		for (int i = 0; i < 41; i++) {
			/*timeSeries[i].setKey("MU Meteor wind observation - Altitude: "
					+ (i + 70) + "km");*/
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	void read(URL url) {

		String line;

		double[] u = new double[41];
		double[] v = new double[41];
		double[] sigma_u = new double[41];
		double[] sigma_v = new double[41];

		try {
			FileReader fileReader = new FileReader("/tmp" + url.getPath());
			bufferedReader = new BufferedReader(fileReader);

			while ((line = bufferedReader.readLine()) != null) {
				int yy = Integer
						.parseInt(line.substring(0, 2).replace(" ", ""));
				int tdy = Integer.parseInt(line.substring(2, 5)
						.replace(" ", ""));
				int hh = Integer
						.parseInt(line.substring(5, 7).replace(" ", ""));
				int min = Integer.parseInt(line.substring(7, 9)
						.replace(" ", ""));
				int ch = Integer.parseInt(line.substring(9, 12)
						.replace(" ", "")) - 70; // 0ch:70km,1ch:71km,...,41ch:110km
				// observation period : 1990 - 2005
				int yyyy;
				if (yy >= 90) {
					yyyy = 1900 + yy;
				} else {
					yyyy = 2000 + yy;
				}
				// from total day to month & day
				Calendar calendar = Calendar.getInstance();
				calendar.set(yyyy, 0, 1);
				calendar.add(Calendar.DAY_OF_MONTH, tdy);
				int mm = calendar.get(Calendar.MONTH) + 1;
				int dd = calendar.get(Calendar.DATE);

				u[ch] = Double.parseDouble(line.substring(12, 19)); // East-West
																	// wind
																	// (m/s)
				v[ch] = Double.parseDouble(line.substring(19, 27)); // North-South
																	// wind
																	// (m/s)
				sigma_u[ch] = Double.parseDouble(line.substring(27, 35)); // Dispersion
																			// of
																			// u
																			// (m/s)
				sigma_v[ch] = Double.parseDouble(line.substring(35, 43)); // Dispersion
																			// of
																			// v
																			// (m/s)

				Second second = new Second(0, min, hh, dd, mm, yyyy);
				this.add(second, u[ch], ch);
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
