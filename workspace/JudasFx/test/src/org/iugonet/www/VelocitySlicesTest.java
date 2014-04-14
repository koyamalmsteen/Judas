package org.iugonet.www;

import static org.junit.Assert.*;

import org.fest.swing.fixture.DialogFixture;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class VelocitySlicesTest {

	VelocitySlices velocitySlices;
	DialogFixture dialogFixture;

	@Before
	public void setUp() throws Exception {
		velocitySlices = new VelocitySlices();
		dialogFixture = new DialogFixture(velocitySlices);
		dialogFixture.show();
	}

	@After
	public void tearDown() throws Exception {
		velocitySlices.dispose();
		dialogFixture.cleanUp();
	}

	@Test
	public void test_01() {
		dialogFixture.button("btnGenerate").click();
		assertFalse(velocitySlices.isActive());
	}

	@Test
	public void test_02() {
		dialogFixture.button("btnCancel").click();
		assertFalse(velocitySlices.isActive());
	}

	@Test
	public void test_03() {
		dialogFixture.button("btnExport").click();
		assertFalse(velocitySlices.isActive());
	}

	@Test
	public void test_04() {
		dialogFixture.button("btnExportAll").click();
		assertFalse(velocitySlices.isActive());
	}
	
	@Test
	public void test_05() {
		dialogFixture.button("rdbtnRainbow").click();
		assertFalse(velocitySlices.isActive());
	}

	@Test
	public void test_06() {
		dialogFixture.button("rdbtnLiner").click();
		assertFalse(velocitySlices.isActive());
	}
	
	@Test
	public void test_07() {
		dialogFixture.button("rdbtnCool").click();
		assertFalse(velocitySlices.isActive());
	}
	
	@Test
	public void test_08() {
		dialogFixture.button("rdbtnLog").click();
		assertFalse(velocitySlices.isActive());
	}
	
	@Test
	public void test_09() {
		dialogFixture.button("rdbtnHot").click();
		assertFalse(velocitySlices.isActive());
	}
	
	@Test
	public void test_10() {
		dialogFixture.button("rdbtnM").click();
		assertFalse(velocitySlices.isActive());
	}
	
	@Test
	public void test_11() {
		dialogFixture.button("rdbtnCopper").click();
		assertFalse(velocitySlices.isActive());
	}
	
	@Test
	public void test_12() {
		dialogFixture.button("rdbtnE").click();
		assertFalse(velocitySlices.isActive());
	}
	
	@Test
	public void test_13() {
		dialogFixture.button("rdbtnTop").click();
		assertFalse(velocitySlices.isActive());
	}
	
	@Test
	public void test_14() {
		dialogFixture.button("rdbtnD").click();
		assertFalse(velocitySlices.isActive());
	}
	
	@Test
	public void test_15() {
		dialogFixture.button("rdbtnBottom").click();
		assertFalse(velocitySlices.isActive());
	}
	
	@Test
	public void test_16() {
		dialogFixture.button("rdbtnT").click();
		assertFalse(velocitySlices.isActive());
	}
	
	@Test
	public void test_17() {
		dialogFixture.button("tdbtnLeft").click();
		assertFalse(velocitySlices.isActive());
	}
	
	@Test
	public void test_18() {
		dialogFixture.button("rdbtnRight").click();
		assertFalse(velocitySlices.isActive());
	}
	
	@Test
	public void test_19() {
		dialogFixture.checkBox("chckbxFi").check();
		assertFalse(velocitySlices.isActive());
	}
	
	@Test
	public void test_20() {
		dialogFixture.textBox("textField_1").setText("hoge");
		assertFalse(velocitySlices.isActive());
	}
	
	@Test
	public void test_21() {
		dialogFixture.checkBox("chckbxHo").check();
		assertFalse(velocitySlices.isActive());
	}
	
	@Test
	public void test_22() {
		dialogFixture.textBox("textField_2").setText("hoge");
		assertFalse(velocitySlices.isActive());
	}
	
	@Test
	public void test_23() {
		dialogFixture.comboBox("comboBox_1").selectItem("");
		assertFalse(velocitySlices.isActive());
	}
	
	@Test
	public void test_24() {
		dialogFixture.textBox("textField_3").setText("hoge");
		assertFalse(velocitySlices.isActive());
	}

	@Test
	public void test_25() {
		dialogFixture.comboBox("comboBox_2").selectItem("");
		assertFalse(velocitySlices.isActive());
	}
	
	@Test
	public void test_26() {
		dialogFixture.comboBox("comboBox_3").selectItem("");
		assertFalse(velocitySlices.isActive());
	}

	@Test
	public void test_27() {
		dialogFixture.button("rdbtnHorizontal").click();
		assertFalse(velocitySlices.isActive());
	}
	
	@Test
	public void test_28() {
		dialogFixture.button("rdbtnVertical").click();
		assertFalse(velocitySlices.isActive());
	}
	
	@Test
	public void test_29() {
		dialogFixture.button("rdbtnA").click();
		assertFalse(velocitySlices.isActive());
	}	

	@Test
	public void test_30() {
		dialogFixture.button("rdbtnB").click();
		assertFalse(velocitySlices.isActive());
	}	
	
	@Test
	public void test_31() {
		dialogFixture.button("rdbtnC").click();
		assertFalse(velocitySlices.isActive());
	}	
	
	@Test
	public void test_32() {
		dialogFixture.button("rdbtnRainbow").click();
		assertFalse(velocitySlices.isActive());
	}

	@Test
	public void test_33() {
		dialogFixture.button("rdbtnLiner").click();
		assertFalse(velocitySlices.isActive());
	}
	
	@Test
	public void test_34() {
		dialogFixture.button("rdbtnCool").click();
		assertFalse(velocitySlices.isActive());
	}
	
	@Test
	public void test_35() {
		dialogFixture.button("rdbtnLog").click();
		assertFalse(velocitySlices.isActive());
	}
	
	@Test
	public void test_36() {
		dialogFixture.button("rdbtnHot").click();
		assertFalse(velocitySlices.isActive());
	}
	
	@Test
	public void test_37() {
		dialogFixture.button("rdbtnM").click();
		assertFalse(velocitySlices.isActive());
	}
	
	@Test
	public void test_38() {
		dialogFixture.button("rdbtnCopper").click();
		assertFalse(velocitySlices.isActive());
	}
	
	@Test
	public void test_39() {
		dialogFixture.button("rdbtnE").click();
		assertFalse(velocitySlices.isActive());
	}
	
	@Test
	public void test_40() {
		dialogFixture.button("rdbtnTop").click();
		assertFalse(velocitySlices.isActive());
	}
	
	@Test
	public void test_41() {
		dialogFixture.button("rdbtnD").click();
		assertFalse(velocitySlices.isActive());
	}
	
	@Test
	public void test_42() {
		dialogFixture.button("rdbtnBottom").click();
		assertFalse(velocitySlices.isActive());
	}
	
	@Test
	public void test_43() {
		dialogFixture.button("rdbtnT").click();
		assertFalse(velocitySlices.isActive());
	}
	
	@Test
	public void test_44() {
		dialogFixture.button("tdbtnLeft").click();
		assertFalse(velocitySlices.isActive());
	}
	
	@Test
	public void test_45() {
		dialogFixture.button("rdbtnRight").click();
		assertFalse(velocitySlices.isActive());
	}
	
	@Test
	public void test_46() {
		dialogFixture.checkBox("chckbxFi").check();
		assertFalse(velocitySlices.isActive());
	}
	
	@Test
	public void test_47() {
		dialogFixture.textBox("textField_1").setText("hoge");
		assertFalse(velocitySlices.isActive());
	}
	
	@Test
	public void test_48() {
		dialogFixture.checkBox("chckbxHo").check();
		assertFalse(velocitySlices.isActive());
	}
	
	@Test
	public void test_49() {
		dialogFixture.textBox("textField_2").setText("hoge");
		assertFalse(velocitySlices.isActive());
	}
	
	@Test
	public void test_50() {
		dialogFixture.comboBox("comboBox_1").selectItem("");
		assertFalse(velocitySlices.isActive());
	}
	
	@Test
	public void test_51() {
		dialogFixture.textBox("textField_3").setText("hoge");
		assertFalse(velocitySlices.isActive());
	}

	@Test
	public void test_52() {
		dialogFixture.comboBox("comboBox_2").selectItem("");
		assertFalse(velocitySlices.isActive());
	}
	
	@Test
	public void test_53() {
		dialogFixture.comboBox("comboBox_3").selectItem("");
		assertFalse(velocitySlices.isActive());
	}

	@Test
	public void test_54() {
		dialogFixture.button("rdbtnHorizontal").click();
		assertFalse(velocitySlices.isActive());
	}
	
	@Test
	public void test_55() {
		dialogFixture.button("rdbtnVertical").click();
		assertFalse(velocitySlices.isActive());
	}
	
	@Test
	public void test_56() {
		dialogFixture.button("rdbtnA").click();
		assertFalse(velocitySlices.isActive());
	}	

	@Test
	public void test_57() {
		dialogFixture.button("rdbtnB").click();
		assertFalse(velocitySlices.isActive());
	}	
	
	@Test
	public void test_58() {
		dialogFixture.button("rdbtnC").click();
		assertFalse(velocitySlices.isActive());
	}	
	
	@Test
	public void test_59() {
		dialogFixture.button("rdbtnRainbow").click();
		assertFalse(velocitySlices.isActive());
	}

	@Test
	public void test_60() {
		dialogFixture.button("rdbtnLiner").click();
		assertFalse(velocitySlices.isActive());
	}
	
	@Test
	public void test_61() {
		dialogFixture.button("rdbtnCool").click();
		assertFalse(velocitySlices.isActive());
	}
	
	@Test
	public void test_62() {
		dialogFixture.button("rdbtnLog").click();
		assertFalse(velocitySlices.isActive());
	}
	
	@Test
	public void test_63() {
		dialogFixture.button("rdbtnHot").click();
		assertFalse(velocitySlices.isActive());
	}
	
	@Test
	public void test_64() {
		dialogFixture.button("rdbtnM").click();
		assertFalse(velocitySlices.isActive());
	}
	
	@Test
	public void test_65() {
		dialogFixture.button("rdbtnCopper").click();
		assertFalse(velocitySlices.isActive());
	}
	
	@Test
	public void test_66() {
		dialogFixture.button("rdbtnE").click();
		assertFalse(velocitySlices.isActive());
	}
	
	@Test
	public void test_67() {
		dialogFixture.button("rdbtnTop").click();
		assertFalse(velocitySlices.isActive());
	}
	
	@Test
	public void test_68() {
		dialogFixture.button("rdbtnD").click();
		assertFalse(velocitySlices.isActive());
	}
	
	@Test
	public void test_69() {
		dialogFixture.button("rdbtnBottom").click();
		assertFalse(velocitySlices.isActive());
	}
	
	@Test
	public void test_70() {
		dialogFixture.button("rdbtnT").click();
		assertFalse(velocitySlices.isActive());
	}
	
	@Test
	public void test_71() {
		dialogFixture.button("tdbtnLeft").click();
		assertFalse(velocitySlices.isActive());
	}
	
	@Test
	public void test_72() {
		dialogFixture.button("rdbtnRight").click();
		assertFalse(velocitySlices.isActive());
	}
	
	@Test
	public void test_73() {
		dialogFixture.checkBox("chckbxFi").check();
		assertFalse(velocitySlices.isActive());
	}
	
	@Test
	public void test_74() {
		dialogFixture.textBox("textField_1").setText("hoge");
		assertFalse(velocitySlices.isActive());
	}
	
	@Test
	public void test_75() {
		dialogFixture.checkBox("chckbxHo").check();
		assertFalse(velocitySlices.isActive());
	}
	
	@Test
	public void test_76() {
		dialogFixture.textBox("textField_2").setText("hoge");
		assertFalse(velocitySlices.isActive());
	}
	
	@Test
	public void test_77() {
		dialogFixture.comboBox("comboBox_1").selectItem("");
		assertFalse(velocitySlices.isActive());
	}
	
	@Test
	public void test_78() {
		dialogFixture.textBox("textField_3").setText("hoge");
		assertFalse(velocitySlices.isActive());
	}

	@Test
	public void test_79() {
		dialogFixture.comboBox("comboBox_2").selectItem("");
		assertFalse(velocitySlices.isActive());
	}
	
	@Test
	public void test_80() {
		dialogFixture.comboBox("comboBox_3").selectItem("");
		assertFalse(velocitySlices.isActive());
	}

	@Test
	public void test_81() {
		dialogFixture.button("rdbtnHorizontal").click();
		assertFalse(velocitySlices.isActive());
	}
	
	@Test
	public void test_82() {
		dialogFixture.button("rdbtnVertical").click();
		assertFalse(velocitySlices.isActive());
	}
	
	@Test
	public void test_83() {
		dialogFixture.button("rdbtnA").click();
		assertFalse(velocitySlices.isActive());
	}	

	@Test
	public void test_84() {
		dialogFixture.button("rdbtnB").click();
		assertFalse(velocitySlices.isActive());
	}	
	
	@Test
	public void test_85() {
		dialogFixture.button("rdbtnC").click();
		assertFalse(velocitySlices.isActive());
	}	
	
	@Test
	public void test_86() {
		dialogFixture.button("rdbtnRainbow").click();
		assertFalse(velocitySlices.isActive());
	}

	@Test
	public void test_87() {
		dialogFixture.button("rdbtnLiner").click();
		assertFalse(velocitySlices.isActive());
	}
	
	@Test
	public void test_88() {
		dialogFixture.button("rdbtnCool").click();
		assertFalse(velocitySlices.isActive());
	}
	
	@Test
	public void test_89() {
		dialogFixture.button("rdbtnLog").click();
		assertFalse(velocitySlices.isActive());
	}
	
	@Test
	public void test_90() {
		dialogFixture.button("rdbtnHot").click();
		assertFalse(velocitySlices.isActive());
	}
	
	@Test
	public void test_91() {
		dialogFixture.button("rdbtnM").click();
		assertFalse(velocitySlices.isActive());
	}
	
	@Test
	public void test_92() {
		dialogFixture.button("rdbtnCopper").click();
		assertFalse(velocitySlices.isActive());
	}
	
	@Test
	public void test_93() {
		dialogFixture.button("rdbtnE").click();
		assertFalse(velocitySlices.isActive());
	}
	
	@Test
	public void test_94() {
		dialogFixture.button("rdbtnTop").click();
		assertFalse(velocitySlices.isActive());
	}
	
	@Test
	public void test_95() {
		dialogFixture.button("rdbtnD").click();
		assertFalse(velocitySlices.isActive());
	}
	
	@Test
	public void test_96() {
		dialogFixture.button("rdbtnBottom").click();
		assertFalse(velocitySlices.isActive());
	}
	
	@Test
	public void test_97() {
		dialogFixture.button("rdbtnT").click();
		assertFalse(velocitySlices.isActive());
	}
	
	@Test
	public void test_98() {
		dialogFixture.button("tdbtnLeft").click();
		assertFalse(velocitySlices.isActive());
	}
	
	@Test
	public void test_99() {
		dialogFixture.button("rdbtnRight").click();
		assertFalse(velocitySlices.isActive());
	}
	
	@Test
	public void test_100() {
		dialogFixture.checkBox("chckbxFi").check();
		assertFalse(velocitySlices.isActive());
	}
	
	@Test
	public void test_101() {
		dialogFixture.textBox("textField_1").setText("hoge");
		assertFalse(velocitySlices.isActive());
	}
	
	@Test
	public void test_102() {
		dialogFixture.checkBox("chckbxHo").check();
		assertFalse(velocitySlices.isActive());
	}
	
	@Test
	public void test_103() {
		dialogFixture.textBox("textField_2").setText("hoge");
		assertFalse(velocitySlices.isActive());
	}
	
	@Test
	public void test_104() {
		dialogFixture.comboBox("comboBox_1").selectItem("");
		assertFalse(velocitySlices.isActive());
	}
	
	@Test
	public void test_105() {
		dialogFixture.textBox("textField_3").setText("hoge");
		assertFalse(velocitySlices.isActive());
	}

	@Test
	public void test_106() {
		dialogFixture.comboBox("comboBox_2").selectItem("");
		assertFalse(velocitySlices.isActive());
	}
	
	@Test
	public void test_107() {
		dialogFixture.comboBox("comboBox_3").selectItem("");
		assertFalse(velocitySlices.isActive());
	}

	@Test
	public void test_108() {
		dialogFixture.button("rdbtnHorizontal").click();
		assertFalse(velocitySlices.isActive());
	}
	
	@Test
	public void test_109() {
		dialogFixture.button("rdbtnVertical").click();
		assertFalse(velocitySlices.isActive());
	}
	
	@Test
	public void test_110() {
		dialogFixture.button("rdbtnA").click();
		assertFalse(velocitySlices.isActive());
	}	

	@Test
	public void test_111() {
		dialogFixture.button("rdbtnB").click();
		assertFalse(velocitySlices.isActive());
	}	
	
	@Test
	public void test_112() {
		dialogFixture.button("rdbtnC").click();
		assertFalse(velocitySlices.isActive());
	}	

}
