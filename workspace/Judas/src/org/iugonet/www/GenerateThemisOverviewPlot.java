package org.iugonet.www;

import java.awt.BorderLayout;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.undo.UndoableEditSupport;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Font;
import java.awt.Insets;
import javax.swing.AbstractAction;
import javax.swing.ButtonGroup;

import javax.swing.InputMap;
import javax.swing.JCheckBox;
import javax.swing.JComponent;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JRadioButton;
import javax.swing.KeyStroke;

public class GenerateThemisOverviewPlot extends JDialog {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JTextField textField;

	protected UndoableEditSupport undoableEditSupport;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			GenerateThemisOverviewPlot dialog = new GenerateThemisOverviewPlot();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public GenerateThemisOverviewPlot() {
		super();
		undoableEditSupport = new UndoableEditSupport(this);

		setModal(true);
		setAlwaysOnTop(true);
		setTitle("Generate Themis Overview Plot");
		
		Icons icons = new Icons();
		setIconImage(icons.getImage("icons/favicon.ico"));
		
		setBounds(100, 100, 400, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		GridBagLayout gbl_contentPanel = new GridBagLayout();
		gbl_contentPanel.columnWidths = new int[] { 0, 0, 0, 0, 0, 0, 0 };
		gbl_contentPanel.rowHeights = new int[] { 0, 0, 0, 0, 0, 0 };
		gbl_contentPanel.columnWeights = new double[] { 0.0, 1.0, 0.0, 0.0,
				0.0, 0.0, Double.MIN_VALUE };
		gbl_contentPanel.rowWeights = new double[] { 0.0, 0.0, 0.0, 1.0, 0.0,
				Double.MIN_VALUE };
		contentPanel.setLayout(gbl_contentPanel);
		{
			JLabel lblCreatingTheOverview = new JLabel(
					"Creating the overview plot might take a few minutes.");
			lblCreatingTheOverview.setFont(new Font("Dialog", Font.BOLD, 10));
			GridBagConstraints gbc_lblCreatingTheOverview = new GridBagConstraints();
			gbc_lblCreatingTheOverview.gridwidth = 3;
			gbc_lblCreatingTheOverview.insets = new Insets(0, 0, 5, 5);
			gbc_lblCreatingTheOverview.gridx = 0;
			gbc_lblCreatingTheOverview.gridy = 0;
			contentPanel
					.add(lblCreatingTheOverview, gbc_lblCreatingTheOverview);
		}
		{
			JLabel lblProbe = new JLabel("Probe:");
			GridBagConstraints gbc_lblProbe = new GridBagConstraints();
			gbc_lblProbe.insets = new Insets(0, 0, 5, 5);
			gbc_lblProbe.gridx = 0;
			gbc_lblProbe.gridy = 1;
			contentPanel.add(lblProbe, gbc_lblProbe);
		}
		{
			JRadioButton rdbtnAp = new JRadioButton("A(P5)");
			GridBagConstraints gbc_rdbtnAp = new GridBagConstraints();
			gbc_rdbtnAp.insets = new Insets(0, 0, 5, 5);
			gbc_rdbtnAp.gridx = 1;
			gbc_rdbtnAp.gridy = 1;
			contentPanel.add(rdbtnAp, gbc_rdbtnAp);
		}
		ButtonGroup buttonGroup = new ButtonGroup();
		{
			JRadioButton rdbtnBp = new JRadioButton("B(P1)");
			GridBagConstraints gbc_rdbtnBp = new GridBagConstraints();
			gbc_rdbtnBp.insets = new Insets(0, 0, 5, 5);
			gbc_rdbtnBp.gridx = 2;
			gbc_rdbtnBp.gridy = 1;
			contentPanel.add(rdbtnBp, gbc_rdbtnBp);

			buttonGroup.add(rdbtnBp);
		}
		{
			JRadioButton rdbtnCp = new JRadioButton("C(P2)");
			GridBagConstraints gbc_rdbtnCp = new GridBagConstraints();
			gbc_rdbtnCp.insets = new Insets(0, 0, 5, 5);
			gbc_rdbtnCp.gridx = 3;
			gbc_rdbtnCp.gridy = 1;
			contentPanel.add(rdbtnCp, gbc_rdbtnCp);

			buttonGroup.add(rdbtnCp);
		}
		{
			JRadioButton rdbtnDp = new JRadioButton("D(P3)");
			GridBagConstraints gbc_rdbtnDp = new GridBagConstraints();
			gbc_rdbtnDp.insets = new Insets(0, 0, 5, 5);
			gbc_rdbtnDp.gridx = 4;
			gbc_rdbtnDp.gridy = 1;
			contentPanel.add(rdbtnDp, gbc_rdbtnDp);

			buttonGroup.add(rdbtnDp);
		}
		{
			JRadioButton rdbtnEp = new JRadioButton("E(P4)");
			GridBagConstraints gbc_rdbtnEp = new GridBagConstraints();
			gbc_rdbtnEp.insets = new Insets(0, 0, 5, 0);
			gbc_rdbtnEp.gridx = 5;
			gbc_rdbtnEp.gridy = 1;
			contentPanel.add(rdbtnEp, gbc_rdbtnEp);

			buttonGroup.add(rdbtnEp);
		}
		{
			JLabel lblStartTime = new JLabel("Start Time:");
			GridBagConstraints gbc_lblStartTime = new GridBagConstraints();
			gbc_lblStartTime.anchor = GridBagConstraints.EAST;
			gbc_lblStartTime.insets = new Insets(0, 0, 5, 5);
			gbc_lblStartTime.gridx = 0;
			gbc_lblStartTime.gridy = 2;
			contentPanel.add(lblStartTime, gbc_lblStartTime);
		}
		{
			textField = new JTextField();
			textField.setText("2007-03-23/00:00:00");
			GridBagConstraints gbc_textField = new GridBagConstraints();
			gbc_textField.insets = new Insets(0, 0, 5, 5);
			gbc_textField.fill = GridBagConstraints.HORIZONTAL;
			gbc_textField.gridx = 1;
			gbc_textField.gridy = 2;
			contentPanel.add(textField, gbc_textField);
			textField.setColumns(10);
		}
		{
			JButton btnMyCalendar_1 = new JButton("");
			btnMyCalendar_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					MyCalendar calendar = new MyCalendar();
					calendar.setLocationRelativeTo(null);
					calendar.setVisible(true);
				}
			});

			btnMyCalendar_1.setIcon(icons
					.getImageIcon("icons/calendar-alt-1-20.png"));
			GridBagConstraints gbc_button = new GridBagConstraints();
			gbc_button.insets = new Insets(0, 0, 5, 5);
			gbc_button.gridx = 2;
			gbc_button.gridy = 2;
			contentPanel.add(btnMyCalendar_1, gbc_button);
		}
		{
			JButton btnPlotKey = new JButton("Plot Key");
			GridBagConstraints gbc_btnPlotKey = new GridBagConstraints();
			gbc_btnPlotKey.insets = new Insets(0, 0, 0, 5);
			gbc_btnPlotKey.gridheight = 4;
			gbc_btnPlotKey.gridx = 3;
			gbc_btnPlotKey.gridy = 2;
			contentPanel.add(btnPlotKey, gbc_btnPlotKey);
		}
		{
			JLabel lblStopTime = new JLabel("Stop Time:");
			GridBagConstraints gbc_lblStopTime = new GridBagConstraints();
			gbc_lblStopTime.insets = new Insets(0, 0, 5, 5);
			gbc_lblStopTime.gridx = 0;
			gbc_lblStopTime.gridy = 3;
			contentPanel.add(lblStopTime, gbc_lblStopTime);
		}
		{
			JTextArea textArea = new JTextArea();
			textArea.setText("2007-03-24/00:00:00");
			GridBagConstraints gbc_textArea = new GridBagConstraints();
			gbc_textArea.insets = new Insets(0, 0, 5, 5);
			gbc_textArea.fill = GridBagConstraints.BOTH;
			gbc_textArea.gridx = 1;
			gbc_textArea.gridy = 3;
			contentPanel.add(textArea, gbc_textArea);
		}
		{
			JButton btnMyCalendar_2 = new JButton("");
			btnMyCalendar_2.addActionListener(new ActionListener() {
				public void actionPerformed1(ActionEvent e) {
					MyCalendar calendar = new MyCalendar();
					calendar.setLocationRelativeTo(null);
					calendar.setVisible(true);
				}

				@Override
				public void actionPerformed(ActionEvent arg0) {
					// TODO Auto-generated method stub
					
				}
			});

			btnMyCalendar_2.setIcon(icons
					.getImageIcon("icons/calendar-alt-1-20.png"));
			GridBagConstraints gbc_button = new GridBagConstraints();
			gbc_button.insets = new Insets(0, 0, 5, 5);
			gbc_button.gridx = 2;
			gbc_button.gridy = 3;
			contentPanel.add(btnMyCalendar_2, gbc_button);
		}
		{
			JCheckBox chckbxUseSingleDay = new JCheckBox("Use Single Day");
			GridBagConstraints gbc_chckbxUseSingleDay = new GridBagConstraints();
			gbc_chckbxUseSingleDay.insets = new Insets(0, 0, 0, 5);
			gbc_chckbxUseSingleDay.gridx = 1;
			gbc_chckbxUseSingleDay.gridy = 4;
			contentPanel.add(chckbxUseSingleDay, gbc_chckbxUseSingleDay);
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

	/*
	 * private Image getImage(String imageFileName){ URL imageUrl =
	 * this.getClass().getClassLoader().getResource(imageFileName); Image image
	 * = (imageUrl != null) ? new ImageIcon(imageUrl).getImage() : new
	 * ImageIcon(imageFileName).getImage(); return image; }
	 * 
	 * private ImageIcon getImageIcon(String imageFileName){ ImageIcon imageIcon
	 * = new ImageIcon(); imageIcon.setImage(getImage(imageFileName)); return
	 * imageIcon; }
	 */
}
