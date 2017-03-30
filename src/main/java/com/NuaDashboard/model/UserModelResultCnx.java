package com.NuaDashboard.model;

public class UserModelResultCnx {
	private Integer id;
	private String userName;
	private String email;
	private String numtel;
    private String adress;
    private String role;
    
	public UserModelResultCnx() {
		super();
	}
	public UserModelResultCnx(Integer id, String userName, String email, String numtel, String adress, String role) {
		super();
		this.id = id;
		this.userName = userName;
		this.email = email;
		this.numtel = numtel;
		this.adress = adress;
		this.role = role;
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
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * @return the numtel
	 */
	public String getNumtel() {
		return numtel;
	}
	/**
	 * @param numtel the numtel to set
	 */
	public void setNumtel(String numtel) {
		this.numtel = numtel;
	}
	/**
	 * @return the adress
	 */
	public String getAdress() {
		return adress;
	}
	/**
	 * @param adress the adress to set
	 */
	public void setAdress(String adress) {
		this.adress = adress;
	}
	/**
	 * @return the role
	 */
	public String getRole() {
		return role;
	}
	/**
	 * @param role the role to set
	 */
	public void setRole(String role) {
		this.role = role;
	}

	
		 
}
