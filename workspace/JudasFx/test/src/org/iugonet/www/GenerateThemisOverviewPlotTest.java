package org.iugonet.www;

import static org.junit.Assert.*;

import org.fest.swing.fixture.DialogFixture;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class GenerateThemisOverviewPlotTest {

	GenerateThemisOverviewPlot generateThemisOverviewPlot;
	DialogFixture dialogFixture;

	@Before
	public void setUp() throws Exception {
		generateThemisOverviewPlot = new GenerateThemisOverviewPlot();
		dialogFixture = new DialogFixture(generateThemisOverviewPlot);
		dialogFixture.show();
	}

	@After
	public void tearDown() throws Exception {
		generateThemisOverviewPlot.dispose();
		dialogFixture.cleanUp();
	}

	@Test
	public void test_01() {
		dialogFixture.button("btnOk").click();
		assertFalse(generateThemisOverviewPlot.isActive());
	}

	@Test
	public void test_02() {
		dialogFixture.button("btnCancel").click();
		assertFalse(generateThemisOverviewPlot.isActive());
	}
}
