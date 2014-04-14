package org.iugonet.www;

public class JnlpFileCreator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if (args.length != 1) {
			String str = "";
			str = str + "Usage:\n";
			str = str + "  java JnlpFileCreator [Granule.xml]\n\n";
			str = str + "This program is for IUGONET Common Metadata Format";
			str = str + "You have to specify Granule Metadata in XML format";
			System.out.println("java JnlpFileCreator Granule.xml");
		} else {
			System.out.println("B");
			// kakuchoushi no check

			// yomikomi

			// validator

			// Granule ka?

			String str = "<?xml version=\"1.0\" encoding=\"utf-8\"?>";
			str = str
					+ "<jnlp spec=\"1.0+\" codebase=\"http://130.54.59.234/~ykoyama/judas101\" href=\"judas.jnlp\">";
			str = str + "<information>";
			str = str + "<title>IUGONET</title>";
			str = str + "<vencode>The Java(tm) Tutorial</vendor>";
			str = str + "<homepage href=\"http://130.54.59.234/~ykoyama\"/>";
			str = str + "<description>IUGONET</description>";
			str = str
					+ "<description kind=\"short\">A demo that uses formatted text fields to implement a mortage payment calculator.</description>";
			str = str + "<icon href=\"apple-touch-icon.png\"/>";
			str = str + "<icon kind=\"splash\" href=\"icon.xpm\"/>";
			str = str + "<offline-allowed/>";
			str = str + "</information>";
			str = str + "<resources>";
			str = str + "<j2se version=\"1.6+\"/>";
			str = str + "<jar href=\"judas.jar\"/>";
			str = str + "<jar href=\"images.jar\"/>";
			str = str + "<jar href=\"jfreechart-1.0.14.jar\"/>";
			str = str + "<jar href=\"jcommon-1.0.17.jar\"/>";
			str = str + "</resources>";
			str = str + "<security>";
			str = str + "<all-permissions/>";
			str = str + "</security>";
			str = str + "<application-desc main-class=\"Judas\">";
			str = str
					+ "<argument>http://wdc-data.iugonet.org/data/hour/index/dst/1984/dst8410</argument>";
			str = str + "</application-desc>";
			str = str + "</jnlp>\n";
		}
	}

}
