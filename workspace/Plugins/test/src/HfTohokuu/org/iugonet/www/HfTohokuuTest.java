package org.iugonet.www;

import java.net.URI;
import java.beans.*;
import java.io.*;

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

	@Test
	public void xmlEncoderTest() throws Exception {
		URI uri = new URI(
				"spase://IUGONET/Granule/ICSWSE/MAGDAS/AAB/fluxgate/PT1S_ICSWSE_storage/AAB_SEC_200811010000_mgd");
		sample.read(uri);
		
		try{
			XMLEncoder xmlEncoder = new XMLEncoder(new BufferedOutputStream(new FileOutputStream("goods.xml")));
			xmlEncoder.writeObject(goodsArray);
			xmlEncoder.close();
		} catch(FileNotFoundException ex){
			System.err.println(ex);
		}
	}
	
	@Test
	public void xmlDecoderTest() throws Exception {
		URI uri = new URI(
				"spase://IUGONET/Granule/ICSWSE/MAGDAS/AAB/fluxgate/PT1S_ICSWSE_storage/AAB_SEC_200811010000_mgd");
		sample.read(uri);
		
		try{
			XMLDecoder xmlDecoder = new XMLDecoder(new BufferedInputStream(new FileInputStream("goods.xml")));
			sample = (Sample)xmlDecoder.readObject();
			xmlDecoder.close();
		}catch(FileNotFoundException ex){
			System.err.println(ex);
			return;
		}
	}
}
