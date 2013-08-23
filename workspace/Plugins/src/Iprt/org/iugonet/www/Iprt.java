package org.iugonet.www;

//import nom.tam.fits.BasicHDU;
//import nom.tam.fits.Fits;
//import nom.tam.fits.Header;

import java.net.URL;

import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.time.TimeSeriesCollection;

public class Iprt extends Tplot {

	public Iprt() {
		super(820);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	void read(URL url) {

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
