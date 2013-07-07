package org.iugonet.www;

import org.jfree.data.time.TimeSeries;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class LfrtoTest {
	Lfrto lfrto;
	String url;
	String filepath;

	@Before
	public void setUp() throws Exception {
		lfrto = new Lfrto();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		url = "http://iprt.gp.tohoku.ac.jp";
		filepath = "/lf/cdf/ath/201301/lfrto_30sec_ath_nau_20130101_v01.cdf";

		lfrto.file_http_copy(url + filepath);
		lfrto.readData(filepath);
		TimeSeries[] timeSeries = lfrto.getTimeSeries();

		for (int i = 0; i < timeSeries[0].getItemCount(); i++) {
			System.out.print(timeSeries[0].getTimePeriod(i).getStart() + " ");
			System.out.println(timeSeries[0].getDataItem(i).getValue());
		}
	}

}
