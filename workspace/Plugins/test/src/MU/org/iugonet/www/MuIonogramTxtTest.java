package org.iugonet.www;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class MuIonogramTxtTest {
	MuIonogramTxt muIonogramTxt;
	String url;
	String filepath;

	@Before
	public void setUp() throws Exception {
		muIonogramTxt = new MuIonogramTxt();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		url = "http://database.rish.kyoto-u.ac.jp";
		filepath = "/arch/mudb/data/ionosonde/text/2001/200101/20010118/200101181714_ionogram.txt";

		muIonogramTxt.file_http_copy(url + filepath);
		muIonogramTxt.readData(filepath);

		// TimeSeries timeSeries = muIonogramTxt.getTimeSeries();
		//
		// for (int i = 0; i < timeSeries.getItemCount(); i++) {
		// System.out.print(timeSeries.getTimePeriod(i).getStart() + " ");
		// System.out.println(timeSeries.getDataItem(i).getValue());
		// }
	}

}
