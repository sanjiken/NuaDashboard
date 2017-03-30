package com.NuaDashboard.model;



public class UserModelRequestAdd {
	
	private String userName;
    private String password;
    private String confPassword;
	private String email;
	private Boolean isActivate;
	private String numtel;
	private String adress;
	
	public UserModelRequestAdd() {
		super();
	}

	public UserModelRequestAdd(String userName, String password, String confPassword, String email, Boolean isActivate,
			String numtel, String adress) {
		super();
		this.userName = userName;
		this.password = password;
		this.confPassword = confPassword;
		this.email = email;
		this.isActivate = isActivate;
		this.numtel = numtel;
		this.adress = adress;
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

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "UserModelRequestAdd [userName=" + userName + ", password=" + password + ", confPassword=" + confPassword
				+ ", email=" + email + ", isActivate=" + isActivate + ", numtel=" + numtel + ", adress=" + adress + "]";
	}
	
	
	
	
}
