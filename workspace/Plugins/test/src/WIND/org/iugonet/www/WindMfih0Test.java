package org.iugonet.www;

import org.jfree.data.time.TimeSeries;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class WindMfih0Test {
	WindMfih0 windMfih0;
	String url;
	String filepath;
	
	@Before
	public void setUp() throws Exception {
		windMfih0 = new WindMfih0();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		url = "http://spdf.gsfc.nasa.gov";
		filepath = "/pub/data/wind/mfi/mfi_h0/1994/wi_h0_mfi_19941113_v05.cdf";
		windMfih0.file_http_copy(url+filepath);
		windMfih0.readData(filepath);
		
		TimeSeries[] timeSeries = windMfih0.getTimeSeries();

		for (int i = 0; i < timeSeries.length; i++) {
			System.out.println(timeSeries[i].getKey());
		}
		
		for (int i = 0; i < timeSeries[2].getItemCount(); i++) {
			System.out.print(timeSeries[2].getTimePeriod(i).getStart() + " ");
			System.out.println(timeSeries[2].getDataItem(i).getValue());
		}
	}

}
