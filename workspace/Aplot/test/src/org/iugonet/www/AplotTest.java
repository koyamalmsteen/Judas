package org.iugonet.www;

import static org.junit.Assert.*;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class AplotTest {

	class Sample extends Aplot {
		Sample() {
			super();
		}

		@Override
		void read(URL url) {
//			System.out.println(url);
		}
	}

	Sample sample;

	@Before
	public void setUp() throws Exception {
		sample = new Sample();
	}

	@After
	public void tearDown() throws Exception {
		sample = null;
		System.gc();
	}

	@Test
	public void test_getRootDataDir01() {
		String expected = "~/data";
		String actual = sample.getRootDataDir();
		assertEquals(expected, actual);
	}

	@Test
	public void test_setRootDataDir01() {
		String expected = "~/hoge";
		sample.setRootDataDir(expected);
		String actual = sample.getRootDataDir();
		assertEquals(expected, actual);
	}

	@Test
	public void test_getThemisDataDir01() {
		String expected = "~/themis";
		String actual = sample.getThemisDataDir();
		assertEquals(expected, actual);
	}

	@Test
	public void test_setThemisDataDir01() {
		String expected = "~/hoge";
		sample.setThemisDataDir(expected);
		String actual = sample.getThemisDataDir();
		assertEquals(expected, actual);
	}

	@Test
	public void test_getThemisRemoteDataDir01() {
		String actual = sample.getThemisRemoteDataDir();
		String expected = "http://themis.stp.isas.jaxa.jp/data/themis/";
		assertEquals(expected, actual);
	}

	@Test
	public void test_setThemisRemoteDataDir01() {
		String expected = "http://www.kyoto-u.ac.jp/";
		sample.setThemisRemoteDataDir(expected);
		String actual = sample.getThemisRemoteDataDir();
		assertEquals(expected, actual);
	}

	@Test
	public void test_resolve01() throws Exception {
		URI uri = new URI(
				"spase://IUGONET/Granule/WDC_Kyoto/WDC/Dst/index/PT1H/dst198410_wdc");
		URL expected = new URL("http://wdc-data.iugonet.org/data/hour/index/dst/1984/dst8410");
		URL actual = sample.resolve(uri);
		assertEquals(expected, actual);
	}

	@Test
	public void test_file_http_copy01() throws Exception {
		String strUrl = "http://wdc-data.iugonet.org/data/hour/index/dst/1984/dst8410";
		sample.file_http_copy(strUrl);

	}

	@Test
	public void test_file_http_copy02() throws Exception {
		URL url = new URL("http://wdc-data.iugonet.org/data/hour/index/dst/1984/dst8410");
		sample.file_http_copy(url);
	}
	
	@Test
	public void test_file_http_copy03() throws Exception {
		URI uri = new URI(
				"spase://IUGONET/Granule/WDC_Kyoto/WDC/Dst/index/PT1H/dst198410_wdc");
		sample.file_http_copy(uri);
	}
	
	@Test
	public void test_download01() throws Exception {
		String strUrl = "http://wdc-data.iugonet.org/data/hour/index/dst/1984/dst8410";
		sample.download(strUrl);
	}

	@Test
	public void test_download02() throws Exception {
		URL url = new URL("http://wdc-data.iugonet.org/data/hour/index/dst/1984/dst8410");
		sample.download(url);
	}
	
	@Test
	public void test_download03() throws Exception {
		URI uri = new URI(
				"spase://IUGONET/Granule/WDC_Kyoto/WDC/Dst/index/PT1H/dst198410_wdc");
		sample.download(uri);
	}
	
	@Test
	public void test_read01() throws Exception {
		String strUrl = "http://wdc-data.iugonet.org/data/hour/index/dst/1984/dst8410";
		sample.read(strUrl);
	}
	
	@Test
	public void test_read02() throws Exception {
		URL url = new URL("http://wdc-data.iugonet.org/data/hour/index/dst/1984/dst8410");
		sample.read(url);
	}
	
	@Test
	public void test_read03() throws Exception {
		URI uri = new URI(
				"spase://IUGONET/Granule/WDC_Kyoto/WDC/Dst/index/PT1H/dst198410_wdc");
		sample.read(uri);
	}
}
