package org.iugonet.www;

import java.io.BufferedReader;

import java.io.FileReader;
import java.net.URI;
import java.net.URL;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.time.Second;
import org.jfree.data.time.TimeSeries;
import org.jfree.data.time.TimeSeriesCollection;

public class DstIndex extends Tplot {

	private BufferedReader bufferedReader;
	private String strUrl = "http://wdc-data.iugonet.org/data/hour/index/dst/1984/dst8410";

	public DstIndex() {
		super(1);
		// timeSeries[0].setKey("Dst index");
	}

	@Override
	void readData(URL url) {
		String line;

		try {
			FileReader fileReader = new FileReader("/tmp" + url.getPath());
			// FileReader fileReader = new
			// FileReader("/tmp/data/hour/index/dst/1984/dst8410");
			bufferedReader = new BufferedReader(fileReader);

			while ((line = bufferedReader.readLine()) != null) {
				System.out.println(line);
				// System.out.print(line.substring(1-1,3));
				String yy_tail = line.substring(4 - 1, 5);
				int yyyy = 1900 + Integer.parseInt(yy_tail);
				String mm_s = line.substring(6 - 1, 7);
				int mm = Integer.parseInt(mm_s);
				// System.out.print(line.substring(8-1,8));
				String dd_s = line.substring(9 - 1, 10);
				int dd = Integer.parseInt(dd_s);
				// System.out.print(line.substring(11-1,12));
				// System.out.print(line.substring(13-1,13));
				// System.out.print(line.substring(14-1,14));
				// String yy_head = line.substring(15 - 1, 16);
				String dst_base = line.substring(17 - 1, 20).replace(" ", "");

				int j = 0;

				for (int i = 21 - 1; i < 116; i = i + 4) {
					String dst_offset = line.substring(i, i + 4).replace(" ",
							"");
					double dst = (double) (Integer.parseInt(dst_base) * 100. + Integer
							.parseInt(dst_offset));

					//
					// Calendar calendar = Calendar.getInstance();
					// int offset = calendar.get(Calendar.DST_OFFSET) +
					// calendar.get(Calendar.ZONE_OFFSET);
					//

					Second second = new Second(0, 0, j++, dd, mm, yyyy);

					this.add(second, dst, 0);
				}
				// System.out.print(line.substring(117-1,120));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}	
	}
	
	@Override
	public ChartPanel getChartPanel() {
		JFreeChart chart = getChart();

		ChartPanel cpanel = new ChartPanel(chart);
		return cpanel;
	}

	@Override
	public JFreeChart getChart() {
		JFreeChart chart = null;

		String xlabel = "UTC";
		String ylabel = "Dst index [nT]";

		chart = ChartFactory.createTimeSeriesChart(null, xlabel, ylabel,
				loadData(strUrl), false, true, false);

		return chart;
	}

	@Override
	public TimeSeriesCollection loadData(String strUrl) {
		TimeSeriesCollection timeSeriesCollection = new TimeSeriesCollection();

		DstIndex dstIndex = new DstIndex();
		try {
			dstIndex.file_http_copy(strUrl);
			dstIndex.readData(strUrl);
		} catch (Exception e) {
			e.printStackTrace();
		}

		TimeSeries[] timeSeries = new TimeSeries[1];
		timeSeries[0] = dstIndex.getTimeSeries(0);

		timeSeriesCollection.addSeries(dstIndex.getTimeSeries(0));

		return timeSeriesCollection;
	}

	@Override
	public TimeSeriesCollection loadData(URI uri) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TimeSeriesCollection loadData(URL arg0) {
		// TODO Auto-generated method stub
		return null;
	}

}
