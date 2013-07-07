package org.iugonet.www;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.jfree.data.time.TimeSeries;

public class MuMeteorNcdfTest {
	MuMeteorNcdf muMeteorNcdf1month;

	int num;
	String url = "http://www.rish.kyoto-u.ac.jp";
	String filepath = "/radar-group/mu/meteor/data/netcdf/1_month/h1km_t60min00/1990/W199005.h1t60min00.nc";

	// String filepath =
	// "/radar-group/mu/meteor/data/netcdf/1_month/h2km_t60min00/1990/W199005.h2t60min00.nc";
	// String filepath =
	// "/radar-group/mu/meteor/data/netcdf/1_day/h1km_t60min00/1990/W19900518.h1t60min00.nc";
	// String filepath =
	// "/radar-group/mu/meteor/data/netcdf/1_day/h2km_t60min00/1990/W19900518.h2t60min00.nc";

	@Before
	public void setUp() throws Exception {
		if (filepath.contains("h1")) {
			num = 41 * 4;
		} else if (filepath.contains("h2")) {
			num = 21 * 4;
		}
		muMeteorNcdf1month = new MuMeteorNcdf(num);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {

		muMeteorNcdf1month.file_http_copy(url + filepath);
		muMeteorNcdf1month.readData(filepath);

		TimeSeries[] timeSeries = muMeteorNcdf1month.getTimeSeries();
		// for (int i = 0; i < num; i++) {
		// System.out.println(timeSeries[i].getKey());
		// }
		for (int i = 0; i < timeSeries[11].getItemCount(); i++) {
			System.out.print(timeSeries[11].getTimePeriod(i).getStart() + " ");
			System.out.println(timeSeries[11].getDataItem(i).getValue());
		}
	}

}
