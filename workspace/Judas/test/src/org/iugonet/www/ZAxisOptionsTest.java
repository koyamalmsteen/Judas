package org.iugonet.www;

import static org.junit.Assert.*;

import org.fest.swing.fixture.DialogFixture;
import org.iugonet.www.ZAxisOptions;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ZAxisOptionsTest {

	ZAxisOptions zAxisOptions;
	DialogFixture dialogFixture;

	@Before
	public void setUp() throws Exception {
		zAxisOptions = new ZAxisOptions();
		dialogFixture = new DialogFixture(zAxisOptions);
		dialogFixture.show();
	}

	@After
	public void tearDown() throws Exception {
		zAxisOptions.dispose();
		dialogFixture.cleanUp();
	}

	@Test
	public void test_01() {
		dialogFixture.button("btnOk").click();
		assertFalse(zAxisOptions.isActive());
	}

	@Test
	public void test_02() {
		dialogFixture.button("btnApply").click();
		assertFalse(zAxisOptions.isActive());
	}

	@Test
	public void test_03() {
		dialogFixture.button("btnCancel").click();
		assertFalse(zAxisOptions.isActive());
	}

	@Test
	public void test_04() {
		dialogFixture.button("btnSaveToTemplate").click();
		assertFalse(zAxisOptions.isActive());
	}

}
