package org.iugonet.www;

import static org.junit.Assert.*;

import org.fest.swing.fixture.DialogFixture;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class VelocitySlicesTest {

	VelocitySlices velocitySlices;
	DialogFixture dialogFixture;

	@Before
	public void setUp() throws Exception {
		velocitySlices = new VelocitySlices();
		dialogFixture = new DialogFixture(velocitySlices);
		dialogFixture.show();
	}

	@After
	public void tearDown() throws Exception {
		velocitySlices.dispose();
		dialogFixture.cleanUp();
	}

	@Test
	public void test_01() {
		dialogFixture.button("btnGenerate").click();
		assertFalse(velocitySlices.isActive());
	}

	@Test
	public void test_02() {
		dialogFixture.button("btnCancel").click();
		assertFalse(velocitySlices.isActive());
	}

	@Test
	public void test_03() {
		dialogFixture.button("btnExport").click();
		assertFalse(velocitySlices.isActive());
	}

	@Test
	public void test_04() {
		dialogFixture.button("btnExportAll").click();
		assertFalse(velocitySlices.isActive());
	}

}
