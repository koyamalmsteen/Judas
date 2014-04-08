package org.iugonet.www;

import java.io.BufferedReader;
import java.io.FileReader;
import java.net.URL;

import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.time.TimeSeriesCollection;

public class Eiscat extends Tplot {

	private BufferedReader bufferedReader;

	public Eiscat() {
		// ACE - Electron, Proton, and Alpha Monitor
		super(16);
		/*
		timeSeries[0].setKey("EISCAT Radar - Altitude of a gate in km");
		timeSeries[1]
				.setKey("EISCAT Radar - Geographical latitude of a gate in deg");
		timeSeries[2]
				.setKey("EISCAT Radar - Geographical longitude of a gate in deg");
		timeSeries[3].setKey("EISCAT Radar - Electron number density in m^-3");
		timeSeries[4].setKey("EISCAT Radar - Ion velocity in m/s");
		timeSeries[5].setKey("EISCAT Radar - Ion temperature in K");
		timeSeries[6].setKey("EISCAT Radar - Electron temperature in K");
		timeSeries[7]
				.setKey("EISCAT Radar - Error of electron number density in m^-3");
		timeSeries[8].setKey("EISCAT Radar - Error of ion velocity in m/s");
		timeSeries[9].setKey("EISCAT Radar - Error of ion temperature in K");
		timeSeries[10]
				.setKey("EISCAT Radar - Error of electron temperature in K");
		timeSeries[11].setKey("EISCAT Radar - Azimuth angle of a beam in deg");
		timeSeries[12]
				.setKey("EISCAT Radar - Elevation angle of a beam in deg");
		timeSeries[13]
				.setKey("EISCAT Radar - Ratio of O+ number density to Ne number density in 1e-3");
		timeSeries[14]
				.setKey("EISCAT Radar - Collision frequency in log10(1e-3)");
		timeSeries[15].setKey("EISCAT Radar - Beam range in km");
		*/
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	@Override
	void read(URL url) {

		String line;
		int hh_s = 0;
		int mi_s = 0;
		int sc_s = 0;
		int hh_e = 0;
		int mi_e = 0;
		int sc_e = 0;
		int n = 0;

		try {
			FileReader fileReader = new FileReader("/tmp" + url.getPath());
			bufferedReader = new BufferedReader(fileReader);

			while ((line = bufferedReader.readLine()) != null) {
				if (!line.substring(0, 1).equals("%")) {

					int yyyy = Integer.parseInt(line.substring(0, 4));
					int mm = Integer.parseInt(line.substring(4, 6));
					int dd = Integer.parseInt(line.substring(6, 8));

					String hh_s_str = line.substring(9, 11).trim();
					String mi_s_str = line.substring(11, 13).trim();
					String sc_s_str = line.substring(13, 15).trim();
					String hh_e_str = line.substring(18, 20).trim();
					String mi_e_str = line.substring(20, 22).trim();
					String sc_e_str = line.substring(22, 24).trim();

					if (!hh_s_str.equals("")) {
						hh_s = Integer.parseInt(hh_s_str);
					}
					if (!mi_s_str.equals("")) {
						mi_s = Integer.parseInt(mi_s_str);
					}
					if (!sc_s_str.equals("")) {
						sc_s = Integer.parseInt(sc_s_str);
					}
					if (!hh_e_str.equals("")) {
						hh_e = Integer.parseInt(hh_e_str);
					}
					if (!mi_e_str.equals("")) {
						mi_e = Integer.parseInt(mi_e_str);
					}
					if (!sc_e_str.equals("")) {
						sc_e = Integer.parseInt(sc_e_str);
					}

					// Spatial Information
					double alt = Double.parseDouble(line.substring(26, 33));
					double lat = Double.parseDouble(line.substring(33, 40));
					double lon = Double.parseDouble(line.substring(40, 47));

					// Variable
					double ne = Double.parseDouble(line.substring(49, 55));
					int vi = Integer.parseInt(line.substring(55, 61).trim());
					int ti = Integer.parseInt(line.substring(61, 67).trim());
					int te = Integer.parseInt(line.substring(67, 73).trim());

					// Error
					double errne = Double.parseDouble(line.substring(73, 79));
					int errvi = Integer.parseInt(line.substring(79, 85).trim());
					int errti = Integer.parseInt(line.substring(85, 91).trim());
					int errte = Integer.parseInt(line.substring(91, 97).trim());

					// Others
					double az = Double.parseDouble(line.substring(97, 104));
					double el = Double.parseDouble(line.substring(104, 111));
					int o_ne = Integer
							.parseInt(line.substring(111, 115).trim());
					double co = Double.parseDouble(line.substring(115, 122));
					double range = Double.parseDouble(line.substring(122, 129));

					System.out.println(n + "  " + alt);

					// Second second = new Second(sc_s, mi_s, hh_s, dd, mm,
					// yyyy);
					// this.add(second, alt, 0);
					// this.add(second, lat, 1);
					// this.add(second, lon, 2);
					// this.add(second, ne, 3);
					// this.add(second, vi, 4);
					// this.add(second, ti, 5);
					// this.add(second, te, 6);
					// this.add(second, errne, 7);
					// this.add(second, errvi, 8);
					// this.add(second, errti, 9);
					// this.add(second, errte, 10);
					// this.add(second, az, 11);
					// this.add(second, el, 12);
					// this.add(second, o_ne, 13);
					// this.add(second, co, 14);
					// this.add(second, range, 15);

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
