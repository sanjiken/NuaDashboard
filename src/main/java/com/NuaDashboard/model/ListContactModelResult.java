package com.NuaDashboard.model;

public class ListContactModelResult {

	private Integer id;
	private String userName;
	
	public ListContactModelResult() {
		super();
	}
	public ListContactModelResult(Integer id, String userName) {
		super();
		this.id = id;
		this.userName = userName;
	}
	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}
	/**
	 * @return the userName
	 */
	public String getUserName() {
		return userName;
	}
	/**
	 * @param userName the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	
}
