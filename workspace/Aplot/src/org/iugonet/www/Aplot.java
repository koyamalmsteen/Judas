package org.iugonet.www;

abstract public class Aplot {


	private String rootDataDir = "~/data";
	private String themisDataDir = "~/themis";
	private String themisRemoteDataDir = "http://themis.stp.isas.jaxa.jp/data/themis/";

	Aplot(){
		String rootDataDir = System.getenv("ROOT_DATA_DIR");
		if ( rootDataDir != null ){
			setRootDataDir(rootDataDir);
		}
		
		String themisDataDir = System.getenv("THEMIS_DATA_DIR");
		if ( themisDataDir != null ){
			setThemisDataDir(themisDataDir);
		}
		
		String themisRemoteDataDir = System.getenv("THEMIS_REMOTE_DATA_DIR");
		if ( themisRemoteDataDir != null ){
			setThemisRemoteDataDir(themisRemoteDataDir);
		}
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
