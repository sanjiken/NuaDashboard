package com.NuaDashboard.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "RoleEntity")
public class RoleEntity {

	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name = "hibernate_sequence4")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "hibernate_sequence4")
	private int id;

	@Column(name = "ABR")
	private String abr;

	@Column(name = "DISCRIPTION")
	private String discription;

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
	 * @return the abr
	 */
	public String getAbr() {
		return abr;
	}

	/**
	 * @param abr the abr to set
	 */
	public void setAbr(String abr) {
		this.abr = abr;
	}

	/**
	 * @return the discription
	 */
	public String getDiscription() {
		return discription;
	}

	/**
	 * @param discription the discription to set
	 */
	public void setDiscription(String discription) {
		this.discription = discription;
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

	

}