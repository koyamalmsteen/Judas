package org.iugonet.www;

import static org.junit.Assert.*;

import org.iugonet.www.Cira86Ascii;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Cira86AsciiTest {

	Cira86Ascii cira86Ascii;

	@Before
	public void setUp() throws Exception {
		cira86Ascii = new Cira86Ascii();
	}

	@After
	public void tearDown() throws Exception {
		cira86Ascii = null;
		System.gc();
	}

	@Test
	public void test() {
		// http://nssdcftp.gsfc.nasa.gov/models/atmospheric/cira/cira86ascii/
		fail("Not yet implemented");
	}

}
