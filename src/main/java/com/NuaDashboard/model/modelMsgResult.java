package com.NuaDashboard.model;




import com.NuaDashboard.entity.UserEntity;

public class modelMsgResult {

	private String  contenuMesg;
	private Boolean isShow;
	private String hour;
	private String min;
	private String sec;
	private String dat;
	private String mon;
	private String ye;
	private Boolean isDeleted;
	private UserEntity UserActor;
	private UserEntity UserRecepteur;
	
	public modelMsgResult() {
		super();
	}

	public modelMsgResult(String contenuMesg, Boolean isShow, String hour, String min, String sec, String dat,
			String mon, String ye, Boolean isDeleted, UserEntity userActor, UserEntity userRecepteur) {
		super();
		this.contenuMesg = contenuMesg;
		this.isShow = isShow;
		this.hour = hour;
		this.min = min;
		this.sec = sec;
		this.dat = dat;
		this.mon = mon;
		this.ye = ye;
		this.isDeleted = isDeleted;
		UserActor = userActor;
		UserRecepteur = userRecepteur;
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

	
}
