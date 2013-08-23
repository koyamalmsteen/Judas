package org.iugonet.www;

import java.io.BufferedReader;
import java.io.FileReader;
import java.net.URI;
import java.net.URL;

import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.time.TimeSeriesCollection;

public class MuIonogramTxt extends Tplot {

	private BufferedReader bufferedReader;

	public MuIonogramTxt() {
		super(1);
		//timeSeries[0].setKey("MU Ionosonde");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	@Override
	void read(URL url) {
		String line;

		double[][] ionogram = new double[161][217];
		double[] frequency = new double[161];
		double[] height = new double[217];

		try {
			FileReader fileReader = new FileReader("/tmp" + url.getPath());
			bufferedReader = new BufferedReader(fileReader);

			int n = 0;
			while ((line = bufferedReader.readLine()) != null) {
				if (n == 1) {
					int yyyy = Integer.parseInt(line.substring(12, 16).replace(
							" ", ""));
					int mm = Integer.parseInt(line.substring(17, 19).replace(
							" ", ""));
					int yy = Integer.parseInt(line.substring(20, 22).replace(
							" ", ""));
					int hh = Integer.parseInt(line.substring(23, 25).replace(
							" ", ""));
					int min = Integer.parseInt(line.substring(26, 28).replace(
							" ", ""));
				}
				if (n == 9) {
					for (int i = 0; i <= 160; i++) {
						frequency[i] = Double.parseDouble(line.substring(
								(i + 1) * 8, (i + 2) * 8));
					}
				}
				if (n >= 10) {
					height[n - 10] = Double.parseDouble(line.substring(0, 8));
					for (int i = 0; i <= 160; i++) {
						ionogram[i][n - 10] = Double.parseDouble(line
								.substring((i + 1) * 8, (i + 2) * 8));
					}
				}
				n++;
			}

			// check
			System.out.println("Frequency:161ch");
			for (int i = 0; i < 161; i++) {
				System.out.println(frequency[i]);
			}
			System.out.println("");
			System.out.println("Height:217ch");
			for (int j = 0; j < 217; j++) {
				System.out.println(height[j]);
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
