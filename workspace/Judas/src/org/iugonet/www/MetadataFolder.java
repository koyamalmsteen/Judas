package org.iugonet.www;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

import javax.swing.undo.UndoableEditSupport;

public class MetadataFolder {

	private String metadataFolder;

	protected UndoableEditSupport undoableEditSupport;

	public String getMetadataFolder() {
		return metadataFolder;
	}

	public void setMetadataFolder(String metadataFolder) {
		this.metadataFolder = metadataFolder;
	}

	MetadataFolder() {
		undoableEditSupport = new UndoableEditSupport(this);

		System.setProperty("java.net.useSystemProxies", "true");
		System.setProperty("http.proxyhost", "");
		System.setProperty("http.proxyPort", "");
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public void getMetadata(String resourceID) {

	}

	public void getMetadata(URL url) {
		URLConnection conn;
		try {
			/*
			 * Proxy proxy = new Proxy(Proxy.Type.HTTP, new
			 * InetSocketAddress("proxy.kuins.net", 8080)); conn =
			 * url.openConnection(proxy);
			 */
			BufferedReader br = new BufferedReader(new InputStreamReader(
					url.openStream()));
			// System.out.println(conn);
			// BufferedReader in = new BufferedReader(new
			// InputStreamReader(conn.getInputStream()));
			File file = new File("/tmp/hoge.txt");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
