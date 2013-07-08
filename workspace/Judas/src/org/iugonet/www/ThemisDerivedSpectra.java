package org.iugonet.www;

import java.awt.GridBagLayout;

import java.awt.GridBagConstraints;
import java.awt.Insets;

import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JList;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.undo.UndoableEditSupport;

public class ThemisDerivedSpectra extends Project {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
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
	private JCheckBox chckbxUseSingleDay;

	protected UndoableEditSupport undoableEditSupport;

	public ThemisDerivedSpectra() {
		super();
		undoableEditSupport = new UndoableEditSupport(this);

		readConf(getClass().getClassLoader().getResource(
				"conf/ThemisDerivedSpectra.xml"));

		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[] { 130, 150, 0, 0, 0, 0, 0, 0, 0 };
		gridBagLayout.rowHeights = new int[] { 60, 0, 50, 0, 0, 0, 0, 0, 0, 0,
				0, 0, 0, 0, 0, 0, 0, 0, 0 };
		gridBagLayout.columnWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0,
				0.0, 0.0, 0.0, Double.MIN_VALUE };
		gridBagLayout.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
				0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0,
				Double.MIN_VALUE };
		setLayout(gridBagLayout);

		JLabel lblDataSelection = new JLabel("Data Selection:");
		GridBagConstraints gbc_lblDataSelection = new GridBagConstraints();
		gbc_lblDataSelection.gridwidth = 2;
		gbc_lblDataSelection.anchor = GridBagConstraints.WEST;
		gbc_lblDataSelection.insets = new Insets(0, 0, 5, 5);
		gbc_lblDataSelection.gridx = 0;
		gbc_lblDataSelection.gridy = 0;
		add(lblDataSelection, gbc_lblDataSelection);

		JLabel lblEnergyRange = new JLabel("Energy Range:");
		GridBagConstraints gbc_lblEnergyRange = new GridBagConstraints();
		gbc_lblEnergyRange.anchor = GridBagConstraints.WEST;
		gbc_lblEnergyRange.insets = new Insets(0, 0, 5, 5);
		gbc_lblEnergyRange.gridx = 3;
		gbc_lblEnergyRange.gridy = 0;
		add(lblEnergyRange, gbc_lblEnergyRange);

		JLabel lblAdvanced = new JLabel("Advanced:");
		GridBagConstraints gbc_lblAdvanced = new GridBagConstraints();
		gbc_lblAdvanced.anchor = GridBagConstraints.WEST;
		gbc_lblAdvanced.insets = new Insets(0, 0, 5, 0);
		gbc_lblAdvanced.gridx = 7;
		gbc_lblAdvanced.gridy = 0;
		add(lblAdvanced, gbc_lblAdvanced);

		JLabel lblStartTime_1 = new JLabel("Start Time:");
		GridBagConstraints gbc_lblStartTime_1 = new GridBagConstraints();
		gbc_lblStartTime_1.anchor = GridBagConstraints.WEST;
		gbc_lblStartTime_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblStartTime_1.gridx = 0;
		gbc_lblStartTime_1.gridy = 1;
		add(lblStartTime_1, gbc_lblStartTime_1);

		textField_3 = new JTextField();
		textField_3.setText("2007-03-23/00:00:00");
		GridBagConstraints gbc_textField_1 = new GridBagConstraints();
		gbc_textField_1.insets = new Insets(0, 0, 5, 5);
		gbc_textField_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_1.gridx = 1;
		gbc_textField_1.gridy = 1;
		add(textField_3, gbc_textField_1);
		textField_3.setColumns(10);

		JButton btnMyCalendar_1 = new JButton("");
		btnMyCalendar_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("Start Time");
				MyCalendar calendar = new MyCalendar();
				calendar.setLocationRelativeTo(null);
				calendar.setVisible(true);
			}
		});
		GridBagConstraints gbc_btnMyCalendar_1 = new GridBagConstraints();
		gbc_btnMyCalendar_1.insets = new Insets(0, 0, 5, 5);
		gbc_btnMyCalendar_1.gridx = 2;
		gbc_btnMyCalendar_1.gridy = 1;
		add(btnMyCalendar_1, gbc_btnMyCalendar_1);
		Icons icons = new Icons();
		btnMyCalendar_1.setIcon(icons.getImageIcon("icons/calendar-alt-1-20.png"));
		JLabel lblMinev = new JLabel("Min (eV):");
		GridBagConstraints gbc_lblMinev = new GridBagConstraints();
		gbc_lblMinev.anchor = GridBagConstraints.WEST;
		gbc_lblMinev.insets = new Insets(0, 0, 5, 5);
		gbc_lblMinev.gridx = 3;
		gbc_lblMinev.gridy = 1;
		add(lblMinev, gbc_lblMinev);

		textField_2 = new JTextField();
		textField_2.setText("0");
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.insets = new Insets(0, 0, 5, 5);
		gbc_textField.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField.gridx = 4;
		gbc_textField.gridy = 1;
		add(textField_2, gbc_textField);
		textField_2.setColumns(10);

		JLabel lblMaxev = new JLabel("Max (eV):");
		GridBagConstraints gbc_lblMaxev = new GridBagConstraints();
		gbc_lblMaxev.anchor = GridBagConstraints.EAST;
		gbc_lblMaxev.insets = new Insets(0, 0, 5, 5);
		gbc_lblMaxev.gridx = 5;
		gbc_lblMaxev.gridy = 1;
		add(lblMaxev, gbc_lblMaxev);

		textField_1 = new JTextField();
		textField_1.setText("1e7");
		GridBagConstraints gbc_txte = new GridBagConstraints();
		gbc_txte.insets = new Insets(0, 0, 5, 5);
		gbc_txte.fill = GridBagConstraints.HORIZONTAL;
		gbc_txte.gridx = 6;
		gbc_txte.gridy = 1;
		add(textField_1, gbc_txte);
		textField_1.setColumns(10);

		JCheckBox chckbxNormalizeTimeSamples = new JCheckBox(
				"Normalize Time Samples");
		GridBagConstraints gbc_chckbxNormalizeTimeSamples = new GridBagConstraints();
		gbc_chckbxNormalizeTimeSamples.insets = new Insets(0, 0, 5, 0);
		gbc_chckbxNormalizeTimeSamples.gridx = 7;
		gbc_chckbxNormalizeTimeSamples.gridy = 1;
		add(chckbxNormalizeTimeSamples, gbc_chckbxNormalizeTimeSamples);

		JCheckBox chckbxReturnEnergySpectrum = new JCheckBox(
				"Return Energy Spectrum");
		GridBagConstraints gbc_chckbxReturnEnergySpectrum = new GridBagConstraints();
		gbc_chckbxReturnEnergySpectrum.anchor = GridBagConstraints.WEST;
		gbc_chckbxReturnEnergySpectrum.gridwidth = 2;
		gbc_chckbxReturnEnergySpectrum.insets = new Insets(0, 0, 5, 5);
		gbc_chckbxReturnEnergySpectrum.gridx = 3;
		gbc_chckbxReturnEnergySpectrum.gridy = 2;
		add(chckbxReturnEnergySpectrum, gbc_chckbxReturnEnergySpectrum);

		JLabel lblSetMaximumGap = new JLabel("Set Maximum Gap (sec):");
		GridBagConstraints gbc_lblSetMaximumGap = new GridBagConstraints();
		gbc_lblSetMaximumGap.anchor = GridBagConstraints.WEST;
		gbc_lblSetMaximumGap.insets = new Insets(0, 0, 5, 0);
		gbc_lblSetMaximumGap.gridx = 7;
		gbc_lblSetMaximumGap.gridy = 2;
		add(lblSetMaximumGap, gbc_lblSetMaximumGap);

		chckbxUseSingleDay = new JCheckBox("Use Single Day");
		chckbxUseSingleDay.setSelected(true);
		GridBagConstraints gbc_chckbxUseSingleDay = new GridBagConstraints();
		gbc_chckbxUseSingleDay.anchor = GridBagConstraints.WEST;
		gbc_chckbxUseSingleDay.insets = new Insets(0, 0, 5, 5);
		gbc_chckbxUseSingleDay.gridx = 1;
		gbc_chckbxUseSingleDay.gridy = 3;
		add(chckbxUseSingleDay, gbc_chckbxUseSingleDay);

		JLabel lblStopTime_1 = new JLabel("Stop Time:");
		GridBagConstraints gbc_lblStopTime_1 = new GridBagConstraints();
		gbc_lblStopTime_1.anchor = GridBagConstraints.WEST;
		gbc_lblStopTime_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblStopTime_1.gridx = 0;
		gbc_lblStopTime_1.gridy = 2;
		add(lblStopTime_1, gbc_lblStopTime_1);
		if (chckbxUseSingleDay.isSelected()) {
			lblStopTime_1.setEnabled(false);
		}

		JButton btnMyCalendar_2 = new JButton("");
		btnMyCalendar_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Stop Time");
				MyCalendar calendar = new MyCalendar();
				calendar.setLocationRelativeTo(null);
				calendar.setVisible(true);
			}
		});

		if (chckbxUseSingleDay.isSelected()) {
			btnMyCalendar_2.setEnabled(false);
		}
		textField_4 = new JTextField();
		textField_4.setText("2007-03-24/00:00:00");
		GridBagConstraints gbc_textField_2 = new GridBagConstraints();
		gbc_textField_2.insets = new Insets(0, 0, 5, 5);
		gbc_textField_2.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_2.gridx = 1;
		gbc_textField_2.gridy = 2;
		add(textField_4, gbc_textField_2);
		textField_4.setColumns(10);
		GridBagConstraints gbc_btnMyCalendar_2 = new GridBagConstraints();
		gbc_btnMyCalendar_2.insets = new Insets(0, 0, 5, 5);
		gbc_btnMyCalendar_2.gridx = 2;
		gbc_btnMyCalendar_2.gridy = 2;
		add(btnMyCalendar_2, gbc_btnMyCalendar_2);
		btnMyCalendar_2.setIcon(icons.getImageIcon("icons/calendar-alt-1-20.png"));
		if (chckbxUseSingleDay.isSelected()) {
			textField_4.setEnabled(false);
		}

		JLabel lblEnergyfacOptions = new JLabel("Energy/FAC Options");
		GridBagConstraints gbc_lblEnergyfacOptions = new GridBagConstraints();
		gbc_lblEnergyfacOptions.anchor = GridBagConstraints.WEST;
		gbc_lblEnergyfacOptions.insets = new Insets(0, 0, 5, 0);
		gbc_lblEnergyfacOptions.gridx = 7;
		gbc_lblEnergyfacOptions.gridy = 3;
		add(lblEnergyfacOptions, gbc_lblEnergyfacOptions);

		JCheckBox chckbxUseBetaSst = new JCheckBox("Use Beta SST Calibrations?");
		GridBagConstraints gbc_chckbxUseBetaSst = new GridBagConstraints();
		gbc_chckbxUseBetaSst.gridwidth = 2;
		gbc_chckbxUseBetaSst.anchor = GridBagConstraints.WEST;
		gbc_chckbxUseBetaSst.insets = new Insets(0, 0, 5, 5);
		gbc_chckbxUseBetaSst.gridx = 0;
		gbc_chckbxUseBetaSst.gridy = 4;
		add(chckbxUseBetaSst, gbc_chckbxUseBetaSst);

		JLabel lblAngularDistribution = new JLabel("Angular distribution:");
		GridBagConstraints gbc_lblAngularDistribution = new GridBagConstraints();
		gbc_lblAngularDistribution.anchor = GridBagConstraints.WEST;
		gbc_lblAngularDistribution.insets = new Insets(0, 0, 5, 5);
		gbc_lblAngularDistribution.gridx = 3;
		gbc_lblAngularDistribution.gridy = 4;
		add(lblAngularDistribution, gbc_lblAngularDistribution);

		JLabel lblRegrid = new JLabel("Regrid");
		GridBagConstraints gbc_lblRegrid = new GridBagConstraints();
		gbc_lblRegrid.anchor = GridBagConstraints.WEST;
		gbc_lblRegrid.insets = new Insets(0, 0, 5, 0);
		gbc_lblRegrid.gridx = 7;
		gbc_lblRegrid.gridy = 4;
		add(lblRegrid, gbc_lblRegrid);

		JLabel label_7 = new JLabel("");
		GridBagConstraints gbc_label_7 = new GridBagConstraints();
		gbc_label_7.insets = new Insets(0, 0, 5, 5);
		gbc_label_7.gridx = 1;
		gbc_label_7.gridy = 5;
		add(label_7, gbc_label_7);

		String[] str3 = { "PHI: probe-sun dir in spin plane (deg)" };
		JComboBox comboBox = new JComboBox(str3);
		GridBagConstraints gbc_comboBox = new GridBagConstraints();
		gbc_comboBox.gridwidth = 3;
		gbc_comboBox.insets = new Insets(0, 0, 5, 5);
		gbc_comboBox.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox.gridx = 3;
		gbc_comboBox.gridy = 6;
		add(comboBox, gbc_comboBox);

		JLabel lblH = new JLabel("H");
		GridBagConstraints gbc_lblH = new GridBagConstraints();
		gbc_lblH.anchor = GridBagConstraints.WEST;
		gbc_lblH.insets = new Insets(0, 0, 5, 0);
		gbc_lblH.gridx = 7;
		gbc_lblH.gridy = 6;
		add(lblH, gbc_lblH);

		JLabel lblProbe = new JLabel("Probe:");
		GridBagConstraints gbc_lblProbe = new GridBagConstraints();
		gbc_lblProbe.anchor = GridBagConstraints.WEST;
		gbc_lblProbe.insets = new Insets(0, 0, 5, 5);
		gbc_lblProbe.gridx = 0;
		gbc_lblProbe.gridy = 8;
		add(lblProbe, gbc_lblProbe);

		JLabel lblDataType = new JLabel("Data Type:");
		GridBagConstraints gbc_lblDataType = new GridBagConstraints();
		gbc_lblDataType.anchor = GridBagConstraints.WEST;
		gbc_lblDataType.insets = new Insets(0, 0, 5, 5);
		gbc_lblDataType.gridx = 1;
		gbc_lblDataType.gridy = 8;
		add(lblDataType, gbc_lblDataType);

		JList list = new JList();
		GridBagConstraints gbc_list = new GridBagConstraints();
		gbc_list.insets = new Insets(0, 0, 5, 5);
		gbc_list.fill = GridBagConstraints.BOTH;
		gbc_list.gridx = 0;
		gbc_list.gridy = 7;
		add(list, gbc_list);

		String[] str1 = { "* (All)", "A (P5)", "B (P1)", "C (P2)", "D (P3)",
				"E (P4)" };

		JLabel lblAngularLimits = new JLabel("Angular Limits");
		GridBagConstraints gbc_lblAngularLimits = new GridBagConstraints();
		gbc_lblAngularLimits.insets = new Insets(0, 0, 5, 5);
		gbc_lblAngularLimits.gridx = 3;
		gbc_lblAngularLimits.gridy = 8;
		add(lblAngularLimits, gbc_lblAngularLimits);

		JLabel lblC = new JLabel("C");
		GridBagConstraints gbc_lblC = new GridBagConstraints();
		gbc_lblC.anchor = GridBagConstraints.WEST;
		gbc_lblC.insets = new Insets(0, 0, 5, 0);
		gbc_lblC.gridx = 7;
		gbc_lblC.gridy = 8;
		add(lblC, gbc_lblC);

		JLabel lblPhi = new JLabel("PHI");
		GridBagConstraints gbc_lblPhi = new GridBagConstraints();
		gbc_lblPhi.insets = new Insets(0, 0, 5, 5);
		gbc_lblPhi.gridx = 2;
		gbc_lblPhi.gridy = 9;
		add(lblPhi, gbc_lblPhi);

		JLabel lblMin = new JLabel("Min");
		GridBagConstraints gbc_lblMin = new GridBagConstraints();
		gbc_lblMin.anchor = GridBagConstraints.WEST;
		gbc_lblMin.insets = new Insets(0, 0, 5, 5);
		gbc_lblMin.gridx = 3;
		gbc_lblMin.gridy = 9;
		add(lblMin, gbc_lblMin);

		textField_5 = new JTextField();
		textField_5.setText("0");
		GridBagConstraints gbc_textField_3 = new GridBagConstraints();
		gbc_textField_3.insets = new Insets(0, 0, 5, 5);
		gbc_textField_3.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_3.gridx = 4;
		gbc_textField_3.gridy = 9;
		add(textField_5, gbc_textField_3);
		textField_5.setColumns(10);

		JLabel lblMax = new JLabel("Max");
		GridBagConstraints gbc_lblMax = new GridBagConstraints();
		gbc_lblMax.insets = new Insets(0, 0, 5, 5);
		gbc_lblMax.anchor = GridBagConstraints.WEST;
		gbc_lblMax.gridx = 5;
		gbc_lblMax.gridy = 9;
		add(lblMax, gbc_lblMax);

		textField_13 = new JTextField();
		textField_13.setText("360");
		GridBagConstraints gbc_textField_11 = new GridBagConstraints();
		gbc_textField_11.insets = new Insets(0, 0, 5, 5);
		gbc_textField_11.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_11.gridx = 6;
		gbc_textField_11.gridy = 9;
		add(textField_13, gbc_textField_11);
		textField_13.setColumns(10);

		JCheckBox chckbxRemoveSstMask = new JCheckBox("Remove SST mask");
		GridBagConstraints gbc_chckbxRemoveSstMask = new GridBagConstraints();
		gbc_chckbxRemoveSstMask.anchor = GridBagConstraints.WEST;
		gbc_chckbxRemoveSstMask.insets = new Insets(0, 0, 5, 0);
		gbc_chckbxRemoveSstMask.gridx = 7;
		gbc_chckbxRemoveSstMask.gridy = 9;
		add(chckbxRemoveSstMask, gbc_chckbxRemoveSstMask);

		JLabel lblTheta = new JLabel("THETA");
		GridBagConstraints gbc_lblTheta = new GridBagConstraints();
		gbc_lblTheta.insets = new Insets(0, 0, 5, 5);
		gbc_lblTheta.gridx = 2;
		gbc_lblTheta.gridy = 10;
		add(lblTheta, gbc_lblTheta);

		JLabel lblMin_1 = new JLabel("Min");
		GridBagConstraints gbc_lblMin_1 = new GridBagConstraints();
		gbc_lblMin_1.anchor = GridBagConstraints.WEST;
		gbc_lblMin_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblMin_1.gridx = 3;
		gbc_lblMin_1.gridy = 10;
		add(lblMin_1, gbc_lblMin_1);

		textField_6 = new JTextField();
		textField_6.setText("-90");
		GridBagConstraints gbc_textField_4 = new GridBagConstraints();
		gbc_textField_4.insets = new Insets(0, 0, 5, 5);
		gbc_textField_4.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_4.gridx = 4;
		gbc_textField_4.gridy = 10;
		add(textField_6, gbc_textField_4);
		textField_6.setColumns(10);

		JLabel lblMax_1 = new JLabel("Max");
		GridBagConstraints gbc_lblMax_1 = new GridBagConstraints();
		gbc_lblMax_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblMax_1.anchor = GridBagConstraints.WEST;
		gbc_lblMax_1.gridx = 5;
		gbc_lblMax_1.gridy = 10;
		add(lblMax_1, gbc_lblMax_1);

		textField_12 = new JTextField();
		textField_12.setText("90");
		GridBagConstraints gbc_textField_10 = new GridBagConstraints();
		gbc_textField_10.insets = new Insets(0, 0, 5, 5);
		gbc_textField_10.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_10.gridx = 6;
		gbc_textField_10.gridy = 10;
		add(textField_12, gbc_textField_10);
		textField_12.setColumns(10);

		JLabel lblMaskRemovel = new JLabel("Mask removel");
		GridBagConstraints gbc_lblMaskRemovel = new GridBagConstraints();
		gbc_lblMaskRemovel.anchor = GridBagConstraints.WEST;
		gbc_lblMaskRemovel.insets = new Insets(0, 0, 5, 0);
		gbc_lblMaskRemovel.gridx = 7;
		gbc_lblMaskRemovel.gridy = 10;
		add(lblMaskRemovel, gbc_lblMaskRemovel);

		JLabel lblVariableName = new JLabel("Variable Name:");
		GridBagConstraints gbc_lblVariableName = new GridBagConstraints();
		gbc_lblVariableName.anchor = GridBagConstraints.WEST;
		gbc_lblVariableName.insets = new Insets(0, 0, 5, 5);
		gbc_lblVariableName.gridx = 0;
		gbc_lblVariableName.gridy = 11;
		add(lblVariableName, gbc_lblVariableName);

		textField_7 = new JTextField();
		textField_7.setText("0");
		GridBagConstraints gbc_textField_5 = new GridBagConstraints();
		gbc_textField_5.insets = new Insets(0, 0, 5, 5);
		gbc_textField_5.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_5.gridx = 4;
		gbc_textField_5.gridy = 11;
		add(textField_7, gbc_textField_5);
		textField_7.setColumns(10);

		JLabel lblMax_2 = new JLabel("Max");
		GridBagConstraints gbc_lblMax_2 = new GridBagConstraints();
		gbc_lblMax_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblMax_2.anchor = GridBagConstraints.WEST;
		gbc_lblMax_2.gridx = 5;
		gbc_lblMax_2.gridy = 11;
		add(lblMax_2, gbc_lblMax_2);

		textField_11 = new JTextField();
		textField_11.setText("180");
		GridBagConstraints gbc_textField_9 = new GridBagConstraints();
		gbc_textField_9.insets = new Insets(0, 0, 5, 5);
		gbc_textField_9.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_9.gridx = 6;
		gbc_textField_9.gridy = 11;
		add(textField_11, gbc_textField_9);
		textField_11.setColumns(10);

		JLabel lblPa = new JLabel("PA");
		GridBagConstraints gbc_lblPa = new GridBagConstraints();
		gbc_lblPa.insets = new Insets(0, 0, 5, 5);
		gbc_lblPa.gridx = 2;
		gbc_lblPa.gridy = 11;
		add(lblPa, gbc_lblPa);

		JLabel lblMin_2 = new JLabel("Min");
		GridBagConstraints gbc_lblMin_2 = new GridBagConstraints();
		gbc_lblMin_2.anchor = GridBagConstraints.WEST;
		gbc_lblMin_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblMin_2.gridx = 3;
		gbc_lblMin_2.gridy = 11;
		add(lblMin_2, gbc_lblMin_2);

		JLabel lblLim = new JLabel("Lim");
		GridBagConstraints gbc_lblLim = new GridBagConstraints();
		gbc_lblLim.insets = new Insets(0, 0, 5, 0);
		gbc_lblLim.gridx = 7;
		gbc_lblLim.gridy = 11;
		add(lblLim, gbc_lblLim);

		JLabel lblNewSuffix = new JLabel("New suffix:");
		GridBagConstraints gbc_lblNewSuffix = new GridBagConstraints();
		gbc_lblNewSuffix.anchor = GridBagConstraints.WEST;
		gbc_lblNewSuffix.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewSuffix.gridx = 0;
		gbc_lblNewSuffix.gridy = 12;
		add(lblNewSuffix, gbc_lblNewSuffix);

		textField_14 = new JTextField();
		GridBagConstraints gbc_textField_12 = new GridBagConstraints();
		gbc_textField_12.insets = new Insets(0, 0, 5, 5);
		gbc_textField_12.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_12.gridx = 1;
		gbc_textField_12.gridy = 12;
		add(textField_14, gbc_textField_12);
		textField_14.setColumns(10);

		textField_8 = new JTextField();
		textField_8.setText("0");
		GridBagConstraints gbc_textField_6 = new GridBagConstraints();
		gbc_textField_6.insets = new Insets(0, 0, 5, 5);
		gbc_textField_6.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_6.gridx = 4;
		gbc_textField_6.gridy = 12;
		add(textField_8, gbc_textField_6);
		textField_8.setColumns(10);

		JLabel lblMax_3 = new JLabel("Max");
		GridBagConstraints gbc_lblMax_3 = new GridBagConstraints();
		gbc_lblMax_3.insets = new Insets(0, 0, 5, 5);
		gbc_lblMax_3.anchor = GridBagConstraints.WEST;
		gbc_lblMax_3.gridx = 5;
		gbc_lblMax_3.gridy = 12;
		add(lblMax_3, gbc_lblMax_3);

		textField_10 = new JTextField();
		textField_10.setText("360");
		GridBagConstraints gbc_textField_8 = new GridBagConstraints();
		gbc_textField_8.insets = new Insets(0, 0, 5, 5);
		gbc_textField_8.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_8.gridx = 6;
		gbc_textField_8.gridy = 12;
		add(textField_10, gbc_textField_8);
		textField_10.setColumns(10);

		JLabel lblGyro = new JLabel("GYRO");
		GridBagConstraints gbc_lblGyro = new GridBagConstraints();
		gbc_lblGyro.insets = new Insets(0, 0, 5, 5);
		gbc_lblGyro.gridx = 2;
		gbc_lblGyro.gridy = 12;
		add(lblGyro, gbc_lblGyro);

		JLabel lblFill = new JLabel("Fill");
		GridBagConstraints gbc_lblFill = new GridBagConstraints();
		gbc_lblFill.insets = new Insets(0, 0, 5, 0);
		gbc_lblFill.gridx = 7;
		gbc_lblFill.gridy = 12;
		add(lblFill, gbc_lblFill);

		textField_9 = new JTextField();
		textField_9.setText("0");
		GridBagConstraints gbc_textField_7 = new GridBagConstraints();
		gbc_textField_7.insets = new Insets(0, 0, 5, 5);
		gbc_textField_7.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_7.gridx = 6;
		gbc_textField_7.gridy = 13;
		add(textField_9, gbc_textField_7);
		textField_9.setColumns(10);

		JLabel lblMin_3 = new JLabel("Min");
		GridBagConstraints gbc_lblMin_3 = new GridBagConstraints();
		gbc_lblMin_3.anchor = GridBagConstraints.WEST;
		gbc_lblMin_3.insets = new Insets(0, 0, 5, 5);
		gbc_lblMin_3.gridx = 3;
		gbc_lblMin_3.gridy = 12;
		add(lblMin_3, gbc_lblMin_3);

		JLabel lblStartAnglephi = new JLabel("Start Angle (Phi only)");
		GridBagConstraints gbc_lblStartAnglephi = new GridBagConstraints();
		gbc_lblStartAnglephi.gridwidth = 4;
		gbc_lblStartAnglephi.insets = new Insets(0, 0, 5, 5);
		gbc_lblStartAnglephi.gridx = 2;
		gbc_lblStartAnglephi.gridy = 13;
		add(lblStartAnglephi, gbc_lblStartAnglephi);
		JList list_1 = new JList(str1);
		GridBagConstraints gbc_list_1 = new GridBagConstraints();
		gbc_list_1.insets = new Insets(0, 0, 5, 5);
		gbc_list_1.fill = GridBagConstraints.BOTH;
		gbc_list_1.gridx = 0;
		gbc_list_1.gridy = 9;
		add(list_1, gbc_list_1);

		String[] str2 = { "*", "peif", "peir", "peib", "peef", "peeb", "psif",
				"psir", "psef", "pser" };
		JList list_2 = new JList(str2);
		GridBagConstraints gbc_list_2 = new GridBagConstraints();
		gbc_list_2.insets = new Insets(0, 0, 5, 5);
		gbc_list_2.fill = GridBagConstraints.BOTH;
		gbc_list_2.gridx = 1;
		gbc_list_2.gridy = 9;
		add(list_2, gbc_list_2);

		JButton btnApply = new JButton("Apply");
		GridBagConstraints gbc_btnApply = new GridBagConstraints();
		gbc_btnApply.insets = new Insets(0, 0, 0, 5);
		gbc_btnApply.gridx = 3;
		gbc_btnApply.gridy = 17;
		add(btnApply, gbc_btnApply);

		JButton btnResetAll = new JButton("Reset All");
		GridBagConstraints gbc_btnResetAll = new GridBagConstraints();
		gbc_btnResetAll.insets = new Insets(0, 0, 0, 5);
		gbc_btnResetAll.gridx = 4;
		gbc_btnResetAll.gridy = 17;
		add(btnResetAll, gbc_btnResetAll);

		JButton btnHelp = new JButton("Help");
		GridBagConstraints gbc_btnHelp = new GridBagConstraints();
		gbc_btnHelp.insets = new Insets(0, 0, 0, 5);
		gbc_btnHelp.gridx = 5;
		gbc_btnHelp.gridy = 17;
		add(btnHelp, gbc_btnHelp);
	}

}
