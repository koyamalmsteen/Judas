package org.iugonet.www;

import org.iugonet.www.SymIndex;
import org.jfree.data.time.TimeSeries;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class SymIndexTest {

	SymIndex symIndex;
	String url;
	String filepath;

	@Before
	public void setUp() throws Exception {
		symIndex = new SymIndex();
	}

	@After
	public void tearDown() throws Exception {
		symIndex = null;
		System.gc();
	}

	@Test
	public void test01() {
		url = "http://wdc-data.iugonet.org";
		filepath = "/data/min/index/asy/1988/asy8803.wdc";

		symIndex.file_http_copy(url + filepath);
		symIndex.readData(filepath);
		TimeSeries[] timeSeries = symIndex.getTimeSeries();

		for (int i = 0; i < timeSeries[0].getItemCount(); i++) {
			System.out.print(timeSeries[0].getTimePeriod(i).getStart() + " ");
			System.out.println(timeSeries[0].getDataItem(i).getValue());
		}
	}

	@Test
	public void test02() {
		url = "http://wdc-data.iugonet.org";
		filepath = "/data/min/index/asy/1988/asy8803.wdc";
		symIndex.file_http_copy(url + filepath);
		symIndex.readData(filepath);
	}

}
