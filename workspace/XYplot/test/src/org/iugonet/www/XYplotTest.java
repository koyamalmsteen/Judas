package org.iugonet.www;

import static org.junit.Assert.*;

import java.net.URL;

import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.xy.XYSeriesCollection;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class XYplotTest {

	class Sample extends XYplot{

		@Override
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
		public XYSeriesCollection loadData(String strUrl) {
			return null;

		}

		@Override
		void readData(URL url) {
			// TODO Auto-generated method stub
			
		}
		
	}
	
	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		fail("Not yet implemented");
	}

}
