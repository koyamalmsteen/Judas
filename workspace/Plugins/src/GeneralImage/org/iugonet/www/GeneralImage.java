package org.iugonet.www;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

import javax.media.jai.JAI;
import javax.media.jai.PlanarImage;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import com.sun.media.jai.widget.DisplayJAI;

public class GeneralImage extends Iplot{

	private BufferedReader bufferedReader;
	private String strUrl = "http://wdc.kugi.kyoto-u.ac.jp/film/image/rapid/aso/1953/r530823.tif";

	public GeneralImage() {
		super();
//		super(1);
		// timeSeries[0].setKey("Dst index");
	}

	@Override
	void readData(String arg0) {

		String line;

		try {
			URL url = new URL(arg0);
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

				}
				// System.out.print(line.substring(117-1,120));
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/*
	@Override
	void file_http_copy(String arg0, String arg1) {
		// TODO Auto-generated method stub

	}*/

	public void file_http_copy(String arg0) {
		try {
			URL url = new URL(arg0);

			String[] strArray = url.getPath().split("/");
			String strDir = "/tmp";
			for (int i = 0; i < strArray.length - 1; i++) {
				strDir = strDir + "/" + strArray[i];
			}

			File fileDir = new File(strDir);

			if (fileDir.exists()) {
				System.out.println(fileDir + "Directory exists.");
			} else {
				if (fileDir.mkdirs()) {
					System.out.println(fileDir.getPath()
							+ " Created directories to store data.");
				} else {
					System.out.println(fileDir.getPath()
							+ " Couldn't created directories to store data.");
				}
			}

			String charset = "UTF-8";

			URLConnection conn = url.openConnection();
			BufferedInputStream bis = new BufferedInputStream(
					conn.getInputStream());
			BufferedReader bufferedReader = new BufferedReader(
					new InputStreamReader(bis, charset));
			FileWriter fileWriter = new FileWriter("/tmp" + url.getPath());
			String line;

			while ((line = bufferedReader.readLine()) != null) {
				fileWriter.write(line + "\n");
			}

			fileWriter.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public JPanel getJPanel() {
		String imagePath = "/tmp/tux.gif";
		PlanarImage image = JAI.create("fileload", imagePath);
				
		DisplayJAI displayJAI = new DisplayJAI(image);
		
		JScrollPane newImagePane = new JScrollPane(displayJAI);
		
		JPanel jpanel = new JPanel();
		jpanel.add(newImagePane);
		
		return jpanel;
	}

	@Override
	void file_http_copy(String start, String end) {
		// TODO Auto-generated method stub
		
	}

}
