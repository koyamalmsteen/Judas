package org.iugonet.www;

<<<<<<< HEAD
=======
import static org.junit.Assert.*;

>>>>>>> b8c1d3b... This is initial commit.
import org.fest.swing.fixture.DialogFixture;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class PlotPaneTest {

	PlotPane plotPane;
	DialogFixture dialogFixture;

	@Before
	public void setUp() throws Exception {
		plotPane = new PlotPane();
<<<<<<< HEAD
//		dialogFixture = new DialogFixture(plotPane);
//		dialogFixture.show();
=======
		dialogFixture = new DialogFixture(plotPane);
		dialogFixture.show();
>>>>>>> b8c1d3b... This is initial commit.
	}

	@After
	public void tearDown() throws Exception {
<<<<<<< HEAD
//		plotPane.dispose();
=======
		plotPane.dispose();
>>>>>>> b8c1d3b... This is initial commit.
		dialogFixture.cleanUp();
	}

	@Test
	public void test() {
		dialogFixture.button("btnCancel").click();
<<<<<<< HEAD
//		assertFalse(plotPane.isActive());
=======
		assertFalse(plotPane.isActive());
>>>>>>> b8c1d3b... This is initial commit.
	}

}
