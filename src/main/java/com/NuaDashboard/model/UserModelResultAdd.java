package com.NuaDashboard.model;

public class UserModelResultAdd {
	private Integer id;
	private String userName;
	private String email;
	
	public UserModelResultAdd() {
		super();
	}
	public UserModelResultAdd(Integer id, String userName, String email) {
		super();
		this.id = id;
		this.userName = userName;
		this.email = email;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "UserModelResultAdd [id=" + id + ", userName=" + userName + ", email=" + email + "]";
	}

	
}
