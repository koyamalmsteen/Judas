package org.iugonet.www;

import static org.junit.Assert.*;

import org.fest.swing.fixture.DialogFixture;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class HistoryWindowTest {

	HistoryWindow historyWindow;
	DialogFixture dialogFixture;

	@Before
	public void setUp() throws Exception {
		historyWindow = new HistoryWindow();
		dialogFixture = new DialogFixture(historyWindow);
		dialogFixture.show();
	}

	@After
	public void tearDown() throws Exception {
		historyWindow.dispose();
		dialogFixture.cleanUp();
	}

	@Test
	public void test_01() {
		dialogFixture.button("btnOk").click();
		assertFalse(historyWindow.isActive());
	}

	@Test
	public void test_02() {
		dialogFixture.button("btnCancel").click();
		assertFalse(historyWindow.isActive());
	}

}
