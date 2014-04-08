package org.iugonet.www;

import java.util.ArrayList;
import java.lang.Double;
import java.net.URL;

import gsfc.nssdc.cdf.CDF;
import gsfc.nssdc.cdf.util.Epoch;
import gsfc.nssdc.cdf.Variable;

import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.time.Second;
import org.jfree.data.time.TimeSeriesCollection;

public class FmagNipr extends Tplot {

	public FmagNipr() {
		super(3);
		/*
		timeSeries[0]
				.setKey("NIPR 2sec Resolution Fluxgate Magnetometer Data - H component");
		timeSeries[1]
				.setKey("NIPR 2sec Resolution Fluxgate Magnetometer Data - D component");
		timeSeries[2]
				.setKey("NIPR 2sec Resolution Fluxgate Magnetometer Data - Z component");
				*/
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	@Override
	void read(URL url) {
		try {
			ArrayList<Second> second = new ArrayList<Second>();
			CDF cdf = CDF.open("/tmp" + url.getPath(), 0);

			// // depends epoch_2sec ////
			Variable epoch_2sec = cdf.getVariable(0);
			Variable hdz_2sec = cdf.getVariable(4);

			long num = epoch_2sec.getMaxAllocatedRecord();

			for (int i = 0; i < num; i++) {
				double depoch_2sec = ((Double) epoch_2sec.getRecord(i))
						.doubleValue();
				int yyyy = (int) Epoch.breakdown(depoch_2sec)[0];
				int mm = (int) Epoch.breakdown(depoch_2sec)[1];
				int dd = (int) Epoch.breakdown(depoch_2sec)[2];
				int hr = (int) Epoch.breakdown(depoch_2sec)[3];
				int mn = (int) Epoch.breakdown(depoch_2sec)[4];
				int sc = (int) Epoch.breakdown(depoch_2sec)[5];
				if (yyyy >= 1900 && yyyy <= 9999) {
					second.add(new Second(sc, mn, hr, dd, mm, yyyy));
					double h_2sec = ((double[]) hdz_2sec.getRecord(i))[0];
					double d_2sec = ((double[]) hdz_2sec.getRecord(i))[1];
					double z_2sec = ((double[]) hdz_2sec.getRecord(i))[2];
					this.add(second.get(i), h_2sec, 0);
					this.add(second.get(i), d_2sec, 1);
					this.add(second.get(i), z_2sec, 2);
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
