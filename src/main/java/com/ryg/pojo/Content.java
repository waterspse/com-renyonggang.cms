package com.ryg.pojo;

public class Content {
	
	
	private Integer id;
	
	private String title;
	
	private String content;

	public Content(Integer id, String title, String content) {
		super();
		this.id = id;
		this.title = title;
		this.content = content;
	}

	public Content() {
		super();
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

	@Override
	public String toString() {
		return "Content [id=" + id + ", title=" + title + ", content=" + content + "]";
	}

	
	
	

}
