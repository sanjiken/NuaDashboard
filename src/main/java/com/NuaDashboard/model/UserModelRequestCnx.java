package com.NuaDashboard.model;

public class UserModelRequestCnx {
	
	private String email;
	private String password;
	
	public UserModelRequestCnx() {
		super();
	}

	public UserModelRequestCnx(String email, String password) {
		super();
		this.email = email;
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "UserModelRequestCnx [email=" + email + ", password=" + password + "]";
	}
	
	
}
