package org.iugonet.www;

import static org.junit.Assert.*;

import org.fest.swing.fixture.DialogFixture;
import org.iugonet.www.YAxisOptions;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class YAxisOptionsTest {

	YAxisOptions yAxisOptions;
	DialogFixture dialogFixture;

	@Before
	public void setUp() throws Exception {
		yAxisOptions = new YAxisOptions();
		dialogFixture = new DialogFixture(yAxisOptions);
		dialogFixture.show();
	}

	@After
	public void tearDown() throws Exception {
		yAxisOptions.dispose();
		dialogFixture.cleanUp();
	}

	@Test
	public void test_01() {
		dialogFixture.button("btnOk").click();
		assertFalse(yAxisOptions.isActive());
	}

	@Test
	public void test_02() {
		dialogFixture.button("btnApply").click();
		assertFalse(yAxisOptions.isActive());
	}

	@Test
	public void test_03() {
		dialogFixture.button("btnCancel").click();
		assertFalse(yAxisOptions.isActive());
	}

	@Test
	public void test_04() {
		dialogFixture.button("rdbtnRainbow").click();
		assertFalse(yAxisOptions.isActive());
	}

	@Test
	public void test_05() {
		dialogFixture.button("rdbtnLiner").click();
		assertFalse(yAxisOptions.isActive());
	}
	
	@Test
	public void test_06() {
		dialogFixture.button("rdbtnCool").click();
		assertFalse(yAxisOptions.isActive());
	}
	
	@Test
	public void test_07() {
		dialogFixture.button("rdbtnLog").click();
		assertFalse(yAxisOptions.isActive());
	}
	
	@Test
	public void test_08() {
		dialogFixture.button("rdbtnHot").click();
		assertFalse(yAxisOptions.isActive());
	}
	
	@Test
	public void test_09() {
		dialogFixture.button("rdbtnM").click();
		assertFalse(yAxisOptions.isActive());
	}
	
	@Test
	public void test_10() {
		dialogFixture.button("rdbtnCopper").click();
		assertFalse(yAxisOptions.isActive());
	}
	
	@Test
	public void test_11() {
		dialogFixture.button("rdbtnE").click();
		assertFalse(yAxisOptions.isActive());
	}
	
	@Test
	public void test_12() {
		dialogFixture.button("rdbtnTop").click();
		assertFalse(yAxisOptions.isActive());
	}
	
	@Test
	public void test_13() {
		dialogFixture.button("rdbtnD").click();
		assertFalse(yAxisOptions.isActive());
	}
	
	@Test
	public void test_14() {
		dialogFixture.button("rdbtnBottom").click();
		assertFalse(yAxisOptions.isActive());
	}
	
	@Test
	public void test_15() {
		dialogFixture.button("rdbtnT").click();
		assertFalse(yAxisOptions.isActive());
	}
	
	@Test
	public void test_16() {
		dialogFixture.button("tdbtnLeft").click();
		assertFalse(yAxisOptions.isActive());
	}
	
	@Test
	public void test_17() {
		dialogFixture.button("rdbtnRight").click();
		assertFalse(yAxisOptions.isActive());
	}
	
	@Test
	public void test_18() {
		dialogFixture.checkBox("chckbxFi").check();
		assertFalse(yAxisOptions.isActive());
	}
	
	@Test
	public void test_19() {
		dialogFixture.textBox("textField_1").setText("hoge");
		assertFalse(yAxisOptions.isActive());
	}
	
	@Test
	public void test_20() {
		dialogFixture.checkBox("chckbxHo").check();
		assertFalse(yAxisOptions.isActive());
	}
	
	@Test
	public void test_21() {
		dialogFixture.textBox("textField_2").setText("hoge");
		assertFalse(yAxisOptions.isActive());
	}
	
	@Test
	public void test_22() {
		dialogFixture.comboBox("comboBox_1").selectItem("");
		assertFalse(yAxisOptions.isActive());
	}
	
	@Test
	public void test_23() {
		dialogFixture.textBox("textField_3").setText("hoge");
		assertFalse(yAxisOptions.isActive());
	}

	@Test
	public void test_24() {
		dialogFixture.comboBox("comboBox_2").selectItem("");
		assertFalse(yAxisOptions.isActive());
	}
	
	@Test
	public void test_25() {
		dialogFixture.comboBox("comboBox_3").selectItem("");
		assertFalse(yAxisOptions.isActive());
	}

	@Test
	public void test_26() {
		dialogFixture.button("rdbtnHorizontal").click();
		assertFalse(yAxisOptions.isActive());
	}
	
	@Test
	public void test_27() {
		dialogFixture.button("rdbtnVertical").click();
		assertFalse(yAxisOptions.isActive());
	}
	
	@Test
	public void test_28() {
		dialogFixture.button("rdbtnA").click();
		assertFalse(yAxisOptions.isActive());
	}	

	@Test
	public void test_29() {
		dialogFixture.button("rdbtnB").click();
		assertFalse(yAxisOptions.isActive());
	}	
	
	@Test
	public void test_30() {
		dialogFixture.button("rdbtnC").click();
		assertFalse(yAxisOptions.isActive());
	}
}
