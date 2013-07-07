package org.iugonet.www;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.jfree.data.time.TimeSeries;

public class MuIsdataDriftNcdfTest {
	MuIsdataDriftNcdf muIsdataDriftNcdf;
	String url;
	String filepath;

	@Before
	public void setUp() throws Exception {
		muIsdataDriftNcdf = new MuIsdataDriftNcdf();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		url = "http://www.rish.kyoto-u.ac.jp";
		filepath = "/radar-group/mu/isdata/data/drift/netcdf/1992/19920722_drift.nc";

		muIsdataDriftNcdf.file_http_copy(url + filepath);
		muIsdataDriftNcdf.readData(filepath);

		TimeSeries[] timeSeries = muIsdataDriftNcdf.getTimeSeries();
		for (int i = 0; i < 9; i++) {
			System.out.println(timeSeries[i].getKey());
		}
		for (int i = 0; i < timeSeries[8].getItemCount(); i++) {
			System.out.print(timeSeries[8].getTimePeriod(i).getStart() + " ");
			System.out.println(timeSeries[8].getDataItem(i).getValue());
		}
	}

}
