package org.iugonet.www;

import static org.junit.Assert.*;

import org.fest.swing.fixture.DialogFixture;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class XAxisOptionsTest {

	XAxisOptions xAxisOptions;
	DialogFixture dialogFixture;

	@Before
	public void setUp() throws Exception {
		xAxisOptions = new XAxisOptions();
		dialogFixture = new DialogFixture(xAxisOptions);
		dialogFixture.show();
	}

	@After
	public void tearDown() throws Exception {
		xAxisOptions.dispose();
		dialogFixture.cleanUp();
	}

	@Test
	public void test_01() {
		dialogFixture.button("btnOk").click();
		assertFalse(xAxisOptions.isActive());
	}

	@Test
	public void test_02() {
		dialogFixture.button("btnApply").click();
		assertFalse(xAxisOptions.isActive());
	}

	@Test
	public void test_03() {
		dialogFixture.button("btnCancel").click();
		assertFalse(xAxisOptions.isActive());
	}

	@Test
	public void test_04() {
		dialogFixture.button("btnSaveToTemplate").click();
		assertFalse(xAxisOptions.isActive());
	}
}
