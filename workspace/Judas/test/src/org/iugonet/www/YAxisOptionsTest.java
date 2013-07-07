package org.iugonet.www;

import static org.junit.Assert.*;

import org.fest.swing.fixture.DialogFixture;
import org.iugonet.www.YAxisOptions;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class YAxisOptionsTest {

	YAxisOptions yAxisOptions;
	DialogFixture dialogFixture;

	@Before
	public void setUp() throws Exception {
		yAxisOptions = new YAxisOptions();
		dialogFixture = new DialogFixture(yAxisOptions);
		dialogFixture.show();
	}

	@After
	public void tearDown() throws Exception {
		yAxisOptions.dispose();
		dialogFixture.cleanUp();
	}

	@Test
	public void test_01() {
		dialogFixture.button("btnOk").click();
		assertFalse(yAxisOptions.isActive());
	}

	@Test
	public void test_02() {
		dialogFixture.button("btnApply").click();
		assertFalse(yAxisOptions.isActive());
	}

	@Test
	public void test_03() {
		dialogFixture.button("btnCancel").click();
		assertFalse(yAxisOptions.isActive());
	}

	@Test
	public void test_04() {
		dialogFixture.button("btnSaveToTemplate").click();
		assertFalse(yAxisOptions.isActive());
	}

}
