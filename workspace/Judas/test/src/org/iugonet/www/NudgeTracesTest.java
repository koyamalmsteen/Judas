package org.iugonet.www;

import static org.junit.Assert.*;

import org.fest.swing.fixture.DialogFixture;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class NudgeTracesTest {

	NudgeTraces nudgeTraces;
	DialogFixture dialogFixture;

	@Before
	public void setUp() throws Exception {
		nudgeTraces = new NudgeTraces();
		dialogFixture = new DialogFixture(nudgeTraces);
		dialogFixture.show();
	}

	@After
	public void tearDown() throws Exception {
		nudgeTraces.dispose();
		dialogFixture.cleanUp();
	}

	@Test
	public void test() {
		dialogFixture.button("btnOk").click();
		assertFalse(nudgeTraces.isActive());
	}

}
