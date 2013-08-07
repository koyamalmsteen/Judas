package org.iugonet.www;

import org.iugonet.www.MuIsdataDriftTxt;
import org.jfree.data.time.TimeSeries;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class MuIsdataDriftTxtTest {
	MuIsdataDriftTxt muIsdataDriftTxt;
	String url;
	String filepath;

	@Before
	public void setUp() throws Exception {
		muIsdataDriftTxt = new MuIsdataDriftTxt();
	}

	@After
	public void tearDown() throws Exception {
		muIsdataDriftTxt = null;
		System.gc();
	}

	@Test
	public void test() {
		url = "http://www.rish.kyoto-u.ac.jp";
		filepath = "/radar-group/mu/isdata/data/drift/text/1986/19860917_drift.txt";

		muIsdataDriftTxt.file_http_copy(url + filepath);
		muIsdataDriftTxt.read(filepath);

		TimeSeries[] timeSeries = muIsdataDriftTxt.getTimeSeries();

		for (int i = 0; i < timeSeries[0].getItemCount(); i++) {
			System.out.print(timeSeries[0].getTimePeriod(i).getStart() + " ");
			System.out.println(timeSeries[0].getDataItem(i).getValue());
		}
	}

}
