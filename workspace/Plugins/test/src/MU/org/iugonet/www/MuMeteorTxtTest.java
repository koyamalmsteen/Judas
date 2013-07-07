package org.iugonet.www;

import org.jfree.data.time.TimeSeries;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class MuMeteorTxtTest {
	MuMeteorTxt muMeteorTxt;
	String url;
	String filepath;

	@Before
	public void setUp() throws Exception {
		muMeteorTxt = new MuMeteorTxt();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		url = "http://www.rish.kyoto-u.ac.jp";
		filepath = "/radar-group/mu/meteor/data/text/1_day/h1km_t60min00/1990/W19900518.h1t60min00.txt";

		muMeteorTxt.file_http_copy(url + filepath);
		muMeteorTxt.readData(filepath);

		TimeSeries[] timeSeries = muMeteorTxt.getTimeSeries();

		for (int i = 0; i < timeSeries[0].getItemCount(); i++) {
			System.out.print(timeSeries[0].getTimePeriod(i).getStart() + " ");
			System.out.println(timeSeries[0].getDataItem(i).getValue());
		}
	}

}
