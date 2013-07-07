package org.iugonet.www;

import org.iugonet.www.TplotWdcDst;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TplotWdcDstTest {

	TplotWdcDst tplotWdcDst;
	String arg0 = "http://wdc-data.iugonet.org/data/hour/index/dst/1984/dst8410";

	@Before
	public void setUp() throws Exception {
		tplotWdcDst = new TplotWdcDst(arg0);
	}

	@After
	public void tearDown() throws Exception {
		tplotWdcDst = null;
		System.gc();
	}

	@Test
	public void test_01() {
		// fail("Not yet implemented");
	}

}
