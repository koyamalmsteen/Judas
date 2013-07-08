package org.iugonet.www;

import java.io.BufferedReader;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;

import org.jfree.data.time.Hour;
import org.jfree.data.time.Second;
import org.jfree.data.time.TimeSeries;
import org.jfree.data.time.TimeSeriesCollection;

public class TplotWdcDst extends Tplot {

	TimeSeries timeSeries;

	TplotWdcDst(String arg0) {
		super();

		timeSeries = new TimeSeries("Dst index", Hour.class);

		retrieveFile(arg0);
		// loadData(arg0);
	}

	public void retrieveFile(String arg0) {

		try {
			URL url = new URL(arg0);
			URLConnection conn = url.openConnection();

			InputStream in = conn.getInputStream();

			File newDir = new File("/tmp"
					+ url.getFile()
							.substring(0, url.getFile().lastIndexOf('/')));
			if (newDir.exists() == false) {
				newDir.mkdirs();
			}

			File file = new File("/tmp" + url.getFile());
			FileOutputStream out = new FileOutputStream(file, false);
			int b;
			while ((b = in.read()) != -1) {
				out.write(b);
			}
			out.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public TimeSeriesCollection loadData(String arg0) {
		TimeSeriesCollection timeSeriesCollection = new TimeSeriesCollection();

		try {
			URL url = new URL(arg0);

			File file = new File("/tmp" + url.getFile());
			FileReader fileReader;
			fileReader = new FileReader(file);
			BufferedReader br = new BufferedReader(fileReader);
			TimeSeries timeSeries = loadData2(br);
			timeSeriesCollection.addSeries(timeSeries);
			br.close();
			fileReader.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return timeSeriesCollection;
	}

	public TimeSeries loadData2(BufferedReader br) {
		String line;
		ArrayList<Double> array = new ArrayList<Double>();
		ArrayList<Hour> hour = new ArrayList<Hour>();

		try {
			int j = 1;
			while ((line = br.readLine()) != null) {
				String yy_tail = line.substring(4 - 1, 5);
				String mm = line.substring(6 - 1, 7);
				String dd = line.substring(9 - 1, 10); //
				String yy_head = line.substring(15 - 1, 16);
				String dst_base = line.substring(17 - 1, 20).replace(" ", "");

				for (int i = 21 - 1; i < 116; i = i + 4) {
					String dst_offset = line.substring(i, i + 4).replace(" ",
							"");
					array.add(Double.parseDouble(dst_base) * 100.
							+ Double.parseDouble(dst_offset));
				}

				for (int i = 0; i < 24; i++) {
					hour.add(new Hour(i, j, 1, 2000));
				}
				j = j + 1;
			}

			for (int i = 0; i < array.size(); i++) {
				timeSeries.add(hour.get(i), array.get(i));
			}
			System.out.println(timeSeries.getValue(1));
		} catch (IOException e) {
			e.printStackTrace();
		}

		return timeSeries;
	}

	public char[] getData() {
		// TODO Auto-generated method stub
		return null;
	}
}
