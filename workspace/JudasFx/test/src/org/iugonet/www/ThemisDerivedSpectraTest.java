package org.iugonet.www;

import static org.junit.Assert.*;

import org.fest.swing.fixture.DialogFixture;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ThemisDerivedSpectraTest {

	LoadData loadData;
	DialogFixture dialogFixture;

	@Before
	public void setUp() throws Exception {
		loadData = new LoadData();
		dialogFixture = new DialogFixture(loadData);
		dialogFixture.show();
	}

	@After
	public void tearDown() throws Exception {
		loadData.dispose();
		dialogFixture.cleanUp();
	}

	@Test
	public void test_01() {
		dialogFixture.button("btnOk").click();
		assertFalse(loadData.isActive());
	}

	@Test
	public void test_02() {
		dialogFixture.button("btnCancel").click();
		assertFalse(loadData.isActive());
	}

}
