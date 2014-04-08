package org.iugonet.www;

import java.util.ArrayList;
import java.lang.Double;
import java.net.URI;
import java.net.URL;

import gsfc.nssdc.cdf.CDF;
import gsfc.nssdc.cdf.util.Epoch;
import gsfc.nssdc.cdf.Variable;

import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.time.Second;
import org.jfree.data.time.TimeSeriesCollection;

public class Mm210 extends Tplot {

	public Mm210() {
		super(1);
		//timeSeries[0].setKey("MM210 magnetometer");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	@Override
	void read(URL url) {
		try {
			ArrayList<Second> second = new ArrayList<Second>();

			int yyyy, mm, dd, hr, mn, sc;
			int i;
			double depoch_1min, depoch_1h;
			double h_1min, d_1min, z_1min;
			double h_1h, d_1h, z_1h;

			CDF cdf = null;
			cdf = CDF.open("/tmp" + url.getPath(), 0);

			// // depends epoch_1min ////
			Variable epoch_1min = cdf.getVariable(0);
			Variable hdz_1min = cdf.getVariable(4);
			Variable f_1min = cdf.getVariable(7);
			Variable time_cal_1min = cdf.getVariable(8);
			// // depends epoch_1h ////
			Variable epoch_1h = cdf.getVariable(9);
			Variable hdz_1h = cdf.getVariable(13);
			Variable f_1h = cdf.getVariable(16);
			Variable time_cal_1h = cdf.getVariable(17);

			long num_1min = epoch_1min.getMaxAllocatedRecord();
			long num_1h = epoch_1min.getMaxAllocatedRecord();

			for (i = 0; i < num_1min + 1; i++) {
				depoch_1min = ((Double) epoch_1min.getRecord(i)).doubleValue();
				yyyy = (int) Epoch.breakdown(depoch_1min)[0];
				mm = (int) Epoch.breakdown(depoch_1min)[1];
				dd = (int) Epoch.breakdown(depoch_1min)[2];
				hr = (int) Epoch.breakdown(depoch_1min)[3];
				mn = (int) Epoch.breakdown(depoch_1min)[4];
				sc = (int) Epoch.breakdown(depoch_1min)[5];
				if (yyyy >= 1900 && yyyy <= 9999) {
					second.add(new Second(sc, mn, hr, dd, mm, yyyy));
					h_1min = ((double[]) hdz_1min.getRecord(i))[0];
					d_1min = ((double[]) hdz_1min.getRecord(i))[1];
					z_1min = ((double[]) hdz_1min.getRecord(i))[2];
					this.add(second.get(i), h_1min, 0);
				}
			}

			/*
			 * 1h-resolution for (i = 0; i < num_1h+1; i++ ) { depoch_1h =
			 * ((Double) epoch_1h.getRecord(i)).doubleValue(); yyyy =
			 * (int)Epoch.breakdown(depoch_1h)[0]; mm =
			 * (int)Epoch.breakdown(depoch_1h)[1]; dd =
			 * (int)Epoch.breakdown(depoch_1h)[2]; hr =
			 * (int)Epoch.breakdown(depoch_1h)[3]; mn =
			 * (int)Epoch.breakdown(depoch_1h)[4]; sc =
			 * (int)Epoch.breakdown(depoch_1h)[5]; if (yyyy>=1900 &&
			 * yyyy<=9999){ second.add(new Second(sc, mn, hr, dd, mm, yyyy));
			 * h_1h = ((double[]) hdz_1h.getRecord(i))[0]; d_1h = ((double[])
			 * hdz_1h.getRecord(i))[1]; z_1h = ((double[])
			 * hdz_1h.getRecord(i))[2]; this.add(second.get(i), h_1h); } }
			 */

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
