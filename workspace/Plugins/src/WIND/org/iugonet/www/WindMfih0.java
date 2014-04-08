package org.iugonet.www;

import java.lang.Double;
import java.net.URI;
import java.net.URL;

import gsfc.nssdc.cdf.CDF;
import gsfc.nssdc.cdf.util.Epoch;
import gsfc.nssdc.cdf.Variable;

import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.time.TimeSeriesCollection;

public class WindMfih0 extends Tplot {

	public WindMfih0() {
//		super(43);
		super(3);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	void read(URL url) {
		try {
			int yyyy, mm, dd, hr, mn, sc;
			double depoch_1min;

			CDF cdf = null;
			cdf = CDF.open("/tmp" + url.getPath(), 0);
			
			Variable[] param = new Variable[cdf.getVariables().size()];
			
			for (int i = 0; i < 66; i++) {
				param[i] = cdf.getVariable(i);
//				timeSeries[i].setKey((String) "WIND mfi "+cdf.getAttribute("FIELDNAM").getEntry(i).getData());
//				System.out.println(i+"	"+param[i]+"  "+cdf.getAttribute("FIELDNAM").getEntry(i).getData()+"	"+param[i].getMaxAllocatedRecord());
			}
			
//			timeSeries[0].setKey((String) "WIND mfi h0"+cdf.getAttribute("FIELDNAM").getEntry(5).getData());
//			timeSeries[1].setKey((String) "WIND mfi h0"+cdf.getAttribute("FIELDNAM").getEntry(5).getData());
//			timeSeries[2].setKey((String) "WIND mfi h0"+cdf.getAttribute("FIELDNAM").getEntry(5).getData());
		
			long num = param[0].getMaxAllocatedRecord();
			
			for (int i = 0; i < num + 1; i++) {
				depoch_1min = ((Double) param[0].getRecord(i)).doubleValue();
				yyyy = (int) Epoch.breakdown(depoch_1min)[0];
				mm = (int) Epoch.breakdown(depoch_1min)[1];
				dd = (int) Epoch.breakdown(depoch_1min)[2];
				hr = (int) Epoch.breakdown(depoch_1min)[3];
				mn = (int) Epoch.breakdown(depoch_1min)[4];
				sc = (int) Epoch.breakdown(depoch_1min)[5];
//				second.add(new Second(sc, mn, hr, dd, mm, yyyy));

//				float[] bgsm = (float[]) param[5].getRecord(i);
//				this.add(second.get(i), bgsm[0], 0);
//				this.add(second.get(i), bgsm[1], 1);
//				this.add(second.get(i), bgsm[2], 2);
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
