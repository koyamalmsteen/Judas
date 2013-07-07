package org.iugonet.www;

abstract public class Aplot {


	private String rootDataDir = "~/data";
	private String themisDataDir = "~/themis";
	private String themisRemoteDataDir = "http://themis.stp.isas.jaxa.jp/data/themis/";

	Aplot(){
		
	}
	
	public void setRootDataDir(String rootDataDir) {
		this.rootDataDir = rootDataDir;
	}

	public String getRootDataDir() {
		return this.rootDataDir;
	}

	public void setThemisDataDir(String themisDataDir) {
		this.themisDataDir = themisDataDir;
	}

	public String getThemisDataDir() {
		return this.themisDataDir;
	}

	public void setThemisRemoteDataDir(String themisRemoteDataDir) {
		this.themisRemoteDataDir = themisRemoteDataDir;
	}

	public String getThemisRemoteDataDir() {
		return this.themisRemoteDataDir;
	}
	
}
