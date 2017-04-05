package com.NuaDashboard.model;

import com.NuaDashboard.entity.UserEntity;

public class ClientModelRequest {
    private Object idClient;
	private String userName;
	private String password;
	private String email;
	private String adress ;
    private String numtel;
	private Boolean isActivate;
	private Boolean isDeleted;
	
	
	public ClientModelRequest() {
		super();
	}

	public ClientModelRequest(Object idClient, String userName, String password, String email, String adress,
			String numtel, Boolean isActivate, Boolean isDeleted) {
		super();
		this.idClient = idClient;
		this.userName = userName;
		this.password = password;
		this.email = email;
		this.adress = adress;
		this.numtel = numtel;
		this.isActivate = isActivate;
		this.isDeleted = isDeleted;
	}

	public Object getIdClient() {
		return idClient;
	}

	public void setIdClient(Object idClient) {
		this.idClient = idClient;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public String getNumtel() {
		return numtel;
	}

	public void setNumtel(String numtel) {
		this.numtel = numtel;
	}

	public Boolean getIsActivate() {
		return isActivate;
	}

	public void setIsActivate(Boolean isActivate) {
		this.isActivate = isActivate;
	}

	public Boolean getIsDeleted() {
		return isDeleted;
	}

	public void setIsDeleted(Boolean isDeleted) {
		this.isDeleted = isDeleted;
	}

	
}