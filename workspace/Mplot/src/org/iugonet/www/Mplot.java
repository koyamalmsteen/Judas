package org.iugonet.www;

import org.geotools.swing.JMapPane;

abstract public class Mplot extends Aplot{

	Mplot(){
		
	}

	abstract void file_http_copy(String start, String end);
	
	abstract public JMapPane getJMapPane();

}
