package org.iugonet.www;

import java.io.BufferedReader;
import java.io.FileReader;
import java.net.URL;

import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.time.Minute;
import org.jfree.data.time.TimeSeriesCollection;

public class GoesGpart extends Tplot {

	private BufferedReader bufferedReader;

	public GoesGpart() {
		super(1);
		//timeSeries[0].setKey("GOES Solar Particle and Electron Flux");
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

					// Particles = Protons/cm2-s-sr
					double p1 = Double.parseDouble(line.substring(34, 42)); // Particles
																			// at
																			// >1
																			// Mev
					double p5 = Double.parseDouble(line.substring(44, 52)); // Particles
																			// at
																			// >5
																			// Mev
					double p10 = Double.parseDouble(line.substring(54, 62)); // Particles
																				// at
																				// >10
																				// Mev
					double p30 = Double.parseDouble(line.substring(64, 72)); // Particles
																				// at
																				// >30
																				// Mev
					double p50 = Double.parseDouble(line.substring(74, 82)); // Particles
																				// at
																				// >50
																				// Mev
					double p100 = Double.parseDouble(line.substring(84, 92)); // Particles
																				// at
																				// >100
																				// Mev

					// Electrons = Electrons/cm2-s-sr
					double e08 = Double.parseDouble(line.substring(94, 102)); // Electrons
																				// at
																				// >0.8
																				// Mev
					double e2 = Double.parseDouble(line.substring(104, 112)); // Electrons
																				// at
																				// >2.0
																				// Mev
					double e4 = Double.parseDouble(line.substring(114, 122)); // Electrons
																				// at
																				// >4.0
																				// Mev

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
