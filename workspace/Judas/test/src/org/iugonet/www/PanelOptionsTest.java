package org.iugonet.www;

import static org.junit.Assert.*;

import org.fest.swing.fixture.DialogFixture;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class PanelOptionsTest {

	PanelOptions panelOptions;
	DialogFixture dialogFixture;

	@Before
	public void setUp() throws Exception {
		panelOptions = new PanelOptions();
		dialogFixture = new DialogFixture(panelOptions);
		dialogFixture.show();
	}

	@After
	public void tearDown() throws Exception {
		panelOptions.dispose();
		dialogFixture.cleanUp();
	}

	@Test
	public void test_01() {
		dialogFixture.button("btnOk").click();
		assertFalse(panelOptions.isActive());
	}

	@Test
	public void test_02() {
		dialogFixture.button("btnApply").click();
		assertFalse(panelOptions.isActive());
	}

	@Test
	public void test_03() {
		dialogFixture.button("btnCancel").click();
		assertFalse(panelOptions.isActive());
	}

	@Test
	public void test_04() {
		dialogFixture.button("btnSaveToTemplate").click();
		assertFalse(panelOptions.isActive());
	}

}
