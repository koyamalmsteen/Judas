package org.iugonet.www;

import java.net.URI;
import java.net.URL;

import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.xy.XYDataItem;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

abstract public class XYplot extends Aplot {

	private XYSeries[] xySeries;

	XYplot() {
		xySeries = new XYSeries[1];
		xySeries[0] = new XYSeries("");
	}

	XYplot(int dim_max) {
		xySeries = new XYSeries[dim_max];
		for (int i = 0; i < xySeries.length; i++) {
			xySeries[i] = new XYSeries("");
		}
	}

	public void add(XYDataItem xyDataItem, int dim_num) {
		xySeries[dim_num].add(xyDataItem);
	}
	
	public void add(double x, double y, int dim_num) {
		xySeries[dim_num].add(x, y);
	}
	
	public void add(double x, Number y, int dim_num) {
		xySeries[dim_num].add(x, y);
	}
	
	public void add(Number x, Number y, int dim_num) {
		xySeries[dim_num].add(x, y);
	}
	
	public void add(XYDataItem arg0, boolean arg1, int dim_num) {
		xySeries[dim_num].add(arg0, arg1);
	}
	
	public void add(double x, double y, boolean notify, int dim_num) {
		xySeries[dim_num].add(x, y, notify);
	}
	
	public void add(double x, Number y, boolean notify, int dim_num) {
		xySeries[dim_num].add(x, y, notify);
	}
	
	public void add(Number x, Number y, boolean notify, int dim_num) {
		xySeries[dim_num].add(x, y, notify);
	}

	abstract public ChartPanel getChartPanel();
	
	abstract public JFreeChart getChart();
	
	abstract public XYSeriesCollection load(URL url);
	
	public XYSeriesCollection load(URI uri) {
		return this.load(this.resolve(uri));
	}
}
