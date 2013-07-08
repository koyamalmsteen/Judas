package org.iugonet.www;


import javax.swing.JPanel;

import javax.swing.undo.UndoableEditSupport;

public class PlotPane extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * Create the panel.
	 */

	private int scaleSize = 100;

	protected UndoableEditSupport undoableEditSupport;

	public int getScaleSize() {
		return scaleSize;
	}

	public void setScaleSize(int scaleSize) {
		if (scaleSize <= 200 && scaleSize >= 1) {
			this.scaleSize = scaleSize;
		}
	}

	public void addScaleSize() {
		if (scaleSize < 200) {
			if (scaleSize % 10 != 0) {
				scaleSize = roundUp(scaleSize);
			} else {
				scaleSize = scaleSize + 10;
			}
		}
	}

	public void subtractScaleSize() {
		if (scaleSize > 1) {
			if (scaleSize % 10 != 0) {
				scaleSize = roundDown(scaleSize);
			} else {
				scaleSize = scaleSize - 10;
			}
			System.out.println("scaleSize=" + scaleSize);
		}
		if (scaleSize == 0) {
			scaleSize = 1;
		}
	}

	public int roundUp(int value) {
		int result;
		if (value % 10 != 0) {
			result = 10 * (value / 10 + 1);
		} else {
			result = value;
		}
		return result;
	}

	public int roundDown(int value) {
		int result;
		if (value % 10 != 0) {
			result = 10 * (value / 10);
		} else {
			result = value;
		}
		return result;
	}

	public PlotPane() {
		super();
	}

	public void plot(String arg0) {
		System.out.println("plot");

		/*
=======
>>>>>>> 9f897e0... This is initial commit.
		TplotWdcDst tplotWdcDst = new TplotWdcDst(
				"http://wdc-data.iugonet.org/data/hour/index/dst/1984/dst8410");
		System.out.println(tplotWdcDst.getData());
		JFreeChart chart = ChartFactory
				.createTimeSeriesChart(
						"Dst index",
						"UTC",
						"Dst index [nT]",
						tplotWdcDst
								.loadData("http://wdc-data.iugonet.org/data/hour/index/dst/1984/dst8410"),
						true, false, false);
		ChartPanel cpanel = new ChartPanel(chart);
		getRootPane().add(cpanel, BorderLayout.CENTER);

		this.add(cpanel);
<<<<<<< HEAD
		*/
		this.setVisible(true);
		this.updateUI();
	}

}
