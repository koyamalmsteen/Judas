package org.iugonet.www;

import static org.junit.Assert.*;

import org.fest.swing.fixture.DialogFixture;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class DialogTest {

	Dialog dialog;
	DialogFixture dialogFixture;

	@Before
	public void setUp() throws Exception {
		dialog = new Dialog();
		dialogFixture = new DialogFixture(dialog);
		dialogFixture.show();
	}

	@After
	public void tearDown() throws Exception {
		dialog.dispose();
		dialogFixture.cleanUp();
	}

	@Test
	public void test_01() {
		dialogFixture.button("btnOk").click();
		try{
			Thread.sleep(5000);
		}catch(Exception e){
		}
		assertFalse(dialog.isActive());
	}

	@Test
	public void test_02() {
		dialogFixture.button("btnCancel").click();
		try{
			Thread.sleep(5000);
		}catch(Exception e){
		}
		assertFalse(dialog.isActive());
	}
}
