package org.iugonet.www;

import java.net.URI;
import java.net.URL;

import org.geotools.swing.JMapPane;

abstract public class Mplot extends Aplot {

	Mplot(){
		
	}

	abstract public JMapPane load(URL url);

	public JMapPane load(URI uri) {
		return this.load(this.resolve(uri));
	}
}
