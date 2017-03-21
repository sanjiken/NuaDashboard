package com.NuaDashboard.model;



public class UserModelRequestAdd {
	
	private String userName;
    private String password;
    private String confPassword;
	private String email;
	private Boolean isActivate;
	public UserModelRequestAdd() {
		super();
	}
	public UserModelRequestAdd(String userName, String password, String confPassword, String email,
			Boolean isActivate) {
		super();
		this.userName = userName;
		this.password = password;
		this.confPassword = confPassword;
		this.email = email;
		this.isActivate = isActivate;
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
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	/**
	 * @return the confPassword
	 */
	public String getConfPassword() {
		return confPassword;
	}
	/**
	 * @param confPassword the confPassword to set
	 */
	public void setConfPassword(String confPassword) {
		this.confPassword = confPassword;
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
	 * @return the isActivate
	 */
	public Boolean getIsActivate() {
		return isActivate;
	}
	/**
	 * @param isActivate the isActivate to set
	 */
	public void setIsActivate(Boolean isActivate) {
		this.isActivate = isActivate;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "UserModelRequestAdd [userName=" + userName + ", password=" + password + ", confPassword=" + confPassword
				+ ", email=" + email + ", isActivate=" + isActivate + "]";
	}
	
	
	
}
