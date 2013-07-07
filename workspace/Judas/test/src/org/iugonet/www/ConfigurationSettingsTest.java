package org.iugonet.www;

import static org.junit.Assert.*;

import org.fest.swing.fixture.DialogFixture;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ConfigurationSettingsTest {

	ConfigurationSettings configurationSettings;
	DialogFixture dialogFixture;

	@Before
	public void setUp() throws Exception {
		configurationSettings = new ConfigurationSettings();
		dialogFixture = new DialogFixture(configurationSettings);
		dialogFixture.show();
	}

	@After
	public void tearDown() throws Exception {
		configurationSettings.dispose();
		dialogFixture.cleanUp();
	}

	@Test
	public void test_01() {
		dialogFixture.button("btnSave").click();
		assertFalse(configurationSettings.isActive());
	}

	@Test
	public void test_02() {
		dialogFixture.button("btnReset").click();
		assertFalse(configurationSettings.isActive());
	}

	@Test
	public void test_03() {
		dialogFixture.button("btnResetTDefault").click();
		assertFalse(configurationSettings.isActive());
	}

	@Test
	public void test_04() {
		dialogFixture.button("btnClose");
		assertFalse(configurationSettings.isActive());
	}

}
