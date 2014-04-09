package org.iugonet.www;

import java.beans.*;
import java.io.*;
import java.net.URI;
import java.net.URL;

import javax.swing.JPanel;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class IplotTest {

	class Sample extends Iplot {

		@Override
		public JPanel getJPanel() {
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
	public void test() {
		String arg ="http://wdc.kugi.kyoto-u.ac.jp/film/image/normal/abg/1906/n060319_h.jpg";
//		spase://IUGONET/Granule/WDC_Kyoto/WDC/ABG/Magnetogram/normal/ABG_19060319_h_normal_jpg
	
		/*
		File file = new File("photo.jpg");
		BufferedImage img;
		try {
			img = ImageIO.read(file);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// 画像の書き込み
		file = new File("photo.png");
		try {
			ImageIO.write(img, "PNG", file);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		*/
		
		/*
		JAI.getDefaultTileSize()
		String file = tiffPath_A3_Horizontal;

		PlanarImage p_image = JAI.create("fileload", file);
		BufferedImage jai_image = new BufferedImage(p_image.getColorModel(),
			                    p_image.copyData(),
			                    p_image.getColorModel().isAlphaPremultiplied(),
			                    null);
		System.out.println("JAI : height = " + jai_image.getHeight() + " / width = " + jai_image.getWidth());

		String[] format = ImageIO.getReaderFormatNames();
		System.out.print("R: ");
		for(int i=0; i<format.length; i++){
		        if(i != 0)      System.out.print(", ");
		        System.out.print(format[i]);
		}
		System.out.println();

		format = ImageIO.getWriterFormatNames();
		System.out.print("W: ");
		for(int i=0; i<format.length; i++){
		        if(i != 0)      System.out.print(", ");
		        System.out.print(format[i]);
		}
		System.out.println(); 
		*/
		
		fail("Not yet implemented");
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
			sample = (Sample) xmlDecoder.readObject();
			xmlDecoder.close();
		}catch(FileNotFoundException ex){
			System.err.println(ex);
			return;
		}
		
		for(int i=0;i<sample.length;i++){
			System.out.println("name:");
		}
		
	}
}
