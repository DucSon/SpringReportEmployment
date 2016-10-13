package com.vnpt.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "USER_ROLES")
public class Userroles {

	private int roleid;
	private String username;
	private String userrole;
	
	public Userroles( String username){
		this.username = username;
	};
	
	@Id
	@Column(name = "ROLE_ID")
	public int getRoleid() {
		return roleid;
	}
	public void setRoleid(int roleid) {
		this.roleid = roleid;
	}
	
	@Column(name = "USERNAME")

	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	
	@Column(name = "USER_ROLE")
	public String getUserrole() {
		return userrole;
	}
	public void setUserrole(String userrole) {
		this.userrole = userrole;
	}
}
