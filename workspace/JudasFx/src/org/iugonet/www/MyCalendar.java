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

import org.jdesktop.swingx.JXMonthView;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.util.Calendar;

import javax.swing.JComboBox;
import javax.swing.JLabel;

public class MyCalendar extends JDialog {

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
			MyCalendar dialog = new MyCalendar();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public MyCalendar() {
		super();
		undoableEditSupport = new UndoableEditSupport(this);

		setModal(true);
		setAlwaysOnTop(true);
		setTitle("Calendar");
		
		Icons icons = new Icons();
		setIconImage(icons.getImage("icons/favicon.ico"));

		setBounds(100, 100, 750, 800);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setLayout(new FlowLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);

		Calendar calendar = Calendar.getInstance();
		{
			String[] yyyy;
			@SuppressWarnings("deprecation")
			int num_yyyy = 1900 + calendar.getTime().getYear() - 1800 + 1;
			yyyy = new String[num_yyyy];
			for (int i = 0; i < num_yyyy; i++) {
				yyyy[i] = String.valueOf(1800 + i);
			}
			{
				JLabel lblYear = new JLabel("Year:");
				contentPanel.add(lblYear);
			}
			JComboBox comboBox = new JComboBox(yyyy);
			comboBox.setSelectedIndex(200);
			contentPanel.add(comboBox);
		}

		JXMonthView monthView = new JXMonthView();
		contentPanel.add(monthView);
		monthView.setPreferredRowCount(4);
		monthView.setPreferredColumnCount(3);
		/*
		 * Date startDate = new Date(1); Date endDate = new Date(2);
		 * monthView.setSelectionInterval(startDate, endDate);
		 */
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
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
			{
				JButton btnCancel = new JButton("Cancel");
				btnCancel.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						dispose();
					}
				});
				btnCancel.setActionCommand("btnCancel");
				btnCancel.setName("btnCancel");
				buttonPane.add(btnCancel);
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
