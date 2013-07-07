package org.iugonet.www;

import static org.junit.Assert.*;

import org.fest.swing.fixture.DialogFixture;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class XXXAxisOptionsTest {

	XXXAxisOptions xXXAxisOptions;
	DialogFixture dialogFixture;

	@Before
	public void setUp() throws Exception {
		xXXAxisOptions = new XXXAxisOptions();
		dialogFixture = new DialogFixture(xXXAxisOptions);
		dialogFixture.show();
	}

	@After
	public void tearDown() throws Exception {
		xXXAxisOptions.dispose();
		dialogFixture.cleanUp();
	}

	@Test
	public void test_01() {
		dialogFixture.button("btnOk").click();
		assertFalse(xXXAxisOptions.isActive());
	}

	@Test
	public void test_02() {
		dialogFixture.button("btnApply").click();
		assertFalse(xXXAxisOptions.isActive());
	}

	@Test
	public void test_03() {
		dialogFixture.button("btnCancel").click();
		assertFalse(xXXAxisOptions.isActive());
	}

	@Test
	public void test_04() {
		dialogFixture.button("btnSaveToTemplate").click();
		assertFalse(xXXAxisOptions.isActive());
	}

}
