package org.iugonet.www;

import java.net.URI;
import java.beans.*;
import java.io.*;

import org.iugonet.www.Mm210;
import org.jfree.data.time.TimeSeries;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Mm210Test {
	Mm210 mm210;
	String url;
	String filepath;

	@Before
	public void setUp() throws Exception {
		mm210 = new Mm210();
	}

	@After
	public void tearDown() throws Exception {
		mm210 = null;
		System.gc();
	}

	@Test
	public void test() {
		url = "http://gemsissc.stelab.nagoya-u.ac.jp";
		filepath = "/data/ergsc/ground/geomag/mm210/1min/ewa/2008/mm210_1min_ewa_20080222_v01.cdf";
		mm210.file_http_copy(url + filepath);
		mm210.read(filepath);

		TimeSeries[] timeSeries = mm210.getTimeSeries();
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
			sample = (Sample)xmlDecoder.readObject();
			xmlDecoder.close();
		}catch(FileNotFoundException ex){
			System.err.println(ex);
			return;
		}
	}
}
