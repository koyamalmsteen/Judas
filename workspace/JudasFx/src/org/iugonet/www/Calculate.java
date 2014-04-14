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
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Image;
import java.awt.Insets;
import java.net.URL;

import javax.swing.AbstractAction;
import javax.swing.ImageIcon;
import javax.swing.InputMap;
import javax.swing.JComponent;
import javax.swing.JScrollPane;
import javax.swing.JList;
import javax.swing.KeyStroke;

public class Calculate extends JDialog {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JTextField txtscratch;

	protected UndoableEditSupport undoableEditSupport;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Calculate dialog = new Calculate();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Calculate() {
		super();
		undoableEditSupport = new UndoableEditSupport(this);

		setModal(true);
		setAlwaysOnTop(true);
		setTitle("Calculate");
		setIconImage(getImage("icons/favicon.ico"));
		setBounds(100, 100, 1000, 650);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		GridBagLayout gbl_contentPanel = new GridBagLayout();
		gbl_contentPanel.columnWidths = new int[] { 30, 30, 0, 60, 50, 300,
				300, 300, 0 };
		gbl_contentPanel.rowHeights = new int[] { 0, 230, 0, 230, 0, 0, 0 };
		gbl_contentPanel.columnWeights = new double[] { 1.0, 0.0, 0.0, 0.0,
				0.0, 1.0, 0.0, 0.0, Double.MIN_VALUE };
		gbl_contentPanel.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0,
				0.0, Double.MIN_VALUE };
		contentPanel.setLayout(gbl_contentPanel);
		{
			JLabel lblProgram = new JLabel("Program:");
			GridBagConstraints gbc_lblProgram = new GridBagConstraints();
			gbc_lblProgram.insets = new Insets(0, 0, 5, 5);
			gbc_lblProgram.anchor = GridBagConstraints.WEST;
			gbc_lblProgram.gridx = 0;
			gbc_lblProgram.gridy = 0;
			contentPanel.add(lblProgram, gbc_lblProgram);
		}
		{
			txtscratch = new JTextField();
			txtscratch.setText("-scratch-");
			GridBagConstraints gbc_txtscratch = new GridBagConstraints();
			gbc_txtscratch.gridwidth = 3;
			gbc_txtscratch.insets = new Insets(0, 0, 5, 5);
			gbc_txtscratch.fill = GridBagConstraints.HORIZONTAL;
			gbc_txtscratch.gridx = 1;
			gbc_txtscratch.gridy = 0;
			contentPanel.add(txtscratch, gbc_txtscratch);
			txtscratch.setColumns(10);
		}
		{
			JLabel lblInsertVariable = new JLabel("Insert Variable:");
			GridBagConstraints gbc_lblInsertVariable = new GridBagConstraints();
			gbc_lblInsertVariable.anchor = GridBagConstraints.WEST;
			gbc_lblInsertVariable.insets = new Insets(0, 0, 5, 5);
			gbc_lblInsertVariable.gridx = 6;
			gbc_lblInsertVariable.gridy = 0;
			contentPanel.add(lblInsertVariable, gbc_lblInsertVariable);
		}
		{
			JLabel lblInsertFunction = new JLabel("Insert Function:");
			GridBagConstraints gbc_lblInsertFunction = new GridBagConstraints();
			gbc_lblInsertFunction.anchor = GridBagConstraints.WEST;
			gbc_lblInsertFunction.insets = new Insets(0, 0, 5, 0);
			gbc_lblInsertFunction.gridx = 7;
			gbc_lblInsertFunction.gridy = 0;
			contentPanel.add(lblInsertFunction, gbc_lblInsertFunction);
		}
		{
			JScrollPane scrollPane = new JScrollPane();
			GridBagConstraints gbc_scrollPane = new GridBagConstraints();
			gbc_scrollPane.gridheight = 3;
			gbc_scrollPane.gridwidth = 5;
			gbc_scrollPane.insets = new Insets(0, 0, 5, 5);
			gbc_scrollPane.fill = GridBagConstraints.BOTH;
			gbc_scrollPane.gridx = 0;
			gbc_scrollPane.gridy = 1;
			contentPanel.add(scrollPane, gbc_scrollPane);
		}
		{
			Icons icons = new Icons();
			JButton button = new JButton(icons.getImageIcon("icons/info20.png"));
			button.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					System.out.println("HoGe");
				}
			});
			button.setIcon(icons.getImageIcon("icons/info20.png"));
			GridBagConstraints gbc_button = new GridBagConstraints();
			gbc_button.insets = new Insets(0, 0, 5, 5);
			gbc_button.gridx = 5;
			gbc_button.gridy = 2;
			contentPanel.add(button, gbc_button);
		}
		{
			JScrollPane scrollPane = new JScrollPane();
			GridBagConstraints gbc_scrollPane = new GridBagConstraints();
			gbc_scrollPane.gridheight = 3;
			gbc_scrollPane.insets = new Insets(0, 0, 5, 5);
			gbc_scrollPane.fill = GridBagConstraints.BOTH;
			gbc_scrollPane.gridx = 6;
			gbc_scrollPane.gridy = 1;
			contentPanel.add(scrollPane, gbc_scrollPane);
		}

		{
			JLabel lblInsertOperator = new JLabel("Insert Operator:");
			GridBagConstraints gbc_lblInsertOperator = new GridBagConstraints();
			gbc_lblInsertOperator.anchor = GridBagConstraints.WEST;
			gbc_lblInsertOperator.insets = new Insets(0, 0, 5, 0);
			gbc_lblInsertOperator.gridx = 7;
			gbc_lblInsertOperator.gridy = 2;
			contentPanel.add(lblInsertOperator, gbc_lblInsertOperator);
		}
		{
			JButton btnOpen = new JButton("Open");
			btnOpen.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					System.out.println("Open");
				}
			});
			GridBagConstraints gbc_btnOpen = new GridBagConstraints();
			gbc_btnOpen.insets = new Insets(0, 0, 5, 5);
			gbc_btnOpen.gridx = 1;
			gbc_btnOpen.gridy = 4;
			contentPanel.add(btnOpen, gbc_btnOpen);
		}
		{
			JButton btnSave = new JButton("Save");
			btnSave.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					System.out.println("Save");
				}
			});
			GridBagConstraints gbc_btnSave = new GridBagConstraints();
			gbc_btnSave.insets = new Insets(0, 0, 5, 5);
			gbc_btnSave.gridx = 2;
			gbc_btnSave.gridy = 4;
			contentPanel.add(btnSave, gbc_btnSave);
		}
		{
			JButton btnRun = new JButton("Run");
			btnRun.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					System.out.println("Run");
				}
			});
			GridBagConstraints gbc_btnRun = new GridBagConstraints();
			gbc_btnRun.insets = new Insets(0, 0, 5, 5);
			gbc_btnRun.gridx = 3;
			gbc_btnRun.gridy = 4;
			contentPanel.add(btnRun, gbc_btnRun);
		}
		{
			JLabel lblInsertConstant = new JLabel("Insert Constant:");
			GridBagConstraints gbc_lblInsertConstant = new GridBagConstraints();
			gbc_lblInsertConstant.insets = new Insets(0, 0, 5, 0);
			gbc_lblInsertConstant.anchor = GridBagConstraints.WEST;
			gbc_lblInsertConstant.gridx = 7;
			gbc_lblInsertConstant.gridy = 4;
			contentPanel.add(lblInsertConstant, gbc_lblInsertConstant);
		}
		{
			String[] strFunction = { "log(x[,base]", "ln(x)", "exp(x[,base])",
					"sqrt(x)", "abs(x)", "sin(x)", "arcsin(x)", "sinh(x)",
					"cos(x)", "arccos(x)", "cosh(x)", "tan(x)", "arctan(x)",
					"tanh(x)", "csc(x)", "arccsc(x)", "csch(x)", "sec(x)",
					"arcsec(x)", "sech(x)", "cot(x)", "arccot(x)", "coth(x)",
					"min(x[,dim])", "max(x[,dim])", "median(x[,dim])",
					"cound(x[,dim])", "total(x[,dim])" };
			JList listFunction = new JList(strFunction);

			JScrollPane scrollPane = new JScrollPane(listFunction);
			GridBagConstraints gbc_scrollPane = new GridBagConstraints();
			gbc_scrollPane.insets = new Insets(0, 0, 5, 0);
			gbc_scrollPane.fill = GridBagConstraints.BOTH;
			gbc_scrollPane.gridx = 7;
			gbc_scrollPane.gridy = 1;
			contentPanel.add(scrollPane, gbc_scrollPane);
		}
		{
			String[] strOperator = { "~", "++", "--", "-", "+", "*", "/", "^",
					"<", ">", "&&", "||", "#", "##", "mod", "and", "eq", "ge",
					"gt", "le", "lt", "or", "xor" };
			JList listOperator = new JList(strOperator);

			JScrollPane scrollPane = new JScrollPane(listOperator);
			GridBagConstraints gbc_scrollPane = new GridBagConstraints();
			gbc_scrollPane.insets = new Insets(0, 0, 5, 0);
			gbc_scrollPane.fill = GridBagConstraints.BOTH;
			gbc_scrollPane.gridx = 7;
			gbc_scrollPane.gridy = 3;
			contentPanel.add(scrollPane, gbc_scrollPane);
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
		 * Close by usig ESC-Key
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

	private Image getImage(String imageFileName) {
		URL imageUrl = this.getClass().getClassLoader()
				.getResource(imageFileName);
		Image image = (imageUrl != null) ? new ImageIcon(imageUrl).getImage()
				: new ImageIcon(imageFileName).getImage();
		return image;
	}

}
