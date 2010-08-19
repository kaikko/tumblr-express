package com.thesaguaros.tumblrexpress.gui.dashboard;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;

public class DashboardPanel extends JPanel {

	private static final long serialVersionUID = 6922496375531695747L;

	private JTable table;

	public DashboardPanel() {
		DashboardTableModel dashboardTableModel = new DashboardTableModel();

		table = new JTable(dashboardTableModel);
		table.setDragEnabled(false);
		table.setRowSelectionAllowed(false);
		table.setColumnSelectionAllowed(false);
		table.setAutoCreateRowSorter(true);
		table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		// table.getColumn("").setCellRenderer(new ButtonRenderer());
		// table.getColumn("").setCellEditor(new ButtonEditor(new JCheckBox()));

		/*
		 * table.addMouseListener(new MouseAdapter() { public void
		 * mouseClicked(MouseEvent e) { int col = table.getSelectedColumn(); int
		 * row = table.getSelectedRow(); } });
		 */

		// The table displayed in a Scrollpane.
		JScrollPane scrollPane = new JScrollPane(table);
		// scrollPane.setPreferredSize(new Dimension(HistoryDialog.DIMENSION_X,
		// HistoryDialog.DIMENSION_Y - MainWindow.DIMENSION_APPBAR));

		add(scrollPane);
		setOpaque(true);

	}

}
