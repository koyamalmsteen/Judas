package org.iugonet.www;

import java.net.URI;
import java.beans.*;
import java.io.*;

import org.iugonet.www.AceEpam;
import org.jfree.data.time.TimeSeries;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class AceEpamTest {

	AceEpam aceEpam;
	String url;
	String filepath;

	@Before
	public void setUp() throws Exception {
		aceEpam = new AceEpam();
	}

	@After
	public void tearDown() throws Exception {
		aceEpam = null;
		System.gc();
	}

	@Test
	public void test() {
		url = "http://www.swpc.noaa.gov";
		// filepath = "/ftpdir/lists/ace2/201303_ace_epam_1h.txt";
		filepath = "/ftpdir/lists/ace/20130322_ace_epam_5m.txt";

		aceEpam.download(url + filepath);
		aceEpam.read(filepath);
		TimeSeries[] timeSeries = aceEpam.getTimeSeries();

		for (int i = 0; i < timeSeries[0].getItemCount(); i++) {
			System.out.print(timeSeries[0].getTimePeriod(i).getStart() + " ");
			System.out.println(timeSeries[0].getDataItem(i).getValue());
		}
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
			goodArray = (Goods[])xmlDecoder.readObject();
			xmlDecoder.close();
		}catch(FileNotFoundException ex){
			System.err.println(ex);
			return;
		}
		
		for(int i=0;i<goodsArray.length;i++){
			System.out.println("name:");
		}
		
	}
}
