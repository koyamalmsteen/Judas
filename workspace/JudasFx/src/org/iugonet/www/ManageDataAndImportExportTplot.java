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

import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;

import javax.swing.JTree;
import javax.swing.JList;

public class ManageDataAndImportExportTplot extends JDialog {

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
			ManageDataAndImportExportTplot dialog = new ManageDataAndImportExportTplot();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public ManageDataAndImportExportTplot() {
		super();
		undoableEditSupport = new UndoableEditSupport(this);

		setModal(true);
		setAlwaysOnTop(true);
		setTitle("Manage Data And Import/Export Tplot");

		Icons icons = new Icons();
		setIconImage(icons.getImage("icons/favicon.ico"));

		setBounds(100, 100, 650, 500);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		GridBagLayout gbl_contentPanel = new GridBagLayout();
		gbl_contentPanel.columnWidths = new int[] { 0, 0, 0, 0 };
		gbl_contentPanel.rowHeights = new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
				0, 0, 0, 0 };
		gbl_contentPanel.columnWeights = new double[] { 1.0, 1.0, 1.0,
				Double.MIN_VALUE };
		gbl_contentPanel.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0,
				0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
		contentPanel.setLayout(gbl_contentPanel);
		{
			JLabel lblTplotData = new JLabel("TPLOT Data:");
			GridBagConstraints gbc_lblTplotData = new GridBagConstraints();
			gbc_lblTplotData.insets = new Insets(0, 0, 5, 5);
			gbc_lblTplotData.gridx = 0;
			gbc_lblTplotData.gridy = 0;
			contentPanel.add(lblTplotData, gbc_lblTplotData);
		}
		{
			JLabel lblGuiData = new JLabel("GUI Data:");
			GridBagConstraints gbc_lblGuiData = new GridBagConstraints();
			gbc_lblGuiData.insets = new Insets(0, 0, 5, 0);
			gbc_lblGuiData.gridx = 2;
			gbc_lblGuiData.gridy = 0;
			contentPanel.add(lblGuiData, gbc_lblGuiData);
		}
		{
			JList list = new JList();
			GridBagConstraints gbc_list = new GridBagConstraints();
			gbc_list.gridheight = 12;
			gbc_list.insets = new Insets(0, 0, 5, 5);
			gbc_list.fill = GridBagConstraints.BOTH;
			gbc_list.gridx = 0;
			gbc_list.gridy = 1;
			contentPanel.add(list, gbc_list);
		}
		{
			JButton btnRightArrow = new JButton("");
			btnRightArrow.setIcon(icons
					.getImageIcon("icons/arrow-1-right20.png"));
			GridBagConstraints gbc_btnRightArrow = new GridBagConstraints();
			gbc_btnRightArrow.insets = new Insets(0, 0, 5, 5);
			gbc_btnRightArrow.gridx = 1;
			gbc_btnRightArrow.gridy = 5;
			contentPanel.add(btnRightArrow, gbc_btnRightArrow);
		}
		{
			JTree tree = new JTree();
			GridBagConstraints gbc_tree = new GridBagConstraints();
			gbc_tree.gridheight = 12;
			gbc_tree.fill = GridBagConstraints.BOTH;
			gbc_tree.gridx = 2;
			gbc_tree.gridy = 1;
			contentPanel.add(tree, gbc_tree);
		}
		{
			JButton button = new JButton("");
			button.setIcon(icons.getImageIcon("icons/arrow-1-left20.png"));

			GridBagConstraints gbc_button = new GridBagConstraints();
			gbc_button.insets = new Insets(0, 0, 5, 5);
			gbc_button.gridx = 1;
			gbc_button.gridy = 6;
			contentPanel.add(button, gbc_button);
		}
		{
			JButton btnTrash = new JButton("");
			btnTrash.setIcon(icons.getImageIcon("icons/trash-empty20.png"));
			
			GridBagConstraints gbc_btnTrash = new GridBagConstraints();
			gbc_btnTrash.insets = new Insets(0, 0, 5, 5);
			gbc_btnTrash.gridx = 1;
			gbc_btnTrash.gridy = 7;
			contentPanel.add(btnTrash, gbc_btnTrash);
		}
		{
			JButton btnZoom = new JButton("");
			btnZoom.setIcon(icons.getImageIcon("icons/zoom-in20.png"));

			GridBagConstraints gbc_btnZoom = new GridBagConstraints();
			gbc_btnZoom.insets = new Insets(0, 0, 0, 5);
			gbc_btnZoom.gridx = 1;
			gbc_btnZoom.gridy = 8;
			contentPanel.add(btnZoom, gbc_btnZoom);
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
