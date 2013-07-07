package org.iugonet.www;

import static org.junit.Assert.*;

import org.fest.swing.fixture.DialogFixture;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class HelpRequestFormTest {

	HelpRequestForm helpRequestForm;
	DialogFixture dialogFixture;

	@Before
	public void setUp() throws Exception {
		helpRequestForm = new HelpRequestForm();
		dialogFixture = new DialogFixture(helpRequestForm);
		dialogFixture.show();
	}

	@After
	public void tearDown() throws Exception {
		helpRequestForm.dispose();
		dialogFixture.cleanUp();
	}

	@Test
	public void test() {
		dialogFixture.button("btnOk").click();
		assertFalse(helpRequestForm.isActive());
	}

}
