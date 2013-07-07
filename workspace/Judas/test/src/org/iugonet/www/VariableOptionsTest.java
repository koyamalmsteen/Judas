package org.iugonet.www;

import static org.junit.Assert.*;

import org.fest.swing.fixture.DialogFixture;
import org.iugonet.www.VariableOptions;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class VariableOptionsTest {

	VariableOptions variableOptions;
	DialogFixture dialogFixture;

	@Before
	public void setUp() throws Exception {
		variableOptions = new VariableOptions();
		dialogFixture = new DialogFixture(variableOptions);
		dialogFixture.show();
	}

	@After
	public void tearDown() throws Exception {
		variableOptions.dispose();
		dialogFixture.cleanUp();
	}

	@Test
	public void test_01() {
		dialogFixture.button("btnOk").click();
		assertFalse(variableOptions.isActive());
	}

	@Test
	public void test_02() {
		dialogFixture.button("btnApply").click();
		assertFalse(variableOptions.isActive());
	}

	@Test
	public void test_03() {
		dialogFixture.button("btnCancel").click();
		assertFalse(variableOptions.isActive());
	}

	@Test
	public void test_04() {
		dialogFixture.button("btnSaveToTemplate").click();
		assertFalse(variableOptions.isActive());
	}

}
