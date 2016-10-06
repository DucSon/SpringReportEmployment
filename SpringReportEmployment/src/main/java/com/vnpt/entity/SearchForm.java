package com.vnpt.entity;

import java.util.List;

public class SearchForm {
	private String username;
	private String fromDate;
	private String toDate;
	private List<String> listOfUsers;
	
	public String getUsername() {
		return username;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}
	
	public String getFromDate() {
		return fromDate;
	}
	
	public void setFromDate(String fromDate) {
		this.fromDate = fromDate;
	}
	
	public String getToDate() {
		return toDate;
	}
	
	public void setToDate(String toDate) {
		this.toDate = toDate;
	}

	public List<String> getListOfUsers() {
		return listOfUsers;
	}

	public void setListOfUsers(List<String> listOfUsers) {
		this.listOfUsers = listOfUsers;
	}
	

}
