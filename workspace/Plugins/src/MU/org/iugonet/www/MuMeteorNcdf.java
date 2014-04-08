package org.iugonet.www;

import java.net.URL;
import java.util.List;
import java.util.Calendar;

import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.time.Second;
import org.jfree.data.time.TimeSeriesCollection;

import ucar.ma2.Array;
import ucar.nc2.NetcdfFile;
import ucar.nc2.Variable;

public class MuMeteorNcdf extends Tplot {

	public MuMeteorNcdf(int num) {
		super(num);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	void read(URL url) {

		int yyyy_s = 0;
		int mm_s = 0;
		int dd_s = 0;
		int sc_t = 0;

		try {
			NetcdfFile ncfile = NetcdfFile.open("/tmp" + url.getPath());
			List<Variable> vl = ncfile.getVariables();

			// float lon = ((Array) ncfile.readSection("lon")).getFloat(0);
			// float lat = ((Array) ncfile.readSection("lat")).getFloat(0);
			Array time = ncfile.readSection("time");
			Array range = ncfile.readSection("range");

			int tsize = (int) time.getSize();
			int rsize = (int) range.getSize();

			String timestart = ncfile.findVariable("time").getUnitsString();

			for (int i = 4; i < 8; i++) {
				Variable var = vl.get(i);
				Array data = ncfile.readSection(vl.get(i).getFullName());

				for (int j = 0; j < tsize; j++) {
					if (timestart.substring(0, 5).contentEquals("hours")) {
						yyyy_s = Integer.parseInt(timestart.substring(12, 16));
						mm_s = Integer.parseInt(timestart.substring(17, 19));
						dd_s = Integer.parseInt(timestart.substring(20, 22));
					} else if (timestart.substring(0, 7).contentEquals(
							"seconds")) {
						yyyy_s = Integer.parseInt(timestart.substring(14, 18));
						mm_s = Integer.parseInt(timestart.substring(19, 21));
						dd_s = Integer.parseInt(timestart.substring(22, 24));
					}

					sc_t = time.getInt(j);
					Calendar calendar = Calendar.getInstance();
					calendar.set(yyyy_s, mm_s - 1, dd_s, 0, 0, 0);
					calendar.add(Calendar.SECOND, sc_t);

					int yyyy = calendar.get(Calendar.YEAR);
					int mm = calendar.get(Calendar.MONTH) + 1;
					int dd = calendar.get(Calendar.DATE);
					int hr = calendar.get(Calendar.HOUR_OF_DAY);
					int mn = calendar.get(Calendar.MINUTE);
					int sc = calendar.get(Calendar.SECOND);
					Second second = new Second(sc, mn, hr, dd, mm, yyyy);

					for (int k = 0; k < rsize; k++) {
						int id = k + rsize * (i - 4);
						/*timeSeries[id].setKey(var.getDescription() + " at "
								+ range.getInt(k) / 1000 + "km" + " ["
								+ var.getUnitsString() + "]");
								*/

						this.add(second, data.getFloat(k + j * rsize), id);
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
