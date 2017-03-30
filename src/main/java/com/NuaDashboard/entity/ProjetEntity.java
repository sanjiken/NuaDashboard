package com.NuaDashboard.entity;

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
	@Table(name = "ProjetEntity")
	public class ProjetEntity {

		private static final long serialVersionUID = 1L;

		@Id
		@SequenceGenerator(name = "hibernate_sequence3")
		@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "hibernate_sequence3")
		private int id;
		
		

		@Column(name = "PROJET_NAME")
		private String projetName;


		@Column(name = "PROPRIETE")
		private String propriete;

		@Column(name = "STATUE")
		private Boolean statue;

		@Column(name = "SUPPORT")
		private String support;
		
		@JoinColumn(name = "ID_CLIENT")
		@ManyToOne
		private UserEntity idClient;
		
		@JoinColumn(name = "ID_INTERNE")
		@ManyToOne
		private UserEntity idInterne;

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
		 * @return the idClient
		 */
		public UserEntity getIdClient() {
			return idClient;
		}

		/**
		 * @param idClient the idClient to set
		 */
		public void setIdClient(UserEntity idClient) {
			this.idClient = idClient;
		}

		/**
		 * @return the idInterne
		 */
		public UserEntity getIdInterne() {
			return idInterne;
		}

		/**
		 * @param idInterne the idInterne to set
		 */
		public void setIdInterne(UserEntity idInterne) {
			this.idInterne = idInterne;
		}

		/**
		 * @return the serialversionuid
		 */
		public static long getSerialversionuid() {
			return serialVersionUID;
		}

		
		
		
		


	
	}
