package org.iugonet.www;

import java.beans.*;
import java.io.*;
import java.net.URI;
import java.net.URL;
import java.util.Date;

import static org.junit.Assert.*;
import org.iugonet.www.Tplot;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.time.Day;
import org.jfree.data.time.Hour;
import org.jfree.data.time.Millisecond;
import org.jfree.data.time.Minute;
import org.jfree.data.time.Month;
import org.jfree.data.time.Quarter;
import org.jfree.data.time.Second;
import org.jfree.data.time.TimeSeriesCollection;
import org.jfree.data.time.Week;
import org.jfree.data.time.Year;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TplotTest1D {

	class Sample extends Tplot {
		Sample(){
			super();
		}
		
		Sample(int dimension) {
			super(dimension);
		}

		void file_http_copy(String start, String end) {
		}

		@Override
		public ChartPanel getChartPanel() {
			return null;
		}

		@Override
		public JFreeChart getChart() {
			return null;
		}

		@Override
		public TimeSeriesCollection load(String strUrl) {
			return null;
		}

		@Override
		public void read(String url) {	
		};
		
		@Override
		void read(URL url) {
		}

		@Override
		public void read(URI uri) {
		}

		@Override
		public TimeSeriesCollection load(URI uri) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public TimeSeriesCollection load(URL url) {
			// TODO Auto-generated method stub
			return null;
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
	public void test_getTimeSeries01() {
		final double expected = 666.6;
		final Millisecond millisecond = new Millisecond(1, 1, 1, 1, 1, 1, 2000);

		//
		sample.add(millisecond, expected, 0);

		//
		double actual = sample.getTimeSeries(0).getDataItem(0).getValue()
				.doubleValue();

		assertEquals(expected, actual, 0);

		//
		Date actual_date0 = sample.getTimeSeries(0).getTimePeriod(0).getStart();
		assertEquals(millisecond.getStart(), actual_date0);		
	}
	
	@Test
	public void test_getTimeSeries02() {
		final double expected = 666.6;
		final Second second = new Second(1, 1, 1, 1, 1, 2000);

		//
		sample.add(second, expected, 0);

		//
		double actual = sample.getTimeSeries(0).getDataItem(0).getValue()
				.doubleValue();

		assertEquals(expected, actual, 0);

		//
		Date actual_date0 = sample.getTimeSeries(0).getTimePeriod(0).getStart();
		assertEquals(second.getStart(), actual_date0);
	}
	
	@Test
	public void test_getTimeSeries03() {
		final double expected = 666.6;
		final Minute minute = new Minute(1, 1, 1, 1, 2000);

		//
		sample.add(minute, expected, 0);

		//
		double actual = sample.getTimeSeries(0).getDataItem(0).getValue()
				.doubleValue();

		assertEquals(expected, actual, 0);

		//
		Date actual_date0 = sample.getTimeSeries(0).getTimePeriod(0).getStart();
		assertEquals(minute.getStart(), actual_date0);
	}
	
	@Test
	public void test_getTimeSeries04() {
		final double expected = 666.6;
		final Hour hour = new Hour(1, 1, 1, 2000);

		//
		sample.add(hour, expected, 0);

		//
		double actual = sample.getTimeSeries(0).getDataItem(0).getValue()
				.doubleValue();

		assertEquals(expected, actual, 0);

		//
		Date actual_date0 = sample.getTimeSeries(0).getTimePeriod(0).getStart();
		assertEquals(hour.getStart(), actual_date0);
	}
	
	@Test
	public void test_getTimeSeries05() {
		final double expected = 666.6;
		final Day day = new Day(1, 1, 2000);

		//
		sample.add(day, expected, 0);

		//
		double actual = sample.getTimeSeries(0).getDataItem(0).getValue()
				.doubleValue();

		assertEquals(expected, actual, 0);

		//
		Date actual_date0 = sample.getTimeSeries(0).getTimePeriod(0).getStart();
		assertEquals(day.getStart(), actual_date0);
	}
	
	@Test
	public void test_getTimeSeries06() {
		final double expected = 666.6;
		final Month month = new Month(1, 2000);

		//
		sample.add(month, expected, 0);

		//
		double actual = sample.getTimeSeries(0).getDataItem(0).getValue()
				.doubleValue();

		assertEquals(expected, actual, 0);

		//
		Date actual_date0 = sample.getTimeSeries(0).getTimePeriod(0).getStart();
		assertEquals(month.getStart(), actual_date0);
	}
	
	@Test
	public void test_getTimeSeries07() {
		final double expected = 666.6;
		final Year year = new Year(2000);

		//
		sample.add(year, expected, 0);

		//
		double actual = sample.getTimeSeries(0).getDataItem(0).getValue()
				.doubleValue();

		assertEquals(expected, actual, 0);

		//
		Date actual_date0 = sample.getTimeSeries(0).getTimePeriod(0).getStart();
		assertEquals(year.getStart(), actual_date0);
	}
	
	@Test
	public void test_getTimeSeries08() {
		final double expected = 666.6;
		final Week week = new Week(1, 2000);

		//
		sample.add(week, expected, 0);

		//
		double actual = sample.getTimeSeries(0).getDataItem(0).getValue()
				.doubleValue();

		assertEquals(expected, actual, 0);

		//
		Date actual_date0 = sample.getTimeSeries(0).getTimePeriod(0).getStart();
		assertEquals(week.getStart(), actual_date0);
	}
	
	@Test
	public void test_getTimeSeries09() {
		final double expected = 666.6;
		final Quarter quarter = new Quarter(1, 2000);

		//
		sample.add(quarter, expected, 0);

		//
		double actual = sample.getTimeSeries(0).getDataItem(0).getValue()
				.doubleValue();

		assertEquals(expected, actual, 0);

		//
		Date actual_date0 = sample.getTimeSeries(0).getTimePeriod(0).getStart();
		assertEquals(quarter.getStart(), actual_date0);
	}
	
	@Test
	public void test_getTimeSeiries10() {
		final double expected0 = 666.6;
		final double expected1 = 777.7;
		final Second second0 = new Second(1, 1, 1, 1, 1, 2000);
		final Second second1 = new Second(2, 1, 1, 1, 1, 2000);

		//
		sample.add(second0, expected0, 0);
		sample.add(second1, expected1, 0);

		//
		double actual0 = sample.getTimeSeries(0).getDataItem(0).getValue()
				.doubleValue();
		double actual1 = sample.getTimeSeries(0).getDataItem(1).getValue()
				.doubleValue();

		assertEquals(expected0, actual0, 0);
		assertEquals(expected1, actual1, 0);

		//
		Date actual_date0 = sample.getTimeSeries(0).getTimePeriod(0).getStart();
		Date actual_date1 = sample.getTimeSeries(0).getTimePeriod(1).getStart();
		assertEquals(second0.getStart(), actual_date0);
		assertEquals(second1.getStart(), actual_date1);
	}
	
	@Test
	public void xmlEncoderTest() throws Exception {
		URI uri = new URI(
				"spase://IUGONET/Granule/ICSWSE/MAGDAS/AAB/fluxgate/PT1S_ICSWSE_storage/AAB_SEC_200811010000_mgd");
		sample.read(uri);
		
		try{
			XMLEncoder xmlEncoder = new XMLEncoder(new BufferedOutputStream(new FileOutputStream("goods.xml")));
			xmlEncoder.writeObject(sample);
			xmlEncoder.close();
		} catch(FileNotFoundException ex){
			System.err.println(ex);
		}
	}
	
	@Test
	public void xmlDecoderTest() throws Exception {
		URI uri = new URI(
				"spase://IUGONET/Granule/ICSWSE/MAGDAS/AAB/fluxgate/PT1S_ICSWSE_storage/AAB_SEC_200811010000_mgd");
		sample.read(uri);
		
		try{
			XMLDecoder xmlDecoder = new XMLDecoder(new BufferedInputStream(new FileInputStream("goods.xml")));
			sample = (Sample) xmlDecoder.readObject();
			xmlDecoder.close();
		}catch(FileNotFoundException ex){
			System.err.println(ex);
			return;
		}
	}
}
