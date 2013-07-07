package org.iugonet.www;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

import org.jfree.data.time.Second;

abstract public class Tplot {

	double[] data;
	Second[] second;

	Tplot() {

		data = new double[24];
		second = new Second[24];

		for (int i = 0; i < data.length; i++) {
			data[i] = i;
		}
		for (int i = 0; i < second.length; i++) {
			second[i] = new Second(i, 1, 1, 1, 1, 2000);
		}

	}

	public void load(String arg0) throws IOException {
		String charset = "UTF-8";

		// arg0 =
		// "http://wdc-data.iugonet.org/data/hour/index/dst/1984/dst8410";

		try {
			URL url = new URL(arg0);
			URLConnection uc = url.openConnection();
			BufferedInputStream bis = new BufferedInputStream(
					uc.getInputStream());
			BufferedReader br = new BufferedReader(new InputStreamReader(bis,
					charset));

			String line;

			while ((line = br.readLine()) != null) {
				int j = 0;

				System.out.println(line);
				// System.out.print(line.substring(1-1,3));
				String yy_tail = line.substring(4 - 1, 5);
				String mm = line.substring(6 - 1, 7);
				// System.out.print(line.substring(8-1,8));
				String dd = line.substring(9 - 1, 10);
				// System.out.print(line.substring(11-1,12));
				// System.out.print(line.substring(13-1,13));
				// System.out.print(line.substring(14-1,14));
				String yy_head = line.substring(15 - 1, 16);
				String dst_base = line.substring(17 - 1, 20).replace(" ", "");

				for (int i = 21 - 1; i < 116; i = i + 4) {
					String dst_offset = line.substring(i, i + 4).replace(" ",
							"");
					data[j++] = Integer.parseInt(dst_base) * 100.
							+ Integer.parseInt(dst_offset);
				}
				// System.out.print(line.substring(117-1,120));
				System.out.println("");
			}
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
