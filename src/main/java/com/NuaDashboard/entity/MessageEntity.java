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
@Table(name = "MessageEntity")	
public class MessageEntity {

	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name = "hibernate_sequence8")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "hibernate_sequence8")
	private int id;
	
	
	@Column(name = "CONTENU_MESG")
	private String  contenuMesg;

	

	@Column(name = "IS_SHOW")
	private Boolean isShow;
	
	@Column(name = "IS_DELETED")
	private Boolean isDeleted;
	
	@JoinColumn(name = "ID_USER_ACTOR")
	@ManyToOne
	private UserEntity UserActor;
	
	@JoinColumn(name = "ID_USER_RECEPTEUR")
	@ManyToOne
	private UserEntity UserRecepteur;

	@Column(name = "HOUR")
	private String hour;

	@Column(name = "MIN")
	private String min;

	
	@Column(name = "SEC")
	private String sec;
	
	@Column(name = "DAT")
	private String dat;
	
	@Column(name = "MON")
	private String mon;

	@Column(name = "YE")
	private String ye;

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
	 * @return the contenuMesg
	 */
	public String getContenuMesg() {
		return contenuMesg;
	}

	/**
	 * @param contenuMesg the contenuMesg to set
	 */
	public void setContenuMesg(String contenuMesg) {
		this.contenuMesg = contenuMesg;
	}

	/**
	 * @return the isShow
	 */
	public Boolean getIsShow() {
		return isShow;
	}

	/**
	 * @param isShow the isShow to set
	 */
	public void setIsShow(Boolean isShow) {
		this.isShow = isShow;
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
	 * @return the userActor
	 */
	public UserEntity getUserActor() {
		return UserActor;
	}

	/**
	 * @param userActor the userActor to set
	 */
	public void setUserActor(UserEntity userActor) {
		UserActor = userActor;
	}

	/**
	 * @return the userRecepteur
	 */
	public UserEntity getUserRecepteur() {
		return UserRecepteur;
	}

	/**
	 * @param userRecepteur the userRecepteur to set
	 */
	public void setUserRecepteur(UserEntity userRecepteur) {
		UserRecepteur = userRecepteur;
	}

	/**
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	/**
	 * @return the hour
	 */
	public String getHour() {
		return hour;
	}

	/**
	 * @param hour the hour to set
	 */
	public void setHour(String hour) {
		this.hour = hour;
	}

	/**
	 * @return the min
	 */
	public String getMin() {
		return min;
	}

	/**
	 * @param min the min to set
	 */
	public void setMin(String min) {
		this.min = min;
	}

	/**
	 * @return the sec
	 */
	public String getSec() {
		return sec;
	}

	/**
	 * @param sec the sec to set
	 */
	public void setSec(String sec) {
		this.sec = sec;
	}

	/**
	 * @return the dat
	 */
	public String getDat() {
		return dat;
	}

	/**
	 * @param dat the dat to set
	 */
	public void setDat(String dat) {
		this.dat = dat;
	}

	/**
	 * @return the mon
	 */
	public String getMon() {
		return mon;
	}

	/**
	 * @param mon the mon to set
	 */
	public void setMon(String mon) {
		this.mon = mon;
	}

	/**
	 * @return the ye
	 */
	public String getYe() {
		return ye;
	}

	/**
	 * @param ye the ye to set
	 */
	public void setYe(String ye) {
		this.ye = ye;
	}
	
	

	
	
}
