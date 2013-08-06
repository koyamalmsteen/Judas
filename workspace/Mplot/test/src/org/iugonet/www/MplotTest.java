package org.iugonet.www;

import static org.junit.Assert.*;

import java.net.URL;

import org.geotools.swing.JMapPane;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class MplotTest {

	class Sample extends Mplot{

		@Override
		public JMapPane getJMapPane() {
			return null;
		}

		@Override
		void readData(URL url) {
		}
	}
	
	Sample sample;
	
	@Before
	public void setUp() throws Exception {
		sample = new Sample();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		assertEquals(1, 1);
	}
}
