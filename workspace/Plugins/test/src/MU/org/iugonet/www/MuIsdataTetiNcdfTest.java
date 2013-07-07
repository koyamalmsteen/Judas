package org.iugonet.www;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.jfree.data.time.TimeSeries;

public class MuIsdataTetiNcdfTest {
	MuIsdataTetiNcdf muIsdataTetiNcdf;
	String url;
	String filepath;

	@Before
	public void setUp() throws Exception {
		muIsdataTetiNcdf = new MuIsdataTetiNcdf();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		url = "http://www.rish.kyoto-u.ac.jp";
		filepath = "/radar-group/mu/isdata/data/teti/netcdf/1986/19860714_teti.nc";

		muIsdataTetiNcdf.file_http_copy(url + filepath);
		muIsdataTetiNcdf.readData(filepath);

		TimeSeries[] timeSeries = muIsdataTetiNcdf.getTimeSeries();
		for (int i = 0; i < timeSeries[1].getItemCount(); i++) {
			System.out.print(timeSeries[1].getTimePeriod(i).getStart() + " ");
			System.out.println(timeSeries[1].getDataItem(i).getValue());
		}
	}

}
