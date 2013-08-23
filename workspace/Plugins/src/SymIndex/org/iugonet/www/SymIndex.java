package org.iugonet.www;

import java.io.BufferedReader;
import java.io.FileReader;
import java.net.URL;

import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.time.Minute;
import org.jfree.data.time.TimeSeriesCollection;

public class SymIndex extends Tplot {

	private BufferedReader bufferedReader;

	public SymIndex() {
		super(1);
		//timeSeries[0].setKey("SYM-H index");
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
				// System.out.print(line.substring(0,6)); //Filler (identifier)
				// value 'ASYSYM'
				int yy = Integer.parseInt(line.substring(12, 14)); // The last
																	// two
																	// digits of
																	// the year
				int yyyy;
				if (yy < 57) { // to be checked
					yyyy = 2000 + yy;
				} else {
					yyyy = 1900 + yy;
				}
				int month = Integer.parseInt(line.substring(14, 16)); // Month
																		// '01'
																		// TO
																		// '12'
				int day = Integer.parseInt(line.substring(16, 18)); // Day of
																	// the month
																	// '01' to
																	// '31'
				int hour = Integer.parseInt(line.substring(19, 21)); // Hour ut,
																		// '00'
																		// to
																		// '23'
				String comp = line.substring(18, 19); // D or H component
				String para = line.substring(21, 24); // ASY or SYM

				if (comp.equals("H") && para.equals("SYM")) {
					for (int i = 0; i < 60; i++) {
						int data = Integer.parseInt(line.substring(34 + 6 * i,
								34 + 6 * (i + 1)).trim());
						if (data == 99999) {
							data = (Integer) null;
						}
						Minute minute = new Minute(i, hour, day, month, yyyy);

						this.add(minute, data, 0);
					}
				}

				if (comp.equals("D") && para.equals("SYM")) {
					for (int i = 0; i < 60; i++) {
						int symd = Integer.parseInt(line.substring(34 + 6 * i,
								34 + 6 * (i + 1)).trim());
						if (symd == 99999) {
							symd = (Integer) null;
						}
						Minute minute = new Minute(i, hour, day, month, yyyy);
						// this.add(minute, (double) symd);
					}
				}

				if (comp.equals("H") && para.equals("ASY")) {
					for (int i = 0; i < 60; i++) {
						int asyh = Integer.parseInt(line.substring(34 + 6 * i,
								34 + 6 * (i + 1)).trim());
						if (asyh == 99999) {
							asyh = (Integer) null;
						}
						Minute minute = new Minute(i, hour, day, month, yyyy);
						// this.add(minute, (double) asyh);
					}
				}

				if (comp.equals("D") && para.equals("ASY")) {
					for (int i = 0; i < 60; i++) {
						int asyd = Integer.parseInt(line.substring(34 + 6 * i,
								34 + 6 * (i + 1)).trim());
						if (asyd == 99999) {
							asyd = (Integer) null;
						}
						Minute minute = new Minute(i, hour, day, month, yyyy);
						// this.add(minute, (double) asyd);
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
