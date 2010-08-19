package com.thesaguaros.tumblrexpress.gui.dashboard;

import java.util.List;

import javax.swing.table.AbstractTableModel;

import com.thesaguaros.tumblrexpress.pojo.castor.Dashboard;
import com.thesaguaros.tumblrexpress.pojo.castor.Post;
import com.thesaguaros.tumblrexpress.turmblr.api.Services;

public class DashboardTableModel extends AbstractTableModel {

	private static final long serialVersionUID = 4526554965720939810L;
	private static final String[] title = { "id", "tumblName", "data", "author"};
	private List<Post> data;
	
	public DashboardTableModel() {
		Services services = new Services();
		Dashboard dash = services.getDashboardPosts();
		data = dash.getPosts().getPosts();
	}
	
	@Override
	public boolean isCellEditable(int row, int column) {
		return false;
	}

	@Override
	public String getColumnName(int column) {
		return title[column];
	}

	@Override
	public int getColumnCount() {
		return title.length;
	}

	@Override
	public int getRowCount() {
		return data.size();
	}

	@Override
	public Object getValueAt(int row, int column) {
		switch(column) {
		case 0:
			return data.get(row).getId();
		case 1:
			return data.get(row).getTumblelogName();
		case 2:
			return data.get(row).getDate();
		case 3:
			return data.get(row).getTumblelog().getName();
		default:
			return "";
		}
	}

}

