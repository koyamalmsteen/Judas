package org.iugonet.www;

import static org.junit.Assert.*;

import java.io.File;
import org.iugonet.www.JnlpGenerator;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class JnlpGeneratorTest {

	JnlpGenerator jnlpGenerator;

	@Before
	public void setUp() throws Exception {
		jnlpGenerator = new JnlpGenerator();
	}

	@After
	public void tearDown() throws Exception {
		jnlpGenerator = null;
		System.gc();
	}

	@Test
	public void test_generateJnlp_01() throws Exception { // Dst index
		String granule = "http://wdc-data.iugonet.org/data/hour/index/dst/1984/dst8410";
		String prefix = "1";
		File file = new File("jnlp/" + prefix + ".jnlp");
		if (file.exists()) {
			file.delete();
		}
		jnlpGenerator.generateJnlp(granule, prefix, 1);
		assertEquals(true, file.exists());
	}

	@Test
	public void test_generateJnlp_02() throws Exception { // AE index
		String granule = "http://wdc-data.iugonet.org/data/hour/index/dst/1984/dst8410";
		String prefix = "2";
		File file = new File("jnlp/" + prefix + ".jnlp");
		if (file.exists()) {
			file.delete();
		}
		jnlpGenerator.generateJnlp(granule, prefix, 1);
		assertEquals(true, file.exists());
	}

	@Test
	public void test_generateJnlp_03() throws Exception { // ASY index
		String granule = "http://wdc-data.iugonet.org/data/min/index/asy/1988/asy8803.wdc";
		String prefix = "3";
		File file = new File("jnlp/" + prefix + ".jnlp");
		if (file.exists()) {
			file.delete();
		}
		jnlpGenerator.generateJnlp(granule, prefix, 1);
		assertEquals(true, file.exists());
	}

	@Test
	public void test_generateJnlp_04() throws Exception { // Lfrto
		String granule = "http://iprt.gp.tohoku.ac.jp/lf/cdf/ath/201302/lfrto_30sec_ath_nwc_20130211_v01.cdf";
		String prefix = "4";
		File file = new File("jnlp/" + prefix + ".jnlp");
		if (file.exists()) {
			file.delete();
		}
		jnlpGenerator.generateJnlp(granule, prefix, 1);
		assertEquals(true, file.exists());
	}

	/*
	 * @Test public void test_readGranule_01() throws Exception { String
	 * urlString=
	 * "http://search.iugonet.org/iugonet/bitstream/123456789/3718550/1/dst198612_wdc.xml"
	 * ; URL url = new URL(urlString); jnlpGenerator.readGranule(url);
	 * assertEquals("Spase",jnlpGenerator.getRoot().getNodeName()); }
	 */

	@Test
	public void test_resolveResourceId_01(){
		String resourceId = "spase://IUGONET/NumericalData/WDC_Kyoto/WDC/NCK/Magnetometer/PT1H";
//		System.out.println("A="+jnlpGenerator.resolveResourceId(resourceId));
	}

	@Test
	public void test_resolveResourceId_02(){
		String resourceId = "spase://IUGONET/Granule/WDC_Kyoto/WDC/Dst/index/PT1H/dst198612_wdc";
//		System.out.println("A="+jnlpGenerator.resolveResourceId(resourceId));
	}
}
