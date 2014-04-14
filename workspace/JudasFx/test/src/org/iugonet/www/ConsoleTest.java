package org.iugonet.www;

import static org.junit.Assert.*;

import org.fest.swing.fixture.DialogFixture;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ConsoleTest {

	Console console;
	DialogFixture dialogFixture;

	@Before
	public void setUp() throws Exception {
		console = new Console();
		dialogFixture = new DialogFixture(console);
		dialogFixture.show();
	}

	@After
	public void tearDown() throws Exception {
		console.dispose();
		dialogFixture.cleanUp();
	}

	@Test
	public void test_01() {
		dialogFixture.button("btnOk").click();
		assertFalse(console.isActive());
	}

}
