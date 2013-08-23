package org.iugonet.www;

import java.io.BufferedReader;
import java.io.FileReader;
import java.net.URI;
import java.net.URL;

import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.time.Second;
import org.jfree.data.time.TimeSeriesCollection;

public class NoaaPower extends Tplot {

	private BufferedReader bufferedReader;

	public NoaaPower() {
		super(1);
		//timeSeries[0].setKey("NOAA POES (Power)");
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

				if (line.length() != 0 && !line.substring(0, 1).equals(":")
						&& !line.substring(0, 1).equals("#")) { // skip header
					int yyyy = Integer.parseInt(line.substring(0, 4));
					int month = Integer.parseInt(line.substring(5, 7));
					int day = Integer.parseInt(line.substring(8, 10));
					int hour = Integer.parseInt(line.substring(11, 13));
					int min = Integer.parseInt(line.substring(14, 16));
					int sec = Integer.parseInt(line.substring(17, 19));

					String satellite = line.substring(20, 27);
					String hemisphere = line.substring(29, 30);

					int pow_index = Integer.parseInt(line.substring(33, 34)); // Hemispheric
																				// Power
																				// Index
																				// (activity
																				// level)
					double power = Double.parseDouble(line.substring(34, 41)); // Estimated
																				// Hemispheric
																				// Power
																				// in
																				// gigawatts
					double factor = Double.parseDouble(line.substring(41, 48)); // Normalizing
																				// factor

					Second second = new Second(sec, min, hour, day, month, yyyy);
					this.add(second, power, 0);
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
