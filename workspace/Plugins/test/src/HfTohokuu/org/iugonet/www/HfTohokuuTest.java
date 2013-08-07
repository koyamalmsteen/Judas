package org.iugonet.www;

import org.iugonet.www.HfTohokuu;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class HfTohokuuTest {
	HfTohokuu hfTohokuu;
	String url;
	String filepath;

	@Before
	public void setUp() throws Exception {
		hfTohokuu = new HfTohokuu();
	}

	@After
	public void tearDown() throws Exception {
		hfTohokuu = null;
		System.gc();
	}

	@Test
	public void test() {
		url = "http://ariel.gp.tohoku.ac.jp/";
		filepath = "/~jupiter/it_hf/cdf2/20040109/it_h1_hf_2004010922_v02.cdf";

		hfTohokuu.file_http_copy(url + filepath);
		hfTohokuu.read(filepath);
	}

}
