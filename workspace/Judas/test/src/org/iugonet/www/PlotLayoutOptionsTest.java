package org.iugonet.www;

import static org.junit.Assert.*;

import org.fest.swing.fixture.DialogFixture;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class PlotLayoutOptionsTest {

	PlotLayoutOptions plotLayoutOptions;
	DialogFixture dialogFixture;

	@Before
	public void setUp() throws Exception {
		plotLayoutOptions = new PlotLayoutOptions();
		dialogFixture = new DialogFixture(plotLayoutOptions);
		dialogFixture.show();
	}

	@After
	public void tearDown() throws Exception {
		plotLayoutOptions.dispose();
		dialogFixture.cleanUp();
	}

	@Test
	public void test_01() {
		dialogFixture.button("btnOk").click();
		assertFalse(plotLayoutOptions.isActive());
	}

	@Test
	public void test_02() {
		dialogFixture.button("btnApply").click();
		assertFalse(plotLayoutOptions.isActive());
	}

	@Test
	public void test_03() {
		dialogFixture.button("btnCancel").click();
		assertFalse(plotLayoutOptions.isActive());
	}

}
