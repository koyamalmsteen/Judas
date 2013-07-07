package org.iugonet.www;

import static org.junit.Assert.*;

import org.fest.swing.fixture.DialogFixture;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class HelpWindowTest {

	HelpWindow helpWindow;
	DialogFixture dialogFixture;

	@Before
	public void setUp() throws Exception {
		helpWindow = new HelpWindow();
		dialogFixture = new DialogFixture(helpWindow);
		dialogFixture.show();
	}

	@After
	public void tearDown() throws Exception {
		helpWindow.dispose();
		dialogFixture.cleanUp();
	}

	@Test
	public void test() {
		dialogFixture.button("btnOk").click();
		assertFalse(helpWindow.isActive());
	}

}
