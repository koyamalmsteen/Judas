package org.iugonet.www;

<<<<<<< HEAD
import org.geotools.swing.JMapPane;

abstract public class Mplot extends Aplot{
=======
public class Mplot {

	private String rootDataDir = "~/data";
	private String themisDataDir = "~/themis";
	private String themisRemoteDataDir = "http://themis.stp.isas.jaxa.jp/data/themis/";
>>>>>>> 137266c... Fixed

	Mplot(){
		
	}
	
<<<<<<< HEAD
	abstract void readData(String arg0);

	abstract void file_http_copy(String start, String end);
	
	abstract public JMapPane getJMapPane();
=======
	public void setRootDataDir(String rootDataDir) {
		this.rootDataDir = rootDataDir;
	}

	public String getRootDataDir() {
		return this.rootDataDir;
	}

	public void setThemisDataDir(String themisDataDir) {
		this.themisDataDir = themisDataDir;
	}
	
//	abstract void readData(String arg0);

//	abstract void file_http_copy(String start, String end);
	
//	abstract public ChartPanel getChartPanel();
	
//	abstract public JFreeChart getChart();

>>>>>>> 137266c... Fixed

}
