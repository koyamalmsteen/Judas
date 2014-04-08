package org.iugonet.www;

import java.net.URI;

import org.iugonet.www.MuIsdataDriftTxt;
import org.jfree.data.time.TimeSeries;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class MuIsdataDriftTxtTest {
	MuIsdataDriftTxt muIsdataDriftTxt;
	String url;
	String filepath;

	@Before
	public void setUp() throws Exception {
		muIsdataDriftTxt = new MuIsdataDriftTxt();
	}

	@After
	public void tearDown() throws Exception {
		muIsdataDriftTxt = null;
		System.gc();
	}

	@Test
	public void test() {
		url = "http://www.rish.kyoto-u.ac.jp";
		filepath = "/radar-group/mu/isdata/data/drift/text/1986/19860917_drift.txt";

		muIsdataDriftTxt.download(url + filepath);
		muIsdataDriftTxt.read(filepath);

		TimeSeries[] timeSeries = muIsdataDriftTxt.getTimeSeries();

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
