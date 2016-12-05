package com.vnpt.entity;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

public class AssetInfoForm {

	private String assetname;
	private int assetid;
	private int userid;
	private String username;
	private String nsx;
	private String hsd;
	private String location;
	private int price;
	private byte[] image;
	private String status;
	private String statusasset;
	private String note;
    private CommonsMultipartFile fileData;

	public AssetInfoForm(){
	}

	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}

	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public byte[]  getImage() {
		return image;
	}
	public void setImage(byte[]  image) {
		this.image = image;
	}

	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}

	public String getNsx() {
		return nsx;
	}
	public void setNsx(String nsx) {
		this.nsx = nsx;
	}	
	
	public int getAssetid() {
		return assetid;
	}
	public void setAssetid(int assetid) {
		this.assetid = assetid;
	}
	
	public String getAssetname() {
		return assetname;
	}
	public void setAssetname(String assetname) {
		this.assetname = assetname;
	}

	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}

	public String getHsd() {
		return hsd;
	}
	public void setHsd(String hsd) {
		this.hsd = hsd;
	}

	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
	
	public String getStatusasset() {
		return statusasset;
	}

	public void setStatusasset(String statusasset) {
		this.statusasset = statusasset;
	}

	public CommonsMultipartFile getFileData() {
		return fileData;
	}

	public void setFileData(CommonsMultipartFile fileData) {
		this.fileData = fileData;
	}

}
