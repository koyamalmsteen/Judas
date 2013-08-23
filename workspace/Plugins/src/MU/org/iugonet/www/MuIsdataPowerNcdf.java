package org.iugonet.www;

import java.net.URL;
import java.util.ArrayList;

import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.time.Second;
import org.jfree.data.time.TimeSeriesCollection;

import ucar.ma2.Array;
import ucar.nc2.NetcdfFile;

public class MuIsdataPowerNcdf extends Tplot {

	public MuIsdataPowerNcdf() {
		super(256 * 4);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	void read(URL url) {
		try {
			NetcdfFile ncfile = NetcdfFile.open("/tmp" + url.getPath());

			// float lat = ((Array) ncfile.readSection("lat")).getFloat(0);
			// float lon = ((Array) ncfile.readSection("lon")).getFloat(0);
			int obsdate = ((Array) ncfile.readSection("obsdate")).getInt(0);
			Array stime = ncfile.readSection("stime");
			// Array etime = ncfile.readSection("etime");
			// Array beam = ncfile.readSection("beam");
			Array az = ncfile.readSection("az");
			Array ze = ncfile.readSection("ze");
			Array height = ncfile.readSection("height");
			Array pwr = ncfile.readSection("pwr");

			int tsize = (int) stime.getSize();

			int yyyy = obsdate / 10000;
			int mm = (obsdate - yyyy * 10000) / 100;
			int dd = obsdate - yyyy * 10000 - mm * 100;

			ArrayList<Second> second = new ArrayList<Second>();
			for (int j = 0; j < tsize; j++) {
				int hr = stime.getInt(j) / 3600;
				int mn = (stime.getInt(j) - hr * 3600) / 60;
				int sc = (stime.getInt(j) - hr * 3600 - mn * 60);
				second.add(new Second(sc, mn, hr, dd, mm, yyyy));
			}

			for (int i = 0; i < 4; i++) {
				for (int j = 0; j < 256; j++) {
					/*
					timeSeries[j + i * 256].setKey("beam" + (i + 1)
							+ "(Azimuth:" + az.getInt(i) + "degee zenith:"
							+ ze.getInt(i) + "degee) "
							+ height.getFloat(j + i * 256) + "km");
							*/
				}
			}

			for (int i = 0; i < 4; i++) {
				for (int j = 0; j < tsize; j++) {
					for (int k = 0; k < 256; k++) {
						int number = i * tsize * 256 + j * 256 + k;
						this.add(second.get(j), pwr.getFloat(number), k + i
								* 256);
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
