package org.iugonet.www;

import java.awt.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;

import javax.swing.*;
import javax.swing.undo.UndoableEditSupport;

import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.JDOMException;
import org.jdom2.input.SAXBuilder;

public class Project extends JPanel implements ActionListener {

	private static final long serialVersionUID = 1L;
	private String projectName;
	protected Element root;
	protected Document doc;

	protected UndoableEditSupport undoableEditSupport;

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public Project() {
		super();
		undoableEditSupport = new UndoableEditSupport(this);

		this.setLayout(new BorderLayout());
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		String cmd = arg0.getActionCommand();

		if (cmd.equals("Done")) {
			// this.dispose();
			System.out.println("Done from Project");
		}
	}

	public void readConf(URL url) {
		System.out.println("Project.readConf");
		try {
			URLConnection conn = url.openConnection();
			doc = new SAXBuilder().build(conn.getInputStream());
			root = doc.getRootElement();
			setProjectName(root.getChild("Tab").getChild("Name").getValue());
		} catch (JDOMException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
