package org.iugonet.www;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;

import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.List;

import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.time.Second;
import org.jfree.data.time.TimeSeriesCollection;

import ucar.ma2.Array;
import ucar.nc2.NetcdfFile;
import ucar.nc2.Variable;

public class MuIsdataTetiNcdf extends Tplot {

	public MuIsdataTetiNcdf() {
		// 7 parameter, 12 height channel;
		super(7 * 12);
	}

	@Override
	void readData(String arg0) {
		try {
			NetcdfFile ncfile = NetcdfFile.open("/tmp" + arg0);
			List<Variable> vl = ncfile.getVariables();

			float lat = ((Array) ncfile.readSection("lat")).getFloat(0);
			float lon = ((Array) ncfile.readSection("lon")).getFloat(0);
			int obsdate = ((Array) ncfile.readSection("obsdate")).getInt(0);
			Array stime = ncfile.readSection("stime");
			Array etime = ncfile.readSection("etime");
			Array height = ncfile.readSection("height");

			int tsize = (int) stime.getSize();
			int hsize = (int) height.getSize();

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

			for (int i = 6; i < 13; i++) {
				Variable var = vl.get(i);
				Array data = ncfile.readSection(vl.get(i).getFullName());
				for (int j = 0; j < tsize; j++) {
					/*timeSeries[(i - 6) * hsize + j].setKey(var.getDescription()
							+ " [" + var.getUnitsString() + "]");
							*/
					for (int k = 0; k < hsize; k++) {
						this.add(second.get(j), data.getFloat(j * hsize + k),
								(i - 6) * hsize + k);
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
