package org.iugonet.www;

import org.jfree.data.time.TimeSeries;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class AceSwepamTest {

	AceSwepam aceSwepam;
	String url;
	String filepath;

	@Before
	public void setUp() throws Exception {
		aceSwepam = new AceSwepam();
	}

	@After
	public void tearDown() throws Exception {
		aceSwepam = null;
		System.gc();
	}

	@Test
	public void test() {
		url = "http://www.swpc.noaa.gov";
		filepath = "/ftpdir/lists/ace2/201303_ace_swepam_1h.txt";

		aceSwepam.file_http_copy(url + filepath);
		aceSwepam.read(filepath);
		TimeSeries[] timeSeries = aceSwepam.getTimeSeries();

		for (int i = 0; i < timeSeries[0].getItemCount(); i++) {
			System.out.print(timeSeries[0].getTimePeriod(i).getStart() + " ");
			System.out.println(timeSeries[0].getDataItem(i).getValue());
		}
	}

}
