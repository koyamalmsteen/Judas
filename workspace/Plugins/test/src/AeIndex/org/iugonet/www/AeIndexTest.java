package org.iugonet.www;

import org.iugonet.www.AeIndex;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class AeIndexTest {

	AeIndex aeIndex;

	@Before
	public void setUp() throws Exception {
		aeIndex = new AeIndex();
	}

	@After
	public void tearDown() throws Exception {
		aeIndex = null;
		System.gc();
	}

	@Test
	public void test01() {
		/*
		aeIndex.readData("");
		*/
	}

	@Test
	public void test02() {
		String arg0 = "http://wdc-data.iugonet.org/data/hour/index/ae/1957/ae.5707.ngdc5";

		aeIndex.file_http_copy(arg0);
		aeIndex.readData(arg0);
	}
}
