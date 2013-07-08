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
import javax.swing.ButtonGroup;
import javax.swing.InputMap;
import javax.swing.JCheckBox;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.KeyStroke;

import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.Font;

public class ConfigurationSettings extends JDialog {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JTextField txthomegeomagthemis;
	private JTextField txtHttpthemisstpisasjaxajpdatathemis;
	private JTextField textField;

	protected UndoableEditSupport undoableEditSupport;
	private JCheckBox chckbxLoadTemplate_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			ConfigurationSettings dialog = new ConfigurationSettings();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public ConfigurationSettings() {
		super();
		undoableEditSupport = new UndoableEditSupport(this);

		setModal(true);
		setAlwaysOnTop(true);
		setTitle("Configuration Settings");
		
		Icons icons = new Icons();
		setIconImage(icons.getImage("/calendar-alt-1-20.png"));

		setBounds(100, 100, 666, 500);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		GridBagLayout gbl_contentPanel = new GridBagLayout();
		gbl_contentPanel.columnWidths = new int[] { 0, 80, 0, 0, 0 };
		gbl_contentPanel.rowHeights = new int[] { 34, 39, 29, 23, 0, 0, 0, 0,
				0, 0, 0 };
		gbl_contentPanel.columnWeights = new double[] { 0.0, 0.0, 0.0, 0.0,
				Double.MIN_VALUE };
		gbl_contentPanel.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0,
				0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
		contentPanel.setLayout(gbl_contentPanel);
		{
			JLabel lblConfigurationSettings = new JLabel(
					"Configuration Settings:");
			GridBagConstraints gbc_lblConfigurationSettings = new GridBagConstraints();
			gbc_lblConfigurationSettings.insets = new Insets(0, 0, 5, 5);
			gbc_lblConfigurationSettings.anchor = GridBagConstraints.EAST;
			gbc_lblConfigurationSettings.gridx = 0;
			gbc_lblConfigurationSettings.gridy = 0;
			contentPanel.add(lblConfigurationSettings,
					gbc_lblConfigurationSettings);
		}
		{
			JComboBox comboBox = new JComboBox();
			GridBagConstraints gbc_comboBox = new GridBagConstraints();
			gbc_comboBox.insets = new Insets(0, 0, 5, 5);
			gbc_comboBox.fill = GridBagConstraints.HORIZONTAL;
			gbc_comboBox.gridx = 1;
			gbc_comboBox.gridy = 0;
			comboBox.addItem("THEMIS");
			comboBox.addItem("GOES");
			comboBox.addItem("WIND");
			comboBox.addItem("ISTP");
			contentPanel.add(comboBox, gbc_comboBox);
		}
		{
			txthomegeomagthemis = new JTextField();
			txthomegeomagthemis.setText("/home/geomag/themis/");
			GridBagConstraints gbc_txthomegeomagthemis = new GridBagConstraints();
			gbc_txthomegeomagthemis.gridwidth = 3;
			gbc_txthomegeomagthemis.insets = new Insets(0, 0, 5, 5);
			gbc_txthomegeomagthemis.fill = GridBagConstraints.HORIZONTAL;
			gbc_txthomegeomagthemis.gridx = 0;
			gbc_txthomegeomagthemis.gridy = 1;
			contentPanel.add(txthomegeomagthemis, gbc_txthomegeomagthemis);
			txthomegeomagthemis.setColumns(10);
		}
		{
			txtHttpthemisstpisasjaxajpdatathemis = new JTextField();
			txtHttpthemisstpisasjaxajpdatathemis
					.setText("http://themis.stp.isas.jaxa.jp/data/themis/");
			GridBagConstraints gbc_txtHttpthemisstpisasjaxajpdatathemis = new GridBagConstraints();
			gbc_txtHttpthemisstpisasjaxajpdatathemis.gridwidth = 3;
			gbc_txtHttpthemisstpisasjaxajpdatathemis.insets = new Insets(0, 0,
					5, 5);
			gbc_txtHttpthemisstpisasjaxajpdatathemis.fill = GridBagConstraints.HORIZONTAL;
			gbc_txtHttpthemisstpisasjaxajpdatathemis.gridx = 0;
			gbc_txtHttpthemisstpisasjaxajpdatathemis.gridy = 2;
			contentPanel.add(txtHttpthemisstpisasjaxajpdatathemis,
					gbc_txtHttpthemisstpisasjaxajpdatathemis);
			txtHttpthemisstpisasjaxajpdatathemis.setColumns(10);
		}
		{
			JLabel lblRemoteDataFirectory = new JLabel("Remote data firectory");
			lblRemoteDataFirectory.setFont(new Font("Dialog", Font.BOLD, 10));
			GridBagConstraints gbc_lblRemoteDataFirectory = new GridBagConstraints();
			gbc_lblRemoteDataFirectory.insets = new Insets(0, 0, 5, 0);
			gbc_lblRemoteDataFirectory.gridx = 3;
			gbc_lblRemoteDataFirectory.gridy = 2;
			contentPanel
					.add(lblRemoteDataFirectory, gbc_lblRemoteDataFirectory);
		}
		{
			JLabel lblLocalDataDirectory_1 = new JLabel("Local data directory");
			lblLocalDataDirectory_1.setFont(new Font("Dialog", Font.BOLD, 10));
			GridBagConstraints gbc_lblLocalDataDirectory_1 = new GridBagConstraints();
			gbc_lblLocalDataDirectory_1.insets = new Insets(0, 0, 5, 0);
			gbc_lblLocalDataDirectory_1.gridx = 3;
			gbc_lblLocalDataDirectory_1.gridy = 1;
			contentPanel.add(lblLocalDataDirectory_1,
					gbc_lblLocalDataDirectory_1);
		}
		{
			JLabel lblDownloadData = new JLabel("Download Data:");
			GridBagConstraints gbc_lblDownloadData = new GridBagConstraints();
			gbc_lblDownloadData.anchor = GridBagConstraints.WEST;
			gbc_lblDownloadData.insets = new Insets(0, 0, 5, 5);
			gbc_lblDownloadData.gridx = 0;
			gbc_lblDownloadData.gridy = 3;
			contentPanel.add(lblDownloadData, gbc_lblDownloadData);
		}
		ButtonGroup buttonGroup = new ButtonGroup();
		{

			JRadioButton rdbtnAutomatically = new JRadioButton("Automatically");
			rdbtnAutomatically.setSelected(true);
			rdbtnAutomatically.setFont(new Font("Dialog", Font.BOLD, 10));
			GridBagConstraints gbc_rdbtnAutomatically = new GridBagConstraints();
			gbc_rdbtnAutomatically.anchor = GridBagConstraints.WEST;
			gbc_rdbtnAutomatically.insets = new Insets(0, 0, 5, 5);
			gbc_rdbtnAutomatically.gridx = 1;
			gbc_rdbtnAutomatically.gridy = 3;
			contentPanel.add(rdbtnAutomatically, gbc_rdbtnAutomatically);

			buttonGroup.add(rdbtnAutomatically);
		}
		{
			JRadioButton rdbtnUseLocalData_1 = new JRadioButton(
					"Use Local Data Only");
			rdbtnUseLocalData_1.setFont(new Font("Dialog", Font.BOLD, 10));
			GridBagConstraints gbc_rdbtnUseLocalData_1 = new GridBagConstraints();
			gbc_rdbtnUseLocalData_1.anchor = GridBagConstraints.WEST;
			gbc_rdbtnUseLocalData_1.insets = new Insets(0, 0, 5, 5);
			gbc_rdbtnUseLocalData_1.gridx = 2;
			gbc_rdbtnUseLocalData_1.gridy = 3;
			contentPanel.add(rdbtnUseLocalData_1, gbc_rdbtnUseLocalData_1);

			buttonGroup.add(rdbtnUseLocalData_1);
		}
		{
			JLabel lblUpdateFiles = new JLabel("Update Files:");
			GridBagConstraints gbc_lblUpdateFiles = new GridBagConstraints();
			gbc_lblUpdateFiles.anchor = GridBagConstraints.WEST;
			gbc_lblUpdateFiles.insets = new Insets(0, 0, 5, 5);
			gbc_lblUpdateFiles.gridx = 0;
			gbc_lblUpdateFiles.gridy = 4;
			contentPanel.add(lblUpdateFiles, gbc_lblUpdateFiles);
		}
		ButtonGroup buttonGroup2 = new ButtonGroup();
		{
			JRadioButton rdbtnUpdateIfNewer = new JRadioButton(
					"Update if Newer");
			rdbtnUpdateIfNewer.setSelected(true);
			rdbtnUpdateIfNewer.setFont(new Font("Dialog", Font.BOLD, 10));
			GridBagConstraints gbc_rdbtnUpdateIfNewer = new GridBagConstraints();
			gbc_rdbtnUpdateIfNewer.anchor = GridBagConstraints.WEST;
			gbc_rdbtnUpdateIfNewer.insets = new Insets(0, 0, 5, 5);
			gbc_rdbtnUpdateIfNewer.gridx = 1;
			gbc_rdbtnUpdateIfNewer.gridy = 4;
			contentPanel.add(rdbtnUpdateIfNewer, gbc_rdbtnUpdateIfNewer);

			buttonGroup2.add(rdbtnUpdateIfNewer);
		}
		{
			JRadioButton rdbtnUseLocalData = new JRadioButton(
					"Use Local Data Only");
			rdbtnUseLocalData.setFont(new Font("Dialog", Font.BOLD, 10));
			GridBagConstraints gbc_rdbtnUseLocalData = new GridBagConstraints();
			gbc_rdbtnUseLocalData.anchor = GridBagConstraints.WEST;
			gbc_rdbtnUseLocalData.insets = new Insets(0, 0, 5, 5);
			gbc_rdbtnUseLocalData.gridx = 2;
			gbc_rdbtnUseLocalData.gridy = 4;
			contentPanel.add(rdbtnUseLocalData, gbc_rdbtnUseLocalData);

			buttonGroup2.add(rdbtnUseLocalData);
		}
		{
			JLabel lblLoadData = new JLabel("Load Data:");
			GridBagConstraints gbc_lblLoadData = new GridBagConstraints();
			gbc_lblLoadData.anchor = GridBagConstraints.WEST;
			gbc_lblLoadData.insets = new Insets(0, 0, 5, 5);
			gbc_lblLoadData.gridx = 0;
			gbc_lblLoadData.gridy = 5;
			contentPanel.add(lblLoadData, gbc_lblLoadData);
		}
		ButtonGroup buttonGroup3 = new ButtonGroup();
		{
			JRadioButton rdbtnDownloadAndLoad = new JRadioButton(
					"Download and Load");
			rdbtnDownloadAndLoad.setSelected(true);
			rdbtnDownloadAndLoad.setFont(new Font("Dialog", Font.BOLD, 10));
			GridBagConstraints gbc_rdbtnDownloadAndLoad = new GridBagConstraints();
			gbc_rdbtnDownloadAndLoad.anchor = GridBagConstraints.WEST;
			gbc_rdbtnDownloadAndLoad.insets = new Insets(0, 0, 5, 5);
			gbc_rdbtnDownloadAndLoad.gridx = 1;
			gbc_rdbtnDownloadAndLoad.gridy = 5;
			contentPanel.add(rdbtnDownloadAndLoad, gbc_rdbtnDownloadAndLoad);

			buttonGroup3.add(rdbtnDownloadAndLoad);
		}
		{
			JRadioButton rdbtnDownloadOnly = new JRadioButton("Download Only");
			rdbtnDownloadOnly.setFont(new Font("Dialog", Font.BOLD, 10));
			GridBagConstraints gbc_rdbtnDownloadOnly = new GridBagConstraints();
			gbc_rdbtnDownloadOnly.anchor = GridBagConstraints.WEST;
			gbc_rdbtnDownloadOnly.insets = new Insets(0, 0, 5, 5);
			gbc_rdbtnDownloadOnly.gridx = 2;
			gbc_rdbtnDownloadOnly.gridy = 5;
			contentPanel.add(rdbtnDownloadOnly, gbc_rdbtnDownloadOnly);

			buttonGroup3.add(rdbtnDownloadOnly);
		}
		{
			JLabel lblVerbosehigherValue = new JLabel(
					"Verbose (higher value = more comments):");
			GridBagConstraints gbc_lblVerbosehigherValue = new GridBagConstraints();
			gbc_lblVerbosehigherValue.anchor = GridBagConstraints.WEST;
			gbc_lblVerbosehigherValue.gridwidth = 3;
			gbc_lblVerbosehigherValue.insets = new Insets(0, 0, 5, 5);
			gbc_lblVerbosehigherValue.gridx = 0;
			gbc_lblVerbosehigherValue.gridy = 6;
			contentPanel.add(lblVerbosehigherValue, gbc_lblVerbosehigherValue);
		}
		{
			JComboBox comboBox = new JComboBox();
			GridBagConstraints gbc_comboBox = new GridBagConstraints();
			gbc_comboBox.insets = new Insets(0, 0, 5, 0);
			gbc_comboBox.fill = GridBagConstraints.HORIZONTAL;
			gbc_comboBox.gridx = 3;
			gbc_comboBox.gridy = 6;
			comboBox.addItem("0");
			comboBox.addItem("1");
			comboBox.addItem("2");
			comboBox.addItem("3");
			comboBox.addItem("4");
			comboBox.addItem("5");
			comboBox.addItem("6");
			comboBox.addItem("7");
			comboBox.addItem("8");
			comboBox.addItem("9");
			comboBox.addItem("10");
			contentPanel.add(comboBox, gbc_comboBox);
		}
		{
			JLabel lblGraphicsMode = new JLabel("Graphics Mode:");
			GridBagConstraints gbc_lblGraphicsMode = new GridBagConstraints();
			gbc_lblGraphicsMode.anchor = GridBagConstraints.WEST;
			gbc_lblGraphicsMode.insets = new Insets(0, 0, 5, 5);
			gbc_lblGraphicsMode.gridx = 0;
			gbc_lblGraphicsMode.gridy = 7;
			contentPanel.add(lblGraphicsMode, gbc_lblGraphicsMode);
		}
		ButtonGroup buttonGroup4 = new ButtonGroup();
		{
			JRadioButton rdbtnHardwareRender = new JRadioButton(
					"Hardware Render");
			GridBagConstraints gbc_rdbtnHardwareRender = new GridBagConstraints();
			gbc_rdbtnHardwareRender.anchor = GridBagConstraints.WEST;
			gbc_rdbtnHardwareRender.insets = new Insets(0, 0, 5, 5);
			gbc_rdbtnHardwareRender.gridx = 1;
			gbc_rdbtnHardwareRender.gridy = 7;
			contentPanel.add(rdbtnHardwareRender, gbc_rdbtnHardwareRender);

			buttonGroup4.add(rdbtnHardwareRender);
		}
		{
			JRadioButton rdbtnSoftwareRender = new JRadioButton(
					"Software Render");
			rdbtnSoftwareRender.setSelected(true);
			GridBagConstraints gbc_rdbtnSoftwareRender = new GridBagConstraints();
			gbc_rdbtnSoftwareRender.anchor = GridBagConstraints.WEST;
			gbc_rdbtnSoftwareRender.insets = new Insets(0, 0, 5, 5);
			gbc_rdbtnSoftwareRender.gridx = 2;
			gbc_rdbtnSoftwareRender.gridy = 7;
			contentPanel.add(rdbtnSoftwareRender, gbc_rdbtnSoftwareRender);

			buttonGroup4.add(rdbtnSoftwareRender);
		}
		{
			JLabel lblTemplate = new JLabel("Template:");
			GridBagConstraints gbc_lblTemplate = new GridBagConstraints();
			gbc_lblTemplate.anchor = GridBagConstraints.WEST;
			gbc_lblTemplate.insets = new Insets(0, 0, 5, 5);
			gbc_lblTemplate.gridx = 0;
			gbc_lblTemplate.gridy = 8;
			contentPanel.add(lblTemplate, gbc_lblTemplate);
		}
		{
			chckbxLoadTemplate_1 = new JCheckBox("Load Template");
			chckbxLoadTemplate_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {

					// Create a new undo action
					// Save our current state in a final boolean so it is
					// accessible in the inner class below
					final boolean curState = chckbxLoadTemplate_1.isSelected();
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
							chckbxLoadTemplate_1.setSelected(curState);

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
							chckbxLoadTemplate_1.setSelected(!curState);

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
			chckbxLoadTemplate_1.setFont(new Font("Dialog", Font.BOLD, 10));
			GridBagConstraints gbc_chckbxLoadTemplate_1 = new GridBagConstraints();
			gbc_chckbxLoadTemplate_1.anchor = GridBagConstraints.WEST;
			gbc_chckbxLoadTemplate_1.insets = new Insets(0, 0, 5, 5);
			gbc_chckbxLoadTemplate_1.gridx = 1;
			gbc_chckbxLoadTemplate_1.gridy = 8;
			contentPanel.add(chckbxLoadTemplate_1, gbc_chckbxLoadTemplate_1);
		}
		{
			textField = new JTextField();
			GridBagConstraints gbc_textField = new GridBagConstraints();
			gbc_textField.gridwidth = 2;
			gbc_textField.insets = new Insets(0, 0, 0, 5);
			gbc_textField.fill = GridBagConstraints.HORIZONTAL;
			gbc_textField.gridx = 1;
			gbc_textField.gridy = 9;
			contentPanel.add(textField, gbc_textField);
			textField.setColumns(10);
		}
		{
			JButton btnBrowse = new JButton("Browse");
			GridBagConstraints gbc_btnBrowse = new GridBagConstraints();
			gbc_btnBrowse.gridx = 3;
			gbc_btnBrowse.gridy = 9;
			contentPanel.add(btnBrowse, gbc_btnBrowse);
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.CENTER));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton btnSave = new JButton("Save");
				btnSave.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						dispose();
					}
				});
				btnSave.setActionCommand("btnSave");
				btnSave.setName("btnSave");
				buttonPane.add(btnSave);
			}
			{
				JButton btnReset = new JButton("Reset");
				btnReset.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						dispose();
					}
				});
				btnReset.setActionCommand("btnReset");
				btnReset.setName("btnReset");
				buttonPane.add(btnReset);
			}
			{
				JButton btnResetToDefault = new JButton("Reset to Default");
				btnResetToDefault.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						dispose();
					}
				});
				btnResetToDefault.setActionCommand("btnResetToDefault");
				btnResetToDefault.setName("btnResetToDefault");
				buttonPane.add(btnResetToDefault);
			}
			{
				JButton btnClose = new JButton("Close");
				btnClose.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						dispose();
					}
				});
				btnClose.setActionCommand("btnClose");
				btnClose.setName("btnClose");
				buttonPane.add(btnClose);
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
