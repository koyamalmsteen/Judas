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

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.JTabbedPane;
import javax.swing.JLabel;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Image;
import java.awt.Insets;
import java.net.URL;

import javax.swing.AbstractAction;
import javax.swing.ButtonGroup;
import javax.swing.InputMap;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JList;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JRadioButton;
import javax.swing.KeyStroke;
import javax.swing.JTextArea;

public class VelocitySlices extends JDialog {

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
	private JTextField textField_15;
	private JTextField textField_16;
	private JTextField textField_17;
	private JTextField textField_18;
	private JTextField textField_19;
	private JTextField textField_20;
	private JTextField textField_21;
	private JTextField textField_22;
	private JTextField textField_23;

	protected UndoableEditSupport undoableEditSupport;
	private JCheckBox chckbxCenterTime;
	private JCheckBox chckbxRestrictEnergyRange;
	private JCheckBox chckbxR;
	private JCheckBox chckbxSmoothDatawidth;
	private JCheckBox chckbxS;
	private JCheckBox chckbxRemoveBinsBelow;
	private JCheckBox chckbxUseNewSst;
	private JCheckBox chckbxSpecifyResolution;
	private JCheckBox chckbxRemoveEsaBackground;
	private JCheckBox chckbxRemoveSstMask;
	private JCheckBox chckbxRemoveSstContamination;
	private JCheckBox chckbxPlotContourLines;
	private JCheckBox chckbxAutorange;
	private JCheckBox chckbxAutorangexy;
	private JCheckBox chckbxLogarithmicPlot;
	private JCheckBox chckbxPlotSunDirection;
	private JCheckBox chckbxPlotBulkVelocity;
	private JCheckBox chckbxPlotAxes;
	private JCheckBox chckbxDrawEnergyLimits;
	private JCheckBox chckbxLabelContourLines;
	private JCheckBox chckbxXaxis;
	private JCheckBox chckbxYaxis;
	private JCheckBox chckbxZaxis;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			VelocitySlices dialog = new VelocitySlices();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public VelocitySlices() {
		super();
		undoableEditSupport = new UndoableEditSupport(this);

		setModal(true);
		setAlwaysOnTop(true);
		setTitle("Velocity Slices");
		
		Icons icons = new Icons();
		setIconImage(icons.getImage("icons/favicon.ico"));

		setBounds(100, 100, 500, 700);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setLayout(new FlowLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		{
			JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
			Icons icons1 = new Icons();

			// contentPanel.add(tabbedPane);
			{
				JPanel panel = new JPanel();
				tabbedPane.addTab("Main", null, panel, null);
				GridBagLayout gbl_panel = new GridBagLayout();
				gbl_panel.columnWidths = new int[] { 0, 0, 0, 0, 0 };
				gbl_panel.rowHeights = new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0,
						0, 0, 0, 0, 0, 0, 0, 0, 0 };
				gbl_panel.columnWeights = new double[] { 1.0, 1.0, 1.0, 1.0,
						Double.MIN_VALUE };
				gbl_panel.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0,
						0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
						0.0, Double.MIN_VALUE };
				panel.setLayout(gbl_panel);
				{
					JLabel lblProbe = new JLabel("Probe:");
					GridBagConstraints gbc_lblProbe = new GridBagConstraints();
					gbc_lblProbe.insets = new Insets(0, 0, 5, 5);
					gbc_lblProbe.gridx = 0;
					gbc_lblProbe.gridy = 0;
					panel.add(lblProbe, gbc_lblProbe);
				}
				{
					JLabel lblDistributionType = new JLabel(
							"Distribution Type:");
					GridBagConstraints gbc_lblDistributionType = new GridBagConstraints();
					gbc_lblDistributionType.insets = new Insets(0, 0, 5, 5);
					gbc_lblDistributionType.gridx = 1;
					gbc_lblDistributionType.gridy = 0;
					panel.add(lblDistributionType, gbc_lblDistributionType);
				}
				{
					JLabel lblUnits = new JLabel("Units:");
					GridBagConstraints gbc_lblUnits = new GridBagConstraints();
					gbc_lblUnits.insets = new Insets(0, 0, 5, 5);
					gbc_lblUnits.gridx = 2;
					gbc_lblUnits.gridy = 0;
					panel.add(lblUnits, gbc_lblUnits);
				}
				{
					String[] str = { "Counts", "DF", "Rate", "Flux", "EFlux" };

					JList list = new JList(str);
					GridBagConstraints gbc_list = new GridBagConstraints();
					gbc_list.insets = new Insets(0, 0, 5, 5);
					gbc_list.fill = GridBagConstraints.BOTH;
					gbc_list.gridx = 2;
					gbc_list.gridy = 1;
					panel.add(list, gbc_list);
				}
				{
					String[] str = { "DSL", "GSE", "GSM" };

					JList list = new JList(str);
					GridBagConstraints gbc_list = new GridBagConstraints();
					gbc_list.insets = new Insets(0, 0, 5, 5);
					gbc_list.fill = GridBagConstraints.BOTH;
					gbc_list.gridx = 2;
					gbc_list.gridy = 3;
					panel.add(list, gbc_list);
				}
				{
					String[] str = { "a", "b", "c", "d", "e" };

					JList list = new JList(str);
					GridBagConstraints gbc_list = new GridBagConstraints();
					gbc_list.insets = new Insets(0, 0, 5, 5);
					gbc_list.fill = GridBagConstraints.BOTH;
					gbc_list.gridx = 0;
					gbc_list.gridy = 1;
					panel.add(list, gbc_list);
				}
				{
					String[] str = { "peif", "peir", "peib", "psif", "psir",
							"peef", "peer", "peeb", "psef", "pser", "pseb" };

					JList list = new JList(str);
					GridBagConstraints gbc_list = new GridBagConstraints();
					gbc_list.gridheight = 3;
					gbc_list.insets = new Insets(0, 0, 5, 5);
					gbc_list.fill = GridBagConstraints.BOTH;
					gbc_list.gridx = 1;
					gbc_list.gridy = 1;
					panel.add(list, gbc_list);
				}
				{
					JLabel lblCoord = new JLabel("Coord:");
					GridBagConstraints gbc_lblCoord = new GridBagConstraints();
					gbc_lblCoord.insets = new Insets(0, 0, 5, 5);
					gbc_lblCoord.gridx = 2;
					gbc_lblCoord.gridy = 2;
					panel.add(lblCoord, gbc_lblCoord);
				}
				{
					JLabel lblStartTime = new JLabel("Start Time:");
					GridBagConstraints gbc_lblStartTime = new GridBagConstraints();
					gbc_lblStartTime.anchor = GridBagConstraints.WEST;
					gbc_lblStartTime.insets = new Insets(0, 0, 5, 5);
					gbc_lblStartTime.gridx = 0;
					gbc_lblStartTime.gridy = 5;
					panel.add(lblStartTime, gbc_lblStartTime);
				}
				{
					textField_1 = new JTextField();
					textField_1.setText("2008-02-26/04:54:00");
					GridBagConstraints gbc_textField = new GridBagConstraints();
					gbc_textField.insets = new Insets(0, 0, 5, 5);
					gbc_textField.fill = GridBagConstraints.HORIZONTAL;
					gbc_textField.gridx = 1;
					gbc_textField.gridy = 5;
					panel.add(textField_1, gbc_textField);
					textField_1.setColumns(10);
				}
				{
					JButton button = new JButton("");
					button.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent arg0) {
							System.out.println("Start Time");
							MyCalendar calendar = new MyCalendar();
							calendar.setLocationRelativeTo(null);
							calendar.setVisible(true);
						}
					});

					button.setIcon(icons1.getImageIcon("icons/calendar-alt-1-20.png"));

					GridBagConstraints gbc_button = new GridBagConstraints();
					gbc_button.insets = new Insets(0, 0, 5, 5);
					gbc_button.gridx = 2;
					gbc_button.gridy = 5;
					panel.add(button, gbc_button);
				}
				{
					JLabel lblStopTime = new JLabel("Stop Time:");
					GridBagConstraints gbc_lblStopTime = new GridBagConstraints();
					gbc_lblStopTime.insets = new Insets(0, 0, 5, 5);
					gbc_lblStopTime.anchor = GridBagConstraints.WEST;
					gbc_lblStopTime.gridx = 0;
					gbc_lblStopTime.gridy = 6;
					panel.add(lblStopTime, gbc_lblStopTime);
				}
				{
					textField_2 = new JTextField();
					textField_2.setText("2008-02-26/04:54:30");
					GridBagConstraints gbc_textField_1 = new GridBagConstraints();
					gbc_textField_1.insets = new Insets(0, 0, 5, 5);
					gbc_textField_1.fill = GridBagConstraints.HORIZONTAL;
					gbc_textField_1.gridx = 1;
					gbc_textField_1.gridy = 6;
					panel.add(textField_2, gbc_textField_1);
					textField_2.setColumns(10);
				}
				{
					JButton btnNewButton_2 = new JButton("");
					btnNewButton_2.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent arg0) {
							System.out.println("Stop Time");
							MyCalendar calendar = new MyCalendar();
							calendar.setLocationRelativeTo(null);
							calendar.setVisible(true);
						}
					});

					btnNewButton_2.setIcon(icons1.getImageIcon("icons/calendar-alt-1-20.png"));

					GridBagConstraints gbc_btnNewButton_2 = new GridBagConstraints();
					gbc_btnNewButton_2.insets = new Insets(0, 0, 5, 5);
					gbc_btnNewButton_2.gridx = 2;
					gbc_btnNewButton_2.gridy = 6;
					panel.add(btnNewButton_2, gbc_btnNewButton_2);
				}
				{
					JLabel lblWindowSizesec = new JLabel("Window Size (sec):");
					GridBagConstraints gbc_lblWindowSizesec = new GridBagConstraints();
					gbc_lblWindowSizesec.gridheight = 2;
					gbc_lblWindowSizesec.anchor = GridBagConstraints.WEST;
					gbc_lblWindowSizesec.insets = new Insets(0, 0, 5, 5);
					gbc_lblWindowSizesec.gridx = 0;
					gbc_lblWindowSizesec.gridy = 7;
					panel.add(lblWindowSizesec, gbc_lblWindowSizesec);
				}
				{
					textField_3 = new JTextField();
					textField_3.setText("30");
					GridBagConstraints gbc_textField_2 = new GridBagConstraints();
					gbc_textField_2.gridheight = 2;
					gbc_textField_2.insets = new Insets(0, 0, 5, 5);
					gbc_textField_2.fill = GridBagConstraints.HORIZONTAL;
					gbc_textField_2.gridx = 1;
					gbc_textField_2.gridy = 7;
					panel.add(textField_3, gbc_textField_2);
					textField_3.setColumns(10);
				}
				{
					JButton btnNewButton_6 = new JButton("");

					btnNewButton_6.setIcon(icons1.getImageIcon("icons/arrow-3-up8.png"));

					GridBagConstraints gbc_btnNewButton_6 = new GridBagConstraints();
					gbc_btnNewButton_6.insets = new Insets(0, 0, 5, 5);
					gbc_btnNewButton_6.gridx = 2;
					gbc_btnNewButton_6.gridy = 7;
					panel.add(btnNewButton_6, gbc_btnNewButton_6);
				}
				{
					chckbxCenterTime = new JCheckBox("Center Time");
					chckbxCenterTime.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent arg0) {
							// Create a new undo action
							// Save our current state in a final boolean so it
							// is accessible in the inner class below
							final boolean curState = chckbxCenterTime
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
									chckbxCenterTime.setSelected(curState);

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
									chckbxCenterTime.setSelected(!curState);

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
					GridBagConstraints gbc_chckbxCenterTime = new GridBagConstraints();
					gbc_chckbxCenterTime.insets = new Insets(0, 0, 5, 0);
					gbc_chckbxCenterTime.gridx = 3;
					gbc_chckbxCenterTime.gridy = 7;
					panel.add(chckbxCenterTime, gbc_chckbxCenterTime);
				}
				{
					JLabel lblStepTimesec = new JLabel("Step Time (sec):");
					GridBagConstraints gbc_lblStepTimesec = new GridBagConstraints();
					gbc_lblStepTimesec.gridheight = 2;
					gbc_lblStepTimesec.anchor = GridBagConstraints.WEST;
					gbc_lblStepTimesec.insets = new Insets(0, 0, 5, 5);
					gbc_lblStepTimesec.gridx = 0;
					gbc_lblStepTimesec.gridy = 9;
					panel.add(lblStepTimesec, gbc_lblStepTimesec);
				}
				{
					textField_4 = new JTextField();
					textField_4.setText("30");
					GridBagConstraints gbc_textField_3 = new GridBagConstraints();
					gbc_textField_3.gridheight = 2;
					gbc_textField_3.insets = new Insets(0, 0, 5, 5);
					gbc_textField_3.fill = GridBagConstraints.HORIZONTAL;
					gbc_textField_3.gridx = 1;
					gbc_textField_3.gridy = 9;
					panel.add(textField_4, gbc_textField_3);
					textField_4.setColumns(10);
				}
				ButtonGroup buttonGroup = new ButtonGroup();
				{
					JButton button = new JButton("");

					button.setIcon(icons1.getImageIcon("icons/arrow-3-down8.png"));

					GridBagConstraints gbc_button = new GridBagConstraints();
					gbc_button.insets = new Insets(0, 0, 5, 5);
					gbc_button.gridx = 2;
					gbc_button.gridy = 8;
					panel.add(button, gbc_button);
				}
				{
					JButton button = new JButton("");

					button.setIcon(icons1.getImageIcon("icons/arrow-3-up8.png"));

					GridBagConstraints gbc_button = new GridBagConstraints();
					gbc_button.insets = new Insets(0, 0, 5, 5);
					gbc_button.gridx = 2;
					gbc_button.gridy = 9;
					panel.add(button, gbc_button);
				}
				{
					JButton button = new JButton("");
					
					button.setIcon(icons1.getImageIcon("icons/arrow-3-down8.png"));

					GridBagConstraints gbc_button = new GridBagConstraints();
					gbc_button.insets = new Insets(0, 0, 5, 5);
					gbc_button.gridx = 2;
					gbc_button.gridy = 10;
					panel.add(button, gbc_button);
				}
				{
					JRadioButton rdbtnGeometric = new JRadioButton("Geometric");
					rdbtnGeometric.setSelected(true);
					GridBagConstraints gbc_rdbtnGeometric = new GridBagConstraints();
					gbc_rdbtnGeometric.insets = new Insets(0, 0, 5, 5);
					gbc_rdbtnGeometric.gridx = 0;
					gbc_rdbtnGeometric.gridy = 11;
					panel.add(rdbtnGeometric, gbc_rdbtnGeometric);

					buttonGroup.add(rdbtnGeometric);
				}

				{
					JRadioButton rdbtndInterpolation = new JRadioButton(
							"2D Interpolation");
					GridBagConstraints gbc_rdbtndInterpolation = new GridBagConstraints();
					gbc_rdbtndInterpolation.insets = new Insets(0, 0, 5, 5);
					gbc_rdbtndInterpolation.gridx = 1;
					gbc_rdbtndInterpolation.gridy = 11;
					panel.add(rdbtndInterpolation, gbc_rdbtndInterpolation);

					buttonGroup.add(rdbtndInterpolation);
				}
				{
					JRadioButton rdbtndInterpolation_1 = new JRadioButton(
							"3D Interpolation");
					GridBagConstraints gbc_rdbtndInterpolation_1 = new GridBagConstraints();
					gbc_rdbtndInterpolation_1.insets = new Insets(0, 0, 5, 5);
					gbc_rdbtndInterpolation_1.gridx = 2;
					gbc_rdbtndInterpolation_1.gridy = 11;
					panel.add(rdbtndInterpolation_1, gbc_rdbtndInterpolation_1);

					buttonGroup.add(rdbtndInterpolation_1);
				}
				{
					JLabel lblRotation = new JLabel("Rotation:");
					GridBagConstraints gbc_lblRotation = new GridBagConstraints();
					gbc_lblRotation.anchor = GridBagConstraints.WEST;
					gbc_lblRotation.insets = new Insets(0, 0, 5, 5);
					gbc_lblRotation.gridx = 0;
					gbc_lblRotation.gridy = 12;
					panel.add(lblRotation, gbc_lblRotation);
				}
				{
					String[] str = { "BV", "BE", "xyz", "xvel", "perp",
							"perp_xyz" };

					JComboBox comboBox = new JComboBox(str);
					GridBagConstraints gbc_comboBox = new GridBagConstraints();
					gbc_comboBox.insets = new Insets(0, 0, 5, 5);
					gbc_comboBox.fill = GridBagConstraints.HORIZONTAL;
					gbc_comboBox.gridx = 1;
					gbc_comboBox.gridy = 12;
					panel.add(comboBox, gbc_comboBox);
				}
				{
					JButton button = new JButton("");
					button.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent arg0) {
							IonElectronVelocitySlicesRotationsLegend ionElectronVelocitySlicesRotationsLegend = new IonElectronVelocitySlicesRotationsLegend();
							ionElectronVelocitySlicesRotationsLegend
									.setVisible(true);
						}
					});

					button.setIcon(icons1.getImageIcon("icons/info20.png"));

					GridBagConstraints gbc_button = new GridBagConstraints();
					gbc_button.insets = new Insets(0, 0, 5, 5);
					gbc_button.gridx = 2;
					gbc_button.gridy = 12;
					panel.add(button, gbc_button);
				}
				{
					JLabel lblBulkVelocity = new JLabel(
							"Bulk Velocity, & Mag Data:");
					GridBagConstraints gbc_lblBulkVelocity = new GridBagConstraints();
					gbc_lblBulkVelocity.anchor = GridBagConstraints.WEST;
					gbc_lblBulkVelocity.insets = new Insets(0, 0, 5, 5);
					gbc_lblBulkVelocity.gridx = 0;
					gbc_lblBulkVelocity.gridy = 13;
					panel.add(lblBulkVelocity, gbc_lblBulkVelocity);
				}
				{
					String[] str = { "Auto" };

					JComboBox comboBox = new JComboBox(str);
					GridBagConstraints gbc_comboBox = new GridBagConstraints();
					gbc_comboBox.insets = new Insets(0, 0, 5, 5);
					gbc_comboBox.fill = GridBagConstraints.HORIZONTAL;
					gbc_comboBox.gridx = 1;
					gbc_comboBox.gridy = 13;
					panel.add(comboBox, gbc_comboBox);
				}
				{
					String[] str = { "fgl" };

					JComboBox comboBox = new JComboBox(str);
					GridBagConstraints gbc_comboBox = new GridBagConstraints();
					gbc_comboBox.insets = new Insets(0, 0, 5, 5);
					gbc_comboBox.fill = GridBagConstraints.HORIZONTAL;
					gbc_comboBox.gridx = 2;
					gbc_comboBox.gridy = 13;
					panel.add(comboBox, gbc_comboBox);
				}
				{
					JLabel lblSlicePlaneNormal = new JLabel(
							"Slice Plane Normal (x,y,z)");
					GridBagConstraints gbc_lblSlicePlaneNormal = new GridBagConstraints();
					gbc_lblSlicePlaneNormal.anchor = GridBagConstraints.WEST;
					gbc_lblSlicePlaneNormal.insets = new Insets(0, 0, 5, 5);
					gbc_lblSlicePlaneNormal.gridx = 0;
					gbc_lblSlicePlaneNormal.gridy = 14;
					panel.add(lblSlicePlaneNormal, gbc_lblSlicePlaneNormal);
				}
				{
					textField_5 = new JTextField();
					textField_5.setText("0");
					GridBagConstraints gbc_textField_4 = new GridBagConstraints();
					gbc_textField_4.insets = new Insets(0, 0, 5, 5);
					gbc_textField_4.fill = GridBagConstraints.HORIZONTAL;
					gbc_textField_4.gridx = 1;
					gbc_textField_4.gridy = 14;
					panel.add(textField_5, gbc_textField_4);
					textField_5.setColumns(10);
				}
				{
					textField_6 = new JTextField();
					textField_6.setText("0");
					GridBagConstraints gbc_textField_5 = new GridBagConstraints();
					gbc_textField_5.insets = new Insets(0, 0, 5, 5);
					gbc_textField_5.fill = GridBagConstraints.HORIZONTAL;
					gbc_textField_5.gridx = 2;
					gbc_textField_5.gridy = 14;
					panel.add(textField_6, gbc_textField_5);
					textField_6.setColumns(10);
				}
				{
					textField_7 = new JTextField();
					textField_7.setText("1");
					GridBagConstraints gbc_textField_6 = new GridBagConstraints();
					gbc_textField_6.insets = new Insets(0, 0, 5, 0);
					gbc_textField_6.fill = GridBagConstraints.HORIZONTAL;
					gbc_textField_6.gridx = 3;
					gbc_textField_6.gridy = 14;
					panel.add(textField_7, gbc_textField_6);
					textField_7.setColumns(10);
				}
				{
					JLabel lblDisplacementkms = new JLabel(
							"Displacement (km/s):");
					GridBagConstraints gbc_lblDisplacementkms = new GridBagConstraints();
					gbc_lblDisplacementkms.gridheight = 2;
					gbc_lblDisplacementkms.anchor = GridBagConstraints.WEST;
					gbc_lblDisplacementkms.insets = new Insets(0, 0, 5, 5);
					gbc_lblDisplacementkms.gridx = 0;
					gbc_lblDisplacementkms.gridy = 15;
					panel.add(lblDisplacementkms, gbc_lblDisplacementkms);
				}
				{
					textField_8 = new JTextField();
					textField_8.setText("0");
					GridBagConstraints gbc_textField_7 = new GridBagConstraints();
					gbc_textField_7.gridheight = 2;
					gbc_textField_7.insets = new Insets(0, 0, 5, 5);
					gbc_textField_7.fill = GridBagConstraints.HORIZONTAL;
					gbc_textField_7.gridx = 1;
					gbc_textField_7.gridy = 15;
					panel.add(textField_8, gbc_textField_7);
					textField_8.setColumns(10);
				}
				{
					JButton button = new JButton("");

					button.setIcon(icons1.getImageIcon("icons/arrow-3-up8.png"));

					GridBagConstraints gbc_button = new GridBagConstraints();
					gbc_button.insets = new Insets(0, 0, 5, 5);
					gbc_button.gridx = 2;
					gbc_button.gridy = 15;
					panel.add(button, gbc_button);
				}
				{
					JButton button = new JButton("");

					button.setIcon(icons1.getImageIcon("icons/arrow-3-down8.png"));

					GridBagConstraints gbc_button = new GridBagConstraints();
					gbc_button.insets = new Insets(0, 0, 0, 5);
					gbc_button.gridx = 2;
					gbc_button.gridy = 16;
					panel.add(button, gbc_button);
				}
			}
			{
				JPanel panel = new JPanel();
				tabbedPane.addTab("Options", null, panel, null);
				GridBagLayout gbl_panel = new GridBagLayout();
				gbl_panel.columnWidths = new int[] { 0, 0, 0, 50, 0, 50, 0 };
				gbl_panel.rowHeights = new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0,
						0, 0, 0, 0, 0, 0, 0, 0, 0 };
				gbl_panel.columnWeights = new double[] { 0.0, 0.0, 0.0, 0.0,
						0.0, 1.0, Double.MIN_VALUE };
				gbl_panel.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0,
						0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
						0.0, Double.MIN_VALUE };
				panel.setLayout(gbl_panel);
				{
					JLabel lbldInterpolationLimits = new JLabel(
							"2D Interpolation Limits");
					GridBagConstraints gbc_lbldInterpolationLimits = new GridBagConstraints();
					gbc_lbldInterpolationLimits.insets = new Insets(0, 0, 5, 5);
					gbc_lbldInterpolationLimits.gridx = 0;
					gbc_lbldInterpolationLimits.gridy = 0;
					panel.add(lbldInterpolationLimits,
							gbc_lbldInterpolationLimits);
				}
				{
					JRadioButton rdbtnRestrictLatitude = new JRadioButton(
							"Restrict Latitude");
					GridBagConstraints gbc_rdbtnRestrictLatitude = new GridBagConstraints();
					gbc_rdbtnRestrictLatitude.insets = new Insets(0, 0, 5, 5);
					gbc_rdbtnRestrictLatitude.gridx = 0;
					gbc_rdbtnRestrictLatitude.gridy = 1;
					panel.add(rdbtnRestrictLatitude, gbc_rdbtnRestrictLatitude);
				}
				{
					JRadioButton rdbtnRestrictLongitude = new JRadioButton(
							"Restrict Longitude");
					GridBagConstraints gbc_rdbtnRestrictLongitude = new GridBagConstraints();
					gbc_rdbtnRestrictLongitude.insets = new Insets(0, 0, 5, 5);
					gbc_rdbtnRestrictLongitude.gridx = 2;
					gbc_rdbtnRestrictLongitude.gridy = 1;
					panel.add(rdbtnRestrictLongitude,
							gbc_rdbtnRestrictLongitude);
				}
				{
					JLabel lblMax = new JLabel("Max ():");
					GridBagConstraints gbc_lblMax = new GridBagConstraints();
					gbc_lblMax.gridheight = 2;
					gbc_lblMax.anchor = GridBagConstraints.WEST;
					gbc_lblMax.insets = new Insets(0, 0, 5, 5);
					gbc_lblMax.gridx = 0;
					gbc_lblMax.gridy = 2;
					panel.add(lblMax, gbc_lblMax);
				}
				{
					textField_14 = new JTextField();
					textField_14.setText("20");
					GridBagConstraints gbc_textField_13 = new GridBagConstraints();
					gbc_textField_13.gridheight = 2;
					gbc_textField_13.insets = new Insets(0, 0, 5, 5);
					gbc_textField_13.fill = GridBagConstraints.HORIZONTAL;
					gbc_textField_13.gridx = 2;
					gbc_textField_13.gridy = 2;
					panel.add(textField_14, gbc_textField_13);
					textField_14.setColumns(10);
				}
				{
					JButton button = new JButton("");

					button.setIcon(icons1.getImageIcon("icons/arrow-3-up8.png"));

					GridBagConstraints gbc_button = new GridBagConstraints();
					gbc_button.insets = new Insets(0, 0, 5, 5);
					gbc_button.gridx = 3;
					gbc_button.gridy = 2;
					panel.add(button, gbc_button);
				}
				{
					JLabel lblMaxkms_1 = new JLabel("Max (km/s):");
					GridBagConstraints gbc_lblMaxkms_1 = new GridBagConstraints();
					gbc_lblMaxkms_1.anchor = GridBagConstraints.EAST;
					gbc_lblMaxkms_1.insets = new Insets(0, 0, 5, 5);
					gbc_lblMaxkms_1.gridx = 4;
					gbc_lblMaxkms_1.gridy = 2;
					panel.add(lblMaxkms_1, gbc_lblMaxkms_1);
				}
				{
					textField_19 = new JTextField();
					textField_19.setText("250");
					GridBagConstraints gbc_textField_24 = new GridBagConstraints();
					gbc_textField_24.insets = new Insets(0, 0, 5, 0);
					gbc_textField_24.fill = GridBagConstraints.HORIZONTAL;
					gbc_textField_24.gridx = 5;
					gbc_textField_24.gridy = 2;
					panel.add(textField_19, gbc_textField_24);
					textField_19.setColumns(10);
				}
				{
					JLabel lblMin = new JLabel("Min ():");
					GridBagConstraints gbc_lblMin = new GridBagConstraints();
					gbc_lblMin.anchor = GridBagConstraints.WEST;
					gbc_lblMin.insets = new Insets(0, 0, 5, 5);
					gbc_lblMin.gridx = 0;
					gbc_lblMin.gridy = 4;
					panel.add(lblMin, gbc_lblMin);
				}
				{
					JTextArea textArea = new JTextArea();
					textArea.setText("-20");
					GridBagConstraints gbc_textArea = new GridBagConstraints();
					gbc_textArea.gridheight = 2;
					gbc_textArea.insets = new Insets(0, 0, 5, 5);
					gbc_textArea.fill = GridBagConstraints.BOTH;
					gbc_textArea.gridx = 2;
					gbc_textArea.gridy = 4;
					panel.add(textArea, gbc_textArea);
				}
				{
					JButton button = new JButton("");

					button.setIcon(icons1.getImageIcon("icons/arrow-3-down8.png"));

					GridBagConstraints gbc_button = new GridBagConstraints();
					gbc_button.insets = new Insets(0, 0, 5, 5);
					gbc_button.gridx = 3;
					gbc_button.gridy = 3;
					panel.add(button, gbc_button);
				}
				{
					JLabel lblMinkms_1 = new JLabel("Min (km/s):");
					GridBagConstraints gbc_lblMinkms_1 = new GridBagConstraints();
					gbc_lblMinkms_1.insets = new Insets(0, 0, 5, 5);
					gbc_lblMinkms_1.gridx = 4;
					gbc_lblMinkms_1.gridy = 4;
					panel.add(lblMinkms_1, gbc_lblMinkms_1);
				}
				{
					chckbxRestrictEnergyRange = new JCheckBox(
							"Restrict Energy Range");
					chckbxRestrictEnergyRange
							.addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent arg0) {
									// Create a new undo action
									// Save our current state in a final boolean
									// so it is accessible in the inner class
									// below
									final boolean curState = chckbxRestrictEnergyRange
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
											chckbxRestrictEnergyRange
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
											chckbxRestrictEnergyRange
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
					GridBagConstraints gbc_chckbxRestrictEnergyRange = new GridBagConstraints();
					gbc_chckbxRestrictEnergyRange.gridheight = 4;
					gbc_chckbxRestrictEnergyRange.anchor = GridBagConstraints.WEST;
					gbc_chckbxRestrictEnergyRange.insets = new Insets(0, 0, 5,
							5);
					gbc_chckbxRestrictEnergyRange.gridx = 0;
					gbc_chckbxRestrictEnergyRange.gridy = 5;
					panel.add(chckbxRestrictEnergyRange,
							gbc_chckbxRestrictEnergyRange);
				}
				{
					JLabel lblMaxev = new JLabel("Max (eV):");
					GridBagConstraints gbc_lblMaxev = new GridBagConstraints();
					gbc_lblMaxev.gridheight = 2;
					gbc_lblMaxev.insets = new Insets(0, 0, 5, 5);
					gbc_lblMaxev.anchor = GridBagConstraints.EAST;
					gbc_lblMaxev.gridx = 2;
					gbc_lblMaxev.gridy = 5;
					panel.add(lblMaxev, gbc_lblMaxev);
				}
				{
					textField_18 = new JTextField();
					textField_18.setText("50000");
					GridBagConstraints gbc_textField_23 = new GridBagConstraints();
					gbc_textField_23.gridheight = 2;
					gbc_textField_23.insets = new Insets(0, 0, 5, 5);
					gbc_textField_23.fill = GridBagConstraints.HORIZONTAL;
					gbc_textField_23.gridx = 3;
					gbc_textField_23.gridy = 5;
					panel.add(textField_18, gbc_textField_23);
					textField_18.setColumns(10);
				}
				{
					JButton btnNewButton_7 = new JButton("");
					
					btnNewButton_7.setIcon(icons1.getImageIcon("icons/arrow-3-up8.png"));

					GridBagConstraints gbc_btnNewButton_7 = new GridBagConstraints();
					gbc_btnNewButton_7.insets = new Insets(0, 0, 5, 5);
					gbc_btnNewButton_7.gridx = 4;
					gbc_btnNewButton_7.gridy = 5;
					panel.add(btnNewButton_7, gbc_btnNewButton_7);
				}
				{
					JButton button = new JButton("");

					button.setIcon(icons1.getImageIcon("icons/arrow-3-down8.png"));

					GridBagConstraints gbc_button = new GridBagConstraints();
					gbc_button.insets = new Insets(0, 0, 5, 5);
					gbc_button.gridx = 4;
					gbc_button.gridy = 6;
					panel.add(button, gbc_button);
				}
				{
					JLabel lblMinev = new JLabel("Min (eV):");
					GridBagConstraints gbc_lblMinev = new GridBagConstraints();
					gbc_lblMinev.gridheight = 2;
					gbc_lblMinev.insets = new Insets(0, 0, 5, 5);
					gbc_lblMinev.anchor = GridBagConstraints.EAST;
					gbc_lblMinev.gridx = 2;
					gbc_lblMinev.gridy = 7;
					panel.add(lblMinev, gbc_lblMinev);
				}
				{
					textField_10 = new JTextField();
					textField_10.setText("0");
					GridBagConstraints gbc_textField_9 = new GridBagConstraints();
					gbc_textField_9.gridheight = 2;
					gbc_textField_9.insets = new Insets(0, 0, 5, 5);
					gbc_textField_9.fill = GridBagConstraints.HORIZONTAL;
					gbc_textField_9.gridx = 3;
					gbc_textField_9.gridy = 7;
					panel.add(textField_10, gbc_textField_9);
					textField_10.setColumns(10);
				}
				{
					JButton button = new JButton("");

					button.setIcon(icons1.getImageIcon("icons/arrow-3-up8.png"));

					GridBagConstraints gbc_button = new GridBagConstraints();
					gbc_button.insets = new Insets(0, 0, 5, 5);
					gbc_button.gridx = 4;
					gbc_button.gridy = 7;
					panel.add(button, gbc_button);
				}
				{
					JButton button = new JButton("");

					button.setIcon(icons1.getImageIcon("icons/arrow-3-down8.png"));

					GridBagConstraints gbc_button = new GridBagConstraints();
					gbc_button.insets = new Insets(0, 0, 5, 5);
					gbc_button.gridx = 4;
					gbc_button.gridy = 8;
					panel.add(button, gbc_button);
				}
				{
					textField_13 = new JTextField();
					textField_13.setText("14");
					GridBagConstraints gbc_textField_12 = new GridBagConstraints();
					gbc_textField_12.insets = new Insets(0, 0, 5, 0);
					gbc_textField_12.fill = GridBagConstraints.HORIZONTAL;
					gbc_textField_12.gridx = 5;
					gbc_textField_12.gridy = 9;
					panel.add(textField_13, gbc_textField_12);
					textField_13.setColumns(10);
				}
				{
					textField_12 = new JTextField();
					textField_12.setText("52");
					GridBagConstraints gbc_textField_11 = new GridBagConstraints();
					gbc_textField_11.insets = new Insets(0, 0, 5, 5);
					gbc_textField_11.fill = GridBagConstraints.HORIZONTAL;
					gbc_textField_11.gridx = 4;
					gbc_textField_11.gridy = 9;
					panel.add(textField_12, gbc_textField_11);
					textField_12.setColumns(10);
				}
				{
					chckbxR = new JCheckBox("Regrid Data (phi, theta, energy):");
					chckbxR.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent arg0) {
							// Create a new undo action
							// Save our current state in a final boolean so it
							// is accessible in the inner class below
							final boolean curState = chckbxR.isSelected();
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
									chckbxR.setSelected(curState);

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
									chckbxR.setSelected(!curState);

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
					GridBagConstraints gbc_chckbxR = new GridBagConstraints();
					gbc_chckbxR.anchor = GridBagConstraints.WEST;
					gbc_chckbxR.insets = new Insets(0, 0, 5, 5);
					gbc_chckbxR.gridx = 0;
					gbc_chckbxR.gridy = 9;
					panel.add(chckbxR, gbc_chckbxR);
				}
				{
					textField_11 = new JTextField();
					textField_11.setText("14");
					GridBagConstraints gbc_textField_10 = new GridBagConstraints();
					gbc_textField_10.insets = new Insets(0, 0, 5, 5);
					gbc_textField_10.fill = GridBagConstraints.HORIZONTAL;
					gbc_textField_10.gridx = 3;
					gbc_textField_10.gridy = 9;
					panel.add(textField_11, gbc_textField_10);
					textField_11.setColumns(10);
				}
				{
					chckbxSmoothDatawidth = new JCheckBox("Smooth Data (width)");
					chckbxSmoothDatawidth
							.addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent arg0) {
									// Create a new undo action
									// Save our current state in a final boolean
									// so it is accessible in the inner class
									// below
									final boolean curState = chckbxSmoothDatawidth
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
											chckbxSmoothDatawidth
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
											chckbxSmoothDatawidth
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
					GridBagConstraints gbc_chckbxSmoothDatawidth = new GridBagConstraints();
					gbc_chckbxSmoothDatawidth.gridheight = 2;
					gbc_chckbxSmoothDatawidth.anchor = GridBagConstraints.WEST;
					gbc_chckbxSmoothDatawidth.insets = new Insets(0, 0, 5, 5);
					gbc_chckbxSmoothDatawidth.gridx = 0;
					gbc_chckbxSmoothDatawidth.gridy = 10;
					panel.add(chckbxSmoothDatawidth, gbc_chckbxSmoothDatawidth);
				}
				{
					JButton button = new JButton("");

					button.setIcon(icons1.getImageIcon("icons/arrow-3-up8.png"));

					GridBagConstraints gbc_button = new GridBagConstraints();
					gbc_button.insets = new Insets(0, 0, 5, 5);
					gbc_button.gridx = 4;
					gbc_button.gridy = 10;
					panel.add(button, gbc_button);
				}
				{
					chckbxS = new JCheckBox("Subtract Bulk Velocity");
					chckbxS.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent arg0) {
							// Create a new undo action
							// Save our current state in a final boolean so it
							// is accessible in the inner class below
							final boolean curState = chckbxS.isSelected();
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
									chckbxS.setSelected(curState);

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
									chckbxS.setSelected(!curState);

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
					GridBagConstraints gbc_chckbxS = new GridBagConstraints();
					gbc_chckbxS.anchor = GridBagConstraints.WEST;
					gbc_chckbxS.insets = new Insets(0, 0, 5, 5);
					gbc_chckbxS.gridx = 0;
					gbc_chckbxS.gridy = 12;
					panel.add(chckbxS, gbc_chckbxS);
				}
				{
					JButton button = new JButton("");

					button.setIcon(icons1.getImageIcon("icons/arrow-3-down8.png"));

					GridBagConstraints gbc_button = new GridBagConstraints();
					gbc_button.insets = new Insets(0, 0, 5, 5);
					gbc_button.gridx = 4;
					gbc_button.gridy = 11;
					panel.add(button, gbc_button);
				}
				{
					chckbxRemoveBinsBelow = new JCheckBox(
							"Remove bins below one-count level");
					chckbxRemoveBinsBelow
							.addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent arg0) {
									// Create a new undo action
									// Save our current state in a final boolean
									// so it is accessible in the inner class
									// below
									final boolean curState = chckbxRemoveBinsBelow
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
											chckbxRemoveBinsBelow
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
											chckbxRemoveBinsBelow
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
					GridBagConstraints gbc_chckbxRemoveBinsBelow = new GridBagConstraints();
					gbc_chckbxRemoveBinsBelow.insets = new Insets(0, 0, 5, 5);
					gbc_chckbxRemoveBinsBelow.gridx = 0;
					gbc_chckbxRemoveBinsBelow.gridy = 13;
					panel.add(chckbxRemoveBinsBelow, gbc_chckbxRemoveBinsBelow);
				}
				{
					chckbxUseNewSst = new JCheckBox("Use new SST calibrations");
					chckbxUseNewSst.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent arg0) {
							// Create a new undo action
							// Save our current state in a final boolean so it
							// is accessible in the inner class below
							final boolean curState = chckbxUseNewSst
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
									chckbxUseNewSst.setSelected(curState);

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
									chckbxUseNewSst.setSelected(!curState);

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
					GridBagConstraints gbc_chckbxUseNewSst = new GridBagConstraints();
					gbc_chckbxUseNewSst.anchor = GridBagConstraints.WEST;
					gbc_chckbxUseNewSst.insets = new Insets(0, 0, 5, 5);
					gbc_chckbxUseNewSst.gridx = 0;
					gbc_chckbxUseNewSst.gridy = 14;
					panel.add(chckbxUseNewSst, gbc_chckbxUseNewSst);
				}
				{
					chckbxSpecifyResolution = new JCheckBox(
							"Specify Resolution:");
					chckbxSpecifyResolution
							.addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent arg0) {
									// Create a new undo action
									// Save our current state in a final boolean
									// so it is accessible in the inner class
									// below
									final boolean curState = chckbxSpecifyResolution
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
											chckbxSpecifyResolution
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
											chckbxSpecifyResolution
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
					GridBagConstraints gbc_chckbxSpecifyResolution = new GridBagConstraints();
					gbc_chckbxSpecifyResolution.gridheight = 2;
					gbc_chckbxSpecifyResolution.anchor = GridBagConstraints.WEST;
					gbc_chckbxSpecifyResolution.insets = new Insets(0, 0, 0, 5);
					gbc_chckbxSpecifyResolution.gridx = 0;
					gbc_chckbxSpecifyResolution.gridy = 15;
					panel.add(chckbxSpecifyResolution,
							gbc_chckbxSpecifyResolution);
				}
				{
					textField_9 = new JTextField();
					textField_9.setText("500");
					GridBagConstraints gbc_textField_8 = new GridBagConstraints();
					gbc_textField_8.gridheight = 2;
					gbc_textField_8.insets = new Insets(0, 0, 5, 5);
					gbc_textField_8.fill = GridBagConstraints.HORIZONTAL;
					gbc_textField_8.gridx = 3;
					gbc_textField_8.gridy = 10;
					panel.add(textField_9, gbc_textField_8);
					textField_9.setColumns(10);
				}
				{
					JButton button = new JButton("");

					button.setIcon(icons1.getImageIcon("icons/arrow-3-up8.png"));

					GridBagConstraints gbc_button = new GridBagConstraints();
					gbc_button.insets = new Insets(0, 0, 5, 5);
					gbc_button.gridx = 4;
					gbc_button.gridy = 15;
					panel.add(button, gbc_button);
				}
				{
					JButton button = new JButton("");

					button.setIcon(icons1.getImageIcon("icons/arrow-3-down8.png"));

					GridBagConstraints gbc_button = new GridBagConstraints();
					gbc_button.insets = new Insets(0, 0, 0, 5);
					gbc_button.gridx = 4;
					gbc_button.gridy = 16;
					panel.add(button, gbc_button);
				}

			}
			{
				JPanel panel = new JPanel();
				tabbedPane.addTab("Contamination", null, panel, null);
				GridBagLayout gbl_panel = new GridBagLayout();
				gbl_panel.columnWidths = new int[] { 0, 0, 0, 0 };
				gbl_panel.rowHeights = new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0,
						0, 0, 0, 0, 0, 0, 0, 0 };
				gbl_panel.columnWeights = new double[] { 0.0, 0.0, 0.0,
						Double.MIN_VALUE };
				gbl_panel.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0,
						0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
						Double.MIN_VALUE };
				panel.setLayout(gbl_panel);
				{
					chckbxRemoveEsaBackground = new JCheckBox(
							"Remove ESA Background");
					chckbxRemoveEsaBackground
							.addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent arg0) {
									// Create a new undo action
									// Save our current state in a final boolean
									// so it is accessible in the inner class
									// below
									final boolean curState = chckbxRemoveEsaBackground
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
											chckbxRemoveEsaBackground
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
											chckbxRemoveEsaBackground
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
					chckbxRemoveEsaBackground.setSelected(true);
					GridBagConstraints gbc_chckbxRemoveEsaBackground = new GridBagConstraints();
					gbc_chckbxRemoveEsaBackground.anchor = GridBagConstraints.WEST;
					gbc_chckbxRemoveEsaBackground.insets = new Insets(0, 0, 5,
							5);
					gbc_chckbxRemoveEsaBackground.gridx = 0;
					gbc_chckbxRemoveEsaBackground.gridy = 0;
					panel.add(chckbxRemoveEsaBackground,
							gbc_chckbxRemoveEsaBackground);
				}
				{
					JLabel lblType = new JLabel("Type:");
					GridBagConstraints gbc_lblType = new GridBagConstraints();
					gbc_lblType.insets = new Insets(0, 0, 5, 5);
					gbc_lblType.anchor = GridBagConstraints.EAST;
					gbc_lblType.gridx = 0;
					gbc_lblType.gridy = 1;
					panel.add(lblType, gbc_lblType);
				}
				{
					String[] str = { "Anode", "Angle", "Omni" };
					JComboBox comboBox = new JComboBox(str);
					GridBagConstraints gbc_comboBox = new GridBagConstraints();
					gbc_comboBox.insets = new Insets(0, 0, 5, 5);
					gbc_comboBox.fill = GridBagConstraints.HORIZONTAL;
					gbc_comboBox.gridx = 1;
					gbc_comboBox.gridy = 1;
					panel.add(comboBox, gbc_comboBox);
				}
				{
					JLabel lblNumberOfPoints = new JLabel("Number of Points:");
					GridBagConstraints gbc_lblNumberOfPoints = new GridBagConstraints();
					gbc_lblNumberOfPoints.gridheight = 2;
					gbc_lblNumberOfPoints.insets = new Insets(0, 0, 5, 5);
					gbc_lblNumberOfPoints.anchor = GridBagConstraints.EAST;
					gbc_lblNumberOfPoints.gridx = 0;
					gbc_lblNumberOfPoints.gridy = 2;
					panel.add(lblNumberOfPoints, gbc_lblNumberOfPoints);
				}
				{
					textField_16 = new JTextField();
					textField_16.setText("3");
					GridBagConstraints gbc_textField_15 = new GridBagConstraints();
					gbc_textField_15.gridheight = 2;
					gbc_textField_15.insets = new Insets(0, 0, 5, 5);
					gbc_textField_15.fill = GridBagConstraints.HORIZONTAL;
					gbc_textField_15.gridx = 1;
					gbc_textField_15.gridy = 2;
					panel.add(textField_16, gbc_textField_15);
					textField_16.setColumns(10);
				}
				{
					JButton button = new JButton("");

					button.setIcon(icons1.getImageIcon("icons/arrow-3-up8.png"));

					GridBagConstraints gbc_button = new GridBagConstraints();
					gbc_button.insets = new Insets(0, 0, 5, 0);
					gbc_button.gridx = 2;
					gbc_button.gridy = 2;
					panel.add(button, gbc_button);
				}
				{
					JLabel lblScaling = new JLabel("Scaling:");
					GridBagConstraints gbc_lblScaling = new GridBagConstraints();
					gbc_lblScaling.gridheight = 2;
					gbc_lblScaling.insets = new Insets(0, 0, 5, 5);
					gbc_lblScaling.anchor = GridBagConstraints.EAST;
					gbc_lblScaling.gridx = 0;
					gbc_lblScaling.gridy = 4;
					panel.add(lblScaling, gbc_lblScaling);
				}
				{
					textField_15 = new JTextField();
					textField_15.setText("1");
					GridBagConstraints gbc_textField_14 = new GridBagConstraints();
					gbc_textField_14.gridheight = 2;
					gbc_textField_14.insets = new Insets(0, 0, 5, 5);
					gbc_textField_14.fill = GridBagConstraints.HORIZONTAL;
					gbc_textField_14.gridx = 1;
					gbc_textField_14.gridy = 4;
					panel.add(textField_15, gbc_textField_14);
					textField_15.setColumns(10);
				}
				{
					JButton button = new JButton("");

					button.setIcon(icons1.getImageIcon("icons/arrow-3-down8.png"));

					GridBagConstraints gbc_button = new GridBagConstraints();
					gbc_button.insets = new Insets(0, 0, 5, 0);
					gbc_button.gridx = 2;
					gbc_button.gridy = 3;
					panel.add(button, gbc_button);
				}
				{
					JButton button = new JButton("");

					button.setIcon(icons1.getImageIcon("icons/arrow-3-up8.png"));

					GridBagConstraints gbc_button = new GridBagConstraints();
					gbc_button.insets = new Insets(0, 0, 5, 0);
					gbc_button.gridx = 2;
					gbc_button.gridy = 4;
					panel.add(button, gbc_button);
				}
				{
					chckbxRemoveSstMask = new JCheckBox("Remove SST Mask");
					chckbxRemoveSstMask.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent arg0) {
							// Create a new undo action
							// Save our current state in a final boolean so it
							// is accessible in the inner class below
							final boolean curState = chckbxRemoveSstMask
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
									chckbxRemoveSstMask.setSelected(curState);

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
									chckbxRemoveSstMask.setSelected(!curState);

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
					GridBagConstraints gbc_chckbxRemoveSstMask = new GridBagConstraints();
					gbc_chckbxRemoveSstMask.gridheight = 2;
					gbc_chckbxRemoveSstMask.anchor = GridBagConstraints.WEST;
					gbc_chckbxRemoveSstMask.insets = new Insets(0, 0, 5, 5);
					gbc_chckbxRemoveSstMask.gridx = 0;
					gbc_chckbxRemoveSstMask.gridy = 6;
					panel.add(chckbxRemoveSstMask, gbc_chckbxRemoveSstMask);
				}
				{
					textField_17 = new JTextField();
					textField_17.setText("0.999000");
					GridBagConstraints gbc_textField_16 = new GridBagConstraints();
					gbc_textField_16.gridheight = 2;
					gbc_textField_16.insets = new Insets(0, 0, 5, 5);
					gbc_textField_16.fill = GridBagConstraints.HORIZONTAL;
					gbc_textField_16.gridx = 1;
					gbc_textField_16.gridy = 6;
					panel.add(textField_17, gbc_textField_16);
					textField_17.setColumns(10);
				}
				{
					JButton button = new JButton("");

					button.setIcon(icons1.getImageIcon("icons/arrow-3-down8.png"));

					GridBagConstraints gbc_button = new GridBagConstraints();
					gbc_button.insets = new Insets(0, 0, 5, 0);
					gbc_button.gridx = 2;
					gbc_button.gridy = 5;
					panel.add(button, gbc_button);
				}
				{
					chckbxRemoveSstContamination = new JCheckBox(
							"Remove SST Contamination");
					chckbxRemoveSstContamination
							.addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent arg0) {
									// Create a new undo action
									// Save our current state in a final boolean
									// so it is accessible in the inner class
									// below
									final boolean curState = chckbxRemoveSstContamination
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
											chckbxRemoveSstContamination
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
											chckbxRemoveSstContamination
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
					GridBagConstraints gbc_chckbxRemoveSstContamination = new GridBagConstraints();
					gbc_chckbxRemoveSstContamination.anchor = GridBagConstraints.WEST;
					gbc_chckbxRemoveSstContamination.insets = new Insets(0, 0,
							5, 5);
					gbc_chckbxRemoveSstContamination.gridx = 0;
					gbc_chckbxRemoveSstContamination.gridy = 8;
					panel.add(chckbxRemoveSstContamination,
							gbc_chckbxRemoveSstContamination);
				}
				{
					JButton button = new JButton("");

					button.setIcon(icons1.getImageIcon("icons/arrow-3-up8.png"));

					GridBagConstraints gbc_button = new GridBagConstraints();
					gbc_button.insets = new Insets(0, 0, 5, 0);
					gbc_button.gridx = 2;
					gbc_button.gridy = 6;
					panel.add(button, gbc_button);
				}
				{
					JLabel lblMethod = new JLabel("Method:");
					GridBagConstraints gbc_lblMethod = new GridBagConstraints();
					gbc_lblMethod.anchor = GridBagConstraints.WEST;
					gbc_lblMethod.insets = new Insets(0, 0, 5, 5);
					gbc_lblMethod.gridx = 0;
					gbc_lblMethod.gridy = 9;
					panel.add(lblMethod, gbc_lblMethod);
				}
				{
					String[] str = { "median", "spinfit", "z_score_mod" };

					JComboBox comboBox = new JComboBox(str);
					GridBagConstraints gbc_comboBox = new GridBagConstraints();
					gbc_comboBox.insets = new Insets(0, 0, 5, 5);
					gbc_comboBox.fill = GridBagConstraints.HORIZONTAL;
					gbc_comboBox.gridx = 1;
					gbc_comboBox.gridy = 9;
					panel.add(comboBox, gbc_comboBox);
				}
				{
					JButton button = new JButton("");
					button.setIcon(icons1.getImageIcon("icons/arrow-3-down8.png"));

					GridBagConstraints gbc_button = new GridBagConstraints();
					gbc_button.insets = new Insets(0, 0, 5, 0);
					gbc_button.gridx = 2;
					gbc_button.gridy = 7;
					panel.add(button, gbc_button);
				}
				{
					JLabel lblFillMethod = new JLabel("Fill Method:");
					GridBagConstraints gbc_lblFillMethod = new GridBagConstraints();
					gbc_lblFillMethod.anchor = GridBagConstraints.WEST;
					gbc_lblFillMethod.insets = new Insets(0, 0, 5, 5);
					gbc_lblFillMethod.gridx = 0;
					gbc_lblFillMethod.gridy = 10;
					panel.add(lblFillMethod, gbc_lblFillMethod);
				}
				{
					String[] str = { "Interpolation", "Spin Fit" };

					JComboBox comboBox = new JComboBox(str);
					GridBagConstraints gbc_comboBox = new GridBagConstraints();
					gbc_comboBox.insets = new Insets(0, 0, 5, 5);
					gbc_comboBox.fill = GridBagConstraints.HORIZONTAL;
					gbc_comboBox.gridx = 1;
					gbc_comboBox.gridy = 10;
					panel.add(comboBox, gbc_comboBox);
				}
				{
					JLabel lblTelorancestdv = new JLabel("Telorance (stdv):");
					GridBagConstraints gbc_lblTelorancestdv = new GridBagConstraints();
					gbc_lblTelorancestdv.gridheight = 2;
					gbc_lblTelorancestdv.anchor = GridBagConstraints.EAST;
					gbc_lblTelorancestdv.insets = new Insets(0, 0, 5, 5);
					gbc_lblTelorancestdv.gridx = 0;
					gbc_lblTelorancestdv.gridy = 11;
					panel.add(lblTelorancestdv, gbc_lblTelorancestdv);
				}
				{
					textField_18 = new JTextField();
					textField_18.setText("1.799999");
					GridBagConstraints gbc_textField_17 = new GridBagConstraints();
					gbc_textField_17.gridheight = 2;
					gbc_textField_17.insets = new Insets(0, 0, 5, 5);
					gbc_textField_17.fill = GridBagConstraints.HORIZONTAL;
					gbc_textField_17.gridx = 1;
					gbc_textField_17.gridy = 11;
					panel.add(textField_18, gbc_textField_17);
					textField_18.setColumns(10);
				}
				{
					JButton button = new JButton("");

					button.setIcon(icons1.getImageIcon("icons/arrow-3-up8.png"));

					GridBagConstraints gbc_button = new GridBagConstraints();
					gbc_button.insets = new Insets(0, 0, 5, 0);
					gbc_button.gridx = 2;
					gbc_button.gridy = 11;
					panel.add(button, gbc_button);
				}
				{
					JButton button = new JButton("");
					button.setIcon(icons1.getImageIcon("icons/arrow-3-down8.png"));

					GridBagConstraints gbc_button = new GridBagConstraints();
					gbc_button.insets = new Insets(0, 0, 5, 0);
					gbc_button.gridx = 2;
					gbc_button.gridy = 12;
					panel.add(button, gbc_button);
				}
				{
					JLabel lblNoSlicesLoaded = new JLabel("No slices loaded.");
					GridBagConstraints gbc_lblNoSlicesLoaded = new GridBagConstraints();
					gbc_lblNoSlicesLoaded.insets = new Insets(0, 0, 0, 5);
					gbc_lblNoSlicesLoaded.gridx = 1;
					gbc_lblNoSlicesLoaded.gridy = 15;
					panel.add(lblNoSlicesLoaded, gbc_lblNoSlicesLoaded);
				}
			}
			{
				JPanel panel = new JPanel();
				tabbedPane.addTab("Plot Options", null, panel, null);
				GridBagLayout gbl_panel = new GridBagLayout();
				gbl_panel.columnWidths = new int[] { 0, 0, 0, 0, 0 };
				gbl_panel.rowHeights = new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0,
						0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
				gbl_panel.columnWeights = new double[] { 0.0, 0.0, 0.0, 0.0,
						Double.MIN_VALUE };
				gbl_panel.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0,
						0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
						0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
						Double.MIN_VALUE };
				panel.setLayout(gbl_panel);
				{
					JLabel lblNumberOfColor = new JLabel(
							"Number of Color Contour Levels:");
					GridBagConstraints gbc_lblNumberOfColor = new GridBagConstraints();
					gbc_lblNumberOfColor.gridheight = 2;
					gbc_lblNumberOfColor.insets = new Insets(0, 0, 5, 5);
					gbc_lblNumberOfColor.anchor = GridBagConstraints.EAST;
					gbc_lblNumberOfColor.gridx = 0;
					gbc_lblNumberOfColor.gridy = 0;
					panel.add(lblNumberOfColor, gbc_lblNumberOfColor);
				}
				{
					textField_18 = new JTextField();
					textField_18.setText("60");
					GridBagConstraints gbc_textField_18 = new GridBagConstraints();
					gbc_textField_18.gridheight = 2;
					gbc_textField_18.insets = new Insets(0, 0, 5, 5);
					gbc_textField_18.fill = GridBagConstraints.HORIZONTAL;
					gbc_textField_18.gridx = 1;
					gbc_textField_18.gridy = 0;
					panel.add(textField_18, gbc_textField_18);
					textField_18.setColumns(10);
				}
				{
					JButton button = new JButton("");

					button.setIcon(icons1.getImageIcon("icons/arrow-3-up8.png"));

					GridBagConstraints gbc_button = new GridBagConstraints();
					gbc_button.insets = new Insets(0, 0, 5, 0);
					gbc_button.gridx = 2;
					gbc_button.gridy = 0;
					panel.add(button, gbc_button);
				}
				{
					chckbxPlotContourLines = new JCheckBox("Plot Contour Lines");
					chckbxPlotContourLines
							.addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent arg0) {
									// Create a new undo action
									// Save our current state in a final boolean
									// so it is accessible in the inner class
									// below
									final boolean curState = chckbxPlotContourLines
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
											chckbxPlotContourLines
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
											chckbxPlotContourLines
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
					GridBagConstraints gbc_chckbxPlotContourLines = new GridBagConstraints();
					gbc_chckbxPlotContourLines.gridheight = 2;
					gbc_chckbxPlotContourLines.anchor = GridBagConstraints.WEST;
					gbc_chckbxPlotContourLines.insets = new Insets(0, 0, 5, 5);
					gbc_chckbxPlotContourLines.gridx = 0;
					gbc_chckbxPlotContourLines.gridy = 2;
					panel.add(chckbxPlotContourLines,
							gbc_chckbxPlotContourLines);
				}
				{
					JButton button = new JButton("");

					button.setIcon(icons1.getImageIcon("icons/arrow-3-down8.png"));

					GridBagConstraints gbc_button = new GridBagConstraints();
					gbc_button.insets = new Insets(0, 0, 5, 0);
					gbc_button.gridx = 2;
					gbc_button.gridy = 1;
					panel.add(button, gbc_button);
				}
				{
					JLabel lblNumberOfContour = new JLabel(
							"Number of Contour Levels:");
					GridBagConstraints gbc_lblNumberOfContour = new GridBagConstraints();
					gbc_lblNumberOfContour.gridheight = 2;
					gbc_lblNumberOfContour.insets = new Insets(0, 0, 5, 5);
					gbc_lblNumberOfContour.gridx = 1;
					gbc_lblNumberOfContour.gridy = 2;
					panel.add(lblNumberOfContour, gbc_lblNumberOfContour);
				}
				{
					JButton button = new JButton("");

					button.setIcon(icons1.getImageIcon("icons/arrow-3-up8.png"));

					GridBagConstraints gbc_button = new GridBagConstraints();
					gbc_button.insets = new Insets(0, 0, 5, 0);
					gbc_button.gridx = 2;
					gbc_button.gridy = 2;
					panel.add(button, gbc_button);
				}
				{
					JButton btnNewButton_3 = new JButton("");
					
					btnNewButton_3.setIcon(icons1.getImageIcon("icons/arrow-3-down8.png"));

					GridBagConstraints gbc_btnNewButton_3 = new GridBagConstraints();
					gbc_btnNewButton_3.insets = new Insets(0, 0, 5, 0);
					gbc_btnNewButton_3.gridx = 2;
					gbc_btnNewButton_3.gridy = 3;
					panel.add(btnNewButton_3, gbc_btnNewButton_3);
				}
				{
					JLabel lblMaxunits = new JLabel("Max (units):");
					GridBagConstraints gbc_lblMaxunits = new GridBagConstraints();
					gbc_lblMaxunits.gridheight = 2;
					gbc_lblMaxunits.anchor = GridBagConstraints.WEST;
					gbc_lblMaxunits.insets = new Insets(0, 0, 5, 5);
					gbc_lblMaxunits.gridx = 1;
					gbc_lblMaxunits.gridy = 4;
					panel.add(lblMaxunits, gbc_lblMaxunits);
				}
				{
					JButton btnNewButton_4 = new JButton("");

					btnNewButton_4.setIcon(icons1.getImageIcon("icons/arrow-3-up8.png"));

					GridBagConstraints gbc_btnNewButton_4 = new GridBagConstraints();
					gbc_btnNewButton_4.insets = new Insets(0, 0, 5, 0);
					gbc_btnNewButton_4.gridx = 2;
					gbc_btnNewButton_4.gridy = 4;
					panel.add(btnNewButton_4, gbc_btnNewButton_4);
				}
				{
					chckbxAutorange = new JCheckBox("Autorange (2)");
					chckbxAutorange.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent arg0) {
							// Create a new undo action
							// Save our current state in a final boolean so it
							// is accessible in the inner class below
							final boolean curState = chckbxAutorange
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
									chckbxAutorange.setSelected(curState);

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
									chckbxAutorange.setSelected(!curState);

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
					GridBagConstraints gbc_chckbxAutorange = new GridBagConstraints();
					gbc_chckbxAutorange.gridheight = 4;
					gbc_chckbxAutorange.anchor = GridBagConstraints.WEST;
					gbc_chckbxAutorange.insets = new Insets(0, 0, 5, 5);
					gbc_chckbxAutorange.gridx = 0;
					gbc_chckbxAutorange.gridy = 4;
					panel.add(chckbxAutorange, gbc_chckbxAutorange);
				}
				{
					JButton button = new JButton("");

					button.setIcon(icons1.getImageIcon("icons/arrow-3-down8.png"));

					GridBagConstraints gbc_button = new GridBagConstraints();
					gbc_button.insets = new Insets(0, 0, 5, 0);
					gbc_button.gridx = 2;
					gbc_button.gridy = 5;
					panel.add(button, gbc_button);
				}
				{
					chckbxAutorangexy = new JCheckBox("Autorange (X,Y)");
					chckbxAutorangexy.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent arg0) {
							// Create a new undo action
							// Save our current state in a final boolean so it
							// is accessible in the inner class below
							final boolean curState = chckbxAutorangexy
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
									chckbxAutorangexy.setSelected(curState);

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
									chckbxAutorangexy.setSelected(!curState);

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
					GridBagConstraints gbc_chckbxAutorangexy = new GridBagConstraints();
					gbc_chckbxAutorangexy.gridheight = 4;
					gbc_chckbxAutorangexy.anchor = GridBagConstraints.WEST;
					gbc_chckbxAutorangexy.insets = new Insets(0, 0, 5, 5);
					gbc_chckbxAutorangexy.gridx = 0;
					gbc_chckbxAutorangexy.gridy = 8;
					panel.add(chckbxAutorangexy, gbc_chckbxAutorangexy);
				}
				{
					JLabel lblMinunits = new JLabel("Min (units):");
					GridBagConstraints gbc_lblMinunits = new GridBagConstraints();
					gbc_lblMinunits.gridheight = 2;
					gbc_lblMinunits.anchor = GridBagConstraints.WEST;
					gbc_lblMinunits.insets = new Insets(0, 0, 5, 5);
					gbc_lblMinunits.gridx = 1;
					gbc_lblMinunits.gridy = 6;
					panel.add(lblMinunits, gbc_lblMinunits);
				}
				{
					JButton button = new JButton("");
					
					button.setIcon(icons1.getImageIcon("icons/arrow-3-up8.png"));

					GridBagConstraints gbc_button = new GridBagConstraints();
					gbc_button.insets = new Insets(0, 0, 5, 0);
					gbc_button.gridx = 2;
					gbc_button.gridy = 6;
					panel.add(button, gbc_button);
				}
				{
					JButton button = new JButton("");

					button.setIcon(icons1.getImageIcon("icons/arrow-3-down8.png"));

					GridBagConstraints gbc_button = new GridBagConstraints();
					gbc_button.insets = new Insets(0, 0, 5, 0);
					gbc_button.gridx = 2;
					gbc_button.gridy = 7;
					panel.add(button, gbc_button);
				}
				{
					JLabel lblMaxkms = new JLabel("Max (km/s)");
					GridBagConstraints gbc_lblMaxkms = new GridBagConstraints();
					gbc_lblMaxkms.gridheight = 2;
					gbc_lblMaxkms.anchor = GridBagConstraints.WEST;
					gbc_lblMaxkms.insets = new Insets(0, 0, 5, 5);
					gbc_lblMaxkms.gridx = 1;
					gbc_lblMaxkms.gridy = 8;
					panel.add(lblMaxkms, gbc_lblMaxkms);
				}
				{
					JButton button = new JButton("");

					button.setIcon(icons1.getImageIcon("icons/arrow-3-up8.png"));

					GridBagConstraints gbc_button = new GridBagConstraints();
					gbc_button.insets = new Insets(0, 0, 5, 0);
					gbc_button.gridx = 2;
					gbc_button.gridy = 8;
					panel.add(button, gbc_button);
				}
				{
					JLabel lblMinkms = new JLabel("Min (km/s)");
					GridBagConstraints gbc_lblMinkms = new GridBagConstraints();
					gbc_lblMinkms.gridheight = 2;
					gbc_lblMinkms.anchor = GridBagConstraints.WEST;
					gbc_lblMinkms.insets = new Insets(0, 0, 5, 5);
					gbc_lblMinkms.gridx = 1;
					gbc_lblMinkms.gridy = 10;
					panel.add(lblMinkms, gbc_lblMinkms);
				}
				{
					JButton button = new JButton("");

					button.setIcon(icons1.getImageIcon("icons/arrow-3-down8.png"));

					GridBagConstraints gbc_button = new GridBagConstraints();
					gbc_button.insets = new Insets(0, 0, 5, 0);
					gbc_button.gridx = 2;
					gbc_button.gridy = 9;
					panel.add(button, gbc_button);
				}
				{
					JButton button = new JButton("");

					button.setIcon(icons1.getImageIcon("icons/arrow-3-up8.png"));

					GridBagConstraints gbc_button = new GridBagConstraints();
					gbc_button.insets = new Insets(0, 0, 5, 0);
					gbc_button.gridx = 2;
					gbc_button.gridy = 10;
					panel.add(button, gbc_button);
				}
				{
					JButton btnNewButton_5 = new JButton("");

					btnNewButton_5.setIcon(icons1.getImageIcon("icons/arrow-3-down8.png"));

					GridBagConstraints gbc_btnNewButton_5 = new GridBagConstraints();
					gbc_btnNewButton_5.insets = new Insets(0, 0, 5, 0);
					gbc_btnNewButton_5.gridx = 2;
					gbc_btnNewButton_5.gridy = 11;
					panel.add(btnNewButton_5, gbc_btnNewButton_5);
				}
				{
					chckbxLogarithmicPlot = new JCheckBox("Logarithmic Plot");
					chckbxLogarithmicPlot
							.addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent arg0) {
									// Create a new undo action
									// Save our current state in a final boolean
									// so it is accessible in the inner class
									// below
									final boolean curState = chckbxLogarithmicPlot
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
											chckbxLogarithmicPlot
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
											chckbxLogarithmicPlot
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
					GridBagConstraints gbc_chckbxLogarithmicPlot = new GridBagConstraints();
					gbc_chckbxLogarithmicPlot.anchor = GridBagConstraints.WEST;
					gbc_chckbxLogarithmicPlot.insets = new Insets(0, 0, 5, 5);
					gbc_chckbxLogarithmicPlot.gridx = 0;
					gbc_chckbxLogarithmicPlot.gridy = 12;
					panel.add(chckbxLogarithmicPlot, gbc_chckbxLogarithmicPlot);
				}
				{
					chckbxPlotAxes = new JCheckBox("Plot Axes");
					chckbxPlotAxes.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent arg0) {
							// Create a new undo action
							// Save our current state in a final boolean so it
							// is accessible in the inner class below
							final boolean curState = chckbxPlotAxes
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
									chckbxPlotAxes.setSelected(curState);

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
									chckbxPlotAxes.setSelected(!curState);

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
					GridBagConstraints gbc_chckbxPlotAxes = new GridBagConstraints();
					gbc_chckbxPlotAxes.anchor = GridBagConstraints.WEST;
					gbc_chckbxPlotAxes.insets = new Insets(0, 0, 5, 5);
					gbc_chckbxPlotAxes.gridx = 1;
					gbc_chckbxPlotAxes.gridy = 12;
					panel.add(chckbxPlotAxes, gbc_chckbxPlotAxes);
				}
				{
					chckbxPlotSunDirection = new JCheckBox("Plot Sun Direction");
					chckbxPlotSunDirection
							.addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent arg0) {
									// Create a new undo action
									// Save our current state in a final boolean
									// so it is accessible in the inner class
									// below
									final boolean curState = chckbxPlotSunDirection
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
											chckbxPlotSunDirection
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
											chckbxPlotSunDirection
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
					GridBagConstraints gbc_chckbxPlotSunDirection = new GridBagConstraints();
					gbc_chckbxPlotSunDirection.anchor = GridBagConstraints.WEST;
					gbc_chckbxPlotSunDirection.insets = new Insets(0, 0, 5, 5);
					gbc_chckbxPlotSunDirection.gridx = 0;
					gbc_chckbxPlotSunDirection.gridy = 13;
					panel.add(chckbxPlotSunDirection,
							gbc_chckbxPlotSunDirection);
				}
				{
					chckbxDrawEnergyLimits = new JCheckBox("Draw Energy Limits");
					chckbxDrawEnergyLimits
							.addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent arg0) {
									// Create a new undo action
									// Save our current state in a final boolean
									// so it is accessible in the inner class
									// below
									final boolean curState = chckbxDrawEnergyLimits
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
											chckbxDrawEnergyLimits
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
											chckbxDrawEnergyLimits
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
					GridBagConstraints gbc_chckbxDrawEnergyLimits = new GridBagConstraints();
					gbc_chckbxDrawEnergyLimits.anchor = GridBagConstraints.WEST;
					gbc_chckbxDrawEnergyLimits.insets = new Insets(0, 0, 5, 5);
					gbc_chckbxDrawEnergyLimits.gridx = 1;
					gbc_chckbxDrawEnergyLimits.gridy = 13;
					panel.add(chckbxDrawEnergyLimits,
							gbc_chckbxDrawEnergyLimits);
				}
				{
					chckbxPlotBulkVelocity = new JCheckBox("Plot Bulk Velocity");
					chckbxPlotBulkVelocity
							.addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent arg0) {
									// Create a new undo action
									// Save our current state in a final boolean
									// so it is accessible in the inner class
									// below
									final boolean curState = chckbxPlotBulkVelocity
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
											chckbxPlotBulkVelocity
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
											chckbxPlotBulkVelocity
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
					GridBagConstraints gbc_chckbxPlotBulkVelocity = new GridBagConstraints();
					gbc_chckbxPlotBulkVelocity.anchor = GridBagConstraints.WEST;
					gbc_chckbxPlotBulkVelocity.insets = new Insets(0, 0, 5, 5);
					gbc_chckbxPlotBulkVelocity.gridx = 0;
					gbc_chckbxPlotBulkVelocity.gridy = 14;
					panel.add(chckbxPlotBulkVelocity,
							gbc_chckbxPlotBulkVelocity);
				}
				{
					chckbxLabelContourLines = new JCheckBox(
							"Label Contour Lines");
					chckbxLabelContourLines
							.addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent arg0) {
									// Create a new undo action
									// Save our current state in a final boolean
									// so it is accessible in the inner class
									// below
									final boolean curState = chckbxLabelContourLines
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
											chckbxLabelContourLines
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
											chckbxLabelContourLines
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
					GridBagConstraints gbc_chckbxLabelContourLines = new GridBagConstraints();
					gbc_chckbxLabelContourLines.anchor = GridBagConstraints.WEST;
					gbc_chckbxLabelContourLines.insets = new Insets(0, 0, 5, 5);
					gbc_chckbxLabelContourLines.gridx = 1;
					gbc_chckbxLabelContourLines.gridy = 14;
					panel.add(chckbxLabelContourLines,
							gbc_chckbxLabelContourLines);
				}
				{
					JLabel lblAnnotations = new JLabel("Annotations");
					GridBagConstraints gbc_lblAnnotations = new GridBagConstraints();
					gbc_lblAnnotations.anchor = GridBagConstraints.WEST;
					gbc_lblAnnotations.insets = new Insets(0, 0, 5, 5);
					gbc_lblAnnotations.gridx = 0;
					gbc_lblAnnotations.gridy = 16;
					panel.add(lblAnnotations, gbc_lblAnnotations);
				}
				{
					JLabel lblSpecifyNumberOf = new JLabel(
							"Specify Number of Ticks");
					GridBagConstraints gbc_lblSpecifyNumberOf = new GridBagConstraints();
					gbc_lblSpecifyNumberOf.insets = new Insets(0, 0, 5, 0);
					gbc_lblSpecifyNumberOf.gridx = 2;
					gbc_lblSpecifyNumberOf.gridy = 16;
					panel.add(lblSpecifyNumberOf, gbc_lblSpecifyNumberOf);
				}
				{
					JLabel lblPrecision = new JLabel("Precision:");
					GridBagConstraints gbc_lblPrecision = new GridBagConstraints();
					gbc_lblPrecision.anchor = GridBagConstraints.WEST;
					gbc_lblPrecision.insets = new Insets(0, 0, 5, 5);
					gbc_lblPrecision.gridx = 0;
					gbc_lblPrecision.gridy = 17;
					panel.add(lblPrecision, gbc_lblPrecision);
				}
				{
					JComboBox comboBox = new JComboBox();
					GridBagConstraints gbc_comboBox = new GridBagConstraints();
					gbc_comboBox.insets = new Insets(0, 0, 5, 5);
					gbc_comboBox.fill = GridBagConstraints.HORIZONTAL;
					gbc_comboBox.gridx = 1;
					gbc_comboBox.gridy = 17;
					panel.add(comboBox, gbc_comboBox);
				}
				{
					JLabel lblSize = new JLabel("Size:");
					GridBagConstraints gbc_lblSize = new GridBagConstraints();
					gbc_lblSize.anchor = GridBagConstraints.WEST;
					gbc_lblSize.insets = new Insets(0, 0, 5, 5);
					gbc_lblSize.gridx = 0;
					gbc_lblSize.gridy = 18;
					panel.add(lblSize, gbc_lblSize);
				}
				{
					textField_23 = new JTextField();
					textField_23.setText("100");
					GridBagConstraints gbc_textField_19 = new GridBagConstraints();
					gbc_textField_19.insets = new Insets(0, 0, 5, 5);
					gbc_textField_19.fill = GridBagConstraints.HORIZONTAL;
					gbc_textField_19.gridx = 1;
					gbc_textField_19.gridy = 18;
					panel.add(textField_23, gbc_textField_19);
					textField_23.setColumns(10);
				}

				ButtonGroup buttonGroup = new ButtonGroup();
				{
					JRadioButton rdbtnAutomatic = new JRadioButton("Automatic");
					rdbtnAutomatic.setSelected(true);
					GridBagConstraints gbc_rdbtnAutomatic = new GridBagConstraints();
					gbc_rdbtnAutomatic.anchor = GridBagConstraints.WEST;
					gbc_rdbtnAutomatic.insets = new Insets(0, 0, 5, 5);
					gbc_rdbtnAutomatic.gridx = 0;
					gbc_rdbtnAutomatic.gridy = 19;
					panel.add(rdbtnAutomatic, gbc_rdbtnAutomatic);

					buttonGroup.add(rdbtnAutomatic);
				}

				{
					textField_20 = new JTextField();
					textField_20.setText("4");
					GridBagConstraints gbc_textField_20 = new GridBagConstraints();
					gbc_textField_20.insets = new Insets(0, 0, 5, 5);
					gbc_textField_20.fill = GridBagConstraints.HORIZONTAL;
					gbc_textField_20.gridx = 3;
					gbc_textField_20.gridy = 19;
					panel.add(textField_20, gbc_textField_20);
					textField_20.setColumns(10);
				}
				{
					JRadioButton rdbtnDecimalNotation = new JRadioButton(
							"Decimal Notation");
					GridBagConstraints gbc_rdbtnDecimalNotation = new GridBagConstraints();
					gbc_rdbtnDecimalNotation.anchor = GridBagConstraints.WEST;
					gbc_rdbtnDecimalNotation.insets = new Insets(0, 0, 5, 5);
					gbc_rdbtnDecimalNotation.gridx = 0;
					gbc_rdbtnDecimalNotation.gridy = 20;
					panel.add(rdbtnDecimalNotation, gbc_rdbtnDecimalNotation);

					buttonGroup.add(rdbtnDecimalNotation);
				}
				{
					textField_21 = new JTextField();
					textField_21.setText("4");
					GridBagConstraints gbc_textField_21 = new GridBagConstraints();
					gbc_textField_21.insets = new Insets(0, 0, 5, 5);
					gbc_textField_21.fill = GridBagConstraints.HORIZONTAL;
					gbc_textField_21.gridx = 3;
					gbc_textField_21.gridy = 20;
					panel.add(textField_21, gbc_textField_21);
					textField_21.setColumns(10);
				}
				{
					JRadioButton rdbtnScientificNotation = new JRadioButton(
							"Scientific Notation");
					GridBagConstraints gbc_rdbtnScientificNotation = new GridBagConstraints();
					gbc_rdbtnScientificNotation.anchor = GridBagConstraints.WEST;
					gbc_rdbtnScientificNotation.insets = new Insets(0, 0, 5, 5);
					gbc_rdbtnScientificNotation.gridx = 0;
					gbc_rdbtnScientificNotation.gridy = 21;
					panel.add(rdbtnScientificNotation,
							gbc_rdbtnScientificNotation);

					buttonGroup.add(rdbtnScientificNotation);
				}
				{
					textField_22 = new JTextField();
					textField_22.setText("11");
					GridBagConstraints gbc_textField_22 = new GridBagConstraints();
					gbc_textField_22.insets = new Insets(0, 0, 5, 5);
					gbc_textField_22.fill = GridBagConstraints.HORIZONTAL;
					gbc_textField_22.gridx = 3;
					gbc_textField_22.gridy = 21;
					panel.add(textField_22, gbc_textField_22);
					textField_22.setColumns(10);
				}
				{
					chckbxXaxis = new JCheckBox("X-Axis:");
					chckbxXaxis.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent arg0) {
							// Create a new undo action
							// Save our current state in a final boolean so it
							// is accessible in the inner class below
							final boolean curState = chckbxXaxis.isSelected();
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
									chckbxXaxis.setSelected(curState);

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
									chckbxXaxis.setSelected(!curState);

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
					GridBagConstraints gbc_chckbxXaxis = new GridBagConstraints();
					gbc_chckbxXaxis.insets = new Insets(0, 0, 5, 0);
					gbc_chckbxXaxis.gridx = 2;
					gbc_chckbxXaxis.gridy = 17;
					panel.add(chckbxXaxis, gbc_chckbxXaxis);
				}
				{
					chckbxYaxis = new JCheckBox("Y-Axis:");
					chckbxYaxis.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent arg0) {
							// Create a new undo action
							// Save our current state in a final boolean so it
							// is accessible in the inner class below
							final boolean curState = chckbxYaxis.isSelected();
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
									chckbxYaxis.setSelected(curState);

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
									chckbxYaxis.setSelected(!curState);

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
					GridBagConstraints gbc_chckbxYaxis = new GridBagConstraints();
					gbc_chckbxYaxis.insets = new Insets(0, 0, 5, 0);
					gbc_chckbxYaxis.gridx = 2;
					gbc_chckbxYaxis.gridy = 18;
					panel.add(chckbxYaxis, gbc_chckbxYaxis);
				}
				{
					chckbxZaxis = new JCheckBox("Z-Axis:");
					chckbxZaxis.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent arg0) {
							// Create a new undo action
							// Save our current state in a final boolean so it
							// is accessible in the inner class below
							final boolean curState = chckbxZaxis.isSelected();
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
									chckbxZaxis.setSelected(curState);

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
									chckbxZaxis.setSelected(!curState);

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
					GridBagConstraints gbc_chckbxZaxis = new GridBagConstraints();
					gbc_chckbxZaxis.insets = new Insets(0, 0, 5, 0);
					gbc_chckbxZaxis.gridx = 2;
					gbc_chckbxZaxis.gridy = 19;
					panel.add(chckbxZaxis, gbc_chckbxZaxis);
				}
				{
					JButton btnReplot = new JButton("Re-Plot");
					GridBagConstraints gbc_btnReplot = new GridBagConstraints();
					gbc_btnReplot.insets = new Insets(0, 0, 5, 5);
					gbc_btnReplot.gridx = 1;
					gbc_btnReplot.gridy = 23;
					panel.add(btnReplot, gbc_btnReplot);
				}
				{
					JLabel lblNoSlicesLoaded_1 = new JLabel("No slices loaded.");
					GridBagConstraints gbc_lblNoSlicesLoaded_1 = new GridBagConstraints();
					gbc_lblNoSlicesLoaded_1.insets = new Insets(0, 0, 0, 5);
					gbc_lblNoSlicesLoaded_1.gridx = 1;
					gbc_lblNoSlicesLoaded_1.gridy = 24;
					panel.add(lblNoSlicesLoaded_1, gbc_lblNoSlicesLoaded_1);
				}
			}
			getContentPane().add(tabbedPane, BorderLayout.CENTER);
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.CENTER));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton btnGenerate = new JButton("Generate");
				btnGenerate.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						dispose();
					}
				});
				btnGenerate.setActionCommand("btnGenerate");
				btnGenerate.setName("btnGenerate");
				buttonPane.add(btnGenerate);
				getRootPane().setDefaultButton(btnGenerate);
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
				JButton btnExport = new JButton("Export");
				btnExport.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						System.out.println("Export");
					}
				});
				btnExport.setActionCommand("btnExport");
				btnExport.setName("btnExport");
				buttonPane.add(btnExport);
			}
			{
				JButton btnExportAll = new JButton("Export All");
				btnExportAll.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						System.out.println("Export All");
					}
				});
				btnExportAll.setActionCommand("btnExportAll");
				btnExportAll.setName("btnExportAll");
				buttonPane.add(btnExportAll);
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
	
	private Image getImage(String imageFileName){
		URL imageUrl = this.getClass().getClassLoader().getResource(imageFileName);
		Image image = (imageUrl != null) ? new ImageIcon(imageUrl).getImage()
		                                 : new ImageIcon(imageFileName).getImage();
		return image;
	}
	
}
