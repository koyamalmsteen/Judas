package org.iugonet.www;

import org.jfree.data.time.TimeSeries;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class AceSis5mTest {

	AceSis5m aceSis5m;
	String url;
	String filepath;

	@Before
	public void setUp() throws Exception {
		aceSis5m = new AceSis5m();
	}

	@After
	public void tearDown() throws Exception {
		aceSis5m = null;
		System.gc();
	}

	@Test
	public void test() {
		url = "http://www.swpc.noaa.gov";
		filepath = "/ftpdir/lists/ace/20130322_ace_sis_5m.txt";

		aceSis5m.file_http_copy(url + filepath);
		aceSis5m.readData(filepath);
		TimeSeries[] timeSeries = aceSis5m.getTimeSeries();

		for (int i = 0; i < timeSeries[0].getItemCount(); i++) {
			System.out.print(timeSeries[0].getTimePeriod(i).getStart() + " ");
			System.out.println(timeSeries[0].getDataItem(i).getValue());
		}
	}

}
