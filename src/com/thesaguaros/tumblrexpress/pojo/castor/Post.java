package com.thesaguaros.tumblrexpress.pojo.castor;

import java.util.List;

public class Post {

	private Tumblelog tumblelog;
	private String id;
	private String urlWithSlug;
	private String type;
	private String dateGmt;
	private String date;
	private String unixTimestamp;
	private String format;
	private String reblogKey;
	private String slug;
	private String tumblelogName;
	private int noteCount;
	
	private String regularTitle;
	private String regularBody;
	
	private String photoCaption;
	private String photoLinkUrl;
	private List<PhotoUrl> photoUrls;
	
	private List<String> tags;

	public String getUrlWithSlug() {
		return urlWithSlug;
	}

	public void setUrlWithSlug(String urlWithSlug) {
		this.urlWithSlug = urlWithSlug;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getUnixTimestamp() {
		return unixTimestamp;
	}

	public void setUnixTimestamp(String unixTimestamp) {
		this.unixTimestamp = unixTimestamp;
	}

	public String getFormat() {
		return format;
	}

	public void setFormat(String format) {
		this.format = format;
	}

	public String getReblogKey() {
		return reblogKey;
	}

	public void setReblogKey(String reblogKey) {
		this.reblogKey = reblogKey;
	}

	public String getSlug() {
		return slug;
	}

	public void setSlug(String slug) {
		this.slug = slug;
	}

	public String getTumblelogName() {
		return tumblelogName;
	}

	public void setTumblelogName(String tumblelogName) {
		this.tumblelogName = tumblelogName;
	}

	public int getNoteCount() {
		return noteCount;
	}

	public void setNoteCount(int noteCount) {
		this.noteCount = noteCount;
	}

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

	public void setDateGmt(String dateGmt) {
		this.dateGmt= dateGmt;
	}

	public String getDateGmt() {
		return dateGmt;
	}

	public void setRegularTitle(String regularTitle) {
		this.regularTitle = regularTitle;
	}

	public String getRegularTitle() {
		return regularTitle;
	}

	public void setRegularBody(String regularBody) {
		this.regularBody = regularBody;
	}

	public String getRegularBody() {
		return regularBody;
	}

	public void setTags(List<String> tags) {
		this.tags = tags;
	}

	public List<String> getTags() {
		return tags;
	}

	public void setPhotoCaption(String photoCaption) {
		this.photoCaption = photoCaption;
	}

	public String getPhotoCaption() {
		return photoCaption;
	}

	public void setPhotoLinkUrl(String photoLinkUrl) {
		this.photoLinkUrl = photoLinkUrl;
	}

	public String getPhotoLinkUrl() {
		return photoLinkUrl;
	}

	public void setPhotoUrls(List<PhotoUrl> photoUrls) {
		this.photoUrls = photoUrls;
	}

	public List<PhotoUrl> getPhotoUrls() {
		return photoUrls;
	}
	
}
