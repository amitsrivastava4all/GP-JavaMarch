package com.genpac.socialnetwork.users.dto;

import java.util.Date;

public class MessageDTO {
	private String message;
	private String status;
	private Date loginDateTime;
	private String userid;
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Date getLoginDateTime() {
		return loginDateTime;
	}
	public void setLoginDateTime(Date loginDateTime) {
		this.loginDateTime = loginDateTime;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	
	

}
