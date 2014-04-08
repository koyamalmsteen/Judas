package org.iugonet.www;

import java.io.Serializable;
import java.net.URI;
import java.net.URL;

import org.iugonet.www.Aplot;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.time.*;

abstract public class Tplot extends Aplot implements Serializable {

	private TimeSeries[] timeSeries;

	Tplot() {
		timeSeries = new TimeSeries[1];
		timeSeries[0] = new TimeSeries("");
	}

	Tplot(int dim_max) {
		timeSeries = new TimeSeries[dim_max];
		for (int i = 0; i < timeSeries.length; i++) {
			timeSeries[i] = new TimeSeries("");
		}
	}

	public void add(Millisecond millisecond, double data, int dim_num) {
		timeSeries[dim_num].add(millisecond, data);
	}

	public void add(Second second, double data, int dim_num) {
		timeSeries[dim_num].add(second, data);
	}

	public void add(Minute minute, double data, int dim_num) {
		timeSeries[dim_num].add(minute, data);
	}

	public void add(Hour hour, double data, int dim_num) {
		timeSeries[dim_num].add(hour, data);
	}

	public void add(Day day, double data, int dim_num) {
		timeSeries[dim_num].add(day, data);
	}

	public void add(Month month, double data, int dim_num) {
		timeSeries[dim_num].add(month, data);
	}

	public void add(Year year, double data, int dim_num) {
		timeSeries[dim_num].add(year, data);
	}

	public void add(Week week, double data, int dim_num) {
		timeSeries[dim_num].add(week, data);
	}

	public void add(Quarter quarter, double data, int dim_num) {
		timeSeries[dim_num].add(quarter, data);
	}

	public TimeSeries getTimeSeries(int dim_num) {
		return timeSeries[dim_num];
	}

	public TimeSeries[] getTimeSeries() {
		return timeSeries;
	}

	abstract public ChartPanel getChartPanel();

	abstract public JFreeChart getChart();

	public TimeSeriesCollection load(String strUrl) {
		URL url = null;

		try {
			url = new URL(strUrl);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return this.load(url);
	}

	abstract public TimeSeriesCollection load(URL url);

	public TimeSeriesCollection load(URI uri) {
		return this.load(this.resolve(uri));
	}
}
