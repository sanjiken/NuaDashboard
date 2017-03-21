package com.NuaDashboard.model;

public class UserModelResultCnx {
	private Integer id;
	private String userName;
	private String email;
	
	public UserModelResultCnx() {
		super();
	}
	public UserModelResultCnx(Integer id, String userName, String email) {
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
	
	 
}
