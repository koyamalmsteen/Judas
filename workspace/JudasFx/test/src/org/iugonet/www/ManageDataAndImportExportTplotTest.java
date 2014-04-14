package org.iugonet.www;

import static org.junit.Assert.*;

import org.fest.swing.fixture.DialogFixture;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ManageDataAndImportExportTplotTest {

	ManageDataAndImportExportTplot manageDataAndImportExportTplot;
	DialogFixture dialogFixture;

	@Before
	public void setUp() throws Exception {
		manageDataAndImportExportTplot = new ManageDataAndImportExportTplot();
		dialogFixture = new DialogFixture(manageDataAndImportExportTplot);
		dialogFixture.show();
	}

	@After
	public void tearDown() throws Exception {
		manageDataAndImportExportTplot.dispose();
		dialogFixture.cleanUp();
	}

	@Test
	public void test_01() {
		dialogFixture.button("btnOk").click();
		assertFalse(manageDataAndImportExportTplot.isActive());
	}

}
