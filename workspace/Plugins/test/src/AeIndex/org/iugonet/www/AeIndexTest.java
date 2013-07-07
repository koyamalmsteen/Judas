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
		aeIndex.readData("");
	}

}
