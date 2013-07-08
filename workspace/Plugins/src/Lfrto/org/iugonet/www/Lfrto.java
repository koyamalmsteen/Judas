package org.iugonet.www;

import java.lang.Double;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;

import java.net.URL;
import java.net.URLConnection;

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

	@Override
	void readData(String arg0) {

		try {
			int yyyy, mm, dd, hr, mn, sc;
			int i;
			long num;
			double depoch, dpower, dphase;

			CDF cdf = null;
			cdf = CDF.open("/tmp" + arg0, 0);

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
	void file_http_copy(String arg0, String arg1) {
		// TODO Auto-generated method stub

	}

	public void file_http_copy(String arg0) {
		URL url;
		try {
			url = new URL(arg0);

			String[] strArray = url.getPath().split("/");
			String strDir = "/tmp";
			for (int i = 0; i < strArray.length - 1; i++) {
				strDir = strDir + "/" + strArray[i];
			}

			File fileDir = new File(strDir);

			if (fileDir.exists()) {
				System.out.println(fileDir + "Directory exists.");
			} else {
				if (fileDir.mkdirs()) {
					System.out.println(fileDir.getPath()
							+ " Created directories to store data.");
				} else {
					System.out.println(fileDir.getPath()
							+ " Couldn't created directories to store data.");
				}
			}

			URLConnection conn = url.openConnection();
			InputStream in = conn.getInputStream();

			File file = new File("/tmp" + url.getPath());
			FileOutputStream out = new FileOutputStream(file, false);
			int b;
			while ((b = in.read()) != -1) {
				out.write(b);
			}
			out.close();
			in.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
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

	@Override
	public TimeSeriesCollection loadData(String strUrl) {
		// TODO Auto-generated method stub
		return null;
	}
}
