package org.iugonet.www;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.MalformedURLException;
import java.net.Proxy;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLConnection;

import org.w3c.dom.Document;

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
		String query_head = "http://search.iugonet.org/iugonet/open-search/request?query=ResourceID:";
		String query_tail = "&Granule=granule";

		try {
			String query = query_head + uri.getRawSchemeSpecificPart() + query_tail;
			URL url = new URL(query);
			
			// check proxy
			String http_proxy_upper_case = System.getenv("HTTP_PROXY");
			String http_proxy_lower_case = System.getenv("http_proxy");

			URLConnection urlConnection;
			if( http_proxy_upper_case != null || http_proxy_lower_case != null ){ // with proxy
				URL urlProxy;
				if( http_proxy_upper_case != null ){
					urlProxy = new URL(http_proxy_upper_case);
				}else{
					urlProxy = new URL(http_proxy_lower_case);
				}
				Proxy proxy = new Proxy(Proxy.Type.HTTP, new InetSocketAddress(urlProxy.getHost(),urlProxy.getPort()));
				urlConnection = url.openConnection(proxy);
			}else{                                                                // without proxy
				urlConnection = url.openConnection();
			}
			
			urlConnection.connect();
			
			// contents retrieve
			
			InputStream inputStream = urlConnection.getInputStream();
//			OutputStream outputStream = new OutputStream();
//			inputStream.read()
/*
			File file = new File("/tmp" + url.getPath());
			FileOutputStream out = new FileOutputStream(file, false);
			int b;
			while ((b = in.read()) != -1) {
				out.write(b);
			}
			out.close();
			in.close();
			
			Document document = null;
			try{
//				document = getDocument(urlConnection.getInputStream());
			} catch (Exception e){
				e.printStackTrace();
			}
			*/
		} catch (Exception e) {
			e.printStackTrace();
		}
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
