package org.iugonet.www;

import static org.junit.Assert.*;

import org.fest.swing.fixture.DialogFixture;
import org.iugonet.www.ZAxisOptions;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ZAxisOptionsTest {

	ZAxisOptions zAxisOptions;
	DialogFixture dialogFixture;

	@Before
	public void setUp() throws Exception {
		zAxisOptions = new ZAxisOptions();
		dialogFixture = new DialogFixture(zAxisOptions);
		dialogFixture.show();
	}

	@After
	public void tearDown() throws Exception {
		zAxisOptions.dispose();
		dialogFixture.cleanUp();
	}

	@Test
	public void test_01() {
		dialogFixture.button("btnOk").click();
		assertFalse(zAxisOptions.isActive());
	}

	@Test
	public void test_02() {
		dialogFixture.button("btnApply").click();
		assertFalse(zAxisOptions.isActive());
	}

	@Test
	public void test_03() {
		dialogFixture.button("btnCancel").click();
		assertFalse(zAxisOptions.isActive());
	}

	@Test
	public void test_04() {
		dialogFixture.button("btnSaveToTemplate").click();
		assertFalse(zAxisOptions.isActive());
	}
	
	@Test
	public void test_05() {
		dialogFixture.button("rdbtnRainbow").click();
		assertFalse(zAxisOptions.isActive());
	}

	@Test
	public void test_06() {
		dialogFixture.button("rdbtnLiner").click();
		assertFalse(zAxisOptions.isActive());
	}
	
	@Test
	public void test_07() {
		dialogFixture.button("rdbtnCool").click();
		assertFalse(zAxisOptions.isActive());
	}
	
	@Test
	public void test_08() {
		dialogFixture.button("rdbtnLog").click();
		assertFalse(zAxisOptions.isActive());
	}
	
	@Test
	public void test_09() {
		dialogFixture.button("rdbtnHot").click();
		assertFalse(zAxisOptions.isActive());
	}
	
	@Test
	public void test_10() {
		dialogFixture.button("rdbtnM").click();
		assertFalse(zAxisOptions.isActive());
	}
	
	@Test
	public void test_11() {
		dialogFixture.button("rdbtnCopper").click();
		assertFalse(zAxisOptions.isActive());
	}
	
	@Test
	public void test_12() {
		dialogFixture.button("rdbtnE").click();
		assertFalse(zAxisOptions.isActive());
	}
	
	@Test
	public void test_13() {
		dialogFixture.button("rdbtnTop").click();
		assertFalse(zAxisOptions.isActive());
	}
	
	@Test
	public void test_14() {
		dialogFixture.button("rdbtnD").click();
		assertFalse(zAxisOptions.isActive());
	}
	
	@Test
	public void test_15() {
		dialogFixture.button("rdbtnBottom").click();
		assertFalse(zAxisOptions.isActive());
	}
	
	@Test
	public void test_16() {
		dialogFixture.button("rdbtnT").click();
		assertFalse(zAxisOptions.isActive());
	}
	
	@Test
	public void test_17() {
		dialogFixture.button("tdbtnLeft").click();
		assertFalse(zAxisOptions.isActive());
	}
	
	@Test
	public void test_18() {
		dialogFixture.button("rdbtnRight").click();
		assertFalse(zAxisOptions.isActive());
	}
	
	@Test
	public void test_19() {
		dialogFixture.checkBox("chckbxFi").check();
		assertFalse(zAxisOptions.isActive());
	}
	
	@Test
	public void test_20() {
		dialogFixture.textBox("textField_1").setText("hoge");
		assertFalse(zAxisOptions.isActive());
	}
	
	@Test
	public void test_21() {
		dialogFixture.checkBox("chckbxHo").check();
		assertFalse(zAxisOptions.isActive());
	}
	
	@Test
	public void test_22() {
		dialogFixture.textBox("textField_2").setText("hoge");
		assertFalse(zAxisOptions.isActive());
	}
	
	@Test
	public void test_23() {
		dialogFixture.comboBox("comboBox_1").selectItem("");
		assertFalse(zAxisOptions.isActive());
	}
	
	@Test
	public void test_24() {
		dialogFixture.textBox("textField_3").setText("hoge");
		assertFalse(zAxisOptions.isActive());
	}

	@Test
	public void test_25() {
		dialogFixture.comboBox("comboBox_2").selectItem("");
		assertFalse(zAxisOptions.isActive());
	}
	
	@Test
	public void test_26() {
		dialogFixture.comboBox("comboBox_3").selectItem("");
		assertFalse(zAxisOptions.isActive());
	}

	@Test
	public void test_27() {
		dialogFixture.button("rdbtnHorizontal").click();
		assertFalse(zAxisOptions.isActive());
	}
	
	@Test
	public void test_28() {
		dialogFixture.button("rdbtnVertical").click();
		assertFalse(zAxisOptions.isActive());
	}
	
	@Test
	public void test_29() {
		dialogFixture.button("rdbtnA").click();
		assertFalse(zAxisOptions.isActive());
	}	

	@Test
	public void test_30() {
		dialogFixture.button("rdbtnB").click();
		assertFalse(zAxisOptions.isActive());
	}	
	
	@Test
	public void test_31() {
		dialogFixture.button("rdbtnC").click();
		assertFalse(zAxisOptions.isActive());
	}	
}
