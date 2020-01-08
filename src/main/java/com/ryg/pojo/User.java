package com.ryg.pojo;

import java.util.Date;

/**
 * @author lenovo
 *
 */
public class User {

	
	private Integer id;
	
	private String username;
	
	private String heading;
	
	private String password;
	
	private String nickname;
	
	private Date birthday;
	
	private Integer gender;
	
	private Integer locked;
	
	private Integer score;
	
	private String role;
	
	private String url;
	
	private String create_time;
	
	private String update_time;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getHeading() {
		return heading;
	}

	public void setHeading(String heading) {
		this.heading = heading;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public Integer getGender() {
		return gender;
	}

	public void setGender(Integer gender) {
		this.gender = gender;
	}

	public Integer getLocked() {
		return locked;
	}

	public void setLocked(Integer locked) {
		this.locked = locked;
	}

	public Integer getScore() {
		return score;
	}

	public void setScore(Integer score) {
		this.score = score;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getCreate_time() {
		return create_time;
	}

	public void setCreate_time(String create_time) {
		this.create_time = create_time;
	}

	public String getUpdate_time() {
		return update_time;
	}

	public void setUpdate_time(String update_time) {
		this.update_time = update_time;
	}

	public User(Integer id, String username, String heading, String password, String nickname, Date birthday,
			Integer gender, Integer locked, Integer score, String role, String url, String create_time,
			String update_time) {
		super();
		this.id = id;
		this.username = username;
		this.heading = heading;
		this.password = password;
		this.nickname = nickname;
		this.birthday = birthday;
		this.gender = gender;
		this.locked = locked;
		this.score = score;
		this.role = role;
		this.url = url;
		this.create_time = create_time;
		this.update_time = update_time;
	}

	public User() {
		super();
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", heading=" + heading + ", password=" + password
				+ ", nickname=" + nickname + ", birthday=" + birthday + ", gender=" + gender + ", locked=" + locked
				+ ", score=" + score + ", role=" + role + ", url=" + url + ", create_time=" + create_time
				+ ", update_time=" + update_time + "]";
	}
	
	
	
}
