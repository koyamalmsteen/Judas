package org.iugonet.www;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.AbstractAction;
import javax.swing.InputMap;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.KeyStroke;
import javax.swing.border.EmptyBorder;
import javax.swing.undo.UndoableEditSupport;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.GridLayout;

public class HelpRequestForm extends JDialog {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private final JPanel contentPanel = new JPanel();

	protected UndoableEditSupport undoableEditSupport;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			HelpRequestForm dialog = new HelpRequestForm();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public HelpRequestForm() {
		super();
		undoableEditSupport = new UndoableEditSupport(this);

		setModal(true);
		setAlwaysOnTop(true);
		setTitle("HelpRequestForm");
		
		Icons icons = new Icons();
		setIconImage(icons.getImage("icons/favicon.ico"));

		setBounds(100, 100, 500, 600);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		//
		String str = "";
		str = str + "THEMIS Science Help Request Form\n\n";
		str = str
				+ "thm_sci_help_request_xxxx (xxxx number will be sent back to you)\n\n";
		str = str + "Date Submitted: ________\n\n";
		str = str
				+ "Request Type: __ C-Comment, O-Observation, P-Problem, Q-Question)\n\n";
		str = str
				+ "Category: ___________ (Data, Document, Download, Gui, Instrument,\n\n";
		str = str
				+ "                       Plot, Software, Web Content, Other, Not Sure)\n\n";
		str = str
				+ "Title: ___________________________________________________\n\n";
		str = str + "Requestor Info:\n";
		str = str
				+ "Name: ________________________ Office Phone: _____________\n";
		str = str + "Email: ________________________\n\n";
		str = str + "Help Request Details (fill in as much as you can):\n\n";
		str = str + "If a Problem or Observation:\n";
		str = str + "Date Occurred: _________\n";
		str = str + "Operating System _______ (e.g., Linux, Unix, Windows)\n";
		str = str
				+ "CDF Version ____   Version of Software _____ Version of IDL____\n\n";
		str = str
				+ "Detail Description of Comment, Observation, Problem or Question:\n\n";
		str = str
				+ "(before starging a new GUI session, please also attach the GUI\n";
		str = str + "history file located here on your system:\n";
		str = str + "/home/geomag/thm_gui_running_history.txt\n";
		str = str + ")";
		str = str
				+ "________________________________________________________\n";
		str = str
				+ "________________________________________________________\n";
		str = str
				+ "________________________________________________________\n";
		str = str
				+ "________________________________________________________\n\n";
		str = str
				+ "Please email any support materials that would help in researching\n";
		str = str + "your request to:THEMIS_Science_Support@ssl.berkeley.edu\n";
		str = str + "with the Help Request Title above in the subject line.\n";
		contentPanel.setLayout(new GridLayout(0, 1, 0, 0));

		JTextArea txtrThemisScienceHelp = new JTextArea(str);
		//
		JScrollPane scrollPane = new JScrollPane(txtrThemisScienceHelp);
		scrollPane
				.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane
				.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		contentPanel.add(scrollPane);

		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.CENTER));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton btnOk = new JButton("OK");
				btnOk.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						dispose();
					}
				});
				btnOk.setActionCommand("btnOk");
				btnOk.setName("btnOk");
				buttonPane.add(btnOk);
				getRootPane().setDefaultButton(btnOk);
			}
		}		
		/*
		 * Close by using ESC-Key
		 */
		InputMap imap = getRootPane().getInputMap(
				JComponent.WHEN_IN_FOCUSED_WINDOW);
		imap.put(KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0), "escape");
		getRootPane().getActionMap().put("escape", new AbstractAction() {
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;

			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
	}
	

}
