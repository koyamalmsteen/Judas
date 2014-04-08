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

public class HfTohokuu extends Tplot {

	public HfTohokuu() {
		super(1);
		//timeSeries[0].setKey("Iitate HF");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	@Override
	void read(URL url) {
		// TODO Auto-generated method stub

		try {
			ArrayList<Second> second = new ArrayList<Second>();

			int yyyy, mm, dd, hr, mn, sc;
			int i, j;
			long num;
			double depoch;
			float[] drh, dlh;

			CDF cdf = null;
			cdf = CDF.open("/tmp" + url.getPath(), 0);

			Variable epoch = cdf.getVariable(0);
			Variable channel = cdf.getVariable(1);
			Variable rh = cdf.getVariable(2);
			Variable lh = cdf.getVariable(3);

			num = epoch.getMaxAllocatedRecord();
			depoch = ((Double) epoch.getRecord(0)).doubleValue();
			//
			// for (i = 0; i < 1000; i++) {
			// System.out.println(channel.getScalarData(i));
			// }

			long numc = channel.getDimSizes()[0];
			float[] dchannel = (float[]) channel.getRecord(0);
			// for (i = 0; i < numc; i++){
			// System.out.println(dchannel[i]);
			// }

			for (i = 0; i < num + 1; i++) {
				depoch = ((Double) epoch.getRecord(i)).doubleValue();
				yyyy = (int) Epoch.breakdown(depoch)[0];
				mm = (int) Epoch.breakdown(depoch)[1];
				dd = (int) Epoch.breakdown(depoch)[2];
				hr = (int) Epoch.breakdown(depoch)[3];
				mn = (int) Epoch.breakdown(depoch)[4];
				sc = (int) Epoch.breakdown(depoch)[5];
				if (yyyy >= 1900 && yyyy <= 9999) {
					second.add(new Second(sc, mn, hr, dd, mm, yyyy));
					drh = (float[]) rh.getRecord(i);
					dlh = (float[]) lh.getRecord(i);
					System.out.println("\n\n");
					System.out.println("" + yyyy + mm + dd + hr + mn + sc);
					for (j = 0; j < numc; j++) {
						System.out.println("" + dchannel[j] + "  " + drh[j]);
					}
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
