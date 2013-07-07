package org.iugonet.www;

import static org.junit.Assert.*;

import org.fest.swing.fixture.DialogFixture;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class DataProcessingTest {

	DataProcessing dataProcessing;
	DialogFixture dialogFixture;

	@Before
	public void setUp() throws Exception {
		dataProcessing = new DataProcessing();
		dialogFixture = new DialogFixture(dataProcessing);
		dialogFixture.show();
	}

	@After
	public void tearDown() throws Exception {
		dataProcessing.dispose();
		dialogFixture.cleanUp();
	}

	@Test
	public void test_01() {
		dialogFixture.button("btnOk").click();
		assertFalse(dataProcessing.isActive());
	}

	@Test
	public void test_02() {
		dialogFixture.button("btnCance").click();
		assertFalse(dataProcessing.isActive());
	}

	@Test
	public void test_03() {
		dialogFixture.button("btnSubtractAverage").click();
		assertFalse(dataProcessing.isActive());
	}

	@Test
	public void test_04() {
		dialogFixture.button("btnSubtractMedian").click();
		assertFalse(dataProcessing.isActive());
	}

	@Test
	public void test_05() {
		dialogFixture.button("btnSmoothData").click();
		assertFalse(dataProcessing.isActive());
	}

	@Test
	public void test_06() {
		dialogFixture.button("btnHighPassFilter").click();
		assertFalse(dataProcessing.isActive());
	}

	@Test
	public void test_07() {
		dialogFixture.button("btnBlockAverage").click();
		assertFalse(dataProcessing.isActive());
	}

	@Test
	public void test_08() {
		dialogFixture.button("btnClip").click();
		assertFalse(dataProcessing.isActive());
	}

	@Test
	public void test_09() {
		dialogFixture.button("btnDeflag").click();
		assertFalse(dataProcessing.isActive());
	}

	@Test
	public void test_10() {
		dialogFixture.button("btnDegap").click();
		assertFalse(dataProcessing.isActive());
	}

	@Test
	public void test_11() {
		dialogFixture.button("btnInterpolate").click();
		assertFalse(dataProcessing.isActive());
	}

	@Test
	public void test_12() {
		dialogFixture.button("btnCleanSpikes").click();
		assertFalse(dataProcessing.isActive());
	}

	@Test
	public void test_13() {
		dialogFixture.button("btnTimeDerivative").click();
		assertFalse(dataProcessing.isActive());
	}

	@Test
	public void test_14() {
		dialogFixture.button("btnWaveletTransform").click();
		assertFalse(dataProcessing.isActive());
	}

	@Test
	public void test_15() {
		dialogFixture.button("btnPowerSpectrum").click();
		assertFalse(dataProcessing.isActive());
	}

	@Test
	public void test_16() {
		dialogFixture.button("btnCoordinateTransform").click();
		assertFalse(dataProcessing.isActive());
	}

	@Test
	public void test_17() {
		dialogFixture.button("btnSplitVariable").click();
		assertFalse(dataProcessing.isActive());
	}

	@Test
	public void test_18() {
		dialogFixture.button("btnJoinVariables").click();
		assertFalse(dataProcessing.isActive());
	}
}
