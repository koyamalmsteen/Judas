package org.iugonet.www;

import org.jfree.data.time.TimeSeries;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class AceSis1hTest {

	AceSis1h aceSis1h;
	String url;
	String filepath;

	@Before
	public void setUp() throws Exception {
		aceSis1h = new AceSis1h();
	}

	@After
	public void tearDown() throws Exception {
		aceSis1h = null;
		System.gc();
	}

	@Test
	public void test() {
		url = "http://www.swpc.noaa.gov";
		filepath = "/ftpdir/lists/ace2/201303_ace_sis_1h.txt";

		aceSis1h.download(url + filepath);
		aceSis1h.read(filepath);
		TimeSeries[] timeSeries = aceSis1h.getTimeSeries();

		for (int i = 0; i < timeSeries[0].getItemCount(); i++) {
			System.out.print(timeSeries[0].getTimePeriod(i).getStart() + " ");
			System.out.println(timeSeries[0].getDataItem(i).getValue());
		}
	}

}
