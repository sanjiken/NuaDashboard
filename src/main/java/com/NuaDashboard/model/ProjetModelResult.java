package com.NuaDashboard.model;

import com.NuaDashboard.entity.UserEntity;

public class ProjetModelResult {

	private Integer id;
	private String projetName;
	private String propriete;
	private Boolean statue;
	private String support;
	private Boolean isDeleted;
	private Integer idClient;
	private Integer idInterne;
	
	public ProjetModelResult() {
		super();
	}
	public ProjetModelResult(Integer id, String projetName, String propriete, Boolean statue, String support,
			Boolean isDeleted, Integer idClient, Integer idInterne) {
		super();
		this.id = id;
		this.projetName = projetName;
		this.propriete = propriete;
		this.statue = statue;
		this.support = support;
		this.isDeleted = isDeleted;
		this.idClient = idClient;
		this.idInterne = idInterne;
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
	 * @return the projetName
	 */
	public String getProjetName() {
		return projetName;
	}
	/**
	 * @param projetName the projetName to set
	 */
	public void setProjetName(String projetName) {
		this.projetName = projetName;
	}
	/**
	 * @return the propriete
	 */
	public String getPropriete() {
		return propriete;
	}
	/**
	 * @param propriete the propriete to set
	 */
	public void setPropriete(String propriete) {
		this.propriete = propriete;
	}
	/**
	 * @return the statue
	 */
	public Boolean getStatue() {
		return statue;
	}
	/**
	 * @param statue the statue to set
	 */
	public void setStatue(Boolean statue) {
		this.statue = statue;
	}
	/**
	 * @return the support
	 */
	public String getSupport() {
		return support;
	}
	/**
	 * @param support the support to set
	 */
	public void setSupport(String support) {
		this.support = support;
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
	 * @return the idClient
	 */
	public Integer getIdClient() {
		return idClient;
	}
	/**
	 * @param idClient the idClient to set
	 */
	public void setIdClient(Integer idClient) {
		this.idClient = idClient;
	}
	/**
	 * @return the idInterne
	 */
	public Integer getIdInterne() {
		return idInterne;
	}
	/**
	 * @param idInterne the idInterne to set
	 */
	public void setIdInterne(Integer idInterne) {
		this.idInterne = idInterne;
	}
	
	
	
}
