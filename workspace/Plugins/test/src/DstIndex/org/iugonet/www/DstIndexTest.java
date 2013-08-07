package org.iugonet.www;

import java.net.URI;
import java.net.URL;

import org.iugonet.www.DstIndex;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class DstIndexTest {

	DstIndex dstIndex;

	@Before
	public void setUp() throws Exception {
		dstIndex = new DstIndex();
	}

	@After
	public void tearDown() throws Exception {
		dstIndex = null;
		System.gc();
	}

	@Test
	public void test01() {
		String strUri = "spase://IUGONET/Granule/WDC_Kyoto/WDC/Dst/index/PT1H/dst198410_wdc";
		URI uri;
		try {
			uri = new URI(strUri);
			dstIndex.load(uri);
		} catch (Exception e) {
			e.printStackTrace();
		}
		/*
		 * String arg0 =
		 * "http://wdc-data.iugonet.org/data/hour/index/dst/1984/dst8410";
		 * 
		 * dstIndex.readData(arg0); TimeSeries timeSeries =
		 * dstIndex.getTimeSeries();
		 * 
		 * for (int i = 0; i < timeSeries.getItemCount(); i++) {
		 * System.out.print(timeSeries.getTimePeriod(i).getStart() + " ");
		 * System.out.println(timeSeries.getDataItem(i).getValue()); }
		 */
	}

	@Test
	public void test02() {
		String strUrl = "http://wdc-data.iugonet.org/data/hour/index/dst/1984/dst8410";
		try {
			URL url = new URL(strUrl);
//			dstIndex.load(uri);		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test
	public void test03() {
		String strUri = "spase://IUGONET/Granule/WDC_Kyoto/WDC/Dst/index/PT1H/dst198410_wdc";
		URI uri;
		try {
			uri = new URI(strUri);
			System.out.println(uri);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
