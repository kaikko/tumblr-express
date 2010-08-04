package com.thesaguaros.tumblrexpress.pojo;

public class User {

	private String defaultPostFormat;
	private int canUploadAudio;
	private int canUploadAiff;
	private int canAskQuestion;
	private int canUploadVideo;
	private int maxVideoBytesUploaded;
	private int likedPostCount;
	public String getDefaultPostFormat() {
		return defaultPostFormat;
	}
	public void setDefaultPostFormat(String defaultPostFormat) {
		this.defaultPostFormat = defaultPostFormat;
	}
	public int getCanUploadAudio() {
		return canUploadAudio;
	}
	public void setCanUploadAudio(int canUploadAudio) {
		this.canUploadAudio = canUploadAudio;
	}
	public int getCanUploadAiff() {
		return canUploadAiff;
	}
	public void setCanUploadAiff(int canUploadAiff) {
		this.canUploadAiff = canUploadAiff;
	}
	public int getCanAskQuestion() {
		return canAskQuestion;
	}
	public void setCanAskQuestion(int canAskQuestion) {
		this.canAskQuestion = canAskQuestion;
	}
	public int getCanUploadVideo() {
		return canUploadVideo;
	}
	public void setCanUploadVideo(int canUploadVideo) {
		this.canUploadVideo = canUploadVideo;
	}
	public int getMaxVideoBytesUploaded() {
		return maxVideoBytesUploaded;
	}
	public void setMaxVideoBytesUploaded(int maxVideoBytesUploaded) {
		this.maxVideoBytesUploaded = maxVideoBytesUploaded;
	}
	public int getLikedPostCount() {
		return likedPostCount;
	}
	public void setLikedPostCount(int likedPostCount) {
		this.likedPostCount = likedPostCount;
	}
	
	
	
}
