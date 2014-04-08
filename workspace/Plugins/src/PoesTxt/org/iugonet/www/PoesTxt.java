package org.iugonet.www;

import java.io.BufferedReader;
import java.io.FileReader;
import java.net.URI;
import java.net.URL;

import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.time.Second;
import org.jfree.data.time.TimeSeriesCollection;

public class PoesTxt extends Tplot {

	private BufferedReader bufferedReader;

	public PoesTxt() {
		super(34);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	void read(URL url) {

		String line;
		String[] param_name = null;

		try {
			FileReader fileReader = new FileReader("/tmp" + url.getPath());
			bufferedReader = new BufferedReader(fileReader);

			int n = 0;
			while ((line = bufferedReader.readLine()) != null) {
				if (n == 0) {
					param_name = line.split("\\s+");
					for (int i = 0; i < 34; i++) {
						//timeSeries[i].setKey(param_name[i + 7]);
					}
				} else {
					String[] data = line.split("\\s+");

					int yyyy = Integer.parseInt(data[0]);
					int month = Integer.parseInt(data[1]);
					int day = Integer.parseInt(data[2]);
					int hour = Integer.parseInt(data[3]);
					int min = Integer.parseInt(data[4]);
					int sec = (int) Float.parseFloat(data[5]);

					Second second = new Second(sec, min, hour, day, month, yyyy);
					for (int i = 0; i < 34; i++) {
						this.add(second, Double.parseDouble(data[i + 7]), i);
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
