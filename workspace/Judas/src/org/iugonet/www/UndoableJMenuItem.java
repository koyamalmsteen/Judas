package org.iugonet.www;

import javax.swing.JMenuItem;
import javax.swing.event.UndoableEditListener;

public class UndoableJMenuItem extends JMenuItem {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public UndoableJMenuItem() {

	}

	public UndoableJMenuItem(String txt) {
		super(txt);
		System.out.println("UndoableJMenuItem");
	}

	public void addUndoableEditListener(UndoableEditListener l) {
	}

	public void removeUndoableEditListener(UndoableEditListener l) {
	}
	/*
	 * protected void fireActionPerformed(ActionEvent ev){
	 * super.fireActionPerformed(ev);
	 * 
	 * if( listener!=null ){ listener.undoableEditHappended(new
	 * UndoableEditEvent(this,new UndoableJMenuItemEdit(this))); } }
	 */
}
