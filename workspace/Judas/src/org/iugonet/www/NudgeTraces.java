package org.iugonet.www;

import java.awt.BorderLayout;
<<<<<<< HEAD

import java.awt.FlowLayout;
=======
import java.awt.FlowLayout;

>>>>>>> 9f897e0... This is initial commit.
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
<<<<<<< HEAD
import javax.swing.JLabel;
=======
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
>>>>>>> 9f897e0... This is initial commit.
import java.awt.Font;

public class NudgeTraces extends JDialog {

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
			NudgeTraces dialog = new NudgeTraces();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public NudgeTraces() {
		super();
		undoableEditSupport = new UndoableEditSupport(this);

		setModal(true);
		setAlwaysOnTop(true);
		setTitle("Nudge Traces");
<<<<<<< HEAD
		Icons icons = new Icons();
		setIconImage(icons.getImage("icons/favicon.ico"));
=======
		setIconImage(Toolkit.getDefaultToolkit().getImage(
				NudgeTraces.class.getResource("/favicon.ico")));
>>>>>>> 9f897e0... This is initial commit.
		setBounds(100, 100, 400, 109);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setLayout(new FlowLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		{
			JLabel lblNewLabel = new JLabel(
					"Nudge Traces: There are No Active Panels");
			lblNewLabel.setFont(new Font("Dialog", Font.BOLD, 12));
<<<<<<< HEAD
			lblNewLabel.setIcon(icons.getImageIcon("icons/info20.png"));
			
=======
			lblNewLabel.setIcon(new ImageIcon(NudgeTraces.class
					.getResource("/info20.png")));
>>>>>>> 9f897e0... This is initial commit.
			contentPanel.add(lblNewLabel);
		}
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
		 * Close by usig ESC-Key
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
<<<<<<< HEAD
	
=======

>>>>>>> 9f897e0... This is initial commit.
}
