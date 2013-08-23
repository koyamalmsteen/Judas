package org.iugonet.www;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.time.Second;
import org.jfree.data.time.TimeSeriesCollection;

import ucar.ma2.Array;
import ucar.nc2.NetcdfFile;
import ucar.nc2.Variable;

public class MuIsdataDriftNcdf extends Tplot {

	public MuIsdataDriftNcdf() {
		super(9);
		//timeSeries[0].setKey("netcdf");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	void read(URL url) {
		try {
			NetcdfFile ncfile = NetcdfFile.open("/tmp" + url.getPath());
			List<Variable> vl = ncfile.getVariables();

			// float lat = ((Array) ncfile.readSection("lat")).getFloat(0);
			// float lon = ((Array) ncfile.readSection("lon")).getFloat(0);
			int obsdate = ((Array) ncfile.readSection("obsdate")).getInt(0);
			// Array beam = ncfile.readSection("beam");
			// float az = ((Array) ncfile.readSection("az")).getFloat(0);
			// float ze = ((Array) ncfile.readSection("ze")).getFloat(0);
			Array time = ncfile.readSection("time");
			int tsize = (int) time.getSize();

			int yyyy = obsdate / 10000;
			int mm = (obsdate - yyyy * 10000) / 100;
			int dd = obsdate - yyyy * 10000 - mm * 100;

			ArrayList<Second> second = new ArrayList<Second>();
			for (int j = 0; j < tsize; j++) {
				int hr = time.getInt(j) / 3600;
				int mn = (time.getInt(j) - hr * 3600) / 60;
				int sc = (time.getInt(j) - hr * 3600 - mn * 60);
				second.add(new Second(sc, mn, hr, dd, mm, yyyy));
			}

			for (int i = 7; i < 12; i++) {
				Variable var = vl.get(i);
				/*
				timeSeries[i - 7].setKey(var.getDescription() + " ["
						+ var.getUnitsString() + "]");
						*/
				Array data = ncfile.readSection(vl.get(i).getFullName());
				for (int j = 0; j < tsize; j++) {
					this.add(second.get(j), data.getFloat(j), i - 7);
				}
			}
			// Vd_b : Ion Drift Velocity for beam direction
			Array data = ncfile.readSection(vl.get(12).getFullName());
			for (int k = 0; k < 4; k++) {
				/*
				timeSeries[5 + k].setKey(vl.get(12).getDescription() + " "
						+ (k + 1) + " [" + vl.get(12).getUnitsString() + "]");
						*/
				for (int j = 0; j < tsize; j++) {
					this.add(second.get(j), data.getFloat(j + tsize * k), 5 + k);
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
