package org.iugonet.www;

import static org.junit.Assert.*;

import org.fest.swing.fixture.DialogFixture;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class PageOptionsTest {

	PageOptions pageOptions;
	DialogFixture dialogFixture;

	@Before
	public void setUp() throws Exception {
		pageOptions = new PageOptions();
		dialogFixture = new DialogFixture(pageOptions);
		dialogFixture.show();
	}

	@After
	public void tearDown() throws Exception {
		pageOptions.dispose();
		dialogFixture.cleanUp();
	}

	@Test
	public void test_01() {
		dialogFixture.button("btnOk").click();
		assertFalse(pageOptions.isActive());
	}

	@Test
	public void test_02() {
		dialogFixture.button("btnApply").click();
		assertFalse(pageOptions.isActive());
	}

	@Test
	public void test_03() {
		dialogFixture.button("btnCancel").click();
		assertFalse(pageOptions.isActive());
	}

	@Test
	public void test_04() {
		dialogFixture.button("btnSaveToTemplate").click();
		assertFalse(pageOptions.isActive());
	}

}
