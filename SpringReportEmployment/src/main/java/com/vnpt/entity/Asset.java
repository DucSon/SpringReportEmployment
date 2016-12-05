package com.vnpt.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ASSET")
public class Asset {

	private String assetname;
	private int assetid;
	private int userid;
	private String nsx;
	private String hsd;
	private String location;
	private int price;
	private byte[] image;
	private String status;
	private String statusasset;
	private String note;

//	public Asset(int assetid, int userid, String assetname, String nsx, String hsd, String location, int price,
//			String image, String status, String statusasset, String note) {
//		this.assetid = assetid;
//		this.userid = userid;
//		this.assetname = assetname;
//		this.nsx = nsx;
//		this.hsd = hsd;
//		this.location = location;
//		this.price = price;
//		this.image = image;
//		this.status = status;
//		this.statusasset = statusasset;
//		this.note = note;
//	}

	@Column(name = "NOTE", length = 200)
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
	@Column(name = "STATUS", length = 50)
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Column(name = "IMAGE")
	public byte[] getImage() {
		return image;
	}
	public void setImage(byte[] image) {
		this.image = image;
	}
	@Column(name = "LOCATION", length = 50)
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	@Column(name = "NSX", length = 50)
	public String getNsx() {
		return nsx;
	}
	public void setNsx(String nsx) {
		this.nsx = nsx;
	}	
	
	@Id
	@Column(name = "ASSETID", length = 6)
	public int getAssetid() {
		return assetid;
	}
	public void setAssetid(int assetid) {
		this.assetid = assetid;
	}
	
	@Column(name = "ASSETNAME", length = 50)
	public String getAssetname() {
		return assetname;
	}
	public void setAssetname(String assetname) {
		this.assetname = assetname;
	}
	
	@Column(name = "USERID", length = 6)
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	@Column(name = "HSD", length = 200)
	public String getHsd() {
		return hsd;
	}
	public void setHsd(String hsd) {
		this.hsd = hsd;
	}
	@Column(name = "PRICE", length = 200)
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}

	@Column(name = "STATUSASSET", length = 50)
	public String getStatusasset() {
		return statusasset;
	}

	public void setStatusasset(String statusasset) {
		this.statusasset = statusasset;
	}

}
