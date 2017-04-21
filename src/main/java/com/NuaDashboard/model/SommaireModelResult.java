package com.NuaDashboard.model;

public class SommaireModelResult {

	private Integer id;
	private String projetName;
	private String propriete;
	private Boolean statue;
	private String  Client;
	
	public SommaireModelResult() {
		super();
	}
	public SommaireModelResult(Integer id, String projetName, String propriete, Boolean statue, String client) {
		super();
		this.id = id;
		this.projetName = projetName;
		this.propriete = propriete;
		this.statue = statue;
		this.Client = client;
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
	 * @return the client
	 */
	public String getClient() {
		return Client;
	}
	/**
	 * @param client the client to set
	 */
	public void setClient(String client) {
		Client = client;
	}
	
	
	
}
