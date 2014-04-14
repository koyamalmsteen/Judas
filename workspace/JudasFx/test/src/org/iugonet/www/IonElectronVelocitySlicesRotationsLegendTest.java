package org.iugonet.www;

import static org.junit.Assert.*;

import org.fest.swing.fixture.DialogFixture;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class IonElectronVelocitySlicesRotationsLegendTest {

	IonElectronVelocitySlicesRotationsLegend ionElectronVelocitySlicesRotationsLegend;
	DialogFixture dialogFixture;

	@Before
	public void setUp() throws Exception {
		ionElectronVelocitySlicesRotationsLegend = new IonElectronVelocitySlicesRotationsLegend();
		dialogFixture = new DialogFixture(
				ionElectronVelocitySlicesRotationsLegend);
		dialogFixture.show();
	}

	@After
	public void tearDown() throws Exception {
		ionElectronVelocitySlicesRotationsLegend.dispose();
		dialogFixture.cleanUp();
	}

	@Test
	public void test() {
		dialogFixture.button("btnOk").click();
		assertFalse(ionElectronVelocitySlicesRotationsLegend.isActive());
	}
}
