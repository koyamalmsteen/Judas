package org.iugonet.www;

import java.net.URI;
import java.beans.*;
import java.io.*;

import org.jfree.data.time.TimeSeries;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class LfrtoTest {
	Lfrto lfrto;
	String url;
	String filepath;

	@Before
	public void setUp() throws Exception {
		lfrto = new Lfrto();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		url = "http://iprt.gp.tohoku.ac.jp";
		filepath = "/lf/cdf/ath/201301/lfrto_30sec_ath_nau_20130101_v01.cdf";

		lfrto.file_http_copy(url + filepath);
		lfrto.read(filepath);
		TimeSeries[] timeSeries = lfrto.getTimeSeries();

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
