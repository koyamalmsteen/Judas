package org.iugonet.www;

import static org.junit.Assert.*;

import org.fest.swing.fixture.DialogFixture;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CalculateTest {

	Calculate calculate;
	DialogFixture dialogFixture;

	@Before
	public void setUp() throws Exception {
		calculate = new Calculate();
		dialogFixture = new DialogFixture(calculate);
		dialogFixture.show();
	}

	@After
	public void tearDown() throws Exception {
		calculate.dispose();
		dialogFixture.cleanUp();
	}

	@Test
	public void test_01() {
		dialogFixture.button("btnOk").click();
		assertFalse(calculate.isActive());
	}

	@Test
	public void test_02() {
		dialogFixture.button("btnCancel").click();
		assertFalse(calculate.isActive());
	}

}
