package org.iugonet.www;

import static org.junit.Assert.*;

import org.fest.swing.fixture.DialogFixture;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class MyCalendarTest {

	MyCalendar myCalendar;
	DialogFixture dialogFixture;

	@Before
	public void setUp() throws Exception {
		myCalendar = new MyCalendar();
		dialogFixture = new DialogFixture(myCalendar);
		dialogFixture.show();
	}

	@After
	public void tearDown() throws Exception {
		myCalendar.dispose();
		dialogFixture.cleanUp();
	}

	@Test
	public void test_01() {
		dialogFixture.button("btnOk").click();
		assertFalse(myCalendar.isActive());
	}

	@Test
	public void test_02() {
		dialogFixture.button("btnCancel").click();
		assertFalse(myCalendar.isActive());
	}

}
