package org.iugonet.www;

import org.iugonet.www.AceEpam;
import org.jfree.data.time.TimeSeries;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class AceEpamTest {

	AceEpam aceEpam;
	String url;
	String filepath;

	@Before
	public void setUp() throws Exception {
		aceEpam = new AceEpam();
	}

	@After
	public void tearDown() throws Exception {
		aceEpam = null;
		System.gc();
	}

	@Test
	public void test() {
		url = "http://www.swpc.noaa.gov";
		// filepath = "/ftpdir/lists/ace2/201303_ace_epam_1h.txt";
		filepath = "/ftpdir/lists/ace/20130322_ace_epam_5m.txt";

		aceEpam.file_http_copy(url + filepath);
		aceEpam.readData(filepath);
		TimeSeries[] timeSeries = aceEpam.getTimeSeries();

		for (int i = 0; i < timeSeries[0].getItemCount(); i++) {
			System.out.print(timeSeries[0].getTimePeriod(i).getStart() + " ");
			System.out.println(timeSeries[0].getDataItem(i).getValue());
		}
	}

}
