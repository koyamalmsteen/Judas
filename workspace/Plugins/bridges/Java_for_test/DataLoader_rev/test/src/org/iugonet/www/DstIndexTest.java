package org.iugonet.www;

import org.iugonet.www.DstIndexLoad;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class DstIndexTest {

	DstIndexLoad dstIndexLoad;
	double[][] array;
	
	@Before
	public void setUp() throws Exception {
		dstIndexLoad = new DstIndexLoad();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test01() {
		DstIndexLoad dstIndexLoad = new DstIndexLoad();

		String arg0 = "http://wdc-data.iugonet.org/data/hour/index/dst/1984/dst8410";
		array=dstIndexLoad.LoadData(arg0);
	}
}
