package org.iugonet.www;

import java.awt.BorderLayout;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.undo.AbstractUndoableEdit;
import javax.swing.undo.UndoableEdit;
import javax.swing.undo.UndoableEditSupport;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import javax.swing.AbstractAction;
import javax.swing.InputMap;
import javax.swing.JCheckBox;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JTree;
import javax.swing.JTextField;
import javax.swing.KeyStroke;

import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import javax.swing.JComboBox;
import java.awt.Insets;

public class VariableOptions extends JDialog {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;

	protected UndoableEditSupport undoableEditSupport;
	private JCheckBox chckbxShowVariable;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			VariableOptions dialog = new VariableOptions();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public VariableOptions() {
		super();
		undoableEditSupport = new UndoableEditSupport(this);

		setModal(true);
		setAlwaysOnTop(true);
		setTitle("Variable Options");
		
		Icons icons = new Icons();
		setIconImage(icons.getImage("icons/favicon.ico"));
		
		setBounds(100, 100, 600, 550);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		GridBagLayout gbl_contentPanel = new GridBagLayout();
		gbl_contentPanel.columnWidths = new int[] { 0, 0, 0, 0, 0, 0 };
		gbl_contentPanel.rowHeights = new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
				0, 0, 0, 0, 0 };
		gbl_contentPanel.columnWeights = new double[] { 1.0, 1.0, 0.0, 0.0,
				1.0, Double.MIN_VALUE };
		gbl_contentPanel.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0,
				0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
		contentPanel.setLayout(gbl_contentPanel);
		{
			JLabel lblPanels = new JLabel("Panels:");
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
			JLabel lblVariables = new JLabel("Variables:");
			GridBagConstraints gbc_lblVariables = new GridBagConstraints();
			gbc_lblVariables.anchor = GridBagConstraints.WEST;
			gbc_lblVariables.insets = new Insets(0, 0, 5, 5);
			gbc_lblVariables.gridx = 0;
			gbc_lblVariables.gridy = 1;
			contentPanel.add(lblVariables, gbc_lblVariables);
		}
		{
			JLabel lblAttributes = new JLabel("Attributes:");
			GridBagConstraints gbc_lblAttributes = new GridBagConstraints();
			gbc_lblAttributes.anchor = GridBagConstraints.WEST;
			gbc_lblAttributes.insets = new Insets(0, 0, 5, 5);
			gbc_lblAttributes.gridx = 3;
			gbc_lblAttributes.gridy = 1;
			contentPanel.add(lblAttributes, gbc_lblAttributes);
		}
		{
			JTree tree = new JTree();
			GridBagConstraints gbc_tree = new GridBagConstraints();
			gbc_tree.gridheight = 9;
			gbc_tree.gridwidth = 2;
			gbc_tree.insets = new Insets(0, 0, 5, 5);
			gbc_tree.fill = GridBagConstraints.BOTH;
			gbc_tree.gridx = 0;
			gbc_tree.gridy = 2;
			contentPanel.add(tree, gbc_tree);
		}
		{
			JButton btnAdd = new JButton("");
			btnAdd.setIcon(icons.getImageIcon("icons/add20.png"));

			GridBagConstraints gbc_btnAdd = new GridBagConstraints();
			gbc_btnAdd.insets = new Insets(0, 0, 5, 5);
			gbc_btnAdd.gridx = 2;
			gbc_btnAdd.gridy = 5;
			contentPanel.add(btnAdd, gbc_btnAdd);
		}
		{
			JButton button = new JButton("");
			button.setIcon(icons.getImageIcon("icons/minus20.png"));

			GridBagConstraints gbc_button = new GridBagConstraints();
			gbc_button.insets = new Insets(0, 0, 5, 5);
			gbc_button.gridx = 2;
			gbc_button.gridy = 6;
			contentPanel.add(button, gbc_button);
		}
		{
			JLabel lblField = new JLabel("Field:");
			GridBagConstraints gbc_lblField = new GridBagConstraints();
			gbc_lblField.anchor = GridBagConstraints.EAST;
			gbc_lblField.insets = new Insets(0, 0, 5, 5);
			gbc_lblField.gridx = 3;
			gbc_lblField.gridy = 2;
			contentPanel.add(lblField, gbc_lblField);
		}
		{
			textField_1 = new JTextField();
			GridBagConstraints gbc_textField_1 = new GridBagConstraints();
			gbc_textField_1.insets = new Insets(0, 0, 5, 0);
			gbc_textField_1.fill = GridBagConstraints.HORIZONTAL;
			gbc_textField_1.gridx = 4;
			gbc_textField_1.gridy = 2;
			contentPanel.add(textField_1, gbc_textField_1);
			textField_1.setColumns(10);
		}
		{
			JLabel lblControl = new JLabel("Control:");
			GridBagConstraints gbc_lblControl = new GridBagConstraints();
			gbc_lblControl.insets = new Insets(0, 0, 5, 5);
			gbc_lblControl.anchor = GridBagConstraints.EAST;
			gbc_lblControl.gridx = 3;
			gbc_lblControl.gridy = 3;
			contentPanel.add(lblControl, gbc_lblControl);
		}
		{
			textField_2 = new JTextField();
			GridBagConstraints gbc_textField_2 = new GridBagConstraints();
			gbc_textField_2.insets = new Insets(0, 0, 5, 0);
			gbc_textField_2.fill = GridBagConstraints.HORIZONTAL;
			gbc_textField_2.gridx = 4;
			gbc_textField_2.gridy = 3;
			contentPanel.add(textField_2, gbc_textField_2);
			textField_2.setColumns(10);
		}
		{
			JLabel lblText = new JLabel("Text:");
			GridBagConstraints gbc_lblText = new GridBagConstraints();
			gbc_lblText.insets = new Insets(0, 0, 5, 5);
			gbc_lblText.anchor = GridBagConstraints.EAST;
			gbc_lblText.gridx = 3;
			gbc_lblText.gridy = 4;
			contentPanel.add(lblText, gbc_lblText);
		}
		{
			textField_3 = new JTextField();
			GridBagConstraints gbc_textField_3 = new GridBagConstraints();
			gbc_textField_3.insets = new Insets(0, 0, 5, 0);
			gbc_textField_3.fill = GridBagConstraints.HORIZONTAL;
			gbc_textField_3.gridx = 4;
			gbc_textField_3.gridy = 4;
			contentPanel.add(textField_3, gbc_textField_3);
			textField_3.setColumns(10);
		}
		{
			JLabel lblFormat = new JLabel("Format:");
			GridBagConstraints gbc_lblFormat = new GridBagConstraints();
			gbc_lblFormat.insets = new Insets(0, 0, 5, 5);
			gbc_lblFormat.anchor = GridBagConstraints.EAST;
			gbc_lblFormat.gridx = 3;
			gbc_lblFormat.gridy = 5;
			contentPanel.add(lblFormat, gbc_lblFormat);
		}
		{
			JComboBox comboBox = new JComboBox();
			GridBagConstraints gbc_comboBox = new GridBagConstraints();
			gbc_comboBox.insets = new Insets(0, 0, 5, 0);
			gbc_comboBox.fill = GridBagConstraints.HORIZONTAL;
			gbc_comboBox.gridx = 4;
			gbc_comboBox.gridy = 5;
			contentPanel.add(comboBox, gbc_comboBox);
		}
		{
			JLabel lblColor = new JLabel("Color:");
			GridBagConstraints gbc_lblColor = new GridBagConstraints();
			gbc_lblColor.insets = new Insets(0, 0, 5, 5);
			gbc_lblColor.anchor = GridBagConstraints.WEST;
			gbc_lblColor.gridx = 3;
			gbc_lblColor.gridy = 7;
			contentPanel.add(lblColor, gbc_lblColor);
		}
		{
			JLabel lblFont = new JLabel("Font:");
			GridBagConstraints gbc_lblFont = new GridBagConstraints();
			gbc_lblFont.anchor = GridBagConstraints.EAST;
			gbc_lblFont.insets = new Insets(0, 0, 5, 5);
			gbc_lblFont.gridx = 3;
			gbc_lblFont.gridy = 8;
			contentPanel.add(lblFont, gbc_lblFont);
		}
		{
			JComboBox comboBox = new JComboBox();
			GridBagConstraints gbc_comboBox = new GridBagConstraints();
			gbc_comboBox.insets = new Insets(0, 0, 5, 0);
			gbc_comboBox.fill = GridBagConstraints.HORIZONTAL;
			gbc_comboBox.gridx = 4;
			gbc_comboBox.gridy = 8;
			contentPanel.add(comboBox, gbc_comboBox);
		}
		{
			JLabel lblStyle = new JLabel("Style:");
			GridBagConstraints gbc_lblStyle = new GridBagConstraints();
			gbc_lblStyle.insets = new Insets(0, 0, 5, 5);
			gbc_lblStyle.anchor = GridBagConstraints.EAST;
			gbc_lblStyle.gridx = 3;
			gbc_lblStyle.gridy = 9;
			contentPanel.add(lblStyle, gbc_lblStyle);
		}
		{
			JComboBox comboBox = new JComboBox();
			GridBagConstraints gbc_comboBox = new GridBagConstraints();
			gbc_comboBox.insets = new Insets(0, 0, 5, 0);
			gbc_comboBox.fill = GridBagConstraints.HORIZONTAL;
			gbc_comboBox.gridx = 4;
			gbc_comboBox.gridy = 9;
			contentPanel.add(comboBox, gbc_comboBox);
		}
		{
			JLabel lblFontSize = new JLabel("Font Size:");
			GridBagConstraints gbc_lblFontSize = new GridBagConstraints();
			gbc_lblFontSize.anchor = GridBagConstraints.EAST;
			gbc_lblFontSize.insets = new Insets(0, 0, 5, 5);
			gbc_lblFontSize.gridx = 3;
			gbc_lblFontSize.gridy = 10;
			contentPanel.add(lblFontSize, gbc_lblFontSize);
		}
		{
			textField_4 = new JTextField();
			GridBagConstraints gbc_textField_4 = new GridBagConstraints();
			gbc_textField_4.insets = new Insets(0, 0, 5, 0);
			gbc_textField_4.fill = GridBagConstraints.HORIZONTAL;
			gbc_textField_4.gridx = 4;
			gbc_textField_4.gridy = 10;
			contentPanel.add(textField_4, gbc_textField_4);
			textField_4.setColumns(10);
		}
		{
			JButton button = new JButton("");
			button.setIcon(icons.getImageIcon("icons/info20.png"));

			GridBagConstraints gbc_button = new GridBagConstraints();
			gbc_button.insets = new Insets(0, 0, 5, 5);
			gbc_button.gridx = 1;
			gbc_button.gridy = 11;
			contentPanel.add(button, gbc_button);
		}
		{
			chckbxShowVariable = new JCheckBox("Show Variable");
			chckbxShowVariable.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {

					// Create a new undo action
					// Save our current state in a final boolean so it is
					// accessible in the inner class below
					final boolean curState = chckbxShowVariable.isSelected();
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
							chckbxShowVariable.setSelected(curState);

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
							chckbxShowVariable.setSelected(!curState);

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
			GridBagConstraints gbc_chckbxShowVariable = new GridBagConstraints();
			gbc_chckbxShowVariable.insets = new Insets(0, 0, 5, 0);
			gbc_chckbxShowVariable.gridwidth = 2;
			gbc_chckbxShowVariable.gridx = 3;
			gbc_chckbxShowVariable.gridy = 11;
			contentPanel.add(chckbxShowVariable, gbc_chckbxShowVariable);
		}
		{
			JLabel lblLabelMargin = new JLabel("Label Margin");
			GridBagConstraints gbc_lblLabelMargin = new GridBagConstraints();
			gbc_lblLabelMargin.anchor = GridBagConstraints.EAST;
			gbc_lblLabelMargin.insets = new Insets(0, 0, 0, 5);
			gbc_lblLabelMargin.gridx = 3;
			gbc_lblLabelMargin.gridy = 13;
			contentPanel.add(lblLabelMargin, gbc_lblLabelMargin);
		}
		{
			textField_5 = new JTextField();
			GridBagConstraints gbc_textField_5 = new GridBagConstraints();
			gbc_textField_5.fill = GridBagConstraints.HORIZONTAL;
			gbc_textField_5.gridx = 4;
			gbc_textField_5.gridy = 13;
			contentPanel.add(textField_5, gbc_textField_5);
			textField_5.setColumns(10);
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
					public void actionPerformed(ActionEvent arg0) {
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
