package org.iugonet.www;

import org.jfree.data.time.TimeSeries;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class PoesTxtTest {

	PoesTxt poesTxt;
	String url;
	String filepath;

	@Before
	public void setUp() throws Exception {
		poesTxt = new PoesTxt();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		url = "http://satdat.ngdc.noaa.gov";
		filepath = "/sem/poes/data/avg/txt/1998/noaa15/poes_n15_19980701.txt";

		// poesTxt.file_http_copy(url + filepath);
		poesTxt.read(filepath);

		TimeSeries[] timeSeries = poesTxt.getTimeSeries();
		for (int i = 0; i < timeSeries[1].getItemCount(); i++) {
			System.out.print(timeSeries[1].getTimePeriod(i).getStart() + " ");
			System.out.println(timeSeries[1].getDataItem(i).getValue());
		}
		for (int j = 0; j < 34; j++) {
			System.out.println(timeSeries[j].getKey());
		}

	}

}
