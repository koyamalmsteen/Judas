package org.iugonet.www;

import org.jfree.data.time.TimeSeries;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class GoesGpartTest {

	GoesGpart goesGpart;
	String url;
	String filepath;

	@Before
	public void setUp() throws Exception {
		goesGpart = new GoesGpart();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		url = "http://www.swpc.noaa.gov";
		filepath = "/ftpdir/lists/particle/20130324_Gs_part_5m.txt";

		goesGpart.file_http_copy(url + filepath);
		goesGpart.readData(filepath);
		TimeSeries[] timeSeries = goesGpart.getTimeSeries();

		for (int i = 0; i < timeSeries[0].getItemCount(); i++) {
			System.out.print(timeSeries[0].getTimePeriod(i).getStart() + " ");
			System.out.println(timeSeries[0].getDataItem(i).getValue());
		}
	}

}
