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
import javax.swing.JTabbedPane;

<<<<<<< HEAD
//import org.iugonet.www.Wind;
=======
import org.iugonet.www.Wind;
>>>>>>> 9f897e0... This is initial commit.

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
<<<<<<< HEAD
=======
import java.awt.Toolkit;
>>>>>>> 9f897e0... This is initial commit.

public class LoadData extends JDialog {

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
			LoadData dialog = new LoadData();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public LoadData() {
		super();
		undoableEditSupport = new UndoableEditSupport(this);

		setModal(true);
		setAlwaysOnTop(true);
		setTitle("Load Data");
<<<<<<< HEAD
		Icons icons = new Icons();
		setIconImage(icons.getImage("icons/favicon.ico"));
=======
		setIconImage(Toolkit.getDefaultToolkit().getImage(
				LoadData.class.getResource("/favicon.ico")));
>>>>>>> 9f897e0... This is initial commit.
		setBounds(100, 100, 1000, 700);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setLayout(new FlowLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		// getContentPane().add(contentPanel, BorderLayout.CENTER);
		{
			JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
			// contentPanel.add(tabbedPane);

<<<<<<< HEAD
			ThemisGui themis = new ThemisGui();
			ThemisDerivedSpectra themisDerivedSpectra = new ThemisDerivedSpectra();
			GoesGui goes = new GoesGui();
			// WindGui wind = new WindGui();
			AceGui ace = new AceGui();
=======
			Themis themis = new Themis();
			ThemisDerivedSpectra themisDerivedSpectra = new ThemisDerivedSpectra();
			Goes goes = new Goes();
			Wind wind = new Wind();
			Ace ace = new Ace();
>>>>>>> 9f897e0... This is initial commit.
			Iugonet iugonet = new Iugonet();

			tabbedPane.addTab(themis.getProjectName(), themis);
			tabbedPane.addTab(themisDerivedSpectra.getProjectName(),
					themisDerivedSpectra);
			tabbedPane.addTab(goes.getProjectName(), goes);
<<<<<<< HEAD
			// tabbedPane.addTab(wind.getProjectName(), wind);
=======
			tabbedPane.addTab(wind.getProjectName(), wind);
>>>>>>> 9f897e0... This is initial commit.
			tabbedPane.addTab(ace.getProjectName(), ace);
			tabbedPane.addTab(iugonet.getProjectName(), iugonet);

			getContentPane().add(tabbedPane, BorderLayout.CENTER);
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton btnOk = new JButton("OK");
				btnOk.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
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
					public void actionPerformed(ActionEvent arg0) {
						dispose();
					}
				});
				btnCancel.setActionCommand("btnOk");
				btnCancel.setName("btnOk");
				buttonPane.add(btnCancel);
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

}
