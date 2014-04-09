package org.iugonet.www;

import java.net.URI;
import java.beans.*;
import java.io.*;

import org.jfree.data.time.TimeSeries;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class MuTroposphereWindTxtTest {
	MuTroposphereWindTxt muTroposphereWindTxt;
	String url;
	String filepath;

	@Before
	public void setUp() throws Exception {
		muTroposphereWindTxt = new MuTroposphereWindTxt();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		url = "http://www.rish.kyoto-u.ac.jp";
		filepath = "/radar-group/mu/data/data/ver01.0807_1.01/198603/19860317/19860317.uwnd.csv";

		muTroposphereWindTxt.download(url + filepath);
		muTroposphereWindTxt.read(filepath);

		TimeSeries[] timeSeries = muTroposphereWindTxt.getTimeSeries();

		for (int i = 0; i < timeSeries[20].getItemCount(); i++) {
			System.out.print(timeSeries[20].getTimePeriod(i).getStart() + " ");
			System.out.println(timeSeries[20].getDataItem(i).getValue());
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
			sample = (Sample)xmlDecoder.readObject();
			xmlDecoder.close();
		}catch(FileNotFoundException ex){
			System.err.println(ex);
			return;
		}
	}
}
