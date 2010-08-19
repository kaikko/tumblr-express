package com.thesaguaros.tumblrexpress.pojo.castor;


public class Dashboard {

	private String version;
	private Posts posts;

	public void setVersion(String version) {
		this.version = version;
	}

	public String getVersion() {
		return version;
	}

	public void setPosts(Posts posts) {
		this.posts = posts;
	}

	public Posts getPosts() {
		return posts;
	}
	
}
