package com.thesaguaros.tumblrexpress.pojo.castor;

public class Tumblelog {

	private String title;
	private String type; //public or provate
	
	private String privateId; //for private blog only, to use with group in write API
	
	private String name; //public blogs only
	private String url; //public blogs only
	
	private String isPrimary; // yes if primary
	
	private String avatarUrl; //public blogs only
	private String avatarUrl16;
	private String avatarUrl24;
	private String avatarUrl30;
	private String avatarUrl40;
	private String avatarUrl48;
	private String avatarUrl64;
	private String avatarUrl96;
	private String avatarUrl128;
	private String avatarUrl512;
	
	private int isAdmin;
	private int posts;
	private int twitterEnabled;
	private int draftCount;
	private int messagesCount;
	private int queueCount;
	private int backupPostLimit;
	private String timezone;
	
	private int followers;
	
	public String getAvatarUrl16() {
		return avatarUrl16;
	}
	public void setAvatarUrl16(String avatarUrl16) {
		this.avatarUrl16 = avatarUrl16;
	}
	public String getAvatarUrl24() {
		return avatarUrl24;
	}
	public void setAvatarUrl24(String avatarUrl24) {
		this.avatarUrl24 = avatarUrl24;
	}
	public String getAvatarUrl30() {
		return avatarUrl30;
	}
	public void setAvatarUrl30(String avatarUrl30) {
		this.avatarUrl30 = avatarUrl30;
	}
	public String getAvatarUrl40() {
		return avatarUrl40;
	}
	public void setAvatarUrl40(String avatarUrl40) {
		this.avatarUrl40 = avatarUrl40;
	}
	public String getAvatarUrl48() {
		return avatarUrl48;
	}
	public void setAvatarUrl48(String avatarUrl48) {
		this.avatarUrl48 = avatarUrl48;
	}
	public String getAvatarUrl64() {
		return avatarUrl64;
	}
	public void setAvatarUrl64(String avatarUrl64) {
		this.avatarUrl64 = avatarUrl64;
	}
	public String getAvatarUrl96() {
		return avatarUrl96;
	}
	public void setAvatarUrl96(String avatarUrl96) {
		this.avatarUrl96 = avatarUrl96;
	}
	public String getAvatarUrl128() {
		return avatarUrl128;
	}
	public void setAvatarUrl128(String avatarUrl128) {
		this.avatarUrl128 = avatarUrl128;
	}
	public String getAvatarUrl512() {
		return avatarUrl512;
	}
	public void setAvatarUrl512(String avatarUrl512) {
		this.avatarUrl512 = avatarUrl512;
	}

	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getIsAdmin() {
		return isAdmin;
	}
	public void setIsAdmin(int isAdmin) {
		this.isAdmin = isAdmin;
	}
	public int getPosts() {
		return posts;
	}
	public void setPosts(int posts) {
		this.posts = posts;
	}
	public int getTwitterEnabled() {
		return twitterEnabled;
	}
	public void setTwitterEnabled(int twitterEnabled) {
		this.twitterEnabled = twitterEnabled;
	}
	public int getDraftCount() {
		return draftCount;
	}
	public void setDraftCount(int draftCount) {
		this.draftCount = draftCount;
	}
	public int getMessagesCount() {
		return messagesCount;
	}
	public void setMessagesCount(int messagesCount) {
		this.messagesCount = messagesCount;
	}
	public int getQueueCount() {
		return queueCount;
	}
	public void setQueueCount(int queueCount) {
		this.queueCount = queueCount;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getFollowers() {
		return followers;
	}
	public void setFollowers(int followers) {
		this.followers = followers;
	}
	public String getAvatarUrl() {
		return avatarUrl;
	}
	public void setAvatarUrl(String avatarUrl) {
		this.avatarUrl = avatarUrl;
	}
	public String getIsPrimary() {
		return isPrimary;
	}
	public void setIsPrimary(String isPrimary) {
		this.isPrimary = isPrimary;
	}
	public int getBackupPostLimit() {
		return backupPostLimit;
	}
	public void setBackupPostLimit(int backupPostLimit) {
		this.backupPostLimit = backupPostLimit;
	}
	public void setTimezone(String timezone) {
		this.timezone = timezone;
	}
	public String getTimezone() {
		return timezone;
	}
	public void setPrivateId(String privateId) {
		this.privateId = privateId;
	}
	public String getPrivateId() {
		return privateId;
	}

	
	
}
