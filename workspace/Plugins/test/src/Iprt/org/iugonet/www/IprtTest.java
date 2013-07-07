package org.iugonet.www;

import org.jfree.data.time.TimeSeries;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class IprtTest {
	Iprt iprt;
	String url;
	String filepath;

	@Before
	public void setUp() throws Exception {
		iprt = new Iprt();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		url = "http://radio.gp.tohoku.ac.jp";
		filepath = "/db/IPRT-SUN/DATA2/2010/20101013_IPRT.fits";

		iprt.file_http_copy(url + filepath);
		iprt.readData(filepath);

		TimeSeries[] timeSeries = iprt.getTimeSeries();
		for (int i = 0; i < timeSeries[400].getItemCount(); i++) {
			System.out.print(timeSeries[400].getTimePeriod(i).getStart() + " ");
			System.out.println(timeSeries[400].getDataItem(i).getValue());
		}
		System.out.println(timeSeries[400].getKey());

	}

}
