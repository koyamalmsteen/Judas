package org.iugonet.www;

import static org.junit.Assert.*;

import org.fest.swing.fixture.DialogFixture;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class OverviewPlotKeyTest {

	OverviewPlotKey overviewPlotKey;
	DialogFixture dialogFixture;

	@Before
	public void setUp() throws Exception {
		overviewPlotKey = new OverviewPlotKey();
		dialogFixture = new DialogFixture(overviewPlotKey);
		dialogFixture.show();
	}

	@After
	public void tearDown() throws Exception {
		overviewPlotKey.dispose();
		dialogFixture.cleanUp();
	}

	@Test
	public void test() {
		dialogFixture.button("btnOk").click();
		assertFalse(overviewPlotKey.isActive());
	}

}
