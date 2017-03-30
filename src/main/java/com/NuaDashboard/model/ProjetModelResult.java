package com.NuaDashboard.model;

public class ProjetModelResult {

	private Integer id;
	private String projetName;
	private String propriete;
	private String statue;
	private String support;
	private Integer idClient;
	private Integer idInterne;
	
	public ProjetModelResult() {
		super();
	}
	public ProjetModelResult(Integer id, String projetName, String propriete, String statue, String support,
			Integer idClient, Integer idInterne) {
		super();
		this.id = id;
		this.projetName = projetName;
		this.propriete = propriete;
		this.statue = statue;
		this.support = support;
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
	public String getStatue() {
		return statue;
	}
	/**
	 * @param statue the statue to set
	 */
	public void setStatue(String statue) {
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
