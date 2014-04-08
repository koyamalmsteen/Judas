package org.iugonet.www;

import java.lang.Double;
import java.net.URL;

import gsfc.nssdc.cdf.CDF;
import gsfc.nssdc.cdf.util.Epoch;
import gsfc.nssdc.cdf.Variable;

import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.time.Millisecond;
import org.jfree.data.time.TimeSeriesCollection;

public class ImagNipr extends Tplot {

	public ImagNipr() {
		super(4);
		/*
		timeSeries[0]
				.setKey("NIPR 20Hz Resolution Induction Magnetometer Data - H component");
		timeSeries[1]
				.setKey("NIPR 20Hz Resolution Induction Magnetometer Data - D component");
		timeSeries[2]
				.setKey("NIPR 20Hz Resolution Induction Magnetometer Data - Z component");
		timeSeries[2]
				.setKey("NIPR 20Hz Resolution Induction Magnetometer Data - gps 1pps time pulse");
				*/
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	void read(URL url) {
		try {
			CDF cdf = CDF.open("/tmp" + url.getPath(), 0);

			Variable epoch = cdf.getVariable(0);
			Variable db_dt = cdf.getVariable(4);
			Variable gps_1pps_time_pulse = cdf.getVariable(7);

			long num = epoch.getMaxAllocatedRecord();

			for (int i = 0; i < num; i++) {
				double depoch = ((Double) epoch.getRecord(i)).doubleValue();
				int yyyy = (int) Epoch.breakdown(depoch)[0];
				int mm = (int) Epoch.breakdown(depoch)[1];
				int dd = (int) Epoch.breakdown(depoch)[2];
				int hr = (int) Epoch.breakdown(depoch)[3];
				int mn = (int) Epoch.breakdown(depoch)[4];
				int sc = (int) Epoch.breakdown(depoch)[5];
				int ms = (int) Epoch.breakdown(depoch)[6];
				if (yyyy >= 1900 && yyyy <= 9999) {
					Millisecond millisecond = new Millisecond(ms, sc, mn, hr,
							dd, mm, yyyy);
					double db_dt_h = ((double[]) db_dt.getRecord(i))[0];
					double db_dt_d = ((double[]) db_dt.getRecord(i))[1];
					double db_dt_z = ((double[]) db_dt.getRecord(i))[2];
					double gps_tp = (Double) gps_1pps_time_pulse.getRecord(i);
					this.add(millisecond, db_dt_h, 0);
					this.add(millisecond, db_dt_d, 1);
					this.add(millisecond, db_dt_z, 2);
					this.add(millisecond, gps_tp, 3);
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
