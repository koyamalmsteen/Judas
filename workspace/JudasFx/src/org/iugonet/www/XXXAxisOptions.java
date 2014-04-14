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

import javax.swing.JTabbedPane;

import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import javax.swing.JComboBox;
import java.awt.Insets;
import java.awt.Font;

import javax.swing.AbstractAction;
import javax.swing.ButtonGroup;
import javax.swing.InputMap;
import javax.swing.JCheckBox;
import javax.swing.JComponent;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import javax.swing.KeyStroke;

public class XXXAxisOptions extends JDialog {

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
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField txtdate;
	private JTextField txttime;

	protected UndoableEditSupport undoableEditSupport;
	private JCheckBox chckbxBlablabla;
	private JCheckBox chckbxNewCheckBox;
	private JCheckBox chckbxNewCheckBox_1;
	private JCheckBox chckbxSetAllPanels;
	private JCheckBox chckbxBottom;
	private JCheckBox chckbxTop;
	private JCheckBox chckbxMajorGrids;
	private JCheckBox chckbxMinorGrids;
	private JCheckBox chckbxSetAllPanels_1;
	private JCheckBox chckbxDrawLineAt;
	private JCheckBox chckbxAnnotateFirst;
	private JCheckBox chckbxAnnotateLast;
	private JCheckBox chckbxShowDate;
	private JCheckBox chckbxAnnotateAlongAxis;
	private JCheckBox chckbxAnnotateMajorTicks;
	private JCheckBox chckbxShowLabel;
	private JCheckBox chckbxSetAllPanels_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			XXXAxisOptions dialog = new XXXAxisOptions();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public XXXAxisOptions() {
		super();
		undoableEditSupport = new UndoableEditSupport(this);

		setModal(true);
		setAlwaysOnTop(true);
		Icons icons = new Icons();
		setIconImage(icons.getImage("icons/favicon.ico"));
		setBounds(100, 100, 500, 670);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setLayout(new FlowLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		{
			JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
			// contentPanel.add(tabbedPane);
			{
				JPanel panel = new JPanel();
				tabbedPane.addTab("Range", null, panel, null);
				GridBagLayout gbl_panel = new GridBagLayout();
				gbl_panel.columnWidths = new int[] { 0, 0, 0, 0, 0 };
				gbl_panel.rowHeights = new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0,
						0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
				gbl_panel.columnWeights = new double[] { 0.0, 1.0, 0.0, 1.0,
						Double.MIN_VALUE };
				gbl_panel.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0,
						0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
						0.0, 0.0, Double.MIN_VALUE };
				panel.setLayout(gbl_panel);
				{
					JLabel lblPanels = new JLabel("Panels:");
					lblPanels.setFont(new Font("Dialog", Font.BOLD, 10));
					GridBagConstraints gbc_lblPanels = new GridBagConstraints();
					gbc_lblPanels.anchor = GridBagConstraints.WEST;
					gbc_lblPanels.insets = new Insets(0, 0, 5, 5);
					gbc_lblPanels.gridx = 0;
					gbc_lblPanels.gridy = 0;
					panel.add(lblPanels, gbc_lblPanels);
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
					JLabel lblRangeOptions = new JLabel("Range Options:");
					lblRangeOptions.setFont(new Font("Dialog", Font.BOLD, 10));
					GridBagConstraints gbc_lblRangeOptions = new GridBagConstraints();
					gbc_lblRangeOptions.anchor = GridBagConstraints.WEST;
					gbc_lblRangeOptions.insets = new Insets(0, 0, 5, 5);
					gbc_lblRangeOptions.gridx = 0;
					gbc_lblRangeOptions.gridy = 2;
					panel.add(lblRangeOptions, gbc_lblRangeOptions);
				}
				{
					JLabel lblAutoRange = new JLabel("Auto Range:");
					GridBagConstraints gbc_lblAutoRange = new GridBagConstraints();
					gbc_lblAutoRange.anchor = GridBagConstraints.WEST;
					gbc_lblAutoRange.insets = new Insets(0, 0, 5, 5);
					gbc_lblAutoRange.gridx = 2;
					gbc_lblAutoRange.gridy = 2;
					panel.add(lblAutoRange, gbc_lblAutoRange);
				}
				ButtonGroup buttonGroup = new ButtonGroup();
				{
					JRadioButton rdbtnAutoRange = new JRadioButton("Auto Range");
					rdbtnAutoRange.setSelected(true);
					rdbtnAutoRange.setFont(new Font("Dialog", Font.BOLD, 10));
					GridBagConstraints gbc_rdbtnBlablabla = new GridBagConstraints();
					gbc_rdbtnBlablabla.anchor = GridBagConstraints.WEST;
					gbc_rdbtnBlablabla.insets = new Insets(0, 0, 5, 5);
					gbc_rdbtnBlablabla.gridx = 0;
					gbc_rdbtnBlablabla.gridy = 3;
					panel.add(rdbtnAutoRange, gbc_rdbtnBlablabla);

					buttonGroup.add(rdbtnAutoRange);
				}
				{
					textField_3 = new JTextField();
					GridBagConstraints gbc_textField_2 = new GridBagConstraints();
					gbc_textField_2.insets = new Insets(0, 0, 5, 0);
					gbc_textField_2.fill = GridBagConstraints.HORIZONTAL;
					gbc_textField_2.gridx = 3;
					gbc_textField_2.gridy = 3;
					panel.add(textField_3, gbc_textField_2);
					textField_3.setColumns(10);
				}
				{
					JLabel lblRangeMargin = new JLabel("Range Margin (%):");
					GridBagConstraints gbc_lblRangeMargin = new GridBagConstraints();
					gbc_lblRangeMargin.anchor = GridBagConstraints.WEST;
					gbc_lblRangeMargin.insets = new Insets(0, 0, 5, 5);
					gbc_lblRangeMargin.gridx = 2;
					gbc_lblRangeMargin.gridy = 3;
					panel.add(lblRangeMargin, gbc_lblRangeMargin);
				}
				{
					JRadioButton rdbtnFloatingCenter = new JRadioButton(
							"Floating Center");
					rdbtnFloatingCenter.setFont(new Font("Dialog", Font.BOLD,
							10));
					GridBagConstraints gbc_rdbtnFloatingCenter = new GridBagConstraints();
					gbc_rdbtnFloatingCenter.anchor = GridBagConstraints.WEST;
					gbc_rdbtnFloatingCenter.insets = new Insets(0, 0, 5, 5);
					gbc_rdbtnFloatingCenter.gridx = 0;
					gbc_rdbtnFloatingCenter.gridy = 4;
					panel.add(rdbtnFloatingCenter, gbc_rdbtnFloatingCenter);

					buttonGroup.add(rdbtnFloatingCenter);
				}
				{
					chckbxBlablabla = new JCheckBox("Bound autoscaling range");
					chckbxBlablabla.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent arg0) {
							// Create a new undo action
							// Save our current state in a final boolean so it
							// is accessible in the inner class below
							final boolean curState = chckbxBlablabla
									.isSelected();
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
									chckbxBlablabla.setSelected(curState);

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
									chckbxBlablabla.setSelected(!curState);

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
					GridBagConstraints gbc_chckbxBlablabla = new GridBagConstraints();
					gbc_chckbxBlablabla.anchor = GridBagConstraints.WEST;
					gbc_chckbxBlablabla.insets = new Insets(0, 0, 5, 5);
					gbc_chckbxBlablabla.gridx = 2;
					gbc_chckbxBlablabla.gridy = 4;
					panel.add(chckbxBlablabla, gbc_chckbxBlablabla);
				}
				{
					JRadioButton rdbtnFixedMinMax = new JRadioButton(
							"Fixed Min/Max");
					rdbtnFixedMinMax.setFont(new Font("Dialog", Font.BOLD, 10));
					GridBagConstraints gbc_rdbtnBlablabla_1 = new GridBagConstraints();
					gbc_rdbtnBlablabla_1.anchor = GridBagConstraints.WEST;
					gbc_rdbtnBlablabla_1.insets = new Insets(0, 0, 5, 5);
					gbc_rdbtnBlablabla_1.gridx = 0;
					gbc_rdbtnBlablabla_1.gridy = 5;
					panel.add(rdbtnFixedMinMax, gbc_rdbtnBlablabla_1);

					buttonGroup.add(rdbtnFixedMinMax);
				}
				{
					JLabel lblMinimum = new JLabel("Minimum:");
					GridBagConstraints gbc_lblMinimum = new GridBagConstraints();
					gbc_lblMinimum.anchor = GridBagConstraints.EAST;
					gbc_lblMinimum.insets = new Insets(0, 0, 5, 5);
					gbc_lblMinimum.gridx = 2;
					gbc_lblMinimum.gridy = 6;
					panel.add(lblMinimum, gbc_lblMinimum);
				}
				{
					textField_8 = new JTextField();
					textField_8.setText("0");
					GridBagConstraints gbc_textField_8 = new GridBagConstraints();
					gbc_textField_8.insets = new Insets(0, 0, 5, 0);
					gbc_textField_8.fill = GridBagConstraints.HORIZONTAL;
					gbc_textField_8.gridx = 3;
					gbc_textField_8.gridy = 6;
					panel.add(textField_8, gbc_textField_8);
					textField_8.setColumns(10);
				}
				{
					JLabel lblScaling = new JLabel("Scaling:");
					lblScaling.setFont(new Font("Dialog", Font.BOLD, 10));
					GridBagConstraints gbc_lblScaling = new GridBagConstraints();
					gbc_lblScaling.anchor = GridBagConstraints.WEST;
					gbc_lblScaling.insets = new Insets(0, 0, 5, 5);
					gbc_lblScaling.gridx = 0;
					gbc_lblScaling.gridy = 7;
					panel.add(lblScaling, gbc_lblScaling);
				}
				{
					JLabel lblMaximum = new JLabel("Maximum:");
					GridBagConstraints gbc_lblMaximum = new GridBagConstraints();
					gbc_lblMaximum.anchor = GridBagConstraints.EAST;
					gbc_lblMaximum.insets = new Insets(0, 0, 5, 5);
					gbc_lblMaximum.gridx = 2;
					gbc_lblMaximum.gridy = 7;
					panel.add(lblMaximum, gbc_lblMaximum);
				}
				{
					textField_9 = new JTextField();
					textField_9.setText("0");
					GridBagConstraints gbc_textField_9 = new GridBagConstraints();
					gbc_textField_9.insets = new Insets(0, 0, 5, 0);
					gbc_textField_9.fill = GridBagConstraints.HORIZONTAL;
					gbc_textField_9.gridx = 3;
					gbc_textField_9.gridy = 7;
					panel.add(textField_9, gbc_textField_9);
					textField_9.setColumns(10);
				}
				ButtonGroup buttonGroup2 = new ButtonGroup();
				{
					JRadioButton rdbtnLinear = new JRadioButton("Linear");
					rdbtnLinear.setSelected(true);
					rdbtnLinear.setFont(new Font("Dialog", Font.BOLD, 10));
					GridBagConstraints gbc_rdbtnLinear = new GridBagConstraints();
					gbc_rdbtnLinear.anchor = GridBagConstraints.WEST;
					gbc_rdbtnLinear.insets = new Insets(0, 0, 5, 5);
					gbc_rdbtnLinear.gridx = 0;
					gbc_rdbtnLinear.gridy = 8;
					panel.add(rdbtnLinear, gbc_rdbtnLinear);

					buttonGroup2.add(rdbtnLinear);
				}
				{
					JLabel lblnotAppliedIf = new JLabel(
							"(Not applied if min/max are equal)");
					GridBagConstraints gbc_lblnotAppliedIf = new GridBagConstraints();
					gbc_lblnotAppliedIf.gridwidth = 2;
					gbc_lblnotAppliedIf.insets = new Insets(0, 0, 5, 0);
					gbc_lblnotAppliedIf.gridx = 2;
					gbc_lblnotAppliedIf.gridy = 8;
					panel.add(lblnotAppliedIf, gbc_lblnotAppliedIf);
				}
				{
					JRadioButton rdbtnLog = new JRadioButton("Log");
					rdbtnLog.setFont(new Font("Dialog", Font.BOLD, 10));
					GridBagConstraints gbc_rdbtnLog = new GridBagConstraints();
					gbc_rdbtnLog.anchor = GridBagConstraints.WEST;
					gbc_rdbtnLog.insets = new Insets(0, 0, 5, 5);
					gbc_rdbtnLog.gridx = 0;
					gbc_rdbtnLog.gridy = 9;
					panel.add(rdbtnLog, gbc_rdbtnLog);

					buttonGroup2.add(rdbtnLog);
				}
				{
					JRadioButton rdbtnLog_1 = new JRadioButton("Log");
					rdbtnLog_1.setFont(new Font("Dialog", Font.BOLD, 10));
					GridBagConstraints gbc_rdbtnLog_1 = new GridBagConstraints();
					gbc_rdbtnLog_1.anchor = GridBagConstraints.WEST;
					gbc_rdbtnLog_1.insets = new Insets(0, 0, 5, 5);
					gbc_rdbtnLog_1.gridx = 0;
					gbc_rdbtnLog_1.gridy = 10;
					panel.add(rdbtnLog_1, gbc_rdbtnLog_1);

					buttonGroup2.add(rdbtnLog_1);
				}
				{
					JLabel lblFixedMinmax = new JLabel("Fixed Min/Max");
					lblFixedMinmax.setFont(new Font("Dialog", Font.BOLD, 10));
					GridBagConstraints gbc_lblFixedMinmax = new GridBagConstraints();
					gbc_lblFixedMinmax.anchor = GridBagConstraints.WEST;
					gbc_lblFixedMinmax.insets = new Insets(0, 0, 5, 5);
					gbc_lblFixedMinmax.gridx = 0;
					gbc_lblFixedMinmax.gridy = 12;
					panel.add(lblFixedMinmax, gbc_lblFixedMinmax);
				}
				{
					JLabel lblFloatingCenter = new JLabel("Floating Center:");
					lblFloatingCenter
							.setFont(new Font("Dialog", Font.BOLD, 10));
					GridBagConstraints gbc_lblFloatingCenter = new GridBagConstraints();
					gbc_lblFloatingCenter.anchor = GridBagConstraints.WEST;
					gbc_lblFloatingCenter.insets = new Insets(0, 0, 5, 5);
					gbc_lblFloatingCenter.gridx = 2;
					gbc_lblFloatingCenter.gridy = 12;
					panel.add(lblFloatingCenter, gbc_lblFloatingCenter);
				}
				{
					JLabel lblMin = new JLabel("Min:");
					lblMin.setFont(new Font("Dialog", Font.BOLD, 10));
					GridBagConstraints gbc_lblMin = new GridBagConstraints();
					gbc_lblMin.anchor = GridBagConstraints.WEST;
					gbc_lblMin.insets = new Insets(0, 0, 5, 5);
					gbc_lblMin.gridx = 0;
					gbc_lblMin.gridy = 13;
					panel.add(lblMin, gbc_lblMin);
				}
				{
					textField_1 = new JTextField();
					textField_1.setFont(new Font("Dialog", Font.PLAIN, 10));
					textField_1.setText("2007-03-23/00:00:00");
					GridBagConstraints gbc_textField = new GridBagConstraints();
					gbc_textField.insets = new Insets(0, 0, 5, 5);
					gbc_textField.fill = GridBagConstraints.HORIZONTAL;
					gbc_textField.gridx = 1;
					gbc_textField.gridy = 13;
					panel.add(textField_1, gbc_textField);
					textField_1.setColumns(10);
				}
				{
					JLabel lblSpan = new JLabel("Span");
					lblSpan.setFont(new Font("Dialog", Font.BOLD, 10));
					GridBagConstraints gbc_lblSpan = new GridBagConstraints();
					gbc_lblSpan.anchor = GridBagConstraints.EAST;
					gbc_lblSpan.insets = new Insets(0, 0, 5, 5);
					gbc_lblSpan.gridx = 2;
					gbc_lblSpan.gridy = 13;
					panel.add(lblSpan, gbc_lblSpan);
				}
				{
					textField_4 = new JTextField();
					GridBagConstraints gbc_textField_3 = new GridBagConstraints();
					gbc_textField_3.insets = new Insets(0, 0, 5, 0);
					gbc_textField_3.fill = GridBagConstraints.HORIZONTAL;
					gbc_textField_3.gridx = 3;
					gbc_textField_3.gridy = 13;
					panel.add(textField_4, gbc_textField_3);
					textField_4.setColumns(10);
				}
				{
					JLabel lblMax = new JLabel("Max:");
					lblMax.setFont(new Font("Dialog", Font.BOLD, 10));
					GridBagConstraints gbc_lblMax = new GridBagConstraints();
					gbc_lblMax.anchor = GridBagConstraints.WEST;
					gbc_lblMax.insets = new Insets(0, 0, 5, 5);
					gbc_lblMax.gridx = 0;
					gbc_lblMax.gridy = 14;
					panel.add(lblMax, gbc_lblMax);
				}
				{
					textField_2 = new JTextField();
					textField_2.setFont(new Font("Dialog", Font.PLAIN, 10));
					textField_2.setText("2007-03-24/00:00:00");
					GridBagConstraints gbc_textField_1 = new GridBagConstraints();
					gbc_textField_1.insets = new Insets(0, 0, 5, 5);
					gbc_textField_1.fill = GridBagConstraints.HORIZONTAL;
					gbc_textField_1.gridx = 1;
					gbc_textField_1.gridy = 14;
					panel.add(textField_2, gbc_textField_1);
					textField_2.setColumns(10);
				}
				{
					JLabel lblCenter = new JLabel("Center");
					lblCenter.setFont(new Font("Dialog", Font.BOLD, 10));
					GridBagConstraints gbc_lblCenter = new GridBagConstraints();
					gbc_lblCenter.anchor = GridBagConstraints.EAST;
					gbc_lblCenter.insets = new Insets(0, 0, 5, 5);
					gbc_lblCenter.gridx = 2;
					gbc_lblCenter.gridy = 14;
					panel.add(lblCenter, gbc_lblCenter);
				}
				{
					JComboBox comboBox = new JComboBox();
					GridBagConstraints gbc_comboBox = new GridBagConstraints();
					gbc_comboBox.insets = new Insets(0, 0, 5, 0);
					gbc_comboBox.fill = GridBagConstraints.HORIZONTAL;
					gbc_comboBox.gridx = 3;
					gbc_comboBox.gridy = 14;
					panel.add(comboBox, gbc_comboBox);
				}
				{
					chckbxNewCheckBox = new JCheckBox("New check box");
					chckbxNewCheckBox.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent arg0) {
							// Create a new undo action
							// Save our current state in a final boolean so it
							// is accessible in the inner class below
							final boolean curState = chckbxNewCheckBox
									.isSelected();
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
									chckbxNewCheckBox.setSelected(curState);

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
									chckbxNewCheckBox.setSelected(!curState);

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
					GridBagConstraints gbc_chckbxNewCheckBox = new GridBagConstraints();
					gbc_chckbxNewCheckBox.insets = new Insets(0, 0, 5, 5);
					gbc_chckbxNewCheckBox.gridx = 0;
					gbc_chckbxNewCheckBox.gridy = 16;
					panel.add(chckbxNewCheckBox, gbc_chckbxNewCheckBox);
				}
				{
					chckbxSetAllPanels = new JCheckBox("Set All Panels");
					chckbxSetAllPanels.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent arg0) {
							// Create a new undo action
							// Save our current state in a final boolean so it
							// is accessible in the inner class below
							final boolean curState = chckbxSetAllPanels
									.isSelected();
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
					chckbxSetAllPanels
							.setFont(new Font("Dialog", Font.BOLD, 10));
					GridBagConstraints gbc_chckbxSetAllPanels = new GridBagConstraints();
					gbc_chckbxSetAllPanels.insets = new Insets(0, 0, 5, 0);
					gbc_chckbxSetAllPanels.gridwidth = 2;
					gbc_chckbxSetAllPanels.gridx = 2;
					gbc_chckbxSetAllPanels.gridy = 16;
					panel.add(chckbxSetAllPanels, gbc_chckbxSetAllPanels);
				}
				{
					chckbxNewCheckBox_1 = new JCheckBox("Is Time");
					chckbxNewCheckBox_1.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent arg0) {
							// Create a new undo action
							// Save our current state in a final boolean so it
							// is accessible in the inner class below
							final boolean curState = chckbxNewCheckBox_1
									.isSelected();
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
									chckbxNewCheckBox_1.setSelected(curState);

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
									chckbxNewCheckBox_1.setSelected(!curState);

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
					GridBagConstraints gbc_chckbxNewCheckBox_1 = new GridBagConstraints();
					gbc_chckbxNewCheckBox_1.insets = new Insets(0, 0, 0, 5);
					gbc_chckbxNewCheckBox_1.gridx = 0;
					gbc_chckbxNewCheckBox_1.gridy = 17;
					panel.add(chckbxNewCheckBox_1, gbc_chckbxNewCheckBox_1);
				}
			}
			{
				JPanel panel = new JPanel();
				tabbedPane.addTab("Ticks", null, panel, null);
				GridBagLayout gbl_panel = new GridBagLayout();
				gbl_panel.columnWidths = new int[] { 0, 0, 0, 0, 0 };
				gbl_panel.rowHeights = new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0,
						0, 0, 0, 0, 0, 0, 0, 0 };
				gbl_panel.columnWeights = new double[] { 0.0, 1.0, 1.0, 0.0,
						Double.MIN_VALUE };
				gbl_panel.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0,
						0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0,
						Double.MIN_VALUE };
				panel.setLayout(gbl_panel);
				{
					JLabel lblPanels_1 = new JLabel("Panels:");
					GridBagConstraints gbc_lblPanels_1 = new GridBagConstraints();
					gbc_lblPanels_1.insets = new Insets(0, 0, 5, 5);
					gbc_lblPanels_1.anchor = GridBagConstraints.EAST;
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
					JLabel lblLogMinorTick = new JLabel("Log Minor Tick Type:");
					GridBagConstraints gbc_lblLogMinorTick = new GridBagConstraints();
					gbc_lblLogMinorTick.insets = new Insets(0, 0, 5, 5);
					gbc_lblLogMinorTick.gridx = 1;
					gbc_lblLogMinorTick.gridy = 7;
					panel.add(lblLogMinorTick, gbc_lblLogMinorTick);
				}
				{
					JRadioButton rdbtnFull = new JRadioButton("Full");
					GridBagConstraints gbc_rdbtnFull = new GridBagConstraints();
					gbc_rdbtnFull.insets = new Insets(0, 0, 5, 5);
					gbc_rdbtnFull.gridx = 0;
					gbc_rdbtnFull.gridy = 8;
					panel.add(rdbtnFull, gbc_rdbtnFull);
				}
				{
					JRadioButton rdbtnFirst = new JRadioButton("First");
					GridBagConstraints gbc_rdbtnFirst = new GridBagConstraints();
					gbc_rdbtnFirst.insets = new Insets(0, 0, 5, 5);
					gbc_rdbtnFirst.gridx = 1;
					gbc_rdbtnFirst.gridy = 8;
					panel.add(rdbtnFirst, gbc_rdbtnFirst);
				}
				{
					JRadioButton rdbtnLast = new JRadioButton("Last");
					GridBagConstraints gbc_rdbtnLast = new GridBagConstraints();
					gbc_rdbtnLast.insets = new Insets(0, 0, 5, 0);
					gbc_rdbtnLast.gridx = 2;
					gbc_rdbtnLast.gridy = 8;
					panel.add(rdbtnLast, gbc_rdbtnLast);
				}
				{
					JRadioButton rdbtnNewRadioButton = new JRadioButton(
							"New radio button");
					GridBagConstraints gbc_rdbtnNewRadioButton = new GridBagConstraints();
					gbc_rdbtnNewRadioButton.insets = new Insets(0, 0, 5, 0);
					gbc_rdbtnNewRadioButton.gridx = 3;
					gbc_rdbtnNewRadioButton.gridy = 8;
					panel.add(rdbtnNewRadioButton, gbc_rdbtnNewRadioButton);
				}
				{
					JLabel lblDrawTicks = new JLabel("Draw Ticks:");
					GridBagConstraints gbc_lblDrawTicks = new GridBagConstraints();
					gbc_lblDrawTicks.insets = new Insets(0, 0, 5, 5);
					gbc_lblDrawTicks.gridx = 0;
					gbc_lblDrawTicks.gridy = 11;
					panel.add(lblDrawTicks, gbc_lblDrawTicks);
				}
				{
					textField_5 = new JTextField();
					GridBagConstraints gbc_textField_4 = new GridBagConstraints();
					gbc_textField_4.insets = new Insets(0, 0, 5, 0);
					gbc_textField_4.fill = GridBagConstraints.HORIZONTAL;
					gbc_textField_4.gridx = 2;
					gbc_textField_4.gridy = 14;
					panel.add(textField_5, gbc_textField_4);
					textField_5.setColumns(10);
				}
				{
					JLabel lblPlacement = new JLabel("Placement");
					GridBagConstraints gbc_lblPlacement = new GridBagConstraints();
					gbc_lblPlacement.insets = new Insets(0, 0, 5, 5);
					gbc_lblPlacement.gridx = 0;
					gbc_lblPlacement.gridy = 13;
					panel.add(lblPlacement, gbc_lblPlacement);
				}
				{
					JLabel lblLength = new JLabel("Length");
					GridBagConstraints gbc_lblLength = new GridBagConstraints();
					gbc_lblLength.insets = new Insets(0, 0, 5, 5);
					gbc_lblLength.gridx = 1;
					gbc_lblLength.gridy = 13;
					panel.add(lblLength, gbc_lblLength);
				}
				{
					chckbxBottom = new JCheckBox("Bottom");
					chckbxBottom.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent arg0) {
							// Create a new undo action
							// Save our current state in a final boolean so it
							// is accessible in the inner class below
							final boolean curState = chckbxBottom.isSelected();
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
									chckbxBottom.setSelected(curState);

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
									chckbxBottom.setSelected(!curState);

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
					GridBagConstraints gbc_chckbxBottom = new GridBagConstraints();
					gbc_chckbxBottom.insets = new Insets(0, 0, 5, 5);
					gbc_chckbxBottom.gridx = 0;
					gbc_chckbxBottom.gridy = 14;
					panel.add(chckbxBottom, gbc_chckbxBottom);
				}
				{
					JLabel lblMajor = new JLabel("Major:");
					GridBagConstraints gbc_lblMajor = new GridBagConstraints();
					gbc_lblMajor.insets = new Insets(0, 0, 5, 5);
					gbc_lblMajor.gridx = 1;
					gbc_lblMajor.gridy = 14;
					panel.add(lblMajor, gbc_lblMajor);
				}
				{
					chckbxTop = new JCheckBox("Top");
					chckbxTop.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent arg0) {
							// Create a new undo action
							// Save our current state in a final boolean so it
							// is accessible in the inner class below
							final boolean curState = chckbxTop.isSelected();
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
									chckbxTop.setSelected(curState);

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
									chckbxTop.setSelected(!curState);

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
					GridBagConstraints gbc_chckbxTop = new GridBagConstraints();
					gbc_chckbxTop.insets = new Insets(0, 0, 0, 5);
					gbc_chckbxTop.gridx = 0;
					gbc_chckbxTop.gridy = 15;
					panel.add(chckbxTop, gbc_chckbxTop);
				}
				{
					JLabel lblMinor = new JLabel("Minor:");
					GridBagConstraints gbc_lblMinor = new GridBagConstraints();
					gbc_lblMinor.insets = new Insets(0, 0, 0, 5);
					gbc_lblMinor.gridx = 1;
					gbc_lblMinor.gridy = 15;
					panel.add(lblMinor, gbc_lblMinor);
				}
				{
					textField_6 = new JTextField();
					GridBagConstraints gbc_textField_5 = new GridBagConstraints();
					gbc_textField_5.fill = GridBagConstraints.HORIZONTAL;
					gbc_textField_5.gridx = 2;
					gbc_textField_5.gridy = 15;
					panel.add(textField_6, gbc_textField_5);
					textField_6.setColumns(10);
				}
			}
			{
				JPanel panel = new JPanel();
				tabbedPane.addTab("Grid", null, panel, null);
				GridBagLayout gbl_panel = new GridBagLayout();
				gbl_panel.columnWidths = new int[] { 0, 0, 0 };
				gbl_panel.rowHeights = new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0,
						0, 0, 0, 0, 0, 0 };
				gbl_panel.columnWeights = new double[] { 1.0, 1.0,
						Double.MIN_VALUE };
				gbl_panel.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0,
						0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
						Double.MIN_VALUE };
				panel.setLayout(gbl_panel);
				{
					JLabel lblPanels_2 = new JLabel("Panels:");
					GridBagConstraints gbc_lblPanels_2 = new GridBagConstraints();
					gbc_lblPanels_2.insets = new Insets(0, 0, 5, 5);
					gbc_lblPanels_2.anchor = GridBagConstraints.EAST;
					gbc_lblPanels_2.gridx = 0;
					gbc_lblPanels_2.gridy = 0;
					panel.add(lblPanels_2, gbc_lblPanels_2);
				}
				{
					JComboBox comboBox = new JComboBox();
					GridBagConstraints gbc_comboBox = new GridBagConstraints();
					gbc_comboBox.insets = new Insets(0, 0, 5, 0);
					gbc_comboBox.fill = GridBagConstraints.HORIZONTAL;
					gbc_comboBox.gridx = 1;
					gbc_comboBox.gridy = 0;
					panel.add(comboBox, gbc_comboBox);
				}
				{
					JLabel lblPanelFrameThickness = new JLabel(
							"Panel Frame Thickness");
					GridBagConstraints gbc_lblPanelFrameThickness = new GridBagConstraints();
					gbc_lblPanelFrameThickness.anchor = GridBagConstraints.EAST;
					gbc_lblPanelFrameThickness.insets = new Insets(0, 0, 5, 5);
					gbc_lblPanelFrameThickness.gridx = 0;
					gbc_lblPanelFrameThickness.gridy = 1;
					panel.add(lblPanelFrameThickness,
							gbc_lblPanelFrameThickness);
				}
				{
					textField_7 = new JTextField();
					GridBagConstraints gbc_textField_6 = new GridBagConstraints();
					gbc_textField_6.insets = new Insets(0, 0, 5, 0);
					gbc_textField_6.fill = GridBagConstraints.HORIZONTAL;
					gbc_textField_6.gridx = 1;
					gbc_textField_6.gridy = 1;
					panel.add(textField_7, gbc_textField_6);
					textField_7.setColumns(10);
				}
				{
					chckbxMajorGrids = new JCheckBox("Major Grids:");
					chckbxMajorGrids.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent arg0) {
							// Create a new undo action
							// Save our current state in a final boolean so it
							// is accessible in the inner class below
							final boolean curState = chckbxMajorGrids
									.isSelected();
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
									chckbxMajorGrids.setSelected(curState);

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
									chckbxMajorGrids.setSelected(!curState);

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
					GridBagConstraints gbc_chckbxMajorGrids = new GridBagConstraints();
					gbc_chckbxMajorGrids.insets = new Insets(0, 0, 5, 5);
					gbc_chckbxMajorGrids.gridx = 0;
					gbc_chckbxMajorGrids.gridy = 3;
					panel.add(chckbxMajorGrids, gbc_chckbxMajorGrids);
				}
				{
					JLabel lblColor = new JLabel("Color");
					GridBagConstraints gbc_lblColor = new GridBagConstraints();
					gbc_lblColor.insets = new Insets(0, 0, 5, 5);
					gbc_lblColor.gridx = 0;
					gbc_lblColor.gridy = 4;
					panel.add(lblColor, gbc_lblColor);
				}
				{
					JButton btnNewButton = new JButton("");
					btnNewButton.setIcon(icons.getImageIcon("icons/info20.png"));

					GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
					gbc_btnNewButton.insets = new Insets(0, 0, 5, 0);
					gbc_btnNewButton.gridx = 1;
					gbc_btnNewButton.gridy = 4;
					panel.add(btnNewButton, gbc_btnNewButton);
				}
				{
					JLabel lblThickness = new JLabel("Thickness");
					GridBagConstraints gbc_lblThickness = new GridBagConstraints();
					gbc_lblThickness.anchor = GridBagConstraints.EAST;
					gbc_lblThickness.insets = new Insets(0, 0, 5, 5);
					gbc_lblThickness.gridx = 0;
					gbc_lblThickness.gridy = 5;
					panel.add(lblThickness, gbc_lblThickness);
				}
				{
					textField_10 = new JTextField();
					textField_10.setText("1");
					GridBagConstraints gbc_textField_10 = new GridBagConstraints();
					gbc_textField_10.insets = new Insets(0, 0, 5, 0);
					gbc_textField_10.fill = GridBagConstraints.HORIZONTAL;
					gbc_textField_10.gridx = 1;
					gbc_textField_10.gridy = 5;
					panel.add(textField_10, gbc_textField_10);
					textField_10.setColumns(10);
				}
				{
					JLabel lblStyle = new JLabel("Style");
					GridBagConstraints gbc_lblStyle = new GridBagConstraints();
					gbc_lblStyle.anchor = GridBagConstraints.EAST;
					gbc_lblStyle.insets = new Insets(0, 0, 5, 5);
					gbc_lblStyle.gridx = 0;
					gbc_lblStyle.gridy = 6;
					panel.add(lblStyle, gbc_lblStyle);
				}
				{
					JComboBox comboBox = new JComboBox();
					GridBagConstraints gbc_comboBox = new GridBagConstraints();
					gbc_comboBox.insets = new Insets(0, 0, 5, 0);
					gbc_comboBox.fill = GridBagConstraints.HORIZONTAL;
					gbc_comboBox.gridx = 1;
					gbc_comboBox.gridy = 6;
					panel.add(comboBox, gbc_comboBox);
				}
				{
					chckbxMinorGrids = new JCheckBox("Minor Grids:");
					chckbxMinorGrids.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent arg0) {
							// Create a new undo action
							// Save our current state in a final boolean so it
							// is accessible in the inner class below
							final boolean curState = chckbxMinorGrids
									.isSelected();
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
									chckbxMinorGrids.setSelected(curState);

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
									chckbxMinorGrids.setSelected(!curState);

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
					GridBagConstraints gbc_chckbxMinorGrids = new GridBagConstraints();
					gbc_chckbxMinorGrids.insets = new Insets(0, 0, 5, 5);
					gbc_chckbxMinorGrids.gridx = 0;
					gbc_chckbxMinorGrids.gridy = 8;
					panel.add(chckbxMinorGrids, gbc_chckbxMinorGrids);
				}
				{
					JLabel lblColor_1 = new JLabel("Color");
					GridBagConstraints gbc_lblColor_1 = new GridBagConstraints();
					gbc_lblColor_1.insets = new Insets(0, 0, 5, 5);
					gbc_lblColor_1.gridx = 0;
					gbc_lblColor_1.gridy = 9;
					panel.add(lblColor_1, gbc_lblColor_1);
				}
				{
					JButton button = new JButton("");
					button.setIcon(icons.getImageIcon("icons/info20.png"));

					GridBagConstraints gbc_button = new GridBagConstraints();
					gbc_button.insets = new Insets(0, 0, 5, 0);
					gbc_button.gridx = 1;
					gbc_button.gridy = 9;
					panel.add(button, gbc_button);
				}
				{
					JLabel lblThickness_1 = new JLabel("Thickness");
					GridBagConstraints gbc_lblThickness_1 = new GridBagConstraints();
					gbc_lblThickness_1.anchor = GridBagConstraints.EAST;
					gbc_lblThickness_1.insets = new Insets(0, 0, 5, 5);
					gbc_lblThickness_1.gridx = 0;
					gbc_lblThickness_1.gridy = 10;
					panel.add(lblThickness_1, gbc_lblThickness_1);
				}
				{
					textField_11 = new JTextField();
					textField_11.setText("1");
					GridBagConstraints gbc_textField_11 = new GridBagConstraints();
					gbc_textField_11.insets = new Insets(0, 0, 5, 0);
					gbc_textField_11.fill = GridBagConstraints.HORIZONTAL;
					gbc_textField_11.gridx = 1;
					gbc_textField_11.gridy = 10;
					panel.add(textField_11, gbc_textField_11);
					textField_11.setColumns(10);
				}
				{
					JLabel lblStyle_1 = new JLabel("Style");
					GridBagConstraints gbc_lblStyle_1 = new GridBagConstraints();
					gbc_lblStyle_1.anchor = GridBagConstraints.EAST;
					gbc_lblStyle_1.insets = new Insets(0, 0, 5, 5);
					gbc_lblStyle_1.gridx = 0;
					gbc_lblStyle_1.gridy = 11;
					panel.add(lblStyle_1, gbc_lblStyle_1);
				}
				{
					JComboBox comboBox = new JComboBox();
					GridBagConstraints gbc_comboBox = new GridBagConstraints();
					gbc_comboBox.insets = new Insets(0, 0, 5, 0);
					gbc_comboBox.fill = GridBagConstraints.HORIZONTAL;
					gbc_comboBox.gridx = 1;
					gbc_comboBox.gridy = 11;
					panel.add(comboBox, gbc_comboBox);
				}
				{
					chckbxSetAllPanels_1 = new JCheckBox("Set All Panels");
					chckbxSetAllPanels_1
							.addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent arg0) {
									// Create a new undo action
									// Save our current state in a final boolean
									// so it is accessible in the inner class
									// below
									final boolean curState = chckbxSetAllPanels_1
											.isSelected();
									UndoableEdit undoableEdit = new AbstractUndoableEdit() {

										/**
										 * 
										 */
										private static final long serialVersionUID = 1L;

										// Method that is called when we must
										// redo the undone action
										public void redo()
												throws javax.swing.undo.CannotRedoException {
											super.redo();

											// Set the checkbox to its
											// pre-undone state
											chckbxSetAllPanels_1
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

											// Set the checkbox to its previous
											// state
											chckbxSetAllPanels_1
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
									Judas.getUndoManager()
											.addEdit(undoableEdit);

									// Update the state of the menu items
									Judas.getMntmUndo().setEnabled(
											Judas.getUndoManager().canUndo());
									Judas.getMntmRedo().setEnabled(
											Judas.getUndoManager().canRedo());
								}
							});
					GridBagConstraints gbc_chckbxSetAllPanels_1 = new GridBagConstraints();
					gbc_chckbxSetAllPanels_1.insets = new Insets(0, 0, 0, 5);
					gbc_chckbxSetAllPanels_1.gridx = 1;
					gbc_chckbxSetAllPanels_1.gridy = 13;
					panel.add(chckbxSetAllPanels_1, gbc_chckbxSetAllPanels_1);
				}
			}
			{
				JPanel panel = new JPanel();
				tabbedPane.addTab("Annotation", null, panel, null);
				GridBagLayout gbl_panel = new GridBagLayout();
				gbl_panel.columnWidths = new int[] { 0, 0, 0, 0, 0 };
				gbl_panel.rowHeights = new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0,
						0, 0, 0, 0, 0, 0, 0, 0 };
				gbl_panel.columnWeights = new double[] { 1.0, 1.0, 1.0, 0.0,
						Double.MIN_VALUE };
				gbl_panel.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0,
						0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
						Double.MIN_VALUE };
				panel.setLayout(gbl_panel);
				{
					JLabel lblPanels_3 = new JLabel("Panels:");
					GridBagConstraints gbc_lblPanels_3 = new GridBagConstraints();
					gbc_lblPanels_3.insets = new Insets(0, 0, 5, 5);
					gbc_lblPanels_3.anchor = GridBagConstraints.EAST;
					gbc_lblPanels_3.gridx = 0;
					gbc_lblPanels_3.gridy = 0;
					panel.add(lblPanels_3, gbc_lblPanels_3);
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
					chckbxDrawLineAt = new JCheckBox(
							"Draw Line at Zero (1 for log)");
					chckbxDrawLineAt.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent arg0) {
							// Create a new undo action
							// Save our current state in a final boolean so it
							// is accessible in the inner class below
							final boolean curState = chckbxDrawLineAt
									.isSelected();
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
									chckbxDrawLineAt.setSelected(curState);

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
									chckbxDrawLineAt.setSelected(!curState);

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
					GridBagConstraints gbc_chckbxDrawLineAt = new GridBagConstraints();
					gbc_chckbxDrawLineAt.insets = new Insets(0, 0, 5, 5);
					gbc_chckbxDrawLineAt.gridx = 0;
					gbc_chckbxDrawLineAt.gridy = 1;
					panel.add(chckbxDrawLineAt, gbc_chckbxDrawLineAt);
				}
				{
					JLabel lblAnnotationFormat = new JLabel(
							"Annotation Format:");
					GridBagConstraints gbc_lblAnnotationFormat = new GridBagConstraints();
					gbc_lblAnnotationFormat.anchor = GridBagConstraints.EAST;
					gbc_lblAnnotationFormat.insets = new Insets(0, 0, 5, 5);
					gbc_lblAnnotationFormat.gridx = 1;
					gbc_lblAnnotationFormat.gridy = 1;
					panel.add(lblAnnotationFormat, gbc_lblAnnotationFormat);
				}
				{
					JComboBox comboBox = new JComboBox();
					GridBagConstraints gbc_comboBox = new GridBagConstraints();
					gbc_comboBox.insets = new Insets(0, 0, 5, 5);
					gbc_comboBox.fill = GridBagConstraints.HORIZONTAL;
					gbc_comboBox.gridx = 2;
					gbc_comboBox.gridy = 1;
					panel.add(comboBox, gbc_comboBox);
				}
				{
					chckbxAnnotateFirst = new JCheckBox("Annotate first");
					chckbxAnnotateFirst.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent arg0) {
							// Create a new undo action
							// Save our current state in a final boolean so it
							// is accessible in the inner class below
							final boolean curState = chckbxAnnotateFirst
									.isSelected();
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
									chckbxAnnotateFirst.setSelected(curState);

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
									chckbxAnnotateFirst.setSelected(!curState);

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
					GridBagConstraints gbc_chckbxAnnotateFirst = new GridBagConstraints();
					gbc_chckbxAnnotateFirst.insets = new Insets(0, 0, 5, 5);
					gbc_chckbxAnnotateFirst.gridx = 0;
					gbc_chckbxAnnotateFirst.gridy = 2;
					panel.add(chckbxAnnotateFirst, gbc_chckbxAnnotateFirst);
				}
				{
					chckbxAnnotateLast = new JCheckBox("Annotate last");
					chckbxAnnotateLast.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent arg0) {
							// Create a new undo action
							// Save our current state in a final boolean so it
							// is accessible in the inner class below
							final boolean curState = chckbxAnnotateLast
									.isSelected();
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
									chckbxAnnotateLast.setSelected(curState);

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
									chckbxAnnotateLast.setSelected(!curState);

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
					GridBagConstraints gbc_chckbxAnnotateLast = new GridBagConstraints();
					gbc_chckbxAnnotateLast.insets = new Insets(0, 0, 5, 5);
					gbc_chckbxAnnotateLast.gridx = 0;
					gbc_chckbxAnnotateLast.gridy = 3;
					panel.add(chckbxAnnotateLast, gbc_chckbxAnnotateLast);
				}
				{
					chckbxShowDate = new JCheckBox("Show Date");
					chckbxShowDate.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent arg0) {
							// Create a new undo action
							// Save our current state in a final boolean so it
							// is accessible in the inner class below
							final boolean curState = chckbxShowDate
									.isSelected();
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
									chckbxShowDate.setSelected(curState);

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
									chckbxShowDate.setSelected(!curState);

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
					GridBagConstraints gbc_chckbxShowDate = new GridBagConstraints();
					gbc_chckbxShowDate.insets = new Insets(0, 0, 5, 5);
					gbc_chckbxShowDate.gridx = 0;
					gbc_chckbxShowDate.gridy = 4;
					panel.add(chckbxShowDate, gbc_chckbxShowDate);
				}
				{
					JLabel lblLine = new JLabel("Line 1:");
					GridBagConstraints gbc_lblLine = new GridBagConstraints();
					gbc_lblLine.anchor = GridBagConstraints.EAST;
					gbc_lblLine.insets = new Insets(0, 0, 5, 5);
					gbc_lblLine.gridx = 0;
					gbc_lblLine.gridy = 5;
					panel.add(lblLine, gbc_lblLine);
				}
				{
					txtdate = new JTextField();
					txtdate.setText("%date");
					GridBagConstraints gbc_txtdate = new GridBagConstraints();
					gbc_txtdate.insets = new Insets(0, 0, 5, 5);
					gbc_txtdate.fill = GridBagConstraints.HORIZONTAL;
					gbc_txtdate.gridx = 1;
					gbc_txtdate.gridy = 5;
					panel.add(txtdate, gbc_txtdate);
					txtdate.setColumns(10);
				}
				{
					textField_12 = new JTextField();
					GridBagConstraints gbc_textField_12 = new GridBagConstraints();
					gbc_textField_12.insets = new Insets(0, 0, 5, 5);
					gbc_textField_12.fill = GridBagConstraints.HORIZONTAL;
					gbc_textField_12.gridx = 2;
					gbc_textField_12.gridy = 5;
					panel.add(textField_12, gbc_textField_12);
					textField_12.setColumns(10);
				}
				{
					JLabel lblLine_1 = new JLabel("Line 2:");
					GridBagConstraints gbc_lblLine_1 = new GridBagConstraints();
					gbc_lblLine_1.anchor = GridBagConstraints.EAST;
					gbc_lblLine_1.insets = new Insets(0, 0, 5, 5);
					gbc_lblLine_1.gridx = 0;
					gbc_lblLine_1.gridy = 6;
					panel.add(lblLine_1, gbc_lblLine_1);
				}
				{
					txttime = new JTextField();
					txttime.setText("%time");
					GridBagConstraints gbc_txttime = new GridBagConstraints();
					gbc_txttime.insets = new Insets(0, 0, 5, 5);
					gbc_txttime.fill = GridBagConstraints.HORIZONTAL;
					gbc_txttime.gridx = 1;
					gbc_txttime.gridy = 6;
					panel.add(txttime, gbc_txttime);
					txttime.setColumns(10);
				}
				{
					JButton btnPreview = new JButton("Preview");
					GridBagConstraints gbc_btnPreview = new GridBagConstraints();
					gbc_btnPreview.insets = new Insets(0, 0, 5, 5);
					gbc_btnPreview.gridx = 2;
					gbc_btnPreview.gridy = 6;
					panel.add(btnPreview, gbc_btnPreview);
				}
				{
					chckbxAnnotateAlongAxis = new JCheckBox(
							"Annotate Along Axis:");
					chckbxAnnotateAlongAxis
							.addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent arg0) {
									// Create a new undo action
									// Save our current state in a final boolean
									// so it is accessible in the inner class
									// below
									final boolean curState = chckbxAnnotateAlongAxis
											.isSelected();
									UndoableEdit undoableEdit = new AbstractUndoableEdit() {

										/**
									 * 
									 */
										private static final long serialVersionUID = 1L;

										// Method that is called when we must
										// redo the undone action
										public void redo()
												throws javax.swing.undo.CannotRedoException {
											super.redo();

											// Set the checkbox to its
											// pre-undone state
											chckbxAnnotateAlongAxis
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

											// Set the checkbox to its previous
											// state
											chckbxAnnotateAlongAxis
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
									Judas.getUndoManager()
											.addEdit(undoableEdit);

									// Update the state of the menu items
									Judas.getMntmUndo().setEnabled(
											Judas.getUndoManager().canUndo());
									Judas.getMntmRedo().setEnabled(
											Judas.getUndoManager().canRedo());
								}
							});
					GridBagConstraints gbc_chckbxAnnotateAlongAxis = new GridBagConstraints();
					gbc_chckbxAnnotateAlongAxis.insets = new Insets(0, 0, 5, 5);
					gbc_chckbxAnnotateAlongAxis.gridx = 0;
					gbc_chckbxAnnotateAlongAxis.gridy = 8;
					panel.add(chckbxAnnotateAlongAxis,
							gbc_chckbxAnnotateAlongAxis);
				}
				{
					JLabel lblPlaceAnnotationOn = new JLabel(
							"Place Annotation on:");
					GridBagConstraints gbc_lblPlaceAnnotationOn = new GridBagConstraints();
					gbc_lblPlaceAnnotationOn.anchor = GridBagConstraints.EAST;
					gbc_lblPlaceAnnotationOn.insets = new Insets(0, 0, 5, 5);
					gbc_lblPlaceAnnotationOn.gridx = 0;
					gbc_lblPlaceAnnotationOn.gridy = 9;
					panel.add(lblPlaceAnnotationOn, gbc_lblPlaceAnnotationOn);
				}
				{
					JComboBox comboBox = new JComboBox();
					GridBagConstraints gbc_comboBox = new GridBagConstraints();
					gbc_comboBox.insets = new Insets(0, 0, 5, 5);
					gbc_comboBox.fill = GridBagConstraints.HORIZONTAL;
					gbc_comboBox.gridx = 1;
					gbc_comboBox.gridy = 9;
					panel.add(comboBox, gbc_comboBox);
				}
				{
					chckbxAnnotateMajorTicks = new JCheckBox(
							"Annotate Major Ticks");
					chckbxAnnotateMajorTicks
							.addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent arg0) {
									// Create a new undo action
									// Save our current state in a final boolean
									// so it is accessible in the inner class
									// below
									final boolean curState = chckbxAnnotateMajorTicks
											.isSelected();
									UndoableEdit undoableEdit = new AbstractUndoableEdit() {

										/**
									 * 
									 */
										private static final long serialVersionUID = 1L;

										// Method that is called when we must
										// redo the undone action
										public void redo()
												throws javax.swing.undo.CannotRedoException {
											super.redo();

											// Set the checkbox to its
											// pre-undone state
											chckbxAnnotateMajorTicks
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

											// Set the checkbox to its previous
											// state
											chckbxAnnotateMajorTicks
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
									Judas.getUndoManager()
											.addEdit(undoableEdit);

									// Update the state of the menu items
									Judas.getMntmUndo().setEnabled(
											Judas.getUndoManager().canUndo());
									Judas.getMntmRedo().setEnabled(
											Judas.getUndoManager().canRedo());
								}
							});
					GridBagConstraints gbc_chckbxAnnotateMajorTicks = new GridBagConstraints();
					gbc_chckbxAnnotateMajorTicks.insets = new Insets(0, 0, 5, 5);
					gbc_chckbxAnnotateMajorTicks.gridx = 2;
					gbc_chckbxAnnotateMajorTicks.gridy = 9;
					panel.add(chckbxAnnotateMajorTicks,
							gbc_chckbxAnnotateMajorTicks);
				}
				{
					JLabel lblAnnotateEvent = new JLabel("Annotate Event");
					GridBagConstraints gbc_lblAnnotateEvent = new GridBagConstraints();
					gbc_lblAnnotateEvent.anchor = GridBagConstraints.EAST;
					gbc_lblAnnotateEvent.insets = new Insets(0, 0, 5, 5);
					gbc_lblAnnotateEvent.gridx = 0;
					gbc_lblAnnotateEvent.gridy = 10;
					panel.add(lblAnnotateEvent, gbc_lblAnnotateEvent);
				}
				{
					textField_13 = new JTextField();
					textField_13.setText("%00");
					GridBagConstraints gbc_textField_13 = new GridBagConstraints();
					gbc_textField_13.insets = new Insets(0, 0, 5, 5);
					gbc_textField_13.fill = GridBagConstraints.HORIZONTAL;
					gbc_textField_13.gridx = 1;
					gbc_textField_13.gridy = 10;
					panel.add(textField_13, gbc_textField_13);
					textField_13.setColumns(10);
				}
				{
					JLabel lblAlign = new JLabel("Align");
					GridBagConstraints gbc_lblAlign = new GridBagConstraints();
					gbc_lblAlign.insets = new Insets(0, 0, 5, 5);
					gbc_lblAlign.gridx = 0;
					gbc_lblAlign.gridy = 11;
					panel.add(lblAlign, gbc_lblAlign);
				}
				{
					JLabel lblOrientation = new JLabel("Orientation:");
					GridBagConstraints gbc_lblOrientation = new GridBagConstraints();
					gbc_lblOrientation.insets = new Insets(0, 0, 5, 5);
					gbc_lblOrientation.gridx = 0;
					gbc_lblOrientation.gridy = 12;
					panel.add(lblOrientation, gbc_lblOrientation);
				}
				{
					JLabel lblFont_1 = new JLabel("Font");
					GridBagConstraints gbc_lblFont_1 = new GridBagConstraints();
					gbc_lblFont_1.insets = new Insets(0, 0, 5, 5);
					gbc_lblFont_1.gridx = 0;
					gbc_lblFont_1.gridy = 13;
					panel.add(lblFont_1, gbc_lblFont_1);
				}
				{
					JLabel lblSizepts = new JLabel("Size (pts)");
					GridBagConstraints gbc_lblSizepts = new GridBagConstraints();
					gbc_lblSizepts.insets = new Insets(0, 0, 5, 5);
					gbc_lblSizepts.gridx = 1;
					gbc_lblSizepts.gridy = 13;
					panel.add(lblSizepts, gbc_lblSizepts);
				}
				{
					JLabel lblColor_3 = new JLabel("Color");
					GridBagConstraints gbc_lblColor_3 = new GridBagConstraints();
					gbc_lblColor_3.insets = new Insets(0, 0, 5, 5);
					gbc_lblColor_3.gridx = 2;
					gbc_lblColor_3.gridy = 13;
					panel.add(lblColor_3, gbc_lblColor_3);
				}
				{
					JLabel lblCurrentColor = new JLabel("Current Color");
					GridBagConstraints gbc_lblCurrentColor = new GridBagConstraints();
					gbc_lblCurrentColor.insets = new Insets(0, 0, 5, 0);
					gbc_lblCurrentColor.gridx = 3;
					gbc_lblCurrentColor.gridy = 13;
					panel.add(lblCurrentColor, gbc_lblCurrentColor);
				}
				{
					JComboBox comboBox = new JComboBox();
					GridBagConstraints gbc_comboBox = new GridBagConstraints();
					gbc_comboBox.insets = new Insets(0, 0, 5, 5);
					gbc_comboBox.fill = GridBagConstraints.HORIZONTAL;
					gbc_comboBox.gridx = 0;
					gbc_comboBox.gridy = 14;
					panel.add(comboBox, gbc_comboBox);
				}
				{
					textField_14 = new JTextField();
					GridBagConstraints gbc_textField_14 = new GridBagConstraints();
					gbc_textField_14.insets = new Insets(0, 0, 5, 5);
					gbc_textField_14.fill = GridBagConstraints.HORIZONTAL;
					gbc_textField_14.gridx = 1;
					gbc_textField_14.gridy = 14;
					panel.add(textField_14, gbc_textField_14);
					textField_14.setColumns(10);
				}
				{
					JButton button = new JButton("");
					button.setIcon(icons.getImageIcon("icons/info20.png"));

					GridBagConstraints gbc_button = new GridBagConstraints();
					gbc_button.insets = new Insets(0, 0, 5, 5);
					gbc_button.gridx = 2;
					gbc_button.gridy = 14;
					panel.add(button, gbc_button);
				}
				{
					JLabel label = new JLabel("");
					GridBagConstraints gbc_label = new GridBagConstraints();
					gbc_label.insets = new Insets(0, 0, 5, 0);
					gbc_label.gridx = 3;
					gbc_label.gridy = 14;
					panel.add(label, gbc_label);
				}
			}
			{
				JPanel panel = new JPanel();
				tabbedPane.addTab("Labels", null, panel, null);
				GridBagLayout gbl_panel = new GridBagLayout();
				gbl_panel.columnWidths = new int[] { 0, 0, 0, 0 };
				gbl_panel.rowHeights = new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0,
						0, 0, 0, 0, 0, 0 };
				gbl_panel.columnWeights = new double[] { 0.0, 1.0, 0.0,
						Double.MIN_VALUE };
				gbl_panel.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0,
						0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
						Double.MIN_VALUE };
				panel.setLayout(gbl_panel);
				{
					JLabel lblPanels_4 = new JLabel("Panels:");
					GridBagConstraints gbc_lblPanels_4 = new GridBagConstraints();
					gbc_lblPanels_4.insets = new Insets(0, 0, 5, 5);
					gbc_lblPanels_4.anchor = GridBagConstraints.WEST;
					gbc_lblPanels_4.gridx = 0;
					gbc_lblPanels_4.gridy = 0;
					panel.add(lblPanels_4, gbc_lblPanels_4);
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
					JLabel lblText = new JLabel("Text:");
					GridBagConstraints gbc_lblText = new GridBagConstraints();
					gbc_lblText.insets = new Insets(0, 0, 5, 5);
					gbc_lblText.gridx = 0;
					gbc_lblText.gridy = 1;
					panel.add(lblText, gbc_lblText);
				}
				{
					JLabel lblSelectLabel = new JLabel("Select Label:");
					GridBagConstraints gbc_lblSelectLabel = new GridBagConstraints();
					gbc_lblSelectLabel.anchor = GridBagConstraints.EAST;
					gbc_lblSelectLabel.insets = new Insets(0, 0, 5, 5);
					gbc_lblSelectLabel.gridx = 0;
					gbc_lblSelectLabel.gridy = 2;
					panel.add(lblSelectLabel, gbc_lblSelectLabel);
				}
				{
					JComboBox comboBox = new JComboBox();
					GridBagConstraints gbc_comboBox = new GridBagConstraints();
					gbc_comboBox.insets = new Insets(0, 0, 5, 5);
					gbc_comboBox.fill = GridBagConstraints.HORIZONTAL;
					gbc_comboBox.gridx = 1;
					gbc_comboBox.gridy = 2;
					panel.add(comboBox, gbc_comboBox);
				}
				{
					JLabel lblEditaddLabel = new JLabel("Edit/Add Label:");
					GridBagConstraints gbc_lblEditaddLabel = new GridBagConstraints();
					gbc_lblEditaddLabel.anchor = GridBagConstraints.EAST;
					gbc_lblEditaddLabel.insets = new Insets(0, 0, 5, 5);
					gbc_lblEditaddLabel.gridx = 0;
					gbc_lblEditaddLabel.gridy = 3;
					panel.add(lblEditaddLabel, gbc_lblEditaddLabel);
				}
				{
					chckbxShowLabel = new JCheckBox("Show Label");
					chckbxShowLabel.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent arg0) {
							// Create a new undo action
							// Save our current state in a final boolean so it
							// is accessible in the inner class below
							final boolean curState = chckbxShowLabel
									.isSelected();
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
									chckbxShowLabel.setSelected(curState);

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
									chckbxShowLabel.setSelected(!curState);

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
					GridBagConstraints gbc_chckbxShowLabel = new GridBagConstraints();
					gbc_chckbxShowLabel.insets = new Insets(0, 0, 5, 0);
					gbc_chckbxShowLabel.gridx = 2;
					gbc_chckbxShowLabel.gridy = 2;
					panel.add(chckbxShowLabel, gbc_chckbxShowLabel);
				}
				{
					textField_7 = new JTextField();
					GridBagConstraints gbc_textField_7 = new GridBagConstraints();
					gbc_textField_7.insets = new Insets(0, 0, 5, 5);
					gbc_textField_7.fill = GridBagConstraints.HORIZONTAL;
					gbc_textField_7.gridx = 1;
					gbc_textField_7.gridy = 3;
					panel.add(textField_7, gbc_textField_7);
					textField_7.setColumns(10);
				}
				{
					JLabel lblFont = new JLabel("Font:");
					GridBagConstraints gbc_lblFont = new GridBagConstraints();
					gbc_lblFont.anchor = GridBagConstraints.EAST;
					gbc_lblFont.insets = new Insets(0, 0, 5, 5);
					gbc_lblFont.gridx = 0;
					gbc_lblFont.gridy = 5;
					panel.add(lblFont, gbc_lblFont);
				}
				{
					JComboBox comboBox = new JComboBox();
					GridBagConstraints gbc_comboBox = new GridBagConstraints();
					gbc_comboBox.insets = new Insets(0, 0, 5, 5);
					gbc_comboBox.fill = GridBagConstraints.HORIZONTAL;
					gbc_comboBox.gridx = 1;
					gbc_comboBox.gridy = 5;
					panel.add(comboBox, gbc_comboBox);
				}
				{
					JLabel lblS = new JLabel("S");
					GridBagConstraints gbc_lblS = new GridBagConstraints();
					gbc_lblS.insets = new Insets(0, 0, 5, 0);
					gbc_lblS.gridx = 2;
					gbc_lblS.gridy = 5;
					panel.add(lblS, gbc_lblS);
				}
				{
					JLabel lblFormat = new JLabel("Format:");
					GridBagConstraints gbc_lblFormat = new GridBagConstraints();
					gbc_lblFormat.anchor = GridBagConstraints.EAST;
					gbc_lblFormat.insets = new Insets(0, 0, 5, 5);
					gbc_lblFormat.gridx = 0;
					gbc_lblFormat.gridy = 6;
					panel.add(lblFormat, gbc_lblFormat);
				}
				{
					JComboBox comboBox = new JComboBox();
					GridBagConstraints gbc_comboBox = new GridBagConstraints();
					gbc_comboBox.insets = new Insets(0, 0, 5, 5);
					gbc_comboBox.fill = GridBagConstraints.HORIZONTAL;
					gbc_comboBox.gridx = 1;
					gbc_comboBox.gridy = 6;
					panel.add(comboBox, gbc_comboBox);
				}
				{
					JLabel lblColor_2 = new JLabel("Color");
					GridBagConstraints gbc_lblColor_2 = new GridBagConstraints();
					gbc_lblColor_2.insets = new Insets(0, 0, 5, 0);
					gbc_lblColor_2.gridx = 2;
					gbc_lblColor_2.gridy = 6;
					panel.add(lblColor_2, gbc_lblColor_2);
				}
				{
					JButton btnSyncPanelLabels = new JButton(
							"Sync Panel Labels");
					GridBagConstraints gbc_btnSyncPanelLabels = new GridBagConstraints();
					gbc_btnSyncPanelLabels.insets = new Insets(0, 0, 5, 5);
					gbc_btnSyncPanelLabels.gridx = 1;
					gbc_btnSyncPanelLabels.gridy = 7;
					panel.add(btnSyncPanelLabels, gbc_btnSyncPanelLabels);
				}
				{
					JLabel lblStyle_2 = new JLabel("Style:");
					GridBagConstraints gbc_lblStyle_2 = new GridBagConstraints();
					gbc_lblStyle_2.insets = new Insets(0, 0, 5, 5);
					gbc_lblStyle_2.gridx = 0;
					gbc_lblStyle_2.gridy = 8;
					panel.add(lblStyle_2, gbc_lblStyle_2);
				}
				{
					JRadioButton rdbtnHorizontal = new JRadioButton(
							"Horizontal");
					GridBagConstraints gbc_rdbtnHorizontal = new GridBagConstraints();
					gbc_rdbtnHorizontal.insets = new Insets(0, 0, 5, 5);
					gbc_rdbtnHorizontal.gridx = 0;
					gbc_rdbtnHorizontal.gridy = 11;
					panel.add(rdbtnHorizontal, gbc_rdbtnHorizontal);
				}
				{
					JRadioButton rdbtnVertical = new JRadioButton("Vertical");
					GridBagConstraints gbc_rdbtnVertical = new GridBagConstraints();
					gbc_rdbtnVertical.insets = new Insets(0, 0, 5, 5);
					gbc_rdbtnVertical.gridx = 0;
					gbc_rdbtnVertical.gridy = 12;
					panel.add(rdbtnVertical, gbc_rdbtnVertical);
				}
				{
					chckbxSetAllPanels_2 = new JCheckBox("Set All Panels");
					chckbxSetAllPanels_2
							.addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent arg0) {
									// Create a new undo action
									// Save our current state in a final boolean
									// so it is accessible in the inner class
									// below
									final boolean curState = chckbxSetAllPanels_2
											.isSelected();
									UndoableEdit undoableEdit = new AbstractUndoableEdit() {

										/**
									 * 
									 */
										private static final long serialVersionUID = 1L;

										// Method that is called when we must
										// redo the undone action
										public void redo()
												throws javax.swing.undo.CannotRedoException {
											super.redo();

											// Set the checkbox to its
											// pre-undone state
											chckbxSetAllPanels_2
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

											// Set the checkbox to its previous
											// state
											chckbxSetAllPanels_2
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
									Judas.getUndoManager()
											.addEdit(undoableEdit);

									// Update the state of the menu items
									Judas.getMntmUndo().setEnabled(
											Judas.getUndoManager().canUndo());
									Judas.getMntmRedo().setEnabled(
											Judas.getUndoManager().canRedo());
								}
							});
					GridBagConstraints gbc_chckbxSetAllPanels_2 = new GridBagConstraints();
					gbc_chckbxSetAllPanels_2.insets = new Insets(0, 0, 0, 5);
					gbc_chckbxSetAllPanels_2.gridx = 0;
					gbc_chckbxSetAllPanels_2.gridy = 13;
					panel.add(chckbxSetAllPanels_2, gbc_chckbxSetAllPanels_2);
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
