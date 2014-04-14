package org.iugonet.www;

import java.net.URL;

import javax.swing.undo.UndoableEditSupport;

public class DataFolder {

	private String dataFolder;

	protected UndoableEditSupport undoableEditSupport;

	public String getDataFolder() {
		return dataFolder;
	}

	public void setDataFolder(String dataFolder) {
		this.dataFolder = dataFolder;
	}

	DataFolder() {
		super();
		undoableEditSupport = new UndoableEditSupport(this);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public void getData(String resourceID) {

	}

	public void getData(URL url) {

	}

}
