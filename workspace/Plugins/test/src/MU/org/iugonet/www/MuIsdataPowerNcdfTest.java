package org.iugonet.www;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.jfree.data.time.TimeSeries;

public class MuIsdataPowerNcdfTest {
	MuIsdataPowerNcdf muIsdataPowerNcdf;
	String url;
	String filepath;

	@Before
	public void setUp() throws Exception {
		muIsdataPowerNcdf = new MuIsdataPowerNcdf();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		url = "http://www.rish.kyoto-u.ac.jp";
		filepath = "/radar-group/mu/isdata/data/pwr/netcdf/1986/19860811_pwr.nc";

		muIsdataPowerNcdf.file_http_copy(url + filepath);
		muIsdataPowerNcdf.read(filepath);

		TimeSeries[] timeSeries = muIsdataPowerNcdf.getTimeSeries();

		// for (int i = 0; i < 256*4; i++) {
		// System.out.println(timeSeries[i].getKey());
		// }

		System.out.println(timeSeries[0].getKey());
		for (int i = 0; i < timeSeries[0].getItemCount(); i++) {
			System.out.print(timeSeries[0].getTimePeriod(i).getStart() + " ");
			System.out.println(timeSeries[0].getDataItem(i).getValue());
		}
	}

}
