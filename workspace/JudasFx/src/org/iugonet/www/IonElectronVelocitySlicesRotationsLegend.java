package org.iugonet.www;

import java.awt.BorderLayout;
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

import java.awt.GridLayout;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class IonElectronVelocitySlicesRotationsLegend extends JDialog {

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
			IonElectronVelocitySlicesRotationsLegend dialog = new IonElectronVelocitySlicesRotationsLegend();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public IonElectronVelocitySlicesRotationsLegend() {
		super();
		undoableEditSupport = new UndoableEditSupport(this);

		setTitle("Ion/Electron Velocity Slices - Rotations Legend");
		
		Icons icons = new Icons();
		setIconImage(icons.getImage("icons/favicon.ico"));

		setBounds(100, 100, 650, 240);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(new GridLayout(0, 1, 0, 0));
		//
		String str = "";
		str = str
				+ "BV: The x axis is parallel to B field; the bulk velocity defines the x-y plane.\n";
		str = str
				+ "BE: The x axis is parallel to B field; the B x V(bulk) vector defines the x-y plane.\n";
		str = str + "xyz: The x axis is V_x and the y_axis is V_y.\n";
		str = str
				+ "xvel: The x axis is V_x; teh x-y plane is defined by the bulk velocity.\n";
		str = str
				+ "perp: The x axis is the bulk velocity projected onto the plane normal to the B field; y is B x V(bulk).\n";
		str = str
				+ "perp_xyz: Geometric xy coordinates projected onto the plane normal to the B field.\n\n";
		str = str
				+ "Rotations such as \"zx\" and \"perp_yz\" can be replicated by selecting the \"xyz\"/\"perp_xyz\" option and\n";
		str = str
				+ "changeing the orientation vector (the slice plane normal) to correspond with the desired rotation.\n";
		str = str + "**e.g. <1,0,0> will replicate a \"yz\" rotation\n";
		JTextArea txtArea = new JTextArea();
		txtArea.setText(str);
		//
		JScrollPane scrollPane = new JScrollPane(txtArea);
		contentPanel.add(scrollPane);

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
