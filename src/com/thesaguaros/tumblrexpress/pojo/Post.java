package com.thesaguaros.tumblrexpress.pojo;

public class Post {

	private Tumblelog tumblelog;
	private String id;
	
	

	public void setTumblelog(Tumblelog tumblelog) {
		this.tumblelog = tumblelog;
	}

	public Tumblelog getTumblelog() {
		return tumblelog;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getId() {
		return id;
	}
	
}
