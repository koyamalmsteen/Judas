package org.iugonet.www;

import java.io.File;
import java.io.IOException;
import java.net.URL;

import org.geotools.data.FeatureSource;
import org.geotools.data.FileDataStore;
import org.geotools.data.FileDataStoreFinder;
import org.geotools.data.simple.SimpleFeatureSource;
import org.geotools.map.DefaultMapContext;
import org.geotools.map.Layer;
import org.geotools.map.MapContent;
import org.geotools.map.MapContext;
import org.geotools.renderer.style.Style;
import org.geotools.swing.JMapFrame;
import org.geotools.swing.JMapPane;
import org.geotools.swing.data.JFileDataStoreChooser;

@SuppressWarnings("deprecation")
public class Cira86Ascii extends Mplot {
	
	Cira86Ascii(){
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public void read(String strUrl) {
		
	}
	
	public JMapPane getJMapPane(){

		File file = new File("/home/iugonet/Downloads/ne_50m_coastline.shp");
		
		FileDataStore store;
		FeatureSource featureSource;
		
        try {
			store = FileDataStoreFinder.getDataStore(file);
	        featureSource = store.getFeatureSource();
        } catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

        // Create a map content and add our shapefile to it
        MapContent map = new MapContent();
        map.setTitle("StyleLab");

        // Create a basic Style to render the features
        
//        Style style = createStyle(file, featureSource);

        // Add the features and the associated Style object to
        // the MapContent as a new Layer
 //       Layer layer = new FeatureLayer(featureSource, style);
 //       map.addLayer(layer);

        // Now display the map
//        JMapFrame.showMap(map);

		JMapPane jmapPane = new JMapPane();
		return jmapPane;
	}

	@Override
	void read(URL url) {
		// TODO Auto-generated method stub
		
	}
	
	
}
