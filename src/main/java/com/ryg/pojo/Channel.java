package com.ryg.pojo;

public class Channel {
	
	private Integer id;
	
	private String name;
	
	private String descripttion;
	
	private String icon;
	
	private Integer sorted;

	public Channel(Integer id, String name, String descripttion, String icon, Integer sorted) {
		super();
		this.id = id;
		this.name = name;
		this.descripttion = descripttion;
		this.icon = icon;
		this.sorted = sorted;
	}

	public Channel() {
		super();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescripttion() {
		return descripttion;
	}

	public void setDescripttion(String descripttion) {
		this.descripttion = descripttion;
	}

	public String getIcon() {
		return icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

	public Integer getSorted() {
		return sorted;
	}

	public void setSorted(Integer sorted) {
		this.sorted = sorted;
	}

	@Override
	public String toString() {
		return "Channel [id=" + id + ", name=" + name + ", descripttion=" + descripttion + ", icon=" + icon
				+ ", sorted=" + sorted + "]";
	}
	
	
	

}
