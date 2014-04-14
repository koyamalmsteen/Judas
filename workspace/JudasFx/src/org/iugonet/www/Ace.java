package org.iugonet.www;

import java.awt.GridBagLayout;
import javax.swing.JButton;
import java.awt.GridBagConstraints;
import javax.swing.JLabel;
import java.awt.Insets;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JTextField;
import javax.swing.JList;
import javax.swing.JTree;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.undo.AbstractUndoableEdit;
import javax.swing.undo.UndoableEdit;
import javax.swing.undo.UndoableEditSupport;

public class Ace extends Project {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField textField_1;
	private JTextField textField_2;
	private JCheckBox chckbxUseSingleDay;

	protected UndoableEditSupport undoableEditSupport;

	Ace() {
		super();
		undoableEditSupport = new UndoableEditSupport(this);

		readConf(getClass().getClassLoader().getResource("conf/Ace.xml"));

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

		JLabel lblAceDataSelection = new JLabel("Data Selection:");
		GridBagConstraints gbc_lblAceDataSelection = new GridBagConstraints();
		gbc_lblAceDataSelection.anchor = GridBagConstraints.WEST;
		gbc_lblAceDataSelection.gridwidth = 2;
		gbc_lblAceDataSelection.insets = new Insets(0, 0, 5, 5);
		gbc_lblAceDataSelection.gridx = 0;
		gbc_lblAceDataSelection.gridy = 0;
		add(lblAceDataSelection, gbc_lblAceDataSelection);

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
		textField_1.setText(getStartTime());
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
		btnMyCalendar_1.setIcon(new ImageIcon(Ace.class
				.getResource("/calendar-alt-1-20.png")));
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

		System.out.println("ACE DAYO"
				+ root.getChild("Tab").getChild("DataSelection")
						.getChild("InstrumentTypes").getChildren());
		String[] str = { "mfi" };

		JComboBox comboBox = new JComboBox(str);
		GridBagConstraints gbc_comboBox = new GridBagConstraints();
		gbc_comboBox.gridwidth = 2;
		gbc_comboBox.insets = new Insets(0, 0, 5, 5);
		gbc_comboBox.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox.gridx = 1;
		gbc_comboBox.gridy = 4;
		add(comboBox, gbc_comboBox);

		JButton btnClear = new JButton("Clear");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		GridBagConstraints gbc_btnClear = new GridBagConstraints();
		gbc_btnClear.insets = new Insets(0, 0, 0, 5);
		gbc_btnClear.gridx = 1;
		gbc_btnClear.gridy = 18;
		add(btnClear, gbc_btnClear);

		JButton btnDeleteAllData = new JButton("Delete All Data");
		GridBagConstraints gbc_btnDeleteAllData = new GridBagConstraints();
		gbc_btnDeleteAllData.gridx = 4;
		gbc_btnDeleteAllData.gridy = 18;
		add(btnDeleteAllData, gbc_btnDeleteAllData);

		chckbxUseSingleDay = new JCheckBox("Use Single Day");
		chckbxUseSingleDay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				// Create a new undo action
				// Save our current state in a final boolean so it is accessible
				// in the inner class below
				final boolean curState = chckbxUseSingleDay.isSelected();
				UndoableEdit undoableEdit = new AbstractUndoableEdit() {

					/**
					 * 
					 */
					private static final long serialVersionUID = 1L;

					// Method that is called when we must redo the undone action
					public void redo()
							throws javax.swing.undo.CannotRedoException {
						super.redo();

						// Set the checkbox to its pre-undone state
						chckbxUseSingleDay.setSelected(curState);

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
						chckbxUseSingleDay.setSelected(!curState);

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
				Judas.getMntmUndo()
						.setEnabled(Judas.getUndoManager().canUndo());
				Judas.getMntmRedo()
						.setEnabled(Judas.getUndoManager().canRedo());
			}
		});
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
		textField_2.setText(getStopTime());
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
		btnMyCalendar_2.setIcon(new ImageIcon(Ace.class
				.getResource("/calendar-alt-1-20.png")));
		GridBagConstraints gbc_btnMyCalendar_2 = new GridBagConstraints();
		gbc_btnMyCalendar_2.anchor = GridBagConstraints.NORTH;
		gbc_btnMyCalendar_2.insets = new Insets(0, 0, 5, 5);
		gbc_btnMyCalendar_2.gridx = 2;
		gbc_btnMyCalendar_2.gridy = 2;
		add(btnMyCalendar_2, gbc_btnMyCalendar_2);
		if (chckbxUseSingleDay.isSelected()) {
			btnMyCalendar_2.setEnabled(false);
		}

		JButton button_1 = new JButton("");
		button_1.setIcon(new ImageIcon(Ace.class
				.getResource("/arrow-1-right20.png")));
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
		button_2.setIcon(new ImageIcon(Iugonet.class
				.getResource("/trash-empty20.png")));
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

		JLabel lblParameters = new JLabel("Parameter(s):");
		GridBagConstraints gbc_lblParameters = new GridBagConstraints();
		gbc_lblParameters.insets = new Insets(0, 0, 5, 5);
		gbc_lblParameters.gridx = 1;
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
	}

	public String[] getInstrumentTypes() {
		String[] result = { "1", "2" };
		return result;
	}

	public String getStartTime() {
		return root.getChild("Tab").getChild("DataSelection")
				.getChild("TimeSpan").getChild("StartTime").getValue();
	}

	public String getStopTime() {
		return root.getChild("Tab").getChild("DataSelection")
				.getChild("TimeSpan").getChild("StopTime").getValue();
	}

	public JList getList0() {
		String[] result = { root.getChild("Tab").getChild("Name").getValue(),
				"1", "2" };
		JList jList = new JList(result);
		return jList;
	}

	public JList getList1() {
		String[] result = { "1", "2" };
		JList jList = new JList(result);
		return jList;
	}

}
