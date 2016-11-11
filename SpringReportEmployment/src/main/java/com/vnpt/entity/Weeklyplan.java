package com.vnpt.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "WEEKLYPLAN")
public class Weeklyplan {

	private Integer weeklyplanid;
	private String description;
	private String location;
	private String result;
	private String note;
	private String status;
	private String date;
	private String time;
	private String username;
	private String datecreateplan;

	@Column(name = "DESCRIPTION", length = 200, nullable = false)
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	@Column(name = "LOCATION")
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
	@Column(name = "NOTE")
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
	
	@Column(name = "RESULT")
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
	
	@Column(name = "DATE")
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	
	@Column(name = "DATECREATEPLAN")
	public String getDatecreateplan() {
		return datecreateplan;
	}
	public void setDatecreateplan(String datecreateplan) {
		this.datecreateplan = datecreateplan;
	}
	
	@Column(name = "USERNAME")
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	
	@Id
	@Column(name = "WEEKLYPLANID")
	public Integer getWeeklyplanid() {
		return weeklyplanid;
	}
	public void setWeeklyplanid(Integer weeklyplanid) {
		this.weeklyplanid = weeklyplanid;
	}
	
	@Column(name = "TIME")
	public String getTime() {
		return time;
	}
	
	public void setTime(String time) {
		this.time = time;
	}
	
	@Column(name = "STATUS")
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
}


