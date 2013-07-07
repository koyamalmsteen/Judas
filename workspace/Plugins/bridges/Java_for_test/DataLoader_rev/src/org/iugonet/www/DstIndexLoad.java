package org.iugonet.www;

import org.jfree.data.time.TimeSeries;
import java.util.TimeZone;
import java.util.Calendar;

public class DstIndexLoad {

	public double[][] LoadData(String strUrl) {
		DstIndex dstIndex = new DstIndex();

		try {
			dstIndex.file_http_copy(strUrl);
			dstIndex.readData(strUrl);
		} catch (Exception e) {
			e.printStackTrace();
		}

		TimeSeries[] timeSeries = new TimeSeries[1];
		timeSeries[0] = dstIndex.getTimeSeries();

		// Set TimeZone to UTC
		TimeZone tz = TimeZone.getTimeZone("UTCEtc");
		Calendar cal = Calendar.getInstance(tz);
		
		// Convert TimeSeries to double array
		int n = timeSeries[0].getItemCount();
		// System.out.print(n);
		
		double[][] array = new double[n][2];
		
		for (int i = 0; i < n; i = i + 1) {
			array[i][0] = timeSeries[0].getTimePeriod(i).getFirstMillisecond(cal)/1000;
			array[i][1] = timeSeries[0].getValue(i).doubleValue();
		}

		/*
		for (int i = 0; i < n; i = i + 1) {
			System.out.print(array[i][0]);
			System.out.print('\n');
		}
		for (int i = 0; i < n; i = i + 1) {
			System.out.print(array[i][1]);
			System.out.print('\n');
		}
		*/
		
		return array;
	}

}
