package org.iugonet.www;

import org.jfree.data.time.TimeSeries;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class AceMagTest {

	AceMag aceMag;
	String url;
	String filepath;

	@Before
	public void setUp() throws Exception {
		aceMag = new AceMag();
	}

	@After
	public void tearDown() throws Exception {
		aceMag = null;
		System.gc();
	}

	@Test
	public void test() {
		url = "http://www.swpc.noaa.gov";
		// filepath = "/ftpdir/lists/ace2/201303_ace_mag_1h.txt";
		filepath = "/ftpdir/lists/ace/20130322_ace_mag_1m.txt";

		aceMag.file_http_copy(url + filepath);
		aceMag.read(filepath);
		TimeSeries[] timeSeries = aceMag.getTimeSeries();

		for (int i = 0; i < timeSeries[0].getItemCount(); i++) {
			System.out.print(timeSeries[0].getTimePeriod(i).getStart() + " ");
			System.out.println(timeSeries[0].getDataItem(i).getValue());
		}
	}

}
