package com.NuaDashboard.model;

import com.NuaDashboard.entity.UserEntity;

public class ProjetModelRequest {

	private String projetName;
	private String propriete;
	private String support;
	private Integer idClient;
	private Integer idInterne;
	public ProjetModelRequest() {
		super();
	}
	public ProjetModelRequest(String projetName, String propriete, String support, Integer idClient,
			Integer idInterne) {
		super();
		this.projetName = projetName;
		this.propriete = propriete;
		this.support = support;
		this.idClient = idClient;
		this.idInterne = idInterne;
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