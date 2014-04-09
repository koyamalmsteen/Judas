package org.iugonet.www;

import java.beans.*;
import java.io.*;
import java.net.URI;

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
