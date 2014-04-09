package org.iugonet.www;

import java.net.URI;
import java.beans.*;
import java.io.*;

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
		aeIndex.read(arg0);
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
