package com.dto;

public class User {
	private String fullname;
	private int userId;
	private String userName;
	private String userPass;
	public User() {
		
	}
	@Override
	public String toString() {
		return "User [fullname=" + fullname + ", userId=" + userId + ", userName=" + userName + ", userPass=" + userPass
				+ "]";
	}
	public String getFullname() {
		return fullname;
	}
	public void setFullname(String fullname) {
		this.fullname = fullname;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserPass() {
		return userPass;
	}
	public void setUserPass(String userPass) {
		this.userPass = userPass;
	}
	

}
