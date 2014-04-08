package org.iugonet.www;

import static org.junit.Assert.*;

import java.net.URI;
import java.net.URL;

import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.xy.XYSeriesCollection;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class XYplotTest {

	class Sample extends XYplot{

		@Override
		public ChartPanel getChartPanel() {
			return null;
		}

		@Override
		public JFreeChart getChart() {
			return null;
		}

		@Override
		public XYSeriesCollection load(String strUrl) {
			return null;

		}

		@Override
		void read(URL url) {	
		}
		
	}
	
	Sample sample;
	
	@Before
	public void setUp() throws Exception {
		sample = new Sample();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test01() {
		sample.add(1, 1, 0);
		sample.add(1, 2, 0);
		assertEquals(1,1);
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
