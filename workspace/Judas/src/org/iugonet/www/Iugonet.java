package org.iugonet.www;

import java.awt.GridBagLayout;

import javax.swing.JButton;
import java.awt.GridBagConstraints;
import javax.swing.JLabel;
import java.awt.Insets;

import javax.swing.JCheckBox;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JList;
import javax.swing.JTree;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.undo.UndoableEditSupport;

public class Iugonet extends Project {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField textField_1;
	private JTextField textField_2;
	private JCheckBox chckbxUseSingleDay;

	protected UndoableEditSupport undoableEditSupport;

	Iugonet() {
		super();
		undoableEditSupport = new UndoableEditSupport(this);

		readConf(getClass().getClassLoader().getResource("conf/Iugonet.xml"));

		getList1();
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[] { 150, 150, 150, 50, 450, 0 };
		gridBagLayout.rowHeights = new int[] { 40, 0, 0, 0, 0, 10, 0, 0, 0, 0,
				0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		gridBagLayout.columnWeights = new double[] { 0.0, 0.0, 0.0, 1.0, 0.0,
				Double.MIN_VALUE };
		gridBagLayout.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
				0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
				0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
		setLayout(gridBagLayout);

		JLabel lblIugonetDataSelection = new JLabel("Data Selection:");
		GridBagConstraints gbc_lblIugonetDataSelection = new GridBagConstraints();
		gbc_lblIugonetDataSelection.anchor = GridBagConstraints.WEST;
		gbc_lblIugonetDataSelection.gridwidth = 2;
		gbc_lblIugonetDataSelection.insets = new Insets(0, 0, 5, 5);
		gbc_lblIugonetDataSelection.gridx = 0;
		gbc_lblIugonetDataSelection.gridy = 0;
		add(lblIugonetDataSelection, gbc_lblIugonetDataSelection);

		JLabel lblDataLoaded = new JLabel("Data loaded:");
		GridBagConstraints gbc_lblDataLoaded = new GridBagConstraints();
		gbc_lblDataLoaded.anchor = GridBagConstraints.WEST;
		gbc_lblDataLoaded.insets = new Insets(0, 0, 5, 0);
		gbc_lblDataLoaded.gridx = 4;
		gbc_lblDataLoaded.gridy = 0;
		add(lblDataLoaded, gbc_lblDataLoaded);

		JLabel lblStartTime = new JLabel("Start Time:");
		GridBagConstraints gbc_lblStartTime = new GridBagConstraints();
		gbc_lblStartTime.anchor = GridBagConstraints.WEST;
		gbc_lblStartTime.insets = new Insets(0, 0, 5, 5);
		gbc_lblStartTime.gridx = 0;
		gbc_lblStartTime.gridy = 1;
		add(lblStartTime, gbc_lblStartTime);

		textField_1 = new JTextField();
		textField_1.setText("2007-03-23/00:00:00");
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.insets = new Insets(0, 0, 5, 5);
		gbc_textField.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField.gridx = 1;
		gbc_textField.gridy = 1;
		add(textField_1, gbc_textField);
		textField_1.setColumns(10);

		JButton btnMyCalendar_1 = new JButton("");
		btnMyCalendar_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MyCalendar calendar = new MyCalendar();
				calendar.setLocationRelativeTo(null);
				calendar.setVisible(true);
			}
		});

		Icons icons = new Icons();
		btnMyCalendar_1.setIcon(icons
				.getImageIcon("icons/calendar-alt-1-20.png"));

		GridBagConstraints gbc_button = new GridBagConstraints();
		gbc_button.insets = new Insets(0, 0, 5, 5);
		gbc_button.gridx = 2;
		gbc_button.gridy = 1;
		add(btnMyCalendar_1, gbc_button);

		JTree tree = new JTree();
		GridBagConstraints gbc_tree = new GridBagConstraints();
		gbc_tree.gridheight = 17;
		gbc_tree.insets = new Insets(0, 0, 5, 0);
		gbc_tree.fill = GridBagConstraints.HORIZONTAL;
		gbc_tree.gridx = 4;
		gbc_tree.gridy = 1;
		add(tree, gbc_tree);

		System.out.println("document=" + doc);
		System.out.println("root=" + root);
		System.out.println(root.getChild("Title").getValue());

		String[] str = { "Boundary_Layer_Radar",
				"Equatorial_Atmospheric_Radar", "geomagnetic_field_fluxgate",
				"geomagnetic_field_index", "Iitate_Planetary_Radio_Telescope",
				"Lower_Troposphere_Radar", "Medium_Frequency_radar",
				"Meteor_Wind_radar", "Middle_Upper_atmosphere_radar",
				"SuperDARN", "EISCAT_radar", "Wind_Profiler_Radar_(LQ-7)" };
		JComboBox comboBox = new JComboBox(str);
		GridBagConstraints gbc_comboBox = new GridBagConstraints();
		gbc_comboBox.gridwidth = 2;
		gbc_comboBox.insets = new Insets(0, 0, 5, 5);
		gbc_comboBox.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox.gridx = 1;
		gbc_comboBox.gridy = 4;
		add(comboBox, gbc_comboBox);

		JButton btnClear_1 = new JButton("Clear");
		btnClear_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		GridBagConstraints gbc_btnClear = new GridBagConstraints();
		gbc_btnClear.insets = new Insets(0, 0, 0, 5);
		gbc_btnClear.gridx = 1;
		gbc_btnClear.gridy = 18;
		add(btnClear_1, gbc_btnClear);

		JButton btnClear_2 = new JButton("Clear");
		GridBagConstraints gbc_btnClear_1 = new GridBagConstraints();
		gbc_btnClear_1.insets = new Insets(0, 0, 0, 5);
		gbc_btnClear_1.gridx = 2;
		gbc_btnClear_1.gridy = 18;
		add(btnClear_2, gbc_btnClear_1);

		JButton btnDeleteAllData = new JButton("Delete All Data");
		btnDeleteAllData.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				JPanel panel = Judas.getPanel();

				PlotPane plotPane = new PlotPane();
				panel.add(plotPane, "name_5936624077418");
				plotPane.plot("b");
			}
		});
		GridBagConstraints gbc_btnDeleteAllData = new GridBagConstraints();
		gbc_btnDeleteAllData.gridx = 4;
		gbc_btnDeleteAllData.gridy = 18;
		add(btnDeleteAllData, gbc_btnDeleteAllData);

		chckbxUseSingleDay = new JCheckBox("Use Single Day");
		chckbxUseSingleDay.setSelected(true);
		GridBagConstraints gbc_chckbxUseSingleDay = new GridBagConstraints();
		gbc_chckbxUseSingleDay.anchor = GridBagConstraints.WEST;
		gbc_chckbxUseSingleDay.insets = new Insets(0, 0, 5, 5);
		gbc_chckbxUseSingleDay.gridx = 1;
		gbc_chckbxUseSingleDay.gridy = 3;
		add(chckbxUseSingleDay, gbc_chckbxUseSingleDay);

		JLabel lblStopTime = new JLabel("Stop Time:");
		GridBagConstraints gbc_lblStopTime = new GridBagConstraints();
		gbc_lblStopTime.anchor = GridBagConstraints.WEST;
		gbc_lblStopTime.insets = new Insets(0, 0, 5, 5);
		gbc_lblStopTime.gridx = 0;
		gbc_lblStopTime.gridy = 2;
		add(lblStopTime, gbc_lblStopTime);
		if (chckbxUseSingleDay.isSelected()) {
			lblStopTime.setEnabled(false);
		}

		textField_2 = new JTextField();
		textField_2.setText("2007-03-24/00:00:00");
		GridBagConstraints gbc_textField_1 = new GridBagConstraints();
		gbc_textField_1.insets = new Insets(0, 0, 5, 5);
		gbc_textField_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_1.gridx = 1;
		gbc_textField_1.gridy = 2;
		add(textField_2, gbc_textField_1);
		textField_2.setColumns(10);
		if (chckbxUseSingleDay.isSelected()) {
			textField_2.setEnabled(false);
		}

		JButton btnMyCalendar_2 = new JButton("");
		btnMyCalendar_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MyCalendar calendar = new MyCalendar();
				calendar.setLocationRelativeTo(null);
				calendar.setVisible(true);
			}
		});
		
		btnMyCalendar_2.setIcon(icons
				.getImageIcon("icons/calendar-alt-1-20.png"));

		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.anchor = GridBagConstraints.NORTH;
		gbc_btnNewButton.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton.gridx = 2;
		gbc_btnNewButton.gridy = 2;
		add(btnMyCalendar_2, gbc_btnNewButton);
		if (chckbxUseSingleDay.isSelected()) {
			btnMyCalendar_2.setEnabled(false);
		}

		JButton button_1 = new JButton("");

		button_1.setIcon(icons.getImageIcon("icons/arrow-1-right20.png"));

		GridBagConstraints gbc_button_1 = new GridBagConstraints();
		gbc_button_1.insets = new Insets(0, 0, 5, 5);
		gbc_button_1.gridx = 3;
		gbc_button_1.gridy = 11;
		add(button_1, gbc_button_1);

		JLabel lblInstrumentType = new JLabel("Instrument Type:");
		GridBagConstraints gbc_lblInstrumentType = new GridBagConstraints();
		gbc_lblInstrumentType.anchor = GridBagConstraints.WEST;
		gbc_lblInstrumentType.insets = new Insets(0, 0, 5, 5);
		gbc_lblInstrumentType.gridx = 0;
		gbc_lblInstrumentType.gridy = 4;
		add(lblInstrumentType, gbc_lblInstrumentType);

		JButton button_2 = new JButton("");

		button_2.setIcon(icons.getImageIcon("icons/trash-empty20.png"));

		GridBagConstraints gbc_button_2 = new GridBagConstraints();
		gbc_button_2.insets = new Insets(0, 0, 5, 5);
		gbc_button_2.gridx = 3;
		gbc_button_2.gridy = 12;
		add(button_2, gbc_button_2);

		JLabel lblDataType = new JLabel("Data Type:");
		GridBagConstraints gbc_lblDataType = new GridBagConstraints();
		gbc_lblDataType.insets = new Insets(0, 0, 5, 5);
		gbc_lblDataType.gridx = 0;
		gbc_lblDataType.gridy = 6;
		add(lblDataType, gbc_lblDataType);

		JLabel lblSiteOrParameters = new JLabel("Site or parameter(s)-1:");
		GridBagConstraints gbc_lblSiteOrParameters = new GridBagConstraints();
		gbc_lblSiteOrParameters.insets = new Insets(0, 0, 5, 5);
		gbc_lblSiteOrParameters.gridx = 1;
		gbc_lblSiteOrParameters.gridy = 6;
		add(lblSiteOrParameters, gbc_lblSiteOrParameters);

		JLabel lblParameters = new JLabel("Parameter(s)-2:");
		GridBagConstraints gbc_lblParameters = new GridBagConstraints();
		gbc_lblParameters.insets = new Insets(0, 0, 5, 5);
		gbc_lblParameters.gridx = 2;
		gbc_lblParameters.gridy = 6;
		add(lblParameters, gbc_lblParameters);

		JList list_2 = new JList();
		GridBagConstraints gbc_list_2 = new GridBagConstraints();
		gbc_list_2.gridheight = 11;
		gbc_list_2.insets = new Insets(0, 0, 5, 5);
		gbc_list_2.fill = GridBagConstraints.BOTH;
		gbc_list_2.gridx = 0;
		gbc_list_2.gridy = 7;
		add(list_2, gbc_list_2);

		JList list_3 = new JList();
		GridBagConstraints gbc_list_3 = new GridBagConstraints();
		gbc_list_3.gridheight = 11;
		gbc_list_3.insets = new Insets(0, 0, 5, 5);
		gbc_list_3.fill = GridBagConstraints.BOTH;
		gbc_list_3.gridx = 1;
		gbc_list_3.gridy = 7;
		add(list_3, gbc_list_3);

		JList list_1 = new JList();
		GridBagConstraints gbc_list_1 = new GridBagConstraints();
		gbc_list_1.gridheight = 11;
		gbc_list_1.insets = new Insets(0, 0, 5, 5);
		gbc_list_1.fill = GridBagConstraints.BOTH;
		gbc_list_1.gridx = 2;
		gbc_list_1.gridy = 7;
		add(list_1, gbc_list_1);
	}

	public String[] getInstrumentTypes() {
		String[] result = { "1", "2" };
		return result;
	}

	public String getStartTime() {
		return "1";
	}

	public String getStopTime() {
		return "1";
	}

	public JList getList0() {
		String[] result = { root.getChild("Tab").getChild("Name").getValue(),
				"1", "2" };
		JList jList = new JList(result);
		return jList;
	}

	public JList getList1() {
		System.out.println(root.getChild("Tab").getChild("DataSelection")
				.getChild("InstrumentTypes").getContent().get(1).getValue());
		String[] result = { "1", "2" };
		JList jList = new JList(result);
		return jList;
	}

	public JList getList2() {
		String[] result = { "1", "2" };
		JList jList = new JList(result);
		return jList;
	}

}
