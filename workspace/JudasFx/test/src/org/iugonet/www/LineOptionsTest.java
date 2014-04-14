package org.iugonet.www;

import static org.junit.Assert.*;

import org.fest.swing.fixture.DialogFixture;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class LineOptionsTest {

	LineOptions lineOptions;
	DialogFixture dialogFixture;

	@Before
	public void setUp() throws Exception {
		lineOptions = new LineOptions();
		dialogFixture = new DialogFixture(lineOptions);
		dialogFixture.show();
	}

	@After
	public void tearDown() throws Exception {
		lineOptions.dispose();
		dialogFixture.cleanUp();
	}

	@Test
	public void test() {
		fail("Not yet implemented");
	}

}
