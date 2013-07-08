package org.iugonet.www;

import java.util.ArrayList;

import java.util.Vector;
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

public class WindMfih0 extends Tplot {

	public WindMfih0() {
//		super(43);
		super(3);
	}

	@Override
	void readData(String arg0) {

		try {
			int yyyy, mm, dd, hr, mn, sc;
			double depoch_1min;

			CDF cdf = null;
			cdf = CDF.open("/tmp" + arg0, 0);
			
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
				second.add(new Second(sc, mn, hr, dd, mm, yyyy));

				float[] bgsm = (float[]) param[5].getRecord(i);
				this.add(second.get(i), bgsm[0], 0);
				this.add(second.get(i), bgsm[1], 1);
				this.add(second.get(i), bgsm[2], 2);
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
			System.out.println(System.getenv("ROOT_DATA_DIR"));
			System.out.println(System.getenv("THEMIS_DATA_DIR"));
			System.out.println(System.getenv("THEMIS_REMOTE_DATA_DIR"));

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
