package org.iugonet.www;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.net.URLConnection;

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
	
	public void readData(String strUrl) {
		try {
			URL url = new URL(strUrl);
			readData(url);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	public void readData(URI uri) {
		String resolver = "http://search.iugonet.org";
		System.out.println(uri);
		/*
		System.out.println(uri);
		System.out.println(uri.getSchemeSpecificPart());
		System.out.println(uri.getScheme());
		*/
	}
	
	abstract void readData(URL url);
	
	@Deprecated
	public void file_http_copy(String strUrl) {
		try {
			URL url = new URL(strUrl);

			String[] strArray = url.getPath().split("/");
			String strDir = "/tmp";
			for (int i = 0; i < strArray.length - 1; i++) {
				strDir = strDir + "/" + strArray[i];
			}

			File fileDir = new File(strDir);

			if (fileDir.exists()) {
				System.out.println(fileDir + "Directory exists.");
			} else {
				if (fileDir.mkdirs()) {
					System.out.println(fileDir.getPath()
							+ " Created directories to store data.");
				} else {
					System.out.println(fileDir.getPath()
							+ " Couldn't created directories to store data.");
				}
			}

			URLConnection conn = url.openConnection();
			InputStream in = conn.getInputStream();

			File file = new File("/tmp" + url.getPath());
			FileOutputStream out = new FileOutputStream(file, false);
			int b;
			while ((b = in.read()) != -1) {
				out.write(b);
			}
			out.close();
			in.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
