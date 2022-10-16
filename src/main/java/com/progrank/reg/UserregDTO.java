package com.progrank.reg;

public class UserregDTO {
	
	private String name;
	private String username;
	private String password;
	private String country;
	private char gender;
	private String msg;
	
	public UserregDTO(String msg) {
		this.msg=msg;
	}
	public UserregDTO() {
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "UserregDTO [name=" + name + ", username=" + username + ", password=" + password + ", country=" + country
				+ ", gender=" + gender + ", msg=" + msg + "]";
	}
	
	

}
