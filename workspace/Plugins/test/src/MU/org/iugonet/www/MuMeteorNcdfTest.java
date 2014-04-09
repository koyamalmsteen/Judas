package org.iugonet.www;

import java.net.URI;
import java.beans.*;
import java.io.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.jfree.data.time.TimeSeries;

public class MuMeteorNcdfTest {
	MuMeteorNcdf muMeteorNcdf1month;

	int num;
	String url = "http://www.rish.kyoto-u.ac.jp";
	String filepath = "/radar-group/mu/meteor/data/netcdf/1_month/h1km_t60min00/1990/W199005.h1t60min00.nc";

	// String filepath =
	// "/radar-group/mu/meteor/data/netcdf/1_month/h2km_t60min00/1990/W199005.h2t60min00.nc";
	// String filepath =
	// "/radar-group/mu/meteor/data/netcdf/1_day/h1km_t60min00/1990/W19900518.h1t60min00.nc";
	// String filepath =
	// "/radar-group/mu/meteor/data/netcdf/1_day/h2km_t60min00/1990/W19900518.h2t60min00.nc";

	@Before
	public void setUp() throws Exception {
		if (filepath.contains("h1")) {
			num = 41 * 4;
		} else if (filepath.contains("h2")) {
			num = 21 * 4;
		}
		muMeteorNcdf1month = new MuMeteorNcdf(num);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {

		muMeteorNcdf1month.download(url + filepath);
		muMeteorNcdf1month.read(filepath);

		TimeSeries[] timeSeries = muMeteorNcdf1month.getTimeSeries();
		// for (int i = 0; i < num; i++) {
		// System.out.println(timeSeries[i].getKey());
		// }
		for (int i = 0; i < timeSeries[11].getItemCount(); i++) {
			System.out.print(timeSeries[11].getTimePeriod(i).getStart() + " ");
			System.out.println(timeSeries[11].getDataItem(i).getValue());
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
