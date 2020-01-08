package com.ryg.pojo;

import java.util.Date;

public class Article {
	
	private Integer id;
	
	private String title;
	
	private String content;
	
	private Integer channel_id;
	
	private Integer category_id;
	
	private Integer user_id;
	
	private Integer hits;
	
	private Integer hot;
	
	private Integer status;
	
	private Integer deleted;
	
	private Date created;
	
	private Date updated;
	
	private Integer commentCnt;
	
	private Integer tousuCnt;

	public Article(Integer id, String title, String content, Integer channel_id, Integer category_id, Integer user_id,
			Integer hits, Integer hot, Integer status, Integer deleted, Date created, Date updated, Integer commentCnt,
			Integer tousuCnt) {
		super();
		this.id = id;
		this.title = title;
		this.content = content;
		this.channel_id = channel_id;
		this.category_id = category_id;
		this.user_id = user_id;
		this.hits = hits;
		this.hot = hot;
		this.status = status;
		this.deleted = deleted;
		this.created = created;
		this.updated = updated;
		this.commentCnt = commentCnt;
		this.tousuCnt = tousuCnt;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Integer getChannel_id() {
		return channel_id;
	}

	public void setChannel_id(Integer channel_id) {
		this.channel_id = channel_id;
	}

	public Integer getCategory_id() {
		return category_id;
	}

	public void setCategory_id(Integer category_id) {
		this.category_id = category_id;
	}

	public Integer getUser_id() {
		return user_id;
	}

	public void setUser_id(Integer user_id) {
		this.user_id = user_id;
	}

	public Integer getHits() {
		return hits;
	}

	public void setHits(Integer hits) {
		this.hits = hits;
	}

	public Integer getHot() {
		return hot;
	}

	public void setHot(Integer hot) {
		this.hot = hot;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Integer getDeleted() {
		return deleted;
	}

	public void setDeleted(Integer deleted) {
		this.deleted = deleted;
	}

	public Date getCreated() {
		return created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}

	public Date getUpdated() {
		return updated;
	}

	public void setUpdated(Date updated) {
		this.updated = updated;
	}

	public Integer getCommentCnt() {
		return commentCnt;
	}

	public void setCommentCnt(Integer commentCnt) {
		this.commentCnt = commentCnt;
	}

	public Integer getTousuCnt() {
		return tousuCnt;
	}

	public void setTousuCnt(Integer tousuCnt) {
		this.tousuCnt = tousuCnt;
	}

	@Override
	public String toString() {
		return "Article [id=" + id + ", title=" + title + ", content=" + content + ", channel_id=" + channel_id
				+ ", category_id=" + category_id + ", user_id=" + user_id + ", hits=" + hits + ", hot=" + hot
				+ ", status=" + status + ", deleted=" + deleted + ", created=" + created + ", updated=" + updated
				+ ", commentCnt=" + commentCnt + ", tousuCnt=" + tousuCnt + "]";
	}

	public Article() {
		super();
	}
	
	

}
