package com.NuaDashboard.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "UserEntity")
public class UserEntity implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name = "hibernate_sequence1")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "hibernate_sequence1")
	private int id;

	@Column(name = "USER_NAME")
	private String userName;

	@Column(name = "PASSOWRD")
	private String password;

	@Column(name = "EMAIL")
	private String email;

	@Column(name = "IS_ACTIVATE")
	private Boolean isActivate;
	
	@Column(name = "IS_DELETED")
	private Boolean isDeleted;
	

	@Column(name = "NUMTEL")
	private String numtel;

	@Column(name = "ADRESS")
	private String adress;
	
	@JoinColumn(name ="ID_ROLE")
	@ManyToOne
	private RoleEntity idRole;
	
	@Column(name = "IS_SA")
	private Boolean  isSA;

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
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
	 * @return the isDeleted
	 */
	public Boolean getIsDeleted() {
		return isDeleted;
	}

	/**
	 * @param isDeleted the isDeleted to set
	 */
	public void setIsDeleted(Boolean isDeleted) {
		this.isDeleted = isDeleted;
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
	 * @return the isSA
	 */
	public Boolean getIsSA() {
		return isSA;
	}

	/**
	 * @param isSA the isSA to set
	 */
	public void setIsSA(Boolean isSA) {
		this.isSA = isSA;
	}

	/**
	 * @param adress the adress to set
	 */
	public void setAdress(String adress) {
		this.adress = adress;
	}

	/**
	 * @return the idRole
	 */
	public RoleEntity getIdRole() {
		return idRole;
	}

	/**
	 * @param idRole the idRole to set
	 */
	public void setIdRole(RoleEntity idRole) {
		this.idRole = idRole;
	}

	/**
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	
	
	
	
	
	


}
