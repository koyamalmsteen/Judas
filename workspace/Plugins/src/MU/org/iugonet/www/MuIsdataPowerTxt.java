package org.iugonet.www;

import java.io.BufferedReader;
import java.io.FileReader;
import java.net.URL;

import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.time.Second;
import org.jfree.data.time.TimeSeriesCollection;

public class MuIsdataPowerTxt extends Tplot {

	private BufferedReader bufferedReader;

	public MuIsdataPowerTxt() {
		super(1);
		//timeSeries[0].setKey("MU ionosphere power");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	void read(URL url) {

		String line;
		int channel = 5;

		try {
			FileReader fileReader = new FileReader("/tmp" + url.getPath());
			bufferedReader = new BufferedReader(fileReader);

			int line_num = 0;
			int numc = 0;

			while ((line = bufferedReader.readLine()) != null) {
				if (line_num == 0) {
					double azi_angle = Double.parseDouble((line.split(","))[0]);
					double zen_angle = Double.parseDouble((line.split(","))[1]);
				} else if (line_num == 1) {
					String[] altitude_s = line.split(",");
					numc = altitude_s.length;
					double[] altitude = new double[numc];
					for (int i = 0; i < numc; i++) {
						altitude[i] = Double.parseDouble(altitude_s[i]);
					}
					System.out.println("channel : " + channel);
					System.out
							.println("altitude : " + altitude[channel] + "km");
				} else {
					String[] parameter_s = line.split(",");
					int yyyy = Integer.parseInt(parameter_s[0].substring(0, 4));
					int month = Integer
							.parseInt(parameter_s[0].substring(5, 7));
					int day = Integer.parseInt(parameter_s[0].substring(8, 10));
					int hour = Integer.parseInt(parameter_s[0]
							.substring(11, 13));
					int min = Integer
							.parseInt(parameter_s[0].substring(14, 16));
					int sec = Integer
							.parseInt(parameter_s[0].substring(17, 19));
					double[] power = new double[numc];
					for (int i = 0; i < numc; i++) {
						power[i] = Double.parseDouble(parameter_s[i + 1]);
					}
					Second second = new Second(sec, min, hour, day, month, yyyy);
					this.add(second, power[channel], 0);
				}
				line_num++;
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
