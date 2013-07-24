package org.iugonet.www;

import java.awt.EventQueue;
import java.net.URL;

import gnu.getopt.Getopt;

public class MetadataHandler {
	
	private static String strUrl;
	private static int flag;
	private static String resourceIdGranule;
	
	public MetadataHandler(){
		
	}
	
	public static void main(final String[] args) {
		Getopt getopt = new Getopt("JnlpGenerator", args, "u:f:i:");
		int c;
		while ((c = getopt.getopt()) != -1) {
			switch (c) {
			case 'u': // url
				strUrl = getopt.getOptarg();
				break;
			case 'f': // flag
				flag = Integer.parseInt(getopt.getOptarg()); // 1:Dst
				break;
			case 'i': // id
				resourceIdGranule = getopt.getOptarg();
			}
		}

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MetadataHandler metadataHandler = new MetadataHandler();
					URL url = new URL(strUrl);
					// jnlpGenerator.readGranule(url);
					// metadataHandler.generateJnlp(strUrl, "hoge", flag);
					// jnlpGenerator.generateJnlp(resourceIdGranule);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public String resolve(){
		String strUrl;
		strUrl = null;
		
		return strUrl;
	}
	
	public String reverseResolve(){
		String resourceID;
		resourceID = null;
		
		return resourceID;
	}
	
}
