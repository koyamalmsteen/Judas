package org.iugonet.www;

import java.net.URI;

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
		String strUrl = "http://wdc-data.iugonet.org/data/min/nur/2006/nur0603.wdc";

		wdc.download(strUrl);
		wdc.read(strUrl);
	}

	@Test
	public void xmlEncoderTest() throws Exception {
		URI uri = new URI(
				"spase://IUGONET/Granule/ICSWSE/MAGDAS/AAB/fluxgate/PT1S_ICSWSE_storage/AAB_SEC_200811010000_mgd");
		sample.read(uri);
		
		try{
			XMLEncoder xmlEncoder = new XMLEncoder(new BufferedOutputStream(new FileOutputStream("goods.xml")));
			encoder.writeObject(goodsArray);
			encoder.close();
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
			XMLDecoder xmlDecoder = new XMLDecoder(new BufferedInputStream(new FileInputStread("goods.xml")));
			goodArray = (Goods[])decoder.readObject();
			decoder.close();
		}catch(FileNotFoundException ex){
			System.err.println(ex);
			return;
		}
		
		for(int i=0;i<goodsArray.length;i++){
			System.out.println("name:");
		}
		
	}
}
