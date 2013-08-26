package org.iugonet.www;

import java.net.URI;
import java.net.URL;

import javax.swing.JPanel;

abstract public class Iplot extends Aplot {

	Iplot(){
		/*
		File file = new File("photo.jpg");
		BufferedImage img = ImageIO.read(file);

		// 画像の書き込み
		file = new File("photo.png");
		ImageIO.write(img, "PNG", file); 
		
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
	}

	abstract public JPanel load(URL url);

	public JPanel load(URI uri) {
		return this.load(this.resolve(uri));
	}
}
