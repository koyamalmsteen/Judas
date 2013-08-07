package org.iugonet.www;

import org.jfree.data.time.TimeSeries;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class NoaaPowerTest {

	NoaaPower noaaPower;
	String url;
	String filepath;

	@Before
	public void setUp() throws Exception {
		noaaPower = new NoaaPower();
	}

	@After
	public void tearDown() throws Exception {
		noaaPower = null;
		System.gc();
	}

	@Test
	public void test() {
		url = "http://www.swpc.noaa.gov";
		filepath = "/ftpdir/lists/hpi/power_2013.txt";

		noaaPower.file_http_copy(url + filepath);
		noaaPower.read(filepath);

		TimeSeries[] timeSeries = noaaPower.getTimeSeries();
		for (int i = 0; i < timeSeries[0].getItemCount(); i++) {
			System.out.print(timeSeries[0].getTimePeriod(i).getStart() + " ");
			System.out.println(timeSeries[0].getDataItem(i).getValue());
		}
	}

}
