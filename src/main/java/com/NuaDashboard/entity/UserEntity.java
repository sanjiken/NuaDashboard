package com.NuaDashboard.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "UserEntity")
public class UserEntity{

private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="hibernate_sequence2")
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="hibernate_sequence2")  
	private int id;
	
	@Column(name="USER_NAME")
	private String userName;


	@Column(name="PASSOWRD")
	private String password;
		
		
	
	@Column(name="EMAIL")
	private String email;
	
	
	
	@Column(name="IS_ACTIVATE")
	private Boolean isActivate;



	public UserEntity() {
		super();
	}



	public UserEntity(int id, String userName, String password, String email, Boolean isActivate) {
		super();
		this.id = id;
		this.userName = userName;
		this.password = password;
		this.email = email;
		this.isActivate = isActivate;
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
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



	public Boolean getIsActivate() {
		return isActivate;
	}



	public void setIsActivate(Boolean isActivate) {
		this.isActivate = isActivate;
	}



	public static long getSerialversionuid() {
		return serialVersionUID;
	}



	@Override
	public String toString() {
		return "UserEntity [id=" + id + ", userName=" + userName + ", password=" + password + ", email=" + email
				+ ", isActivate=" + isActivate + "]";
	}
	
}
