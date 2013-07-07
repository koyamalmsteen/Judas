package org.iugonet.www;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ AceTest.class, CalculateTest.class,
		ConfigurationSettingsTest.class, ConsoleTest.class,
		DataProcessingTest.class, DialogTest.class,
		GenerateThemisOverviewPlotTest.class, GoesTest.class,
		HelpRequestFormTest.class, HelpWindowTest.class,
		HistoryWindowTest.class,
		IonElectronVelocitySlicesRotationsLegendTest.class, IugonetTest.class,
		JudasTest.class, LineOptionsTest.class, LoadDataTest.class,
		ManageDataAndImportExportTplotTest.class, MyCalendarTest.class,
		NudgeTracesTest.class, OverviewPlotKeyTest.class,
		PageOptionsTest.class, PanelOptionsTest.class,
		PlotLayoutOptionsTest.class, PlotPaneTest.class, ProjectTest.class,
		ThemisDerivedSpectraTest.class, ThemisTest.class,
		VariableOptionsTest.class, VelocitySlicesTest.class, WindTest.class,
		XAxisOptionsTest.class, XXXAxisOptionsTest.class,
		YAxisOptionsTest.class, ZAxisOptionsTest.class })
public class AllTests {

}
