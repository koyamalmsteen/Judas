package org.iugonet.www;

import java.net.URI;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.jfree.data.time.TimeSeries;

public class MuIsdataTetiNcdfTest {
	MuIsdataTetiNcdf muIsdataTetiNcdf;
	String url;
	String filepath;

	@Before
	public void setUp() throws Exception {
		muIsdataTetiNcdf = new MuIsdataTetiNcdf();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		url = "http://www.rish.kyoto-u.ac.jp";
		filepath = "/radar-group/mu/isdata/data/teti/netcdf/1986/19860714_teti.nc";

		muIsdataTetiNcdf.download(url + filepath);
		muIsdataTetiNcdf.read(filepath);

		TimeSeries[] timeSeries = muIsdataTetiNcdf.getTimeSeries();
		for (int i = 0; i < timeSeries[1].getItemCount(); i++) {
			System.out.print(timeSeries[1].getTimePeriod(i).getStart() + " ");
			System.out.println(timeSeries[1].getDataItem(i).getValue());
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
