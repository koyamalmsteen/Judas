package org.iugonet.www;

import java.util.ArrayList;
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

public class FmagNipr extends Tplot {

	FmagNipr() {
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

	@Override
	void readData(String arg0) {

		try {
			ArrayList<Second> second = new ArrayList<Second>();
			CDF cdf = CDF.open("/tmp" + arg0, 0);

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
