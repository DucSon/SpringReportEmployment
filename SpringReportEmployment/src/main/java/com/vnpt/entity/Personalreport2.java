package com.vnpt.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.SecondaryTable;
import javax.persistence.Table;

@Entity
@Table(name="USERS")
@SecondaryTable(name="DAILYREPORT2", pkJoinColumns={@PrimaryKeyJoinColumn(name = "username")})

public class Personalreport2{

	private String userid;
	private String username;
    private Integer prepaidDevelop;
    private Integer postpaidDevelop;
    private Integer fixedDevelop;
    private Integer gphoneDevelop;
    private Integer fiberDevelop;
    private Integer megaDevelop;
    private Integer mytvDevelop;
	private Integer ivanDevelop;
    private Integer vneduDevelop;
    private Integer cardDevelop;          
    private Integer chargeDevelop;
    
    @Id
	@Column(name = "USERID", length = 45, nullable = false, table="USERS")
	public String getUserid() {
		return userid;
	}
    
	public void setUserid(String userid) {
		this.userid = userid;
	}
	
	@Column(name = "USERNAME", table="USERS")
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	@Column(name = "PREPAIDDEVELOP", table="DAILYREPORT2")
	public Integer getPrepaidDevelop() {
		return prepaidDevelop;
	}
	public void setPrepaidDevelop(Integer prepaidDevelop) {
		this.prepaidDevelop = prepaidDevelop;
	}
	
	@Column(name = "FIXEDDEVELOP", table="DAILYREPORT2")
	public Integer getFixedDevelop() {
		return fixedDevelop;
	}
	public void setFixedDevelop(Integer fixedDevelop) {
		this.fixedDevelop = fixedDevelop;
	}
	
	@Column(name = "POSTPAIDDEVELOP", table="DAILYREPORT2")
	public Integer getPostpaidDevelop() {
		return postpaidDevelop;
	}
	public void setPostpaidDevelop(Integer postpaidDevelop) {
		this.postpaidDevelop = postpaidDevelop;
	}
	
	@Column(name = "GPHONEDEVELOP", table="DAILYREPORT2")
	public Integer getGphoneDevelop() {
		return gphoneDevelop;
	}
	public void setGphoneDevelop(Integer gphoneDevelop) {
		this.gphoneDevelop = gphoneDevelop;
	}
	
	@Column(name = "FIBERDEVELOP", table="DAILYREPORT2")
	public Integer getFiberDevelop() {
		return fiberDevelop;
	}
	public void setFiberDevelop(Integer fiberDevelop) {
		this.fiberDevelop = fiberDevelop;
	}
	
	@Column(name = "MEGADEVELOP", table="DAILYREPORT2")
	public Integer getMegaDevelop() {
		return megaDevelop;
	}
	public void setMegaDevelop(Integer megaDevelop) {
		this.megaDevelop = megaDevelop;
	}
	
	@Column(name = "MYTVDEVELOP", table="DAILYREPORT2")
	public Integer getMytvDevelop() {
		return mytvDevelop;
	}
	public void setMytvDevelop(Integer mytvDevelop) {
		this.mytvDevelop = mytvDevelop;
	}
	
	@Column(name = "IVANDEVELOP", table="DAILYREPORT2")
	public Integer getIvanDevelop() {
		return ivanDevelop;
	}
	public void setIvanDevelop(Integer ivanDevelop) {
		this.ivanDevelop = ivanDevelop;
	}
	
	@Column(name = "VNEDUDEVELOP", table="DAILYREPORT2")
	public Integer getVneduDevelop() {
		return vneduDevelop;
	}
	public void setVneduDevelop(Integer vneduDevelop) {
		this.vneduDevelop = vneduDevelop;
	}
	
	@Column(name = "CARDDEVELOP", table="DAILYREPORT2")
	public Integer getCardDevelop() {
		return cardDevelop;
	}
	public void setCardDevelop(Integer cardDevelop) {
		this.cardDevelop = cardDevelop;
	}
	
	@Column(name = "CHARGEDEVELOP", table="DAILYREPORT2")
	public Integer getChargeDevelop() {
		return chargeDevelop;
	}
	public void setChargeDevelop(Integer chargeDevelop) {
		this.chargeDevelop = chargeDevelop;
	} 
	
}
