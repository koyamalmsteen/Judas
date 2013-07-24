package org.iugonet.www;

import java.io.File;

import java.io.FileOutputStream;
import java.io.InputStream;

import java.net.URL;
import java.net.URLConnection;

//import nom.tam.fits.BasicHDU;
//import nom.tam.fits.Fits;
//import nom.tam.fits.Header;

import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.time.Second;
import org.jfree.data.time.TimeSeriesCollection;

public class Iprt extends Tplot {

	public Iprt() {
		super(820);
	}

	@Override
	void readData(String arg0) {

		try {
//			arg0 = "/home/yagi/20101013_IPRT.fits";
//			Fits fits = new Fits(arg0);

//			BasicHDU hdu = (fits.read())[0];
/*
			int numpole = (hdu.getAxes())[0];
			int numfreq = (hdu.getAxes())[1];
			int numtime = (hdu.getAxes())[2];

			Header header = hdu.getHeader();
			String dateobs = header.getStringValue("DATE-OBS");
			String timeobs = header.getStringValue("TIME-OBS");

			System.out.println(dateobs);
			System.out.println(timeobs);

			int yyyy = Integer.parseInt(dateobs.substring(0, 4));
			int mm = Integer.parseInt(dateobs.substring(5, 7));
			int dd = Integer.parseInt(dateobs.substring(8, 10));
			int hhst = Integer.parseInt(timeobs.substring(0, 2));
			int mnst = Integer.parseInt(timeobs.substring(3, 5));
			int scst = Integer.parseInt(timeobs.substring(6, 8));

			byte[][][] data = (byte[][][]) hdu.getData().getData();

			for (int i = 0; i < numpole; i++) {
				for (int j = 0; j < numfreq; j++) {
					//timeSeries[i * numfreq + j].setKey(j + 100 + " MHz");
				}
			}

			for (int i = 0; i < numpole; i++) {
				for (int k = 0; k < numtime; k++) {
					int totsec = hhst * 3600 + mnst * 60 + scst + k;
					int hh = totsec / 3600;
					int mn = (totsec - hh * 3600) / 60;
					int sc = totsec - hh * 3600 - mn * 60;
					Second second = new Second(sc, mn, hh, dd, mm, yyyy);

					for (int j = 0; j < numfreq; j++) {
						int elem = data[i][j][k] & 0xff;
						this.add(second, (double) elem, i * numfreq + j);
					}
				}
			}
*/
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
