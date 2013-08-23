package org.iugonet.www;

import java.lang.Double;
import java.net.URL;

import gsfc.nssdc.cdf.CDF;
import gsfc.nssdc.cdf.util.Epoch;
import gsfc.nssdc.cdf.Variable;

import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.time.Second;
import org.jfree.data.time.TimeSeriesCollection;

public class Lfrto extends Tplot {

	public Lfrto() {
		super(2);
		//timeSeries[0].setKey("LFRTO - power(amplitude)");
		//timeSeries[1].setKey("LFRTO - phase");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	void read(URL url) {

		try {
			int yyyy, mm, dd, hr, mn, sc;
			int i;
			long num;
			double depoch, dpower, dphase;

			CDF cdf = null;
			cdf = CDF.open("/tmp" + url.getPath(), 0);

			Variable epoch = cdf.getVariable(0);
			Variable power = cdf.getVariable(4);
			Variable phase = cdf.getVariable(5);
			num = phase.getMaxAllocatedRecord();

			depoch = ((Double) epoch.getRecord(0)).doubleValue();
			dphase = (Float) phase.getRecord(0);
			dpower = (Float) power.getRecord(0);

			for (i = 0; i < num + 1; i++) {
				depoch = ((Double) epoch.getRecord(i)).doubleValue();
				yyyy = (int) Epoch.breakdown(depoch)[0];
				mm = (int) Epoch.breakdown(depoch)[1];
				dd = (int) Epoch.breakdown(depoch)[2];
				hr = (int) Epoch.breakdown(depoch)[3];
				mn = (int) Epoch.breakdown(depoch)[4];
				sc = (int) Epoch.breakdown(depoch)[5];
				Second second = new Second(sc, mn, hr, dd, mm, yyyy);
				dpower = (Float) power.getRecord(i);
				dphase = (Float) phase.getRecord(i);
				this.add(second, dpower, 0);
				this.add(second, dphase, 1);
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
