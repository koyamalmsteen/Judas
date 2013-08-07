package org.iugonet.www;

import org.iugonet.www.MuIsdataPowerTxt;
import org.jfree.data.time.TimeSeries;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class MuIsdataPowerTxtTest {
	MuIsdataPowerTxt muIsdataPowerTxt;
	String url;
	String filepath;

	@Before
	public void setUp() throws Exception {
		muIsdataPowerTxt = new MuIsdataPowerTxt();
	}

	@After
	public void tearDown() throws Exception {
		muIsdataPowerTxt = null;
		System.gc();
	}

	@Test
	public void test() {
		url = "http://www.rish.kyoto-u.ac.jp";
		filepath = "/radar-group/mu/isdata/data/pwr/text/1986/19860811_pwr1.txt";

		muIsdataPowerTxt.file_http_copy(url + filepath);
		muIsdataPowerTxt.read(filepath);

		TimeSeries[] timeSeries = muIsdataPowerTxt.getTimeSeries();

		for (int i = 0; i < timeSeries[0].getItemCount(); i++) {
			System.out.print(timeSeries[0].getTimePeriod(i).getStart() + " ");
			System.out.println(timeSeries[0].getDataItem(i).getValue());
		}
	}

}
