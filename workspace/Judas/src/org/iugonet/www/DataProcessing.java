package org.iugonet.www;

import java.awt.FlowLayout;

import javax.swing.AbstractAction;
import javax.swing.InputMap;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.KeyStroke;
import javax.swing.border.EmptyBorder;
import javax.swing.undo.UndoableEditSupport;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

import javax.swing.JLabel;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;

import java.awt.Font;
import javax.swing.JScrollPane;

public class DataProcessing extends JDialog {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();

	protected UndoableEditSupport undoableEditSupport;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			DataProcessing dialog = new DataProcessing();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public DataProcessing() {
		super();
		undoableEditSupport = new UndoableEditSupport(this);

		setModal(true);
		setAlwaysOnTop(true);
		setTitle("Data Processing");
		
		Icons icons = new Icons();
		setIconImage(icons.getImage("icons/favicon.ico"));
		
		setBounds(100, 100, 900, 600);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[] { 896, 0 };
		gridBagLayout.rowHeights = new int[] { 550, 50, 0 };
		gridBagLayout.columnWeights = new double[] { 0.0, Double.MIN_VALUE };
		gridBagLayout.rowWeights = new double[] { 0.0, 0.0, Double.MIN_VALUE };
		getContentPane().setLayout(gridBagLayout);
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		GridBagConstraints gbc_contentPanel = new GridBagConstraints();
		gbc_contentPanel.fill = GridBagConstraints.BOTH;
		gbc_contentPanel.insets = new Insets(0, 0, 5, 0);
		gbc_contentPanel.gridx = 0;
		gbc_contentPanel.gridy = 0;
		getContentPane().add(contentPanel, gbc_contentPanel);
		GridBagLayout gbl_contentPanel = new GridBagLayout();
		gbl_contentPanel.columnWidths = new int[] { 310, 0, 310, 0, 0 };
		gbl_contentPanel.rowHeights = new int[] { 12, 12, 12, 12, 12, 12, 12,
				12, 0, 12, 12, 12, 12, 12, 12, 12, 12, 0, 0 };
		gbl_contentPanel.columnWeights = new double[] { 1.0, 0.0, 0.0, 1.0,
				Double.MIN_VALUE };
		gbl_contentPanel.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0,
				0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
				1.0, Double.MIN_VALUE };
		contentPanel.setLayout(gbl_contentPanel);
		{
			JLabel lblLoadedData = new JLabel("Loaded Data");
			GridBagConstraints gbc_lblLoadedData = new GridBagConstraints();
			gbc_lblLoadedData.anchor = GridBagConstraints.WEST;
			gbc_lblLoadedData.insets = new Insets(0, 0, 5, 5);
			gbc_lblLoadedData.gridx = 0;
			gbc_lblLoadedData.gridy = 0;
			contentPanel.add(lblLoadedData, gbc_lblLoadedData);
		}
		{
			JLabel lblActiveData = new JLabel("Active Data");
			GridBagConstraints gbc_lblActiveData = new GridBagConstraints();
			gbc_lblActiveData.anchor = GridBagConstraints.WEST;
			gbc_lblActiveData.insets = new Insets(0, 0, 5, 5);
			gbc_lblActiveData.gridx = 2;
			gbc_lblActiveData.gridy = 0;
			contentPanel.add(lblActiveData, gbc_lblActiveData);
		}
		{
			JScrollPane scrollPane = new JScrollPane();
			GridBagConstraints gbc_scrollPane = new GridBagConstraints();
			gbc_scrollPane.gridheight = 16;
			gbc_scrollPane.insets = new Insets(0, 0, 5, 5);
			gbc_scrollPane.fill = GridBagConstraints.BOTH;
			gbc_scrollPane.gridx = 0;
			gbc_scrollPane.gridy = 1;
			contentPanel.add(scrollPane, gbc_scrollPane);
		}
		{
			JScrollPane scrollPane = new JScrollPane();
			GridBagConstraints gbc_scrollPane = new GridBagConstraints();
			gbc_scrollPane.gridheight = 16;
			gbc_scrollPane.insets = new Insets(0, 0, 5, 5);
			gbc_scrollPane.fill = GridBagConstraints.BOTH;
			gbc_scrollPane.gridx = 2;
			gbc_scrollPane.gridy = 1;
			contentPanel.add(scrollPane, gbc_scrollPane);
		}
		{
			JButton btnSubtractAverage = new JButton("Subtract Average");
			btnSubtractAverage.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					dispose();
				}
			});
			btnSubtractAverage.setFont(new Font("Dialog", Font.BOLD, 12));
			GridBagConstraints gbc_btnSubtractAverage = new GridBagConstraints();
			gbc_btnSubtractAverage.insets = new Insets(0, 0, 5, 0);
			gbc_btnSubtractAverage.gridx = 3;
			gbc_btnSubtractAverage.gridy = 1;
			gbc_btnSubtractAverage.fill = GridBagConstraints.HORIZONTAL;
			contentPanel.add(btnSubtractAverage, gbc_btnSubtractAverage);
		}
		{
			JButton btnSubtractMedian = new JButton("Subtract Median");
			btnSubtractMedian.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					dispose();
				}
			});
			btnSubtractMedian.setFont(new Font("Dialog", Font.BOLD, 12));
			GridBagConstraints gbc_btnSubtractMedian = new GridBagConstraints();
			gbc_btnSubtractMedian.anchor = GridBagConstraints.NORTH;
			gbc_btnSubtractMedian.fill = GridBagConstraints.HORIZONTAL;
			gbc_btnSubtractMedian.insets = new Insets(0, 0, 5, 0);
			gbc_btnSubtractMedian.gridx = 3;
			gbc_btnSubtractMedian.gridy = 2;
			contentPanel.add(btnSubtractMedian, gbc_btnSubtractMedian);
		}
		{
			JButton btnSmoothData = new JButton("Smooth Data...");
			btnSmoothData.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					dispose();
				}
			});
			btnSmoothData.setFont(new Font("Dialog", Font.BOLD, 12));
			GridBagConstraints gbc_btnSmoothData = new GridBagConstraints();
			gbc_btnSmoothData.fill = GridBagConstraints.HORIZONTAL;
			gbc_btnSmoothData.insets = new Insets(0, 0, 5, 0);
			gbc_btnSmoothData.gridx = 3;
			gbc_btnSmoothData.gridy = 3;
			contentPanel.add(btnSmoothData, gbc_btnSmoothData);
		}
		{
			JButton btnHighPassFilter = new JButton("High Pass filter...");
			btnHighPassFilter.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					dispose();
				}
			});
			btnHighPassFilter.setFont(new Font("Dialog", Font.BOLD, 12));
			GridBagConstraints gbc_btnHighPassFilter = new GridBagConstraints();
			gbc_btnHighPassFilter.fill = GridBagConstraints.HORIZONTAL;
			gbc_btnHighPassFilter.insets = new Insets(0, 0, 5, 0);
			gbc_btnHighPassFilter.gridx = 3;
			gbc_btnHighPassFilter.gridy = 4;
			contentPanel.add(btnHighPassFilter, gbc_btnHighPassFilter);
		}
		{
			JButton btnBlockAverage = new JButton("Block Average...");
			btnBlockAverage.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					dispose();
				}
			});
			btnBlockAverage.setFont(new Font("Dialog", Font.BOLD, 12));
			GridBagConstraints gbc_btnBlockAverage = new GridBagConstraints();
			gbc_btnBlockAverage.fill = GridBagConstraints.HORIZONTAL;
			gbc_btnBlockAverage.insets = new Insets(0, 0, 5, 0);
			gbc_btnBlockAverage.gridx = 3;
			gbc_btnBlockAverage.gridy = 5;
			contentPanel.add(btnBlockAverage, gbc_btnBlockAverage);
		}
		{
			JButton btnClip = new JButton("Clip...");
			btnClip.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					dispose();
				}
			});
			btnClip.setFont(new Font("Dialog", Font.BOLD, 12));
			GridBagConstraints gbc_btnClip = new GridBagConstraints();
			gbc_btnClip.fill = GridBagConstraints.HORIZONTAL;
			gbc_btnClip.insets = new Insets(0, 0, 5, 0);
			gbc_btnClip.gridx = 3;
			gbc_btnClip.gridy = 6;
			contentPanel.add(btnClip, gbc_btnClip);
		}
		{
			JButton button = new JButton("");
			button.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
				}
			});

			/*
			 * button.setIcon(new ImageIcon(DataProcessing.class
			 * .getResource("/arrow-1-right20.png")));
			 */

			GridBagConstraints gbc_button = new GridBagConstraints();
			gbc_button.gridheight = 2;
			gbc_button.insets = new Insets(0, 0, 5, 5);
			gbc_button.gridx = 1;
			gbc_button.gridy = 7;
			contentPanel.add(button, gbc_button);
		}
		{
			JButton btnDeflag = new JButton("Deflag...");
			btnDeflag.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					dispose();
				}
			});
			btnDeflag.setFont(new Font("Dialog", Font.BOLD, 12));
			GridBagConstraints gbc_btnDeflag = new GridBagConstraints();
			gbc_btnDeflag.fill = GridBagConstraints.HORIZONTAL;
			gbc_btnDeflag.insets = new Insets(0, 0, 5, 0);
			gbc_btnDeflag.gridx = 3;
			gbc_btnDeflag.gridy = 7;
			contentPanel.add(btnDeflag, gbc_btnDeflag);
		}
		{
			JButton btnLeftArrow = new JButton("");
			/*
			 * btnLeftArrow.setIcon(new ImageIcon(DataProcessing.class
			 * .getResource("/arrow-1-left20.png")));
			 */

			GridBagConstraints gbc_btnLeftArrow = new GridBagConstraints();
			gbc_btnLeftArrow.gridheight = 2;
			gbc_btnLeftArrow.insets = new Insets(0, 0, 5, 5);
			gbc_btnLeftArrow.gridx = 1;
			gbc_btnLeftArrow.gridy = 8;
			contentPanel.add(btnLeftArrow, gbc_btnLeftArrow);
		}
		{
			JButton btnDegap = new JButton("Degap...");
			btnDegap.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					dispose();
				}
			});
			btnDegap.setFont(new Font("Dialog", Font.BOLD, 12));
			GridBagConstraints gbc_btnDegap = new GridBagConstraints();
			gbc_btnDegap.fill = GridBagConstraints.HORIZONTAL;
			gbc_btnDegap.insets = new Insets(0, 0, 5, 0);
			gbc_btnDegap.gridx = 3;
			gbc_btnDegap.gridy = 8;
			contentPanel.add(btnDegap, gbc_btnDegap);
		}
		{
			JButton btnInterpolate = new JButton("Interpolate...");
			btnInterpolate.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					dispose();
				}
			});
			btnInterpolate.setFont(new Font("Dialog", Font.BOLD, 12));
			GridBagConstraints gbc_btnInterpolate = new GridBagConstraints();
			gbc_btnInterpolate.fill = GridBagConstraints.HORIZONTAL;
			gbc_btnInterpolate.insets = new Insets(0, 0, 5, 0);
			gbc_btnInterpolate.gridx = 3;
			gbc_btnInterpolate.gridy = 9;
			contentPanel.add(btnInterpolate, gbc_btnInterpolate);
		}
		{
			JButton btnCleanSpikes = new JButton("Clean Spikes...");
			btnCleanSpikes.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					dispose();
				}
			});
			btnCleanSpikes.setFont(new Font("Dialog", Font.BOLD, 12));
			GridBagConstraints gbc_btnCleanSpikes = new GridBagConstraints();
			gbc_btnCleanSpikes.fill = GridBagConstraints.HORIZONTAL;
			gbc_btnCleanSpikes.insets = new Insets(0, 0, 5, 0);
			gbc_btnCleanSpikes.gridx = 3;
			gbc_btnCleanSpikes.gridy = 10;
			contentPanel.add(btnCleanSpikes, gbc_btnCleanSpikes);
		}
		{
			JButton btnTimeDerivative = new JButton("Time Derivative...");
			btnTimeDerivative.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					dispose();
				}
			});
			btnTimeDerivative.setFont(new Font("Dialog", Font.BOLD, 12));
			GridBagConstraints gbc_btnTimeDerivative = new GridBagConstraints();
			gbc_btnTimeDerivative.fill = GridBagConstraints.HORIZONTAL;
			gbc_btnTimeDerivative.insets = new Insets(0, 0, 5, 0);
			gbc_btnTimeDerivative.gridx = 3;
			gbc_btnTimeDerivative.gridy = 11;
			contentPanel.add(btnTimeDerivative, gbc_btnTimeDerivative);
		}
		{
			JButton btnWaveletTransform = new JButton("Wavelet Transform...");
			btnWaveletTransform.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					dispose();
				}
			});
			btnWaveletTransform.setFont(new Font("Dialog", Font.BOLD, 12));
			GridBagConstraints gbc_btnWaveletTransform = new GridBagConstraints();
			gbc_btnWaveletTransform.fill = GridBagConstraints.HORIZONTAL;
			gbc_btnWaveletTransform.insets = new Insets(0, 0, 5, 0);
			gbc_btnWaveletTransform.gridx = 3;
			gbc_btnWaveletTransform.gridy = 12;
			contentPanel.add(btnWaveletTransform, gbc_btnWaveletTransform);
		}
		{
			JButton btnPowerSpectrum = new JButton("Power Spectrum...");
			btnPowerSpectrum.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					dispose();
				}
			});
			btnPowerSpectrum.setFont(new Font("Dialog", Font.BOLD, 12));
			GridBagConstraints gbc_btnPowerSpectrum = new GridBagConstraints();
			gbc_btnPowerSpectrum.fill = GridBagConstraints.HORIZONTAL;
			gbc_btnPowerSpectrum.insets = new Insets(0, 0, 5, 0);
			gbc_btnPowerSpectrum.gridx = 3;
			gbc_btnPowerSpectrum.gridy = 13;
			contentPanel.add(btnPowerSpectrum, gbc_btnPowerSpectrum);
		}
		{
			JButton btnCoordinateTransform = new JButton(
					"Coordinate Transform...");
			btnCoordinateTransform.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					dispose();
				}
			});
			btnCoordinateTransform.setFont(new Font("Dialog", Font.BOLD, 12));
			GridBagConstraints gbc_btnCoordinateTransform = new GridBagConstraints();
			gbc_btnCoordinateTransform.fill = GridBagConstraints.HORIZONTAL;
			gbc_btnCoordinateTransform.insets = new Insets(0, 0, 5, 0);
			gbc_btnCoordinateTransform.gridx = 3;
			gbc_btnCoordinateTransform.gridy = 14;
			contentPanel
					.add(btnCoordinateTransform, gbc_btnCoordinateTransform);
		}
		{
			JButton btnSplitVariable = new JButton("Split Variable");
			btnSplitVariable.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					dispose();
				}
			});
			btnSplitVariable.setFont(new Font("Dialog", Font.BOLD, 12));
			GridBagConstraints gbc_btnSplitVariable = new GridBagConstraints();
			gbc_btnSplitVariable.fill = GridBagConstraints.HORIZONTAL;
			gbc_btnSplitVariable.insets = new Insets(0, 0, 5, 0);
			gbc_btnSplitVariable.gridx = 3;
			gbc_btnSplitVariable.gridy = 15;
			contentPanel.add(btnSplitVariable, gbc_btnSplitVariable);
		}
		{
			JButton btnJoinVariables = new JButton("Join Variables...");
			btnJoinVariables.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					dispose();
				}
			});
			GridBagConstraints gbc_btnJoinVariables = new GridBagConstraints();
			gbc_btnJoinVariables.fill = GridBagConstraints.HORIZONTAL;
			gbc_btnJoinVariables.insets = new Insets(0, 0, 5, 0);
			gbc_btnJoinVariables.gridx = 3;
			gbc_btnJoinVariables.gridy = 16;
			contentPanel.add(btnJoinVariables, gbc_btnJoinVariables);
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.CENTER));
			GridBagConstraints gbc_buttonPane = new GridBagConstraints();
			gbc_buttonPane.anchor = GridBagConstraints.NORTH;
			gbc_buttonPane.fill = GridBagConstraints.HORIZONTAL;
			gbc_buttonPane.gridx = 0;
			gbc_buttonPane.gridy = 1;
			getContentPane().add(buttonPane, gbc_buttonPane);
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
