package com.vnpt.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "USERS")
public class User {
	
    private int userid;
    private String username;
    private int manageid;
    private String password;
    private int enable;
    
    public User(String username, String password, int enable, int userid, int managerid ){
    	
    	this.username = username;
    	this.password = password;
    	this.enable = enable;
    	this.userid = userid;
    	this.manageid = managerid;
    }
    public User(String username, String password, int managerid ){
    	
    	this.username = username;
    	this.password = password;
    	this.manageid = managerid;
    }
    
	@Id
	@Column(name = "USER_ID")
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	
	@Column(name = "USERNAME")
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	
	@Column(name = "MANAGER_ID")
	public int getManageid() {
		return manageid;
	}
	public void setManageid(int manageid) {
		this.manageid = manageid;
	}
	
	@Column(name = "PASSWORD")
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	@Column(name = "ENABLED")
	public int getEnable() {
		return enable;
	}
	public void setEnable(int enable) {
		this.enable = enable;
	}

}
