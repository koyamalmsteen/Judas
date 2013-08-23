package org.iugonet.www;

import java.io.BufferedReader;
import java.io.FileReader;
import java.net.URL;

import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.time.Second;
import org.jfree.data.time.TimeSeriesCollection;

public class MuIsdataDriftTxt extends Tplot {

	private BufferedReader bufferedReader;

	public MuIsdataDriftTxt() {
		super(1);
		//timeSeries[0].setKey("MU ionosphere drift");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	@Override
	void read(URL url) {

		String line;

		try {
			FileReader fileReader = new FileReader("/tmp" + url.getPath());
			bufferedReader = new BufferedReader(fileReader);

			while ((line = bufferedReader.readLine()) != null) {
				String yyyy_s = line.substring(0, 4).replace(" ", "");
				String mm_s = line.substring(5, 7).replace(" ", "");
				String dd_s = line.substring(8, 10).replace(" ", "");
				String hh_s = line.substring(12, 14).replace(" ", "");
				int yyyy = Integer.parseInt(yyyy_s);
				int mm = Integer.parseInt(mm_s);
				int dd = Integer.parseInt(dd_s);
				int hh = Integer.parseInt(hh_s);

				double vperp_e = Double.parseDouble(line.substring(14, 21)
						.replace(" ", ""));
				double vperp_n = Double.parseDouble(line.substring(21, 28)
						.replace(" ", ""));
				double vpara_u = Double.parseDouble(line.substring(28, 35)
						.replace(" ", ""));
				double vz_ns = Double.parseDouble(line.substring(35, 42)
						.replace(" ", ""));
				double vz_ew = Double.parseDouble(line.substring(42, 49)
						.replace(" ", ""));
				double vd_b1 = Double.parseDouble(line.substring(49, 56)
						.replace(" ", ""));
				double vd_b2 = Double.parseDouble(line.substring(56, 63)
						.replace(" ", ""));
				double vd_b3 = Double.parseDouble(line.substring(63, 70)
						.replace(" ", ""));
				double vd_b4 = Double.parseDouble(line.substring(70, 77)
						.replace(" ", ""));

				Second second = new Second(0, 0, hh, dd, mm, yyyy);
				this.add(second, vperp_n, 0);
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
