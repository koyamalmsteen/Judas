package org.iugonet.www;

import org.jfree.data.time.TimeSeries;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class AceLoc1hTest {

	AceLoc1h aceLoc1h;
	String url;
	String filepath;

	@Before
	public void setUp() throws Exception {
		aceLoc1h = new AceLoc1h();
	}

	@After
	public void tearDown() throws Exception {
		aceLoc1h = null;
		System.gc();
	}

	@Test
	public void test() {
		url = "http://www.swpc.noaa.gov";
		filepath = "/ftpdir/lists/ace2/201303_ace_loc_1h.txt";

		aceLoc1h.file_http_copy(url + filepath);
		aceLoc1h.readData(filepath);
		TimeSeries[] timeSeries = aceLoc1h.getTimeSeries();

		for (int i = 0; i < timeSeries[0].getItemCount(); i++) {
			System.out.print(timeSeries[0].getTimePeriod(i).getStart() + " ");
			System.out.println(timeSeries[0].getDataItem(i).getValue());
		}
	}

}
