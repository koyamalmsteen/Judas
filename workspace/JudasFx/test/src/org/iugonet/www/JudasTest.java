package org.iugonet.www;

import static org.junit.Assert.*;

import org.fest.swing.fixture.FrameFixture;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class JudasTest {

	Judas judas;
	FrameFixture frameFixture;

	@Before
	public void setUp() throws Exception {
		judas = new Judas();
		frameFixture = new FrameFixture(judas);
		frameFixture.show();
	}

	@After
	public void tearDown() throws Exception {
		judas.dispose();
		frameFixture.cleanUp();
	}

	@Test
	public void test() {
		fail("Not yet implemented");
	}

}
