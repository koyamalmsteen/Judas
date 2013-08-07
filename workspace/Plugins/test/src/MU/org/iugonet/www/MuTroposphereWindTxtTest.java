package org.iugonet.www;

import org.jfree.data.time.TimeSeries;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class MuTroposphereWindTxtTest {
	MuTroposphereWindTxt muTroposphereWindTxt;
	String url;
	String filepath;

	@Before
	public void setUp() throws Exception {
		muTroposphereWindTxt = new MuTroposphereWindTxt();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		url = "http://www.rish.kyoto-u.ac.jp";
		filepath = "/radar-group/mu/data/data/ver01.0807_1.01/198603/19860317/19860317.uwnd.csv";

		muTroposphereWindTxt.file_http_copy(url + filepath);
		muTroposphereWindTxt.read(filepath);

		TimeSeries[] timeSeries = muTroposphereWindTxt.getTimeSeries();

		for (int i = 0; i < timeSeries[20].getItemCount(); i++) {
			System.out.print(timeSeries[20].getTimePeriod(i).getStart() + " ");
			System.out.println(timeSeries[20].getDataItem(i).getValue());
		}
	}

}
