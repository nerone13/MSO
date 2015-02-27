package com.eslauer.models;

// Generated Feb 26, 2015 9:33:46 PM by Hibernate Tools 4.3.1

import java.util.Date;

/**
 * User generated by hbm2java
 */
public class User implements java.io.Serializable {

	private Integer userId;
	private String userName;
	private String password;
	private String email;
	private Date lastUpdate;
	private String nickName;

	public User() {
	}

	public User(String userName, String password, String email,
			Date lastUpdate, String nickName) {
		this.userName = userName;
		this.password = password;
		this.email = email;
		this.lastUpdate = lastUpdate;
		this.nickName = nickName;
	}

	public Integer getUserId() {
		return this.userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getLastUpdate() {
		return this.lastUpdate;
	}

	public void setLastUpdate(Date lastUpdate) {
		this.lastUpdate = lastUpdate;
	}

	public String getNickName() {
		return this.nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

}
