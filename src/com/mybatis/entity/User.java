package com.mybatis.entity;

public class User {
	private int id;
    private String username;
    private String password;
    private String remarks;
    private String role;
    private String realname;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getRealname() {
		return realname;
	}
	public void setRealname(String realname) {
		this.realname = realname;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(String username, String password, String remarks, String role, String realname) {
		super();
		this.username = username;
		this.password = password;
		this.remarks = remarks;
		this.role = role;
		this.realname = realname;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", password=" + password + ", remarks=" + remarks
				+ ", role=" + role + ", realname=" + realname + "]" + "\n";
	}
	
}
