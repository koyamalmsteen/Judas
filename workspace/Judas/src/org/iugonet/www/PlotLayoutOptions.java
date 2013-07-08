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
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;

public class PlotLayoutOptions extends JDialog {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	protected UndoableEditSupport undoableEditSupport;
	private JCheckBox chckbxShowDataComponents;
	private JCheckBox chckbxAutomaticPanels;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			PlotLayoutOptions dialog = new PlotLayoutOptions();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public PlotLayoutOptions() {
		super();
		undoableEditSupport = new UndoableEditSupport(this);

		setModal(true);
		setAlwaysOnTop(true);
		setTitle("Plot Layout Options");
		
		Icons icons = new Icons();
		setIconImage(icons.getImage("icons/favicon.ico"));

		setBounds(100, 100, 1000, 650);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		GridBagLayout gbl_contentPanel = new GridBagLayout();
		gbl_contentPanel.columnWidths = new int[] { 150, 150, 241, 0, 0, 0,
				100, 0, 0 };
		gbl_contentPanel.rowHeights = new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
				0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		gbl_contentPanel.columnWeights = new double[] { 0.0, 0.0, 0.0, 0.0,
				0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
		gbl_contentPanel.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0,
				0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
				0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
		contentPanel.setLayout(gbl_contentPanel);
		{
			chckbxShowDataComponents = new JCheckBox("Show Data Components");
			chckbxShowDataComponents.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					// Create a new undo action
					// Save our current state in a final boolean so it is
					// accessible in the inner class below
					final boolean curState = chckbxShowDataComponents
							.isSelected();
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
							chckbxShowDataComponents.setSelected(curState);

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
							chckbxShowDataComponents.setSelected(!curState);

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
			GridBagConstraints gbc_chckbxShowDataComponents = new GridBagConstraints();
			gbc_chckbxShowDataComponents.anchor = GridBagConstraints.WEST;
			gbc_chckbxShowDataComponents.insets = new Insets(0, 0, 5, 5);
			gbc_chckbxShowDataComponents.gridx = 0;
			gbc_chckbxShowDataComponents.gridy = 0;
			contentPanel.add(chckbxShowDataComponents,
					gbc_chckbxShowDataComponents);
		}
		{
			chckbxAutomaticPanels = new JCheckBox("Automatic Panels");
			chckbxAutomaticPanels.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					// Create a new undo action
					// Save our current state in a final boolean so it is
					// accessible in the inner class below
					final boolean curState = chckbxAutomaticPanels.isSelected();
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
							chckbxAutomaticPanels.setSelected(curState);

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
							chckbxAutomaticPanels.setSelected(!curState);

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
			chckbxAutomaticPanels.setSelected(true);
			GridBagConstraints gbc_chckbxAutomaticPanels = new GridBagConstraints();
			gbc_chckbxAutomaticPanels.anchor = GridBagConstraints.WEST;
			gbc_chckbxAutomaticPanels.insets = new Insets(0, 0, 5, 5);
			gbc_chckbxAutomaticPanels.gridx = 1;
			gbc_chckbxAutomaticPanels.gridy = 0;
			contentPanel.add(chckbxAutomaticPanels, gbc_chckbxAutomaticPanels);
		}
		{
			JLabel lblPanels = new JLabel("Panels");
			GridBagConstraints gbc_lblPanels = new GridBagConstraints();
			gbc_lblPanels.insets = new Insets(0, 0, 5, 5);
			gbc_lblPanels.gridx = 6;
			gbc_lblPanels.gridy = 0;
			contentPanel.add(lblPanels, gbc_lblPanels);
		}
		{
			JLabel lblAdd = new JLabel("Add:");
			GridBagConstraints gbc_lblAdd = new GridBagConstraints();
			gbc_lblAdd.insets = new Insets(0, 0, 5, 5);
			gbc_lblAdd.gridx = 2;
			gbc_lblAdd.gridy = 1;
			contentPanel.add(lblAdd, gbc_lblAdd);
		}
		{
			JLabel lblCreatePlots = new JLabel("- CREATE PLOTS -");
			GridBagConstraints gbc_lblCreatePlots = new GridBagConstraints();
			gbc_lblCreatePlots.insets = new Insets(0, 0, 5, 5);
			gbc_lblCreatePlots.gridx = 4;
			gbc_lblCreatePlots.gridy = 0;
			contentPanel.add(lblCreatePlots, gbc_lblCreatePlots);
		}
		{
			JButton btnAdd = new JButton("Add");
			GridBagConstraints gbc_btnAdd = new GridBagConstraints();
			gbc_btnAdd.fill = GridBagConstraints.HORIZONTAL;
			gbc_btnAdd.insets = new Insets(0, 0, 5, 5);
			gbc_btnAdd.gridx = 6;
			gbc_btnAdd.gridy = 1;
			contentPanel.add(btnAdd, gbc_btnAdd);
		}
		{
			JLabel lblDependentVariable = new JLabel("Dependent Variable:l");
			GridBagConstraints gbc_lblDependentVariable = new GridBagConstraints();
			gbc_lblDependentVariable.anchor = GridBagConstraints.WEST;
			gbc_lblDependentVariable.insets = new Insets(0, 0, 5, 5);
			gbc_lblDependentVariable.gridx = 0;
			gbc_lblDependentVariable.gridy = 2;
			contentPanel.add(lblDependentVariable, gbc_lblDependentVariable);
		}
		{
			JButton btnLine = new JButton("Line ->");
			GridBagConstraints gbc_btnLine = new GridBagConstraints();
			gbc_btnLine.insets = new Insets(0, 0, 5, 5);
			gbc_btnLine.gridx = 2;
			gbc_btnLine.gridy = 2;
			contentPanel.add(btnLine, gbc_btnLine);
		}
		{
			JButton btnRemove = new JButton("Remove");
			GridBagConstraints gbc_btnRemove = new GridBagConstraints();
			gbc_btnRemove.fill = GridBagConstraints.HORIZONTAL;
			gbc_btnRemove.insets = new Insets(0, 0, 5, 5);
			gbc_btnRemove.gridx = 6;
			gbc_btnRemove.gridy = 2;
			contentPanel.add(btnRemove, gbc_btnRemove);
		}
		{
			JButton btnSpec = new JButton("Spec ->");
			GridBagConstraints gbc_btnSpec = new GridBagConstraints();
			gbc_btnSpec.insets = new Insets(0, 0, 5, 5);
			gbc_btnSpec.gridx = 2;
			gbc_btnSpec.gridy = 3;
			contentPanel.add(btnSpec, gbc_btnSpec);
		}
		{
			JButton btnEdit = new JButton("Edit");
			GridBagConstraints gbc_btnEdit = new GridBagConstraints();
			gbc_btnEdit.fill = GridBagConstraints.HORIZONTAL;
			gbc_btnEdit.insets = new Insets(0, 0, 5, 5);
			gbc_btnEdit.gridx = 6;
			gbc_btnEdit.gridy = 3;
			contentPanel.add(btnEdit, gbc_btnEdit);
		}
		{
			JButton button = new JButton("");
			GridBagConstraints gbc_button = new GridBagConstraints();
			gbc_button.insets = new Insets(0, 0, 5, 5);
			gbc_button.gridx = 6;
			gbc_button.gridy = 4;
			contentPanel.add(button, gbc_button);
		}
		{
			JButton button = new JButton("");
			GridBagConstraints gbc_button = new GridBagConstraints();
			gbc_button.insets = new Insets(0, 0, 5, 5);
			gbc_button.gridx = 5;
			gbc_button.gridy = 5;
			contentPanel.add(button, gbc_button);
		}
		{
			JButton button = new JButton("");
			GridBagConstraints gbc_button = new GridBagConstraints();
			gbc_button.insets = new Insets(0, 0, 5, 5);
			gbc_button.gridx = 6;
			gbc_button.gridy = 6;
			contentPanel.add(button, gbc_button);
		}
		{
			JButton button = new JButton("");
			GridBagConstraints gbc_button = new GridBagConstraints();
			gbc_button.insets = new Insets(0, 0, 5, 0);
			gbc_button.gridx = 7;
			gbc_button.gridy = 5;
			contentPanel.add(button, gbc_button);
		}
		{
			JLabel lblRow = new JLabel("Row:");
			GridBagConstraints gbc_lblRow = new GridBagConstraints();
			gbc_lblRow.gridwidth = 3;
			gbc_lblRow.insets = new Insets(0, 0, 5, 5);
			gbc_lblRow.gridx = 5;
			gbc_lblRow.gridy = 7;
			contentPanel.add(lblRow, gbc_lblRow);
		}
		{
			textField = new JTextField();
			GridBagConstraints gbc_textField = new GridBagConstraints();
			gbc_textField.gridwidth = 2;
			gbc_textField.gridheight = 2;
			gbc_textField.insets = new Insets(0, 0, 5, 5);
			gbc_textField.fill = GridBagConstraints.HORIZONTAL;
			gbc_textField.gridx = 5;
			gbc_textField.gridy = 8;
			contentPanel.add(textField, gbc_textField);
			textField.setColumns(10);
		}
		{
			JButton button = new JButton("");
			button.setIcon(icons.getImageIcon("icons/arrow-3-up8.png"));
			GridBagConstraints gbc_button = new GridBagConstraints();
			gbc_button.anchor = GridBagConstraints.WEST;
			gbc_button.gridwidth = 2;
			gbc_button.insets = new Insets(0, 0, 5, 0);
			gbc_button.gridx = 7;
			gbc_button.gridy = 8;
			contentPanel.add(button, gbc_button);
		}
		{
			JButton button = new JButton("");
			
			button.setIcon(icons.getImageIcon("icons/arrow-3-down8.png"));
			GridBagConstraints gbc_button = new GridBagConstraints();
			gbc_button.anchor = GridBagConstraints.WEST;
			gbc_button.gridwidth = 2;
			gbc_button.insets = new Insets(0, 0, 5, 0);
			gbc_button.gridx = 7;
			gbc_button.gridy = 9;
			contentPanel.add(button, gbc_button);
		}
		{
			JLabel lblColumn = new JLabel("Column:");
			GridBagConstraints gbc_lblColumn = new GridBagConstraints();
			gbc_lblColumn.gridwidth = 3;
			gbc_lblColumn.insets = new Insets(0, 0, 5, 5);
			gbc_lblColumn.gridx = 5;
			gbc_lblColumn.gridy = 10;
			contentPanel.add(lblColumn, gbc_lblColumn);
		}
		{
			textField_1 = new JTextField();
			textField_1.setText("1");
			GridBagConstraints gbc_textField_1 = new GridBagConstraints();
			gbc_textField_1.gridwidth = 2;
			gbc_textField_1.gridheight = 2;
			gbc_textField_1.insets = new Insets(0, 0, 5, 5);
			gbc_textField_1.fill = GridBagConstraints.HORIZONTAL;
			gbc_textField_1.gridx = 5;
			gbc_textField_1.gridy = 11;
			contentPanel.add(textField_1, gbc_textField_1);
			textField_1.setColumns(10);
		}
		{
			JButton button = new JButton("");
			button.setIcon(icons.getImageIcon("icons/arrow-3-up8"));
			GridBagConstraints gbc_button = new GridBagConstraints();
			gbc_button.insets = new Insets(0, 0, 5, 0);
			gbc_button.gridx = 7;
			gbc_button.gridy = 11;
			contentPanel.add(button, gbc_button);
		}
		{
			JButton button = new JButton("");
			button.setIcon(icons.getImageIcon("icons/arrow-3-down8.png"));

			GridBagConstraints gbc_button = new GridBagConstraints();
			gbc_button.insets = new Insets(0, 0, 5, 0);
			gbc_button.gridx = 7;
			gbc_button.gridy = 12;
			contentPanel.add(button, gbc_button);
		}
		{
			JLabel lblRowsPerPage = new JLabel("Rows Per Page:");
			GridBagConstraints gbc_lblRowsPerPage = new GridBagConstraints();
			gbc_lblRowsPerPage.gridwidth = 3;
			gbc_lblRowsPerPage.insets = new Insets(0, 0, 5, 5);
			gbc_lblRowsPerPage.gridx = 5;
			gbc_lblRowsPerPage.gridy = 14;
			contentPanel.add(lblRowsPerPage, gbc_lblRowsPerPage);
		}
		{
			textField_2 = new JTextField();
			textField_2.setText("2");
			GridBagConstraints gbc_textField_2 = new GridBagConstraints();
			gbc_textField_2.gridwidth = 2;
			gbc_textField_2.gridheight = 2;
			gbc_textField_2.insets = new Insets(0, 0, 5, 5);
			gbc_textField_2.fill = GridBagConstraints.HORIZONTAL;
			gbc_textField_2.gridx = 5;
			gbc_textField_2.gridy = 15;
			contentPanel.add(textField_2, gbc_textField_2);
			textField_2.setColumns(10);
		}
		{
			JButton button = new JButton("");
			button.setIcon(icons.getImageIcon("icons/arrow-3-up8.png"));

			GridBagConstraints gbc_button = new GridBagConstraints();
			gbc_button.insets = new Insets(0, 0, 5, 0);
			gbc_button.gridx = 7;
			gbc_button.gridy = 15;
			contentPanel.add(button, gbc_button);
		}
		{
			JButton button = new JButton("");
			button.setIcon(icons.getImageIcon("icons/arrow-3-down8.png"));

			GridBagConstraints gbc_button = new GridBagConstraints();
			gbc_button.insets = new Insets(0, 0, 5, 0);
			gbc_button.gridx = 7;
			gbc_button.gridy = 16;
			contentPanel.add(button, gbc_button);
		}
		{
			textField_3 = new JTextField();
			GridBagConstraints gbc_textField_3 = new GridBagConstraints();
			gbc_textField_3.gridheight = 2;
			gbc_textField_3.gridwidth = 2;
			gbc_textField_3.insets = new Insets(0, 0, 5, 5);
			gbc_textField_3.fill = GridBagConstraints.HORIZONTAL;
			gbc_textField_3.gridx = 5;
			gbc_textField_3.gridy = 19;
			contentPanel.add(textField_3, gbc_textField_3);
			textField_3.setColumns(10);
		}
		{
			JLabel lblColsPerPage = new JLabel("Cols Per Page:");
			GridBagConstraints gbc_lblColsPerPage = new GridBagConstraints();
			gbc_lblColsPerPage.gridwidth = 3;
			gbc_lblColsPerPage.insets = new Insets(0, 0, 5, 5);
			gbc_lblColsPerPage.gridx = 5;
			gbc_lblColsPerPage.gridy = 18;
			contentPanel.add(lblColsPerPage, gbc_lblColsPerPage);
		}
		{
			JButton button = new JButton("");
			button.setIcon(icons.getImageIcon("icons/arrow-3-up8.png"));

			GridBagConstraints gbc_button = new GridBagConstraints();
			gbc_button.insets = new Insets(0, 0, 5, 0);
			gbc_button.gridx = 7;
			gbc_button.gridy = 19;
			contentPanel.add(button, gbc_button);
		}
		{
			JButton button = new JButton("");
			button.setIcon(icons.getImageIcon("icons/arrow-3-down8.png"));

			GridBagConstraints gbc_button = new GridBagConstraints();
			gbc_button.insets = new Insets(0, 0, 5, 0);
			gbc_button.gridx = 7;
			gbc_button.gridy = 20;
			contentPanel.add(button, gbc_button);
		}
		{
			JButton btnLockToPanel = new JButton("Lock To Panel");
			GridBagConstraints gbc_btnLockToPanel = new GridBagConstraints();
			gbc_btnLockToPanel.gridwidth = 3;
			gbc_btnLockToPanel.insets = new Insets(0, 0, 5, 5);
			gbc_btnLockToPanel.gridx = 5;
			gbc_btnLockToPanel.gridy = 22;
			contentPanel.add(btnLockToPanel, gbc_btnLockToPanel);
		}
		{
			JButton btnUnlockPanels = new JButton("Unlock Panels");
			GridBagConstraints gbc_btnUnlockPanels = new GridBagConstraints();
			gbc_btnUnlockPanels.gridwidth = 3;
			gbc_btnUnlockPanels.insets = new Insets(0, 0, 0, 5);
			gbc_btnUnlockPanels.gridx = 5;
			gbc_btnUnlockPanels.gridy = 23;
			contentPanel.add(btnUnlockPanels, gbc_btnUnlockPanels);
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.CENTER));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton btnOk = new JButton("OK");
				btnOk.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						/*
						 * if (plotPane.length != 1) { PlotPane[] dummy = new
						 * PlotPane[plotPane.length + 1];
						 * System.arraycopy(plotPane, 0, dummy, 0,
						 * plotPane.length); plotPane = null; PlotPane[]
						 * plotPane = new PlotPane[dummy.length];
						 * System.arraycopy(dummy, 0, plotPane, 0,
						 * dummy.length); dummy = null; plotPane[plotPane.length
						 * - 1] .plot(
						 * "http://wdc-data.iugonet.org/data/hour/index/dst/1984/dst8410"
						 * ); } else { plotPane[0] .plot(
						 * "http://wdc-data.iugonet.org/data/hour/index/dst/1984/dst8410"
						 * ); }
						 */
						// getRootPane().repaint();
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
				{
					JButton btnApply = new JButton("Apply");
					btnApply.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent arg0) {
							System.out.println("Apply");
						}
					});
					btnApply.setActionCommand("btnApply");
					btnApply.setName("btnApply");
					buttonPane.add(btnApply);
				}
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
