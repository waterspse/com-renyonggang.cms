package com.ryg.pojo;

public class Article_Tag {

	
	
	private Integer aid;
	
	private Integer tid;
	
	


	public Article_Tag(Integer aid, Integer tid) {
		super();
		this.aid = aid;
		this.tid = tid;
	}

	public Integer getAid() {
		return aid;
	}

	public void setAid(Integer aid) {
		this.aid = aid;
	}

	public Integer getTid() {
		return tid;
	}

	public void setTid(Integer tid) {
		this.tid = tid;
	}

	@Override
	public String toString() {
		return "Article_Tag [aid=" + aid + ", tid=" + tid + "]";
	}

	
	
	
}
