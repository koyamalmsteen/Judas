package org.iugonet.www;

import java.net.URI;
import java.beans.*;
import java.io.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class MuIonogramTxtTest {
	MuIonogramTxt muIonogramTxt;
	String url;
	String filepath;

	@Before
	public void setUp() throws Exception {
		muIonogramTxt = new MuIonogramTxt();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		url = "http://database.rish.kyoto-u.ac.jp";
		filepath = "/arch/mudb/data/ionosonde/text/2001/200101/20010118/200101181714_ionogram.txt";

		muIonogramTxt.download(url + filepath);
		muIonogramTxt.read(filepath);

		// TimeSeries timeSeries = muIonogramTxt.getTimeSeries();
		//
		// for (int i = 0; i < timeSeries.getItemCount(); i++) {
		// System.out.print(timeSeries.getTimePeriod(i).getStart() + " ");
		// System.out.println(timeSeries.getDataItem(i).getValue());
		// }
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
