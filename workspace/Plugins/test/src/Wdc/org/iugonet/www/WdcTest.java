package org.iugonet.www;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class WdcTest {

	Wdc wdc;

	@Before
	public void setUp() throws Exception {
		wdc = new Wdc();
	}

	@After
	public void tearDown() throws Exception {
		wdc = null;
		System.gc();
	}

	@Test
	public void test01() {
		String arg0 = "http://wdc-data.iugonet.org/data/min/nur/2006/nur0603.wdc";

		wdc.file_http_copy(arg0);
		wdc.read(arg0);
	}

}
