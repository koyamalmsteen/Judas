package org.iugonet.www;

import java.net.URI;
import java.beans.*;
import java.io.*;

import org.jfree.data.time.TimeSeries;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class IprtTest {
	Iprt iprt;
	String url;
	String filepath;

	@Before
	public void setUp() throws Exception {
		iprt = new Iprt();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		url = "http://radio.gp.tohoku.ac.jp";
		filepath = "/db/IPRT-SUN/DATA2/2010/20101013_IPRT.fits";

		iprt.download(url + filepath);
		iprt.read(filepath);

		TimeSeries[] timeSeries = iprt.getTimeSeries();
		for (int i = 0; i < timeSeries[400].getItemCount(); i++) {
			System.out.print(timeSeries[400].getTimePeriod(i).getStart() + " ");
			System.out.println(timeSeries[400].getDataItem(i).getValue());
		}
		System.out.println(timeSeries[400].getKey());

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
