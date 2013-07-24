package org.iugonet.www;

import gnu.getopt.Getopt;



import java.awt.EventQueue;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.net.URL;
import java.util.Enumeration;
import java.util.Properties;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.DOMImplementation;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class JnlpGenerator {

	private Element root;
	private Properties properties;
	private String jnlpOutputFolder;
	private String codebase;
	private String homepage;
	private String iconHref;
	private String iconKind;
	private String vendor;
	private String description;
	private String jfreechart;
	private String jcommon;
	private String java_getopt;
	private String judasviewer;
	private String tplot;
	private String dataloader;
	private String j2seVersion;
	private static String strUrl;
	private static int flag;
	private static String resourceIdGranule;

	public Element getRoot() {
		return root;
	}

	public InputStream getJarInputStream(String path) {
		InputStream inputStream = this.getClass().getClassLoader()
				.getResourceAsStream(path);
		return inputStream;
	}

	public JnlpGenerator() {
		properties = new Properties();

		try {
			/*
			 * InputStream inputStream =
			 * getJarInputStream("./JnlpGenerator.jar");
			 * properties.load(inputStream);
			 */

			String userHome = System.getProperty("user.home");
			File file = new File(
					userHome
							+ "/Judas/workspace/JnlpGenerator/config/application.properties");
			InputStream inputStream = new FileInputStream(file);
			properties.load(inputStream);

			jnlpOutputFolder = properties.getProperty("JNLPOUTPUTFOLDER");
			codebase = "http://" + getHostIpAddress()
					+ "/iugonet/iugonet/Judas";
			homepage = codebase;
			iconHref = properties.getProperty("ICONHREF");
			iconKind = properties.getProperty("ICONKIND");
			vendor = properties.getProperty("VENDOR");
			description = properties.getProperty("DESCRIPTION");
			judasviewer = properties.getProperty("JUDASVIEWER");
			tplot = properties.getProperty("TPLOT");
			dataloader = properties.getProperty("DATALOADER");
			jfreechart = properties.getProperty("JFREECHART");
			jcommon = properties.getProperty("JCOMMON");
			java_getopt = properties.getProperty("JAVAGETOPT");
			j2seVersion = properties.getProperty("J2SE_VERSION");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param args
	 */
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
					JnlpGenerator jnlpGenerator = new JnlpGenerator();
					System.out.println("HOGE"+strUrl);
					URL url = new URL(strUrl);
					// jnlpGenerator.readGranule(url);
					jnlpGenerator.generateJnlp(strUrl, "hoge", flag);
					//jnlpGenerator.generateJnlp(resourceIdGranule);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public String getHostIpAddress() throws SocketException {
		NetworkInterface ni = NetworkInterface.getByName("eth0");
		Enumeration<InetAddress> inetAddresses = ni.getInetAddresses();

		while (inetAddresses.hasMoreElements()) {
			InetAddress ia = inetAddresses.nextElement();
			if (!ia.isLinkLocalAddress()) {
				return ia.getHostAddress();
			}
		}
		return "";
	}

	public void readGranule(URL url) {
		try {
			HttpURLConnection connection = (HttpURLConnection) url
					.openConnection();
			connection.setDoOutput(true);
			connection.setUseCaches(false);
			connection.setRequestMethod("GET");
			InputStream inputStream = connection.getInputStream();
			DocumentBuilder docBuilder = DocumentBuilderFactory.newInstance()
					.newDocumentBuilder();
			Document document = docBuilder.parse(inputStream);
			root = document.getDocumentElement();
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}

	@Deprecated
	public void generateJnlp(String strUrl, int flag){
		
	}

	@Deprecated
	public void generateJnlp(String strUrl, String prefix, int flag) {
		/*
		 * strUlr: e.g.,
		 * http://wdc-data.iugonet.org/data/hour/index/dst/1984/dst8410
		 */
		/*
		 * prefix: It is good to give record number of the search results of
		 * DSpace. Then DSpace should create link to the gerated Jnlp file.
		 */
		generateJnlpXml(strUrl,prefix,flag);
	}

	/*
	 * This method will be new method after Resource Id Resolver was released.
	 */
	public void generateJnlp(String resourceIdOfGranule) {
		// getGranule(resourceIdOfGranule)
		// getParent(resourceIdOfGranule)
		generateJnlpXml("","",1);
	}
	
	public void generateJnlpXml(String strUrl, String prefix, int flag){
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder;
		try {
			builder = factory.newDocumentBuilder();
			DOMImplementation domImpl = builder.getDOMImplementation();
			Document document = domImpl.createDocument("", "jnlp", null);
			Element root = document.getDocumentElement();
			root.setAttribute("spec", "7.0+");
			root.setAttribute("codebase", codebase);
			root.setAttribute("href", "jnlp/" + prefix + ".jnlp");
			// information
			Element information = document.createElement("information");
			Element title = document.createElement("title");
			title.appendChild(document.createTextNode("JudasViewer"));

			Element elemVendor = document.createElement("vendor");
			elemVendor.appendChild(document.createTextNode(vendor));

			Element elemHomepage = document.createElement("homepage");
			elemHomepage.appendChild(document.createTextNode(homepage));

			Element elemDescription = document.createElement("description");
			elemDescription.appendChild(document.createTextNode(description));

			Element elemOfflineAllowed = document
					.createElement("offline-allowed");

			Element elemIconHref = document.createElement("icon");
			elemIconHref.setAttribute("href", "http://"+getHostIpAddress()+"/iugonet/iugonet/Judas/images/"+iconHref);

			Element elemIconKind = document.createElement("icon");
			elemIconKind.setAttribute("kind", "splash");
			elemIconKind.setAttribute("href", "http://"+getHostIpAddress()+"/iugonet/iugonet/Judas/images/"+iconKind);

			information.appendChild(title);
			information.appendChild(elemVendor);
			information.appendChild(elemHomepage);
			information.appendChild(elemDescription);
			information.appendChild(elemOfflineAllowed);
			information.appendChild(elemIconHref);
			information.appendChild(elemIconKind);
			// security
			Element security = document.createElement("security");
			Element allPermissions = document.createElement("all-permissions");
			security.appendChild(allPermissions);
			// resource
			Element resources = document.createElement("resources");
			Element j2se = document.createElement("j2se");
			j2se.setAttribute("version", j2seVersion);
			resources.appendChild(j2se);

			Element[] jar = new Element[6];
			jar[0] = document.createElement("jar");
			jar[0].setAttribute("href", judasviewer);

			jar[1] = document.createElement("jar");
			jar[1].setAttribute("href", tplot);

			jar[2] = document.createElement("jar");
			jar[2].setAttribute("href", dataloader);

			jar[3] = document.createElement("jar");
			jar[3].setAttribute("href", jfreechart);

			jar[4] = document.createElement("jar");
			jar[4].setAttribute("href", jcommon);
			
			jar[5] = document.createElement("jar");
			jar[5].setAttribute("href", java_getopt);

			for (int i = 0; i < jar.length; i++) {
				resources.appendChild(jar[i]);
			}

			// application-desc
			Element applicationDesc = document
					.createElement("application-desc");
			Element argument1 = document.createElement("argument");
			argument1.appendChild(document.createTextNode("-u"));
			Element argument2 = document.createElement("argument");
			argument2.appendChild(document.createTextNode(strUrl));
			Element argument3 = document.createElement("argument");
			argument3.appendChild(document.createTextNode("-f"));
			Element argument4 = document.createElement("argument");
			argument4.appendChild(document.createTextNode("1"));
			
			root.appendChild(information);
			root.appendChild(security);
			root.appendChild(resources);
			root.appendChild(applicationDesc);
			applicationDesc.appendChild(argument1);
			applicationDesc.appendChild(argument2);
			applicationDesc.appendChild(argument3);
			applicationDesc.appendChild(argument4);
			applicationDesc.setAttribute("main-class", "org.iugonet.www.JudasViewer");

			TransformerFactory transFactory = TransformerFactory.newInstance();
			Transformer transformer = transFactory.newTransformer();
			// for indent
			transformer.setOutputProperty(OutputKeys.INDENT, "yes");
			transformer.setOutputProperty(OutputKeys.METHOD, "xml");

			DOMSource source = new DOMSource(document);
			File newXML = new File(jnlpOutputFolder + "/" + prefix + ".jnlp");
			FileOutputStream os = new FileOutputStream(newXML);
			StreamResult result = new StreamResult(os);
			transformer.transform(source, result);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public String resolveResourceId(String resourceId){
		String query="http://search.iugonet.org/iugonet/browse?type=GranuleParentID&value="+resourceId+"&m=2";
//		String query="http://www.yahoo.co.jp";
		URL url;
		try {
			url = new URL(query);
			HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
			httpURLConnection.setDoOutput(true);
			httpURLConnection.setUseCaches(false);
			httpURLConnection.setRequestMethod("GET");
			int responseCode = httpURLConnection.getResponseCode();
			System.out.println(responseCode);
			String redirectUrl = httpURLConnection.getURL().toString();
			System.out.println(redirectUrl);
			httpURLConnection.disconnect();
			return redirectUrl;
			/*
			connection.setRequestMethod("GET");
			InputStream inputStream = connection.getInputStream();
			DocumentBuilder docBuilder = DocumentBuilderFactory.newInstance()
					.newDocumentBuilder();
			Document document = docBuilder.parse(inputStream);
			root = document.getDocumentElement();
			*/
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
