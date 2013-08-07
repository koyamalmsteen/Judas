package org.iugonet.www;

import org.jfree.data.time.TimeSeries;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class GoesGpchanTest {

	GoesGpchan goesGpchan;
	String url;
	String filepath;

	@Before
	public void setUp() throws Exception {
		goesGpchan = new GoesGpchan();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		url = "http://www.swpc.noaa.gov";
		filepath = "/ftpdir/lists/pchan/Gs_pchan_5m.txt";

		goesGpchan.file_http_copy(url + filepath);
		goesGpchan.read(filepath);
		TimeSeries[] timeSeries = goesGpchan.getTimeSeries();

		for (int i = 0; i < timeSeries[0].getItemCount(); i++) {
			System.out.print(timeSeries[0].getTimePeriod(i).getStart() + " ");
			System.out.println(timeSeries[0].getDataItem(i).getValue());
		}
	}

}
