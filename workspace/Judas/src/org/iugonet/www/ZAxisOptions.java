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

import java.awt.GridBagLayout;
import javax.swing.JTabbedPane;
import java.awt.GridBagConstraints;
import javax.swing.JLabel;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

import javax.swing.AbstractAction;
import javax.swing.InputMap;
import javax.swing.JCheckBox;
import javax.swing.JComponent;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.KeyStroke;
import java.awt.event.ActionListener;

public class ZAxisOptions extends JDialog {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	protected UndoableEditSupport undoableEditSupport;
	private JCheckBox chckbxFi;
	private JCheckBox chckbxHo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			ZAxisOptions dialog = new ZAxisOptions();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public ZAxisOptions() {
		super();
		undoableEditSupport = new UndoableEditSupport(this);

		setModal(true);
		setAlwaysOnTop(true);
		setTitle("Z Axis Options");
		Icons icons = new Icons();
		setIconImage(icons.getImage("icons/favicon.ico"));
		setBounds(100, 100, 500, 670);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		{
			JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
			// contentPanel.add(tabbedPane);
			{
				JPanel panel = new JPanel();
				tabbedPane.addTab("Settings", null, panel, null);
				GridBagLayout gbl_panel = new GridBagLayout();
				gbl_panel.columnWidths = new int[] { 0, 0, 0, 0, 0 };
				gbl_panel.rowHeights = new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0,
						0, 0, 0, 0, 0, 0, 0, 0 };
				gbl_panel.columnWeights = new double[] { 0.0, 0.0, 0.0, 0.0,
						Double.MIN_VALUE };
				gbl_panel.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0,
						0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
						Double.MIN_VALUE };
				panel.setLayout(gbl_panel);
				{
					JLabel lblPanels = new JLabel("Panels:");
					GridBagConstraints gbc_lblPanels = new GridBagConstraints();
					gbc_lblPanels.anchor = GridBagConstraints.WEST;
					gbc_lblPanels.insets = new Insets(0, 0, 5, 5);
					gbc_lblPanels.gridx = 0;
					gbc_lblPanels.gridy = 0;
					panel.add(lblPanels, gbc_lblPanels);
				}
				{
					JLabel lblColorTable = new JLabel("Color Table:");
					GridBagConstraints gbc_lblColorTable = new GridBagConstraints();
					gbc_lblColorTable.insets = new Insets(0, 0, 5, 5);
					gbc_lblColorTable.anchor = GridBagConstraints.WEST;
					gbc_lblColorTable.gridx = 0;
					gbc_lblColorTable.gridy = 1;
					panel.add(lblColorTable, gbc_lblColorTable);
				}
				{
					JLabel lblScaling = new JLabel("Scaling:");
					GridBagConstraints gbc_lblScaling = new GridBagConstraints();
					gbc_lblScaling.anchor = GridBagConstraints.WEST;
					gbc_lblScaling.insets = new Insets(0, 0, 5, 5);
					gbc_lblScaling.gridx = 2;
					gbc_lblScaling.gridy = 1;
					panel.add(lblScaling, gbc_lblScaling);
				}
				{
					JLabel lblSample = new JLabel("Sample:");
					GridBagConstraints gbc_lblSample = new GridBagConstraints();
					gbc_lblSample.insets = new Insets(0, 0, 5, 0);
					gbc_lblSample.gridx = 3;
					gbc_lblSample.gridy = 1;
					panel.add(lblSample, gbc_lblSample);
				}
				{
					JRadioButton rdbtnRainbow = new JRadioButton("Rainbow");
					GridBagConstraints gbc_rdbtnRainbow = new GridBagConstraints();
					gbc_rdbtnRainbow.insets = new Insets(0, 0, 5, 5);
					gbc_rdbtnRainbow.gridx = 0;
					gbc_rdbtnRainbow.gridy = 2;
					panel.add(rdbtnRainbow, gbc_rdbtnRainbow);
				}
				{
					JRadioButton rdbtnLinear = new JRadioButton("Linear");
					GridBagConstraints gbc_rdbtnLinear = new GridBagConstraints();
					gbc_rdbtnLinear.anchor = GridBagConstraints.WEST;
					gbc_rdbtnLinear.insets = new Insets(0, 0, 5, 5);
					gbc_rdbtnLinear.gridx = 2;
					gbc_rdbtnLinear.gridy = 2;
					panel.add(rdbtnLinear, gbc_rdbtnLinear);
				}
				{
					JRadioButton rdbtnCool = new JRadioButton("Cool");
					GridBagConstraints gbc_rdbtnCool = new GridBagConstraints();
					gbc_rdbtnCool.insets = new Insets(0, 0, 5, 5);
					gbc_rdbtnCool.gridx = 0;
					gbc_rdbtnCool.gridy = 3;
					panel.add(rdbtnCool, gbc_rdbtnCool);
				}
				{
					JRadioButton rdbtnLog = new JRadioButton("Log");
					GridBagConstraints gbc_rdbtnLog = new GridBagConstraints();
					gbc_rdbtnLog.anchor = GridBagConstraints.WEST;
					gbc_rdbtnLog.insets = new Insets(0, 0, 5, 5);
					gbc_rdbtnLog.gridx = 2;
					gbc_rdbtnLog.gridy = 3;
					panel.add(rdbtnLog, gbc_rdbtnLog);
				}
				{
					JRadioButton rdbtnHot = new JRadioButton("Hot");
					GridBagConstraints gbc_rdbtnHot = new GridBagConstraints();
					gbc_rdbtnHot.insets = new Insets(0, 0, 5, 5);
					gbc_rdbtnHot.gridx = 0;
					gbc_rdbtnHot.gridy = 4;
					panel.add(rdbtnHot, gbc_rdbtnHot);
				}
				{
					JRadioButton rdbtnM = new JRadioButton("M");
					GridBagConstraints gbc_rdbtnM = new GridBagConstraints();
					gbc_rdbtnM.anchor = GridBagConstraints.WEST;
					gbc_rdbtnM.insets = new Insets(0, 0, 5, 5);
					gbc_rdbtnM.gridx = 2;
					gbc_rdbtnM.gridy = 4;
					panel.add(rdbtnM, gbc_rdbtnM);
				}
				{
					JRadioButton rdbtnCopper = new JRadioButton("Copper");
					GridBagConstraints gbc_rdbtnCopper = new GridBagConstraints();
					gbc_rdbtnCopper.insets = new Insets(0, 0, 5, 5);
					gbc_rdbtnCopper.gridx = 0;
					gbc_rdbtnCopper.gridy = 5;
					panel.add(rdbtnCopper, gbc_rdbtnCopper);
				}
				{
					JLabel lblPlacement = new JLabel("Placement:");
					GridBagConstraints gbc_lblPlacement = new GridBagConstraints();
					gbc_lblPlacement.anchor = GridBagConstraints.WEST;
					gbc_lblPlacement.insets = new Insets(0, 0, 5, 5);
					gbc_lblPlacement.gridx = 2;
					gbc_lblPlacement.gridy = 5;
					panel.add(lblPlacement, gbc_lblPlacement);
				}
				{
					JRadioButton rdbtnE = new JRadioButton("E");
					GridBagConstraints gbc_rdbtnE = new GridBagConstraints();
					gbc_rdbtnE.insets = new Insets(0, 0, 5, 5);
					gbc_rdbtnE.gridx = 0;
					gbc_rdbtnE.gridy = 6;
					panel.add(rdbtnE, gbc_rdbtnE);
				}
				{
					JRadioButton rdbtnTop = new JRadioButton("Top");
					GridBagConstraints gbc_rdbtnTop = new GridBagConstraints();
					gbc_rdbtnTop.anchor = GridBagConstraints.WEST;
					gbc_rdbtnTop.insets = new Insets(0, 0, 5, 5);
					gbc_rdbtnTop.gridx = 2;
					gbc_rdbtnTop.gridy = 6;
					panel.add(rdbtnTop, gbc_rdbtnTop);
				}
				{
					JRadioButton rdbtnD = new JRadioButton("D");
					GridBagConstraints gbc_rdbtnD = new GridBagConstraints();
					gbc_rdbtnD.insets = new Insets(0, 0, 5, 5);
					gbc_rdbtnD.gridx = 0;
					gbc_rdbtnD.gridy = 7;
					panel.add(rdbtnD, gbc_rdbtnD);
				}
				{
					JRadioButton rdbtnBottom = new JRadioButton("Bottom");
					GridBagConstraints gbc_rdbtnBottom = new GridBagConstraints();
					gbc_rdbtnBottom.anchor = GridBagConstraints.WEST;
					gbc_rdbtnBottom.insets = new Insets(0, 0, 5, 5);
					gbc_rdbtnBottom.gridx = 2;
					gbc_rdbtnBottom.gridy = 7;
					panel.add(rdbtnBottom, gbc_rdbtnBottom);
				}
				{
					JRadioButton rdbtnT = new JRadioButton("T");
					GridBagConstraints gbc_rdbtnT = new GridBagConstraints();
					gbc_rdbtnT.insets = new Insets(0, 0, 5, 5);
					gbc_rdbtnT.gridx = 0;
					gbc_rdbtnT.gridy = 8;
					panel.add(rdbtnT, gbc_rdbtnT);
				}
				{
					JRadioButton rdbtnLeft = new JRadioButton("Left");
					GridBagConstraints gbc_rdbtnLeft = new GridBagConstraints();
					gbc_rdbtnLeft.anchor = GridBagConstraints.WEST;
					gbc_rdbtnLeft.insets = new Insets(0, 0, 5, 5);
					gbc_rdbtnLeft.gridx = 2;
					gbc_rdbtnLeft.gridy = 8;
					panel.add(rdbtnLeft, gbc_rdbtnLeft);
				}
				{
					JRadioButton rdbtnRight = new JRadioButton("Right");
					GridBagConstraints gbc_rdbtnRight = new GridBagConstraints();
					gbc_rdbtnRight.anchor = GridBagConstraints.WEST;
					gbc_rdbtnRight.insets = new Insets(0, 0, 5, 5);
					gbc_rdbtnRight.gridx = 2;
					gbc_rdbtnRight.gridy = 9;
					panel.add(rdbtnRight, gbc_rdbtnRight);
				}
				{
					JLabel lblRange = new JLabel("Range:");
					GridBagConstraints gbc_lblRange = new GridBagConstraints();
					gbc_lblRange.insets = new Insets(0, 0, 5, 5);
					gbc_lblRange.gridx = 0;
					gbc_lblRange.gridy = 10;
					panel.add(lblRange, gbc_lblRange);
				}
				{
					JRadioButton rdbtnDoNotShow = new JRadioButton(
							"Do not Show Color Bar");
					GridBagConstraints gbc_rdbtnDoNotShow = new GridBagConstraints();
					gbc_rdbtnDoNotShow.insets = new Insets(0, 0, 5, 5);
					gbc_rdbtnDoNotShow.gridx = 2;
					gbc_rdbtnDoNotShow.gridy = 10;
					panel.add(rdbtnDoNotShow, gbc_rdbtnDoNotShow);
				}
				{
					chckbxFi = new JCheckBox("Fi");
					chckbxFi.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent arg0) {

							// Create a new undo action
							// Save our current state in a final boolean so it
							// is accessible in the inner class below
							final boolean curState = chckbxFi.isSelected();
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
									chckbxFi.setSelected(curState);

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
									chckbxFi.setSelected(!curState);

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
					GridBagConstraints gbc_chckbxFi = new GridBagConstraints();
					gbc_chckbxFi.insets = new Insets(0, 0, 5, 5);
					gbc_chckbxFi.gridx = 0;
					gbc_chckbxFi.gridy = 11;
					panel.add(chckbxFi, gbc_chckbxFi);
				}
				{
					JLabel lblHh = new JLabel("hh");
					GridBagConstraints gbc_lblHh = new GridBagConstraints();
					gbc_lblHh.anchor = GridBagConstraints.EAST;
					gbc_lblHh.insets = new Insets(0, 0, 5, 5);
					gbc_lblHh.gridx = 0;
					gbc_lblHh.gridy = 12;
					panel.add(lblHh, gbc_lblHh);
				}
				{
					textField_1 = new JTextField();
					GridBagConstraints gbc_textField = new GridBagConstraints();
					gbc_textField.insets = new Insets(0, 0, 5, 5);
					gbc_textField.fill = GridBagConstraints.HORIZONTAL;
					gbc_textField.gridx = 1;
					gbc_textField.gridy = 12;
					panel.add(textField_1, gbc_textField);
					textField_1.setColumns(10);
				}
				{
					chckbxHo = new JCheckBox("ho");
					chckbxHo.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent arg0) {

							// Create a new undo action
							// Save our current state in a final boolean so it
							// is accessible in the inner class below
							final boolean curState = chckbxHo.isSelected();
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
									chckbxHo.setSelected(curState);

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
									chckbxHo.setSelected(!curState);

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
					GridBagConstraints gbc_chckbxHo = new GridBagConstraints();
					gbc_chckbxHo.anchor = GridBagConstraints.WEST;
					gbc_chckbxHo.insets = new Insets(0, 0, 5, 5);
					gbc_chckbxHo.gridx = 2;
					gbc_chckbxHo.gridy = 12;
					panel.add(chckbxHo, gbc_chckbxHo);
				}
				{
					JLabel lblHh_1 = new JLabel("hh");
					GridBagConstraints gbc_lblHh_1 = new GridBagConstraints();
					gbc_lblHh_1.anchor = GridBagConstraints.EAST;
					gbc_lblHh_1.insets = new Insets(0, 0, 5, 5);
					gbc_lblHh_1.gridx = 0;
					gbc_lblHh_1.gridy = 13;
					panel.add(lblHh_1, gbc_lblHh_1);
				}
				{
					textField_2 = new JTextField();
					GridBagConstraints gbc_textField_1 = new GridBagConstraints();
					gbc_textField_1.insets = new Insets(0, 0, 5, 5);
					gbc_textField_1.fill = GridBagConstraints.HORIZONTAL;
					gbc_textField_1.gridx = 1;
					gbc_textField_1.gridy = 13;
					panel.add(textField_2, gbc_textField_1);
					textField_2.setColumns(10);
				}
				{
					JLabel lblMajorTicks = new JLabel("Major Ticks:");
					GridBagConstraints gbc_lblMajorTicks = new GridBagConstraints();
					gbc_lblMajorTicks.insets = new Insets(0, 0, 5, 5);
					gbc_lblMajorTicks.anchor = GridBagConstraints.WEST;
					gbc_lblMajorTicks.gridx = 2;
					gbc_lblMajorTicks.gridy = 13;
					panel.add(lblMajorTicks, gbc_lblMajorTicks);
				}
				{
					JLabel lblMinotTicks = new JLabel("Minot Ticks:");
					GridBagConstraints gbc_lblMinotTicks = new GridBagConstraints();
					gbc_lblMinotTicks.insets = new Insets(0, 0, 5, 5);
					gbc_lblMinotTicks.anchor = GridBagConstraints.WEST;
					gbc_lblMinotTicks.gridx = 2;
					gbc_lblMinotTicks.gridy = 14;
					panel.add(lblMinotTicks, gbc_lblMinotTicks);
				}
				{
					JLabel lblMargin = new JLabel("Margin:");
					GridBagConstraints gbc_lblMargin = new GridBagConstraints();
					gbc_lblMargin.insets = new Insets(0, 0, 0, 5);
					gbc_lblMargin.anchor = GridBagConstraints.WEST;
					gbc_lblMargin.gridx = 2;
					gbc_lblMargin.gridy = 15;
					panel.add(lblMargin, gbc_lblMargin);
				}
			}
			{
				JPanel panel = new JPanel();
				tabbedPane.addTab("Text", null, panel, null);
				GridBagLayout gbl_panel = new GridBagLayout();
				gbl_panel.columnWidths = new int[] { 0, 0, 0, 0, 0 };
				gbl_panel.rowHeights = new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0,
						0, 0, 0, 0, 0 };
				gbl_panel.columnWeights = new double[] { 0.0, 1.0, 0.0, 0.0,
						Double.MIN_VALUE };
				gbl_panel.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0,
						0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
						Double.MIN_VALUE };
				panel.setLayout(gbl_panel);
				{
					JLabel lblPanels_1 = new JLabel("Panels:");
					GridBagConstraints gbc_lblPanels_1 = new GridBagConstraints();
					gbc_lblPanels_1.anchor = GridBagConstraints.WEST;
					gbc_lblPanels_1.insets = new Insets(0, 0, 5, 5);
					gbc_lblPanels_1.gridx = 0;
					gbc_lblPanels_1.gridy = 0;
					panel.add(lblPanels_1, gbc_lblPanels_1);
				}
				{
					JComboBox comboBox = new JComboBox();
					GridBagConstraints gbc_comboBox = new GridBagConstraints();
					gbc_comboBox.insets = new Insets(0, 0, 5, 5);
					gbc_comboBox.fill = GridBagConstraints.HORIZONTAL;
					gbc_comboBox.gridx = 1;
					gbc_comboBox.gridy = 0;
					panel.add(comboBox, gbc_comboBox);
				}
				{
					JLabel lblLabels = new JLabel("Labels:");
					GridBagConstraints gbc_lblLabels = new GridBagConstraints();
					gbc_lblLabels.anchor = GridBagConstraints.WEST;
					gbc_lblLabels.insets = new Insets(0, 0, 5, 5);
					gbc_lblLabels.gridx = 0;
					gbc_lblLabels.gridy = 1;
					panel.add(lblLabels, gbc_lblLabels);
				}
				{
					JLabel lblT = new JLabel("T");
					GridBagConstraints gbc_lblT = new GridBagConstraints();
					gbc_lblT.anchor = GridBagConstraints.EAST;
					gbc_lblT.insets = new Insets(0, 0, 5, 5);
					gbc_lblT.gridx = 0;
					gbc_lblT.gridy = 2;
					panel.add(lblT, gbc_lblT);
				}
				{
					textField_3 = new JTextField();
					GridBagConstraints gbc_textField_2 = new GridBagConstraints();
					gbc_textField_2.insets = new Insets(0, 0, 5, 5);
					gbc_textField_2.fill = GridBagConstraints.HORIZONTAL;
					gbc_textField_2.gridx = 1;
					gbc_textField_2.gridy = 2;
					panel.add(textField_3, gbc_textField_2);
					textField_3.setColumns(10);
				}
				{
					JLabel lblFont = new JLabel("Font:");
					GridBagConstraints gbc_lblFont = new GridBagConstraints();
					gbc_lblFont.anchor = GridBagConstraints.EAST;
					gbc_lblFont.insets = new Insets(0, 0, 5, 5);
					gbc_lblFont.gridx = 0;
					gbc_lblFont.gridy = 3;
					panel.add(lblFont, gbc_lblFont);
				}
				{
					JComboBox comboBox = new JComboBox();
					GridBagConstraints gbc_comboBox = new GridBagConstraints();
					gbc_comboBox.insets = new Insets(0, 0, 5, 5);
					gbc_comboBox.fill = GridBagConstraints.HORIZONTAL;
					gbc_comboBox.gridx = 1;
					gbc_comboBox.gridy = 3;
					panel.add(comboBox, gbc_comboBox);
				}
				{
					JLabel lblFormat = new JLabel("Format:");
					GridBagConstraints gbc_lblFormat = new GridBagConstraints();
					gbc_lblFormat.anchor = GridBagConstraints.EAST;
					gbc_lblFormat.insets = new Insets(0, 0, 5, 5);
					gbc_lblFormat.gridx = 0;
					gbc_lblFormat.gridy = 4;
					panel.add(lblFormat, gbc_lblFormat);
				}
				{
					JComboBox comboBox = new JComboBox();
					GridBagConstraints gbc_comboBox = new GridBagConstraints();
					gbc_comboBox.insets = new Insets(0, 0, 5, 5);
					gbc_comboBox.fill = GridBagConstraints.HORIZONTAL;
					gbc_comboBox.gridx = 1;
					gbc_comboBox.gridy = 4;
					panel.add(comboBox, gbc_comboBox);
				}
				{
					JLabel lblOrientation = new JLabel("Orientation:");
					GridBagConstraints gbc_lblOrientation = new GridBagConstraints();
					gbc_lblOrientation.insets = new Insets(0, 0, 5, 5);
					gbc_lblOrientation.gridx = 0;
					gbc_lblOrientation.gridy = 5;
					panel.add(lblOrientation, gbc_lblOrientation);
				}
				{
					JRadioButton rdbtnHorizontal = new JRadioButton(
							"Horizontal");
					rdbtnHorizontal.setSelected(true);
					GridBagConstraints gbc_rdbtnHorizontal = new GridBagConstraints();
					gbc_rdbtnHorizontal.insets = new Insets(0, 0, 5, 5);
					gbc_rdbtnHorizontal.gridx = 1;
					gbc_rdbtnHorizontal.gridy = 5;
					panel.add(rdbtnHorizontal, gbc_rdbtnHorizontal);
				}
				{
					JRadioButton rdbtnVertical = new JRadioButton("Vertical");
					GridBagConstraints gbc_rdbtnVertical = new GridBagConstraints();
					gbc_rdbtnVertical.insets = new Insets(0, 0, 5, 0);
					gbc_rdbtnVertical.gridx = 2;
					gbc_rdbtnVertical.gridy = 5;
					panel.add(rdbtnVertical, gbc_rdbtnVertical);
				}
				{
					JLabel lblAnnotation = new JLabel("Annotation:");
					GridBagConstraints gbc_lblAnnotation = new GridBagConstraints();
					gbc_lblAnnotation.anchor = GridBagConstraints.WEST;
					gbc_lblAnnotation.insets = new Insets(0, 0, 5, 5);
					gbc_lblAnnotation.gridx = 0;
					gbc_lblAnnotation.gridy = 7;
					panel.add(lblAnnotation, gbc_lblAnnotation);
				}
				{
					JLabel lblFont_1 = new JLabel("Font:");
					GridBagConstraints gbc_lblFont_1 = new GridBagConstraints();
					gbc_lblFont_1.anchor = GridBagConstraints.WEST;
					gbc_lblFont_1.insets = new Insets(0, 0, 5, 5);
					gbc_lblFont_1.gridx = 0;
					gbc_lblFont_1.gridy = 8;
					panel.add(lblFont_1, gbc_lblFont_1);
				}
				{
					JLabel lblFormat_1 = new JLabel("Format:");
					GridBagConstraints gbc_lblFormat_1 = new GridBagConstraints();
					gbc_lblFormat_1.anchor = GridBagConstraints.WEST;
					gbc_lblFormat_1.insets = new Insets(0, 0, 5, 5);
					gbc_lblFormat_1.gridx = 0;
					gbc_lblFormat_1.gridy = 9;
					panel.add(lblFormat_1, gbc_lblFormat_1);
				}
				{
					JLabel lblAnnotationF = new JLabel("Annotation F");
					GridBagConstraints gbc_lblAnnotationF = new GridBagConstraints();
					gbc_lblAnnotationF.insets = new Insets(0, 0, 5, 5);
					gbc_lblAnnotationF.gridx = 0;
					gbc_lblAnnotationF.gridy = 10;
					panel.add(lblAnnotationF, gbc_lblAnnotationF);
				}
				{
					JRadioButton rdbtnA = new JRadioButton("a");
					GridBagConstraints gbc_rdbtnA = new GridBagConstraints();
					gbc_rdbtnA.insets = new Insets(0, 0, 5, 5);
					gbc_rdbtnA.gridx = 1;
					gbc_rdbtnA.gridy = 10;
					panel.add(rdbtnA, gbc_rdbtnA);
				}
				{
					JRadioButton rdbtnB = new JRadioButton("b");
					GridBagConstraints gbc_rdbtnB = new GridBagConstraints();
					gbc_rdbtnB.insets = new Insets(0, 0, 5, 5);
					gbc_rdbtnB.gridx = 2;
					gbc_rdbtnB.gridy = 10;
					panel.add(rdbtnB, gbc_rdbtnB);
				}
				{
					JRadioButton rdbtnC = new JRadioButton("c");
					GridBagConstraints gbc_rdbtnC = new GridBagConstraints();
					gbc_rdbtnC.insets = new Insets(0, 0, 0, 5);
					gbc_rdbtnC.gridx = 3;
					gbc_rdbtnC.gridy = 10;
					panel.add(rdbtnC, gbc_rdbtnC);
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
