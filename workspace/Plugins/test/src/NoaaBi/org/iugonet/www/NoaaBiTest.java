package org.iugonet.www;

import org.jfree.data.time.TimeSeries;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class NoaaBiTest {

	NoaaBi noaaBi;
	String url;
	String filepath;

	@Before
	public void setUp() throws Exception {
		noaaBi = new NoaaBi();
	}

	@After
	public void tearDown() throws Exception {
		noaaBi = null;
		System.gc();
	}

	@Test
	public void test() {
		url = "http://www.swpc.noaa.gov";
		filepath = "/ftpdir/lists/bi/bi_2013.txt";

		noaaBi.file_http_copy(url + filepath);
		noaaBi.read(filepath);

		TimeSeries[] timeSeries = noaaBi.getTimeSeries();
		for (int i = 0; i < timeSeries[0].getItemCount(); i++) {
			System.out.print(timeSeries[0].getTimePeriod(i).getStart() + " ");
			System.out.println(timeSeries[0].getDataItem(i).getValue());
		}
	}

}
