package org.iugonet.www;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.AbstractAction;
import javax.swing.InputMap;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComponent;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.KeyStroke;
import javax.swing.border.EmptyBorder;
import javax.swing.undo.AbstractUndoableEdit;
import javax.swing.undo.UndoableEdit;
import javax.swing.undo.UndoableEditSupport;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import javax.swing.JComboBox;
import java.awt.Insets;
import javax.swing.JTextField;

public class PanelOptions extends JDialog {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	protected UndoableEditSupport undoableEditSupport;
	private JCheckBox chckbxSetAllPanels;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			PanelOptions dialog = new PanelOptions();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public PanelOptions() {
		super();
		undoableEditSupport = new UndoableEditSupport(this);

		setModal(true);
		setAlwaysOnTop(true);
		setTitle("Panel Options");

		Icons icons = new Icons();
		setIconImage(icons.getImage("icons/favicon.ico"));

		setBounds(100, 100, 600, 650);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		GridBagLayout gbl_contentPanel = new GridBagLayout();
		gbl_contentPanel.columnWidths = new int[] { 0, 0, 0, 0, 0, 0 };
		gbl_contentPanel.rowHeights = new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
				0, 0, 0, 0 };
		gbl_contentPanel.columnWeights = new double[] { 0.0, 1.0, 1.0, 0.0,
				0.0, Double.MIN_VALUE };
		gbl_contentPanel.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0,
				0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
		contentPanel.setLayout(gbl_contentPanel);
		{
			JLabel lblPanels = new JLabel("Panel:");
			GridBagConstraints gbc_lblPanels = new GridBagConstraints();
			gbc_lblPanels.insets = new Insets(0, 0, 5, 5);
			gbc_lblPanels.anchor = GridBagConstraints.EAST;
			gbc_lblPanels.gridx = 0;
			gbc_lblPanels.gridy = 0;
			contentPanel.add(lblPanels, gbc_lblPanels);
		}
		{
			JComboBox comboBox = new JComboBox();
			GridBagConstraints gbc_comboBox = new GridBagConstraints();
			gbc_comboBox.insets = new Insets(0, 0, 5, 5);
			gbc_comboBox.fill = GridBagConstraints.HORIZONTAL;
			gbc_comboBox.gridx = 1;
			gbc_comboBox.gridy = 0;
			contentPanel.add(comboBox, gbc_comboBox);
		}
		{
			JLabel lblTitle = new JLabel("Title:");
			GridBagConstraints gbc_lblTitle = new GridBagConstraints();
			gbc_lblTitle.anchor = GridBagConstraints.EAST;
			gbc_lblTitle.insets = new Insets(0, 0, 5, 5);
			gbc_lblTitle.gridx = 0;
			gbc_lblTitle.gridy = 1;
			contentPanel.add(lblTitle, gbc_lblTitle);
		}
		{
			textField = new JTextField();
			GridBagConstraints gbc_textField = new GridBagConstraints();
			gbc_textField.insets = new Insets(0, 0, 5, 5);
			gbc_textField.fill = GridBagConstraints.HORIZONTAL;
			gbc_textField.gridx = 1;
			gbc_textField.gridy = 1;
			contentPanel.add(textField, gbc_textField);
			textField.setColumns(10);
		}
		{
			JLabel lblMargin = new JLabel("Margin:");
			GridBagConstraints gbc_lblMargin = new GridBagConstraints();
			gbc_lblMargin.insets = new Insets(0, 0, 5, 5);
			gbc_lblMargin.gridx = 2;
			gbc_lblMargin.gridy = 1;
			contentPanel.add(lblMargin, gbc_lblMargin);
		}
		{
			textField_1 = new JTextField();
			textField_1.setText("5");
			GridBagConstraints gbc_textField_1 = new GridBagConstraints();
			gbc_textField_1.insets = new Insets(0, 0, 5, 5);
			gbc_textField_1.fill = GridBagConstraints.HORIZONTAL;
			gbc_textField_1.gridx = 3;
			gbc_textField_1.gridy = 1;
			contentPanel.add(textField_1, gbc_textField_1);
			textField_1.setColumns(10);
		}
		{
			JComboBox comboBox = new JComboBox();
			GridBagConstraints gbc_comboBox = new GridBagConstraints();
			gbc_comboBox.insets = new Insets(0, 0, 5, 5);
			gbc_comboBox.fill = GridBagConstraints.HORIZONTAL;
			gbc_comboBox.gridx = 1;
			gbc_comboBox.gridy = 2;
			contentPanel.add(comboBox, gbc_comboBox);
		}
		{
			textField_2 = new JTextField();
			GridBagConstraints gbc_textField_2 = new GridBagConstraints();
			gbc_textField_2.insets = new Insets(0, 0, 5, 5);
			gbc_textField_2.fill = GridBagConstraints.HORIZONTAL;
			gbc_textField_2.gridx = 2;
			gbc_textField_2.gridy = 2;
			contentPanel.add(textField_2, gbc_textField_2);
			textField_2.setColumns(10);
		}
		{
			JButton button = new JButton("");
			button.setIcon(icons.getImageIcon("icons/info20.png"));

			GridBagConstraints gbc_button = new GridBagConstraints();
			gbc_button.insets = new Insets(0, 0, 5, 0);
			gbc_button.gridx = 4;
			gbc_button.gridy = 2;
			contentPanel.add(button, gbc_button);
		}
		{
			JLabel lblPlacement = new JLabel("Placement:");
			GridBagConstraints gbc_lblPlacement = new GridBagConstraints();
			gbc_lblPlacement.insets = new Insets(0, 0, 5, 5);
			gbc_lblPlacement.gridx = 0;
			gbc_lblPlacement.gridy = 3;
			contentPanel.add(lblPlacement, gbc_lblPlacement);
		}
		{
			JLabel lblColor = new JLabel("Color:");
			GridBagConstraints gbc_lblColor = new GridBagConstraints();
			gbc_lblColor.insets = new Insets(0, 0, 5, 5);
			gbc_lblColor.gridx = 0;
			gbc_lblColor.gridy = 5;
			contentPanel.add(lblColor, gbc_lblColor);
		}
		{
			JLabel lblBackgroundColor = new JLabel("Background Color:");
			GridBagConstraints gbc_lblBackgroundColor = new GridBagConstraints();
			gbc_lblBackgroundColor.insets = new Insets(0, 0, 5, 5);
			gbc_lblBackgroundColor.gridx = 0;
			gbc_lblBackgroundColor.gridy = 6;
			contentPanel.add(lblBackgroundColor, gbc_lblBackgroundColor);
		}
		{
			JLabel lblPanelFrameColor = new JLabel("Panel Frame Color:");
			GridBagConstraints gbc_lblPanelFrameColor = new GridBagConstraints();
			gbc_lblPanelFrameColor.insets = new Insets(0, 0, 5, 5);
			gbc_lblPanelFrameColor.gridx = 0;
			gbc_lblPanelFrameColor.gridy = 7;
			contentPanel.add(lblPanelFrameColor, gbc_lblPanelFrameColor);
		}
		{
			JLabel label = new JLabel("");
			GridBagConstraints gbc_label = new GridBagConstraints();
			gbc_label.insets = new Insets(0, 0, 5, 5);
			gbc_label.gridx = 2;
			gbc_label.gridy = 11;
			contentPanel.add(label, gbc_label);
		}
		{
			chckbxSetAllPanels = new JCheckBox("Set All Panels");
			chckbxSetAllPanels.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					// Create a new undo action
					// Save our current state in a final boolean so it is
					// accessible in the inner class below
					final boolean curState = chckbxSetAllPanels.isSelected();
					UndoableEdit undoableEdit = new AbstractUndoableEdit() {

						/**
							 * 
							 */
						private static final long serialVersionUID = 1L;

						// Method that is called when we must redo the undone
						// action
						public void redo()
								throws javax.swing.undo.CannotRedoException {
							super.redo();

							// Set the checkbox to its pre-undone state
							chckbxSetAllPanels.setSelected(curState);

							// Update our menu items
							Judas.getMntmUndo().setEnabled(
									Judas.getUndoManager().canUndo());
							Judas.getMntmRedo().setEnabled(
									Judas.getUndoManager().canRedo());
						}

						public void undo()
								throws javax.swing.undo.CannotUndoException {
							super.undo();

							// Set the checkbox to its previous state
							chckbxSetAllPanels.setSelected(!curState);

							// Update our menu items
							Judas.getMntmUndo().setEnabled(
									Judas.getUndoManager().canUndo());
							Judas.getMntmRedo().setEnabled(
									Judas.getUndoManager().canRedo());
						}
					};

					// Add this undoable edit to the undo manager
					Judas.getUndoManager().addEdit(undoableEdit);

					// Update the state of the menu items
					Judas.getMntmUndo().setEnabled(
							Judas.getUndoManager().canUndo());
					Judas.getMntmRedo().setEnabled(
							Judas.getUndoManager().canRedo());
				}
			});
			GridBagConstraints gbc_chckbxSetAllPanels = new GridBagConstraints();
			gbc_chckbxSetAllPanels.insets = new Insets(0, 0, 0, 5);
			gbc_chckbxSetAllPanels.gridx = 2;
			gbc_chckbxSetAllPanels.gridy = 12;
			contentPanel.add(chckbxSetAllPanels, gbc_chckbxSetAllPanels);
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
			{
				JButton btnApply = new JButton("Apply");
				btnApply.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						dispose();
					}
				});
				btnApply.setActionCommand("btnApply");
				btnApply.setName("btnApply");
				buttonPane.add(btnApply);
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
			{
				JButton btnSaveToTemplate = new JButton("Save to Template");
				btnSaveToTemplate.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						dispose();
					}
				});
				btnSaveToTemplate.setActionCommand("btnSaveToTemplate");
				btnSaveToTemplate.setName("btnSaveToTemplate");
				buttonPane.add(btnSaveToTemplate);
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
