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
import javax.swing.JTabbedPane;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.KeyStroke;

import java.awt.GridLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JComboBox;
import javax.swing.SwingConstants;

public class PageOptions extends JDialog {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;

	protected UndoableEditSupport undoableEditSupport;
	private JCheckBox chckbxShowTitle;
	private JCheckBox chckbxShowFooter;
	private JCheckBox chckbxM;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			PageOptions dialog = new PageOptions();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public PageOptions() {
		super();
		undoableEditSupport = new UndoableEditSupport(this);

		setModal(true);
		setAlwaysOnTop(true);
		setTitle("Page Options");

		Icons icons = new Icons();
		setIconImage(icons.getImage("icons/favicon.ico"));

		setBounds(100, 100, 600, 500);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setLayout(new FlowLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		{
			JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
			// contentPanel.add(tabbedPane);
			{
				JPanel panel = new JPanel();
				tabbedPane.addTab("Text", null, panel, null);
				panel.setLayout(new GridLayout(0, 1, 0, 0));
				{
					JPanel panel_1 = new JPanel();
					panel.add(panel_1);
					GridBagLayout gbl_panel_1 = new GridBagLayout();
					gbl_panel_1.columnWidths = new int[] { 0, 0, 0, 0, 0 };
					gbl_panel_1.rowHeights = new int[] { 0, 0, 0, 0, 0 };
					gbl_panel_1.columnWeights = new double[] { 0.0, 1.0, 1.0,
							0.0, Double.MIN_VALUE };
					gbl_panel_1.rowWeights = new double[] { 0.0, 0.0, 0.0, 1.0,
							Double.MIN_VALUE };
					panel_1.setLayout(gbl_panel_1);
					{
						JLabel lblPageTitle = new JLabel("Page Title:");
						GridBagConstraints gbc_lblPageTitle = new GridBagConstraints();
						gbc_lblPageTitle.anchor = GridBagConstraints.EAST;
						gbc_lblPageTitle.insets = new Insets(0, 0, 5, 5);
						gbc_lblPageTitle.gridx = 0;
						gbc_lblPageTitle.gridy = 0;
						panel_1.add(lblPageTitle, gbc_lblPageTitle);
					}
					{
						textField = new JTextField();
						GridBagConstraints gbc_textField = new GridBagConstraints();
						gbc_textField.gridwidth = 2;
						gbc_textField.insets = new Insets(0, 0, 5, 5);
						gbc_textField.fill = GridBagConstraints.HORIZONTAL;
						gbc_textField.gridx = 1;
						gbc_textField.gridy = 0;
						panel_1.add(textField, gbc_textField);
						textField.setColumns(10);
					}
					{
						chckbxShowTitle = new JCheckBox("Show Title");
						chckbxShowTitle.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent arg0) {
								// Create a new undo action
								// Save our current state in a final boolean so
								// it is accessible in the inner class below
								final boolean curState = chckbxShowTitle
										.isSelected();
								UndoableEdit undoableEdit = new AbstractUndoableEdit() {

									/**
									 * 
									 */
									private static final long serialVersionUID = 1L;

									// Method that is called when we must redo
									// the undone action
									public void redo()
											throws javax.swing.undo.CannotRedoException {
										super.redo();

										// Set the checkbox to its pre-undone
										// state
										chckbxShowTitle.setSelected(curState);

										// Update our menu items
										Judas.getMntmUndo().setEnabled(
												Judas.getUndoManager()
														.canUndo());
										Judas.getMntmRedo().setEnabled(
												Judas.getUndoManager()
														.canRedo());
									}

									public void undo()
											throws javax.swing.undo.CannotUndoException {
										super.undo();

										// Set the checkbox to its previous
										// state
										chckbxShowTitle.setSelected(!curState);

										// Update our menu items
										Judas.getMntmUndo().setEnabled(
												Judas.getUndoManager()
														.canUndo());
										Judas.getMntmRedo().setEnabled(
												Judas.getUndoManager()
														.canRedo());
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
						GridBagConstraints gbc_chckbxShowTitle = new GridBagConstraints();
						gbc_chckbxShowTitle.insets = new Insets(0, 0, 5, 0);
						gbc_chckbxShowTitle.gridx = 3;
						gbc_chckbxShowTitle.gridy = 0;
						panel_1.add(chckbxShowTitle, gbc_chckbxShowTitle);
					}
					{
						JButton btnToken_1 = new JButton("Token...");
						GridBagConstraints gbc_btnToken_1 = new GridBagConstraints();
						gbc_btnToken_1.insets = new Insets(0, 0, 5, 5);
						gbc_btnToken_1.gridx = 1;
						gbc_btnToken_1.gridy = 1;
						panel_1.add(btnToken_1, gbc_btnToken_1);
					}
					{
						JComboBox comboBox = new JComboBox();
						GridBagConstraints gbc_comboBox = new GridBagConstraints();
						gbc_comboBox.insets = new Insets(0, 0, 5, 5);
						gbc_comboBox.fill = GridBagConstraints.HORIZONTAL;
						gbc_comboBox.gridx = 2;
						gbc_comboBox.gridy = 1;
						panel_1.add(comboBox, gbc_comboBox);
					}
					{
						JLabel lblPageFooter = new JLabel("Page Footer:");
						GridBagConstraints gbc_lblPageFooter = new GridBagConstraints();
						gbc_lblPageFooter.anchor = GridBagConstraints.EAST;
						gbc_lblPageFooter.insets = new Insets(0, 0, 5, 5);
						gbc_lblPageFooter.gridx = 0;
						gbc_lblPageFooter.gridy = 2;
						panel_1.add(lblPageFooter, gbc_lblPageFooter);
					}
					{
						textField_1 = new JTextField();
						GridBagConstraints gbc_textField_1 = new GridBagConstraints();
						gbc_textField_1.gridwidth = 2;
						gbc_textField_1.insets = new Insets(0, 0, 5, 5);
						gbc_textField_1.fill = GridBagConstraints.HORIZONTAL;
						gbc_textField_1.gridx = 1;
						gbc_textField_1.gridy = 2;
						panel_1.add(textField_1, gbc_textField_1);
						textField_1.setColumns(10);
					}
					{
						chckbxShowFooter = new JCheckBox("Show Footer");
						chckbxShowFooter
								.addActionListener(new ActionListener() {
									public void actionPerformed(ActionEvent arg0) {
										// Create a new undo action
										// Save our current state in a final
										// boolean so it is accessible in the
										// inner class below
										final boolean curState = chckbxShowFooter
												.isSelected();
										UndoableEdit undoableEdit = new AbstractUndoableEdit() {

											/**
											 * 
											 */
											private static final long serialVersionUID = 1L;

											// Method that is called when we
											// must redo the undone action
											public void redo()
													throws javax.swing.undo.CannotRedoException {
												super.redo();

												// Set the checkbox to its
												// pre-undone state
												chckbxShowFooter
														.setSelected(curState);

												// Update our menu items
												Judas.getMntmUndo().setEnabled(
														Judas.getUndoManager()
																.canUndo());
												Judas.getMntmRedo().setEnabled(
														Judas.getUndoManager()
																.canRedo());
											}

											public void undo()
													throws javax.swing.undo.CannotUndoException {
												super.undo();

												// Set the checkbox to its
												// previous state
												chckbxShowFooter
														.setSelected(!curState);

												// Update our menu items
												Judas.getMntmUndo().setEnabled(
														Judas.getUndoManager()
																.canUndo());
												Judas.getMntmRedo().setEnabled(
														Judas.getUndoManager()
																.canRedo());
											}
										};

										// Add this undoable edit to the undo
										// manager
										Judas.getUndoManager().addEdit(
												undoableEdit);

										// Update the state of the menu items
										Judas.getMntmUndo().setEnabled(
												Judas.getUndoManager()
														.canUndo());
										Judas.getMntmRedo().setEnabled(
												Judas.getUndoManager()
														.canRedo());
									}
								});
						GridBagConstraints gbc_chckbxShowFooter = new GridBagConstraints();
						gbc_chckbxShowFooter.insets = new Insets(0, 0, 5, 0);
						gbc_chckbxShowFooter.gridx = 3;
						gbc_chckbxShowFooter.gridy = 2;
						panel_1.add(chckbxShowFooter, gbc_chckbxShowFooter);
					}
					{
						JButton btnToken = new JButton("Token...");
						GridBagConstraints gbc_btnToken = new GridBagConstraints();
						gbc_btnToken.insets = new Insets(0, 0, 0, 5);
						gbc_btnToken.gridx = 1;
						gbc_btnToken.gridy = 3;
						panel_1.add(btnToken, gbc_btnToken);
					}
					{
						JComboBox comboBox = new JComboBox();
						GridBagConstraints gbc_comboBox = new GridBagConstraints();
						gbc_comboBox.insets = new Insets(0, 0, 0, 5);
						gbc_comboBox.fill = GridBagConstraints.BOTH;
						gbc_comboBox.gridx = 2;
						gbc_comboBox.gridy = 3;
						panel_1.add(comboBox, gbc_comboBox);
					}
				}
				{
					JPanel panel_1 = new JPanel();
					panel.add(panel_1);
					GridBagLayout gbl_panel_1 = new GridBagLayout();
					gbl_panel_1.columnWidths = new int[] { 0, 336, 0, 0 };
					gbl_panel_1.rowHeights = new int[] { 0, 0, 0, 0, 0 };
					gbl_panel_1.columnWeights = new double[] { 0.0, 1.0, 0.0,
							Double.MIN_VALUE };
					gbl_panel_1.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0,
							Double.MIN_VALUE };
					panel_1.setLayout(gbl_panel_1);
					{
						JLabel lblFontStyles = new JLabel("Font Styles:");
						GridBagConstraints gbc_lblFontStyles = new GridBagConstraints();
						gbc_lblFontStyles.insets = new Insets(0, 0, 5, 5);
						gbc_lblFontStyles.gridx = 0;
						gbc_lblFontStyles.gridy = 0;
						panel_1.add(lblFontStyles, gbc_lblFontStyles);
					}
					{
						JLabel lblFontName = new JLabel("Font Name");
						GridBagConstraints gbc_lblFontName = new GridBagConstraints();
						gbc_lblFontName.insets = new Insets(0, 0, 5, 5);
						gbc_lblFontName.gridx = 1;
						gbc_lblFontName.gridy = 1;
						panel_1.add(lblFontName, gbc_lblFontName);
					}
					{
						JLabel lblSizepoints = new JLabel("Size (points)");
						GridBagConstraints gbc_lblSizepoints = new GridBagConstraints();
						gbc_lblSizepoints.insets = new Insets(0, 0, 5, 0);
						gbc_lblSizepoints.gridx = 2;
						gbc_lblSizepoints.gridy = 1;
						panel_1.add(lblSizepoints, gbc_lblSizepoints);
					}
					{
						JLabel lblTitle = new JLabel("Title:");
						GridBagConstraints gbc_lblTitle = new GridBagConstraints();
						gbc_lblTitle.anchor = GridBagConstraints.EAST;
						gbc_lblTitle.insets = new Insets(0, 0, 5, 5);
						gbc_lblTitle.gridx = 0;
						gbc_lblTitle.gridy = 2;
						panel_1.add(lblTitle, gbc_lblTitle);
					}
					{
						JComboBox comboBox = new JComboBox();
						GridBagConstraints gbc_comboBox = new GridBagConstraints();
						gbc_comboBox.insets = new Insets(0, 0, 5, 5);
						gbc_comboBox.fill = GridBagConstraints.HORIZONTAL;
						gbc_comboBox.gridx = 1;
						gbc_comboBox.gridy = 2;
						panel_1.add(comboBox, gbc_comboBox);
					}
					{
						JLabel lblFooter = new JLabel("Footer:");
						GridBagConstraints gbc_lblFooter = new GridBagConstraints();
						gbc_lblFooter.anchor = GridBagConstraints.EAST;
						gbc_lblFooter.insets = new Insets(0, 0, 0, 5);
						gbc_lblFooter.gridx = 0;
						gbc_lblFooter.gridy = 3;
						panel_1.add(lblFooter, gbc_lblFooter);
					}
					{
						JComboBox comboBox = new JComboBox();
						GridBagConstraints gbc_comboBox = new GridBagConstraints();
						gbc_comboBox.insets = new Insets(0, 0, 0, 5);
						gbc_comboBox.fill = GridBagConstraints.HORIZONTAL;
						gbc_comboBox.gridx = 1;
						gbc_comboBox.gridy = 3;
						panel_1.add(comboBox, gbc_comboBox);
					}
				}
			}
			{
				JPanel panel_1 = new JPanel();
				tabbedPane.addTab("Layout", null, panel_1, null);
				GridBagLayout gbl_panel_1 = new GridBagLayout();
				gbl_panel_1.columnWidths = new int[] { 0, 0, 0, 0, 0 };
				gbl_panel_1.rowHeights = new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0,
						0, 0, 0 };
				gbl_panel_1.columnWeights = new double[] { 0.0, 0.0, 0.0, 0.0,
						Double.MIN_VALUE };
				gbl_panel_1.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0,
						0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
				panel_1.setLayout(gbl_panel_1);
				{
					JLabel lblPanelArrangement = new JLabel(
							"Panel Arrangement:");
					GridBagConstraints gbc_lblPanelArrangement = new GridBagConstraints();
					gbc_lblPanelArrangement.insets = new Insets(0, 0, 5, 5);
					gbc_lblPanelArrangement.gridx = 0;
					gbc_lblPanelArrangement.gridy = 0;
					panel_1.add(lblPanelArrangement, gbc_lblPanelArrangement);
				}
				{
					JLabel lblHorizontalPanelSpacing = new JLabel(
							"Horizontal Panel Spacing (pts):");
					GridBagConstraints gbc_lblHorizontalPanelSpacing = new GridBagConstraints();
					gbc_lblHorizontalPanelSpacing.insets = new Insets(0, 0, 5,
							5);
					gbc_lblHorizontalPanelSpacing.gridx = 0;
					gbc_lblHorizontalPanelSpacing.gridy = 1;
					panel_1.add(lblHorizontalPanelSpacing,
							gbc_lblHorizontalPanelSpacing);
				}
				{
					JLabel lblVerticalPanelSpacing = new JLabel(
							"Vertical Panel Spacing (pts):");
					GridBagConstraints gbc_lblVerticalPanelSpacing = new GridBagConstraints();
					gbc_lblVerticalPanelSpacing.insets = new Insets(0, 0, 5, 5);
					gbc_lblVerticalPanelSpacing.gridx = 0;
					gbc_lblVerticalPanelSpacing.gridy = 2;
					panel_1.add(lblVerticalPanelSpacing,
							gbc_lblVerticalPanelSpacing);
				}
				{
					chckbxM = new JCheckBox("M");
					chckbxM.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent arg0) {
							// Create a new undo action
							// Save our current state in a final boolean so it
							// is accessible in the inner class below
							final boolean curState = chckbxM.isSelected();
							UndoableEdit undoableEdit = new AbstractUndoableEdit() {

								/**
								 * 
								 */
								private static final long serialVersionUID = 1L;

								// Method that is called when we must redo the
								// undone action
								public void redo()
										throws javax.swing.undo.CannotRedoException {
									super.redo();

									// Set the checkbox to its pre-undone state
									chckbxM.setSelected(curState);

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
									chckbxM.setSelected(!curState);

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
					GridBagConstraints gbc_chckbxM = new GridBagConstraints();
					gbc_chckbxM.insets = new Insets(0, 0, 5, 5);
					gbc_chckbxM.gridx = 0;
					gbc_chckbxM.gridy = 3;
					panel_1.add(chckbxM, gbc_chckbxM);
				}
				{
					JLabel lblMargins = new JLabel("Margins:");
					GridBagConstraints gbc_lblMargins = new GridBagConstraints();
					gbc_lblMargins.insets = new Insets(0, 0, 5, 5);
					gbc_lblMargins.gridx = 0;
					gbc_lblMargins.gridy = 5;
					panel_1.add(lblMargins, gbc_lblMargins);
				}
				{
					JLabel lblTop = new JLabel("Top:");
					GridBagConstraints gbc_lblTop = new GridBagConstraints();
					gbc_lblTop.anchor = GridBagConstraints.EAST;
					gbc_lblTop.insets = new Insets(0, 0, 5, 5);
					gbc_lblTop.gridx = 0;
					gbc_lblTop.gridy = 6;
					panel_1.add(lblTop, gbc_lblTop);
				}
				{
					textField_2 = new JTextField();
					textField_2.setText("1.25");
					textField_2.setHorizontalAlignment(SwingConstants.LEFT);
					GridBagConstraints gbc_textField_2 = new GridBagConstraints();
					gbc_textField_2.insets = new Insets(0, 0, 5, 5);
					gbc_textField_2.fill = GridBagConstraints.HORIZONTAL;
					gbc_textField_2.gridx = 1;
					gbc_textField_2.gridy = 6;
					panel_1.add(textField_2, gbc_textField_2);
					textField_2.setColumns(10);
				}
				{
					JLabel lblLeft = new JLabel("Left:");
					GridBagConstraints gbc_lblLeft = new GridBagConstraints();
					gbc_lblLeft.anchor = GridBagConstraints.EAST;
					gbc_lblLeft.insets = new Insets(0, 0, 5, 5);
					gbc_lblLeft.gridx = 0;
					gbc_lblLeft.gridy = 7;
					panel_1.add(lblLeft, gbc_lblLeft);
				}
				{
					textField_3 = new JTextField();
					textField_3.setText("1.65");
					GridBagConstraints gbc_textField_3 = new GridBagConstraints();
					gbc_textField_3.insets = new Insets(0, 0, 5, 5);
					gbc_textField_3.fill = GridBagConstraints.HORIZONTAL;
					gbc_textField_3.gridx = 1;
					gbc_textField_3.gridy = 7;
					panel_1.add(textField_3, gbc_textField_3);
					textField_3.setColumns(10);
				}
				{
					JLabel lblRight = new JLabel("Right:");
					GridBagConstraints gbc_lblRight = new GridBagConstraints();
					gbc_lblRight.anchor = GridBagConstraints.EAST;
					gbc_lblRight.insets = new Insets(0, 0, 5, 5);
					gbc_lblRight.gridx = 2;
					gbc_lblRight.gridy = 7;
					panel_1.add(lblRight, gbc_lblRight);
				}
				{
					textField_5 = new JTextField();
					textField_5.setText("1.25");
					GridBagConstraints gbc_textField_5 = new GridBagConstraints();
					gbc_textField_5.insets = new Insets(0, 0, 5, 0);
					gbc_textField_5.fill = GridBagConstraints.HORIZONTAL;
					gbc_textField_5.gridx = 3;
					gbc_textField_5.gridy = 7;
					panel_1.add(textField_5, gbc_textField_5);
					textField_5.setColumns(10);
				}
				{
					JLabel lblBottom = new JLabel("Bottom:");
					GridBagConstraints gbc_lblBottom = new GridBagConstraints();
					gbc_lblBottom.anchor = GridBagConstraints.EAST;
					gbc_lblBottom.insets = new Insets(0, 0, 5, 5);
					gbc_lblBottom.gridx = 0;
					gbc_lblBottom.gridy = 8;
					panel_1.add(lblBottom, gbc_lblBottom);
				}
				{
					textField_4 = new JTextField();
					textField_4.setText("1.25");
					GridBagConstraints gbc_textField_4 = new GridBagConstraints();
					gbc_textField_4.insets = new Insets(0, 0, 5, 5);
					gbc_textField_4.fill = GridBagConstraints.HORIZONTAL;
					gbc_textField_4.gridx = 1;
					gbc_textField_4.gridy = 8;
					panel_1.add(textField_4, gbc_textField_4);
					textField_4.setColumns(10);
				}
				{
					JLabel lblAllDimensionsIn = new JLabel(
							"All dimensions in inches");
					GridBagConstraints gbc_lblAllDimensionsIn = new GridBagConstraints();
					gbc_lblAllDimensionsIn.insets = new Insets(0, 0, 0, 5);
					gbc_lblAllDimensionsIn.gridx = 1;
					gbc_lblAllDimensionsIn.gridy = 10;
					panel_1.add(lblAllDimensionsIn, gbc_lblAllDimensionsIn);
				}
			}
			getContentPane().add(tabbedPane, BorderLayout.CENTER);
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
