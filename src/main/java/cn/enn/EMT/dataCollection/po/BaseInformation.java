package cn.enn.EMT.dataCollection.po;

import java.util.Date;

public class BaseInformation {
	
	private Integer id;
	private String userID;
	private Date time;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUserID() {
		return userID;
	}
	public void setUserID(String userID) {
		this.userID = userID;
	}
	public Date getTime() {
		return time;
	}
	public void setTime(Date time) {
		this.time = time;
	}	
}
