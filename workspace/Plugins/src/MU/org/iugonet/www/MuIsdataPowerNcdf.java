package org.iugonet.www;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;

import java.net.URL;
import java.net.URLConnection;
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

	@Override
	void readData(String arg0) {
		try {
			NetcdfFile ncfile = NetcdfFile.open("/tmp" + arg0);

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
