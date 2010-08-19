package com.thesaguaros.tumblrexpress.pojo.castor;

import java.util.List;

public class Authenticate {
	private User user;
	private List<Tumblelog> tumblelogs;
	//private Tumblelog tumblelog;
	
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	/*
	public Tumblelog getTumblelog() {
		return tumblelog;
	}
	public void setTumblelog(Tumblelog tumblelog) {
		this.tumblelog = tumblelog;
	}*/
	public void setTumblelogs(List<Tumblelog> tumblelogs) {
		this.tumblelogs = tumblelogs;
	}
	public List<Tumblelog> getTumblelogs() {
		return tumblelogs;
	}
	
	
}
