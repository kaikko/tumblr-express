package com.thesaguaros.tumblrexpress.gui;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;

import com.thesaguaros.tumblrexpress.gui.dashboard.DashboardPanel;

public class MainWindow extends JFrame {

	private static final long serialVersionUID = -7078077481660745436L;

	private final static int DIMENSION_X = 760;
	private final static int DIMENSION_Y = 410;
	private final static int DIMENSION_APPBAR = 60;
	
	private DashboardPanel dashboardPanel;

	public MainWindow() {
		initComponents();

		pack();
		// controllo la dimensione del desktop e centro la finestra sullo
		// schermo
		Dimension xy = Toolkit.getDefaultToolkit().getScreenSize();
		double xxx = (xy.getWidth() - DIMENSION_X) / 2;
		double yyy = (xy.getHeight() - DIMENSION_APPBAR - DIMENSION_Y) / 2;
		setLocation((int) xxx, (int) yyy);
	}

	private void initComponents() {
		setTitle("tumblr-express");
		setResizable(false);
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent evt) {
				exitForm(evt);
			}
		});

		dashboardPanel = new DashboardPanel();
		getContentPane().add(dashboardPanel, BorderLayout.CENTER);
	}

	// azione del pulsante di chiusura
	private void exitForm(WindowEvent evt) {
		System.exit(0);
	}

	public static void main(String[] args) {
		MainWindow mainWin = new MainWindow();
		mainWin.setVisible(true);
	}

}
