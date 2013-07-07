package org.iugonet.www;

import java.awt.Image;
import java.net.URL;

import javax.swing.ImageIcon;

public class Icons {
	public Image getImage(String imageFileName) {
		URL imageUrl = this.getClass().getClassLoader()
				.getResource(imageFileName);
		Image image = (imageUrl != null) ? new ImageIcon(imageUrl).getImage()
				: new ImageIcon(imageFileName).getImage();
		return image;
	}

	public ImageIcon getImageIcon(String imageFileName) {
		ImageIcon imageIcon = new ImageIcon();
		imageIcon.setImage(getImage(imageFileName));
		return imageIcon;
	}
}
