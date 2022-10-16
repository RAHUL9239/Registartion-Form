package com.progrank.controller;

public class Username {
	private String Username;
	private String userPassword;
	public String getUsername() {
		return Username;
	}
	public void setUsername(String username) {
		Username = username;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	@Override
	public String toString() {
		return "Username [Username=" + Username + ", userPassword=" + userPassword + "]";
	}
	
	
	

}
