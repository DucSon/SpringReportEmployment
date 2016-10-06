package com.vnpt.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "DAILYREPORT2")
public class Weekreport {

	private String username;
    private Integer prepaidDevelop;
    private Integer prepaidRestore;
    private Integer prepaidCut;
    private Integer prepaidStop;
    private Integer prepaidIncrease;
    private Integer prepaidUninstall;
    private Integer prepaidUnresponsive;
    
    private Integer postpaidDevelop;
    private Integer postpaidRestore;
    private Integer postpaidCut;
    private Integer postpaidStop;
    private Integer postpaidIncrease;
    private Integer postpaidUninstall;
    private Integer postpaidUnresponsive;
	
    private Integer fixedDevelop;
    private Integer fixedRestore;
    private Integer fixedCut;
    private Integer fixedStop;
    private Integer fixedIncrease;
    private Integer fixedUninstall;
    private Integer fixedUnresponsive;  
    
    private Integer gphoneDevelop;
    private Integer gphoneRestore;
    private Integer gphoneCut;
    private Integer gphoneStop;
    private Integer gphoneIncrease;
    private Integer gphoneUninstall;
    private Integer gphoneUnresponsive;
	
    private Integer fiberDevelop;
    private Integer fiberRestore;
    private Integer fiberCut;
    private Integer fiberStop;
    private Integer fiberIncrease;
    private Integer fiberUninstall;
    private Integer fiberUnresponsive;
    
    private Integer megaDevelop;
    private Integer megaRestore;
    private Integer megaCut;
    private Integer megaStop;
    private Integer megaIncrease;
    private Integer megaUninstall;
    private Integer megaUnresponsive;
    
    private Integer mytvDevelop;
    private Integer mytvRestore;
    private Integer mytvCut;
    private Integer mytvStop;    
    private Integer mytvIncrease;
    private Integer mytvUninstall;
    private Integer mytvUnresponsive;
    
	private Integer ivanDevelop;
    private Integer ivanRestore;
    private Integer ivanCut;
    private Integer ivanStop;
    private Integer ivanIncrease;
    private Integer ivanUninstall;
    private Integer ivanUnresponsive;
    
    private Integer vneduDevelop;
    private Integer vneduRestore;
    private Integer vneduCut;
    private Integer vneduStop;
    private Integer vneduIncrease;
    private Integer vneduUninstall;    
    private Integer vneduUnresponsive;
    
    private Integer cardDevelop;      
    private Integer cardRestore;      
    private Integer cardCut;      
    private Integer cardStop;      
    private Integer cardIncrease;      
    private Integer cardUninstall;      
    private Integer cardUnresponsive;      
    
    private Integer chargeDevelop;      
    private Integer chargeRestore;      
    private Integer chargeCut;      
    private Integer chargeStop;      
    private Integer chargeIncrease;      
    private Integer chargeUninstall;      
    private Integer chargeUnresponsive;
    @Id
	@Column(name = "USERNAME", length = 45, nullable = false)
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	
	@Column(name = "PREPAIDDEVELOP")
	public Integer getPrepaidDevelop() {
		return prepaidDevelop;
	}
	public void setPrepaidDevelop(Integer prepaidDevelop) {
		this.prepaidDevelop = prepaidDevelop;
	}      

	@Column(name = "PREPAIDCUT")
	public Integer getPrepaidCut() {
		return prepaidCut;
	}
	public void setPrepaidCut(Integer prepaidCut) {
		this.prepaidCut = prepaidCut;
	}
	
	@Column(name = "PREPAIDSTOP")
	public Integer getPrepaidStop() {
		return prepaidStop;
	}
	public void setPrepaidStop(Integer prepaidStop) {
		this.prepaidStop = prepaidStop;
	}
	
	@Column(name = "PREPAIDINCREASE")
	public Integer getPrepaidIncrease() {
		return prepaidIncrease;
	}
	public void setPrepaidIncrease(Integer prepaidIncrease) {
		this.prepaidIncrease = prepaidIncrease;
	}
	
	@Column(name = "PREPAIDUNRESPONSIVE")
	public Integer getPrepaidUnresponsive() {
		return prepaidUnresponsive;
	}
	public void setPrepaidUnresponsive(Integer prepaidUnresponsive) {
		this.prepaidUnresponsive = prepaidUnresponsive;
	}
	
	@Column(name = "PREPAIDRESTORE")
	public Integer getPrepaidRestore() {
		return prepaidRestore;
	}
	public void setPrepaidRestore(Integer prepaidRestore) {
		this.prepaidRestore = prepaidRestore;
	}
	
	@Column(name = "PREPAIDUNINSTALL")
	public Integer getPrepaidUninstall() {
		return prepaidUninstall;
	}
	public void setPrepaidUninstall(Integer prepaidUninstall) {
		this.prepaidUninstall = prepaidUninstall;
	}
	
	@Column(name = "POSTPAIDRESTORE")
	public Integer getPostpaidRestore() {
		return postpaidRestore;
	}
	public void setPostpaidRestore(Integer postpaidRestore) {
		this.postpaidRestore = postpaidRestore;
	}
	
	@Column(name = "POSTPAIDDEVELOP")
	public Integer getPostpaidDevelop() {
		return postpaidDevelop;
	}
	public void setPostpaidDevelop(Integer postpaidDevelop) {
		this.postpaidDevelop = postpaidDevelop;
	}
	
	@Column(name = "POSTPAIDCUT")
	public Integer getPostpaidCut() {
		return postpaidCut;
	}
	public void setPostpaidCut(Integer postpaidCut) {
		this.postpaidCut = postpaidCut;
	}
	
	@Column(name = "POSTPAIDSTOP")
	public Integer getPostpaidStop() {
		return postpaidStop;
	}
	public void setPostpaidStop(Integer postpaidStop) {
		this.postpaidStop = postpaidStop;
	}
	
	@Column(name = "POSTPAIDINCREASE")
	public Integer getPostpaidIncrease() {
		return postpaidIncrease;
	}
	public void setPostpaidIncrease(Integer postpaidIncrease) {
		this.postpaidIncrease = postpaidIncrease;
	}
	
	@Column(name = "POSTPAIDUNRESPONSIVE")
	public Integer getPostpaidUnresponsive() {
		return postpaidUnresponsive;
	}
	public void setPostpaidUnresponsive(Integer postpaidUnresponsive) {
		this.postpaidUnresponsive = postpaidUnresponsive;
	}
	
	@Column(name = "POSTPAIDUNINSTALL")
	public Integer getPostpaidUninstall() {
		return postpaidUninstall;
	}
	public void setPostpaidUninstall(Integer postpaidUninstall) {
		this.postpaidUninstall = postpaidUninstall;
	}
	
	@Column(name = "FIXEDRESTORE")
	public Integer getFixedRestore() {
		return fixedRestore;
	}
	
	public void setFixedRestore(Integer fixedRestore) {
		this.fixedRestore = fixedRestore;
	}
	
	@Column(name = "FIXEDDEVELOP")
	public Integer getFixedDevelop() {
		return fixedDevelop;
	}
	
	public void setFixedDevelop(Integer fixedDevelop) {
		this.fixedDevelop = fixedDevelop;
	}
	
	@Column(name = "FIXEDCUT")
	public Integer getFixedCut() {
		return fixedCut;
	}
	public void setFixedCut(Integer fixedCut) {
		this.fixedCut = fixedCut;
	}
	
	@Column(name = "FIXEDSTOP")
	public Integer getFixedStop() {
		return fixedStop;
	}
	public void setFixedStop(Integer fixedStop) {
		this.fixedStop = fixedStop;
	}
	
	@Column(name = "FIXEDUNINSTALL")
	public Integer getFixedUninstall() {
		return fixedUninstall;
	}
	public void setFixedUninstall(Integer fixedUninstall) {
		this.fixedUninstall = fixedUninstall;
	}
	
	@Column(name = "FIXEDINCREASE")
	public Integer getFixedIncrease() {
		return fixedIncrease;
	}
	public void setFixedIncrease(Integer fixedIncrease) {
		this.fixedIncrease = fixedIncrease;
	}
	
	@Column(name = "FIXEDUNRESPONSIVE")
	public Integer getFixedUnresponsive() {
		return fixedUnresponsive;
	}
	public void setFixedUnresponsive(Integer fixedUnresponsive) {
		this.fixedUnresponsive = fixedUnresponsive;
	}
	
	@Column(name = "GPHONEDEVELOP")
	public Integer getGphoneDevelop() {
		return gphoneDevelop;
	}
	public void setGphoneDevelop(Integer gphoneDevelop) {
		this.gphoneDevelop = gphoneDevelop;
	}
	
	@Column(name = "GPHONERESTORE")
	public Integer getGphoneRestore() {
		return gphoneRestore;
	}
	public void setGphoneRestore(Integer gphoneRestore) {
		this.gphoneRestore = gphoneRestore;
	}
	
	@Column(name = "GPHONECUT")
	public Integer getGphoneCut() {
		return gphoneCut;
	}
	public void setGphoneCut(Integer gphoneCut) {
		this.gphoneCut = gphoneCut;
	}
	
	@Column(name = "GPHONEUNINSTALL")
	public Integer getGphoneUninstall() {
		return gphoneUninstall;
	}
	public void setGphoneUninstall(Integer gphoneUninstall) {
		this.gphoneUninstall = gphoneUninstall;
	}
	
	@Column(name = "GPHONESTOP")
	public Integer getGphoneStop() {
		return gphoneStop;
	}
	public void setGphoneStop(Integer gphoneStop) {
		this.gphoneStop = gphoneStop;
	}
	
	@Column(name = "GPHONEINCREASE")
	public Integer getGphoneIncrease() {
		return gphoneIncrease;
	}
	
	public void setGphoneIncrease(Integer gphoneIncrease) {
		this.gphoneIncrease = gphoneIncrease;
	}

	@Column(name = "GPHONEUNRESPONSIVE")
	public Integer getGphoneUnresponsive() {
		return gphoneUnresponsive;
	}
	public void setGphoneUnresponsive(Integer gphoneUnresponsive) {
		this.gphoneUnresponsive = gphoneUnresponsive;
	}
	
	@Column(name = "FIBERDEVELOP")
	public Integer getFiberDevelop() {
		return fiberDevelop;
	}
	public void setFiberDevelop(Integer fiberDevelop) {
		this.fiberDevelop = fiberDevelop;
	}
	
	@Column(name = "FIBERRESTORE")
	public Integer getFiberRestore() {
		return fiberRestore;
	}
	public void setFiberRestore(Integer fiberRestore) {
		this.fiberRestore = fiberRestore;
	}
	
	@Column(name = "FIBERCUT")
	public Integer getFiberCut() {
		return fiberCut;
	}
	public void setFiberCut(Integer fiberCut) {
		this.fiberCut = fiberCut;
	}
	
	@Column(name = "FIBERSTOP")
	public Integer getFiberStop() {
		return fiberStop;
	}
	public void setFiberStop(Integer fiberStop) {
		this.fiberStop = fiberStop;
	}
	
	@Column(name = "FIBERUNINSTALL")
	public Integer getFiberUninstall() {
		return fiberUninstall;
	}
	public void setFiberUninstall(Integer fiberUninstall) {
		this.fiberUninstall = fiberUninstall;
	}
	
	@Column(name = "FIBERINCREASE")
	public Integer getFiberIncrease() {
		return fiberIncrease;
	}
	public void setFiberIncrease(Integer fiberIncrease) {
		this.fiberIncrease = fiberIncrease;
	}
	
	@Column(name = "FIBERUNRESPONSIVE")
	public Integer getFiberUnresponsive() {
		return fiberUnresponsive;
	}
	public void setFiberUnresponsive(Integer fiberUnresponsive) {
		this.fiberUnresponsive = fiberUnresponsive;
	}
	
	@Column(name = "MEGADEVELOP")
	public Integer getMegaDevelop() {
		return megaDevelop;
	}
	public void setMegaDevelop(Integer megaDevelop) {
		this.megaDevelop = megaDevelop;
	}
	
	@Column(name = "MEGACUT")
	public Integer getMegaCut() {
		return megaCut;
	}
	public void setMegaCut(Integer megaCut) {
		this.megaCut = megaCut;
	}
	
	@Column(name = "MEGARESTORE")
	public Integer getMegaRestore() {
		return megaRestore;
	}
	public void setMegaRestore(Integer megaRestore) {
		this.megaRestore = megaRestore;
	}
	
	@Column(name = "MEGASTOP")
	public Integer getMegaStop() {
		return megaStop;
	}
	public void setMegaStop(Integer megaStop) {
		this.megaStop = megaStop;
	}
	
	@Column(name = "MEGAINCREASE")
	public Integer getMegaIncrease() {
		return megaIncrease;
	}
	public void setMegaIncrease(Integer megaIncrease) {
		this.megaIncrease = megaIncrease;
	}
	
	@Column(name = "MEGAUNINSTALL")
	public Integer getMegaUninstall() {
		return megaUninstall;
	}
	public void setMegaUninstall(Integer megaUninstall) {
		this.megaUninstall = megaUninstall;
	}
	
	@Column(name = "MEGAUNRESPONSIVE")
	public Integer getMegaUnresponsive() {
		return megaUnresponsive;
	}
	public void setMegaUnresponsive(Integer megaUnresponsive) {
		this.megaUnresponsive = megaUnresponsive;
	}
	
	@Column(name = "MYTVDEVELOP")
	public Integer getMytvDevelop() {
		return mytvDevelop;
	}
	public void setMytvDevelop(Integer mytvDevelop) {
		this.mytvDevelop = mytvDevelop;
	}
	
	@Column(name = "MYTVRESTORE")
	public Integer getMytvRestore() {
		return mytvRestore;
	}
	public void setMytvRestore(Integer mytvRestore) {
		this.mytvRestore = mytvRestore;
	}
	
	@Column(name = "MYTVCUT")
	public Integer getMytvCut() {
		return mytvCut;
	}
	public void setMytvCut(Integer mytvCut) {
		this.mytvCut = mytvCut;
	}
	
	@Column(name = "MYTVSTOP")
	public Integer getMytvStop() {
		return mytvStop;
	}

	public void setMytvStop(Integer mytvStop) {
		this.mytvStop = mytvStop;
	}
	
	@Column(name = "MYTVINCREASE")
	public Integer getMytvIncrease() {
		return mytvIncrease;
	}
	public void setMytvIncrease(Integer mytvIncrease) {
		this.mytvIncrease = mytvIncrease;
	}
	
	@Column(name = "MYTVUNINSTALL")
	public Integer getMytvUninstall() {
		return mytvUninstall;
	}
	public void setMytvUninstall(Integer mytvUninstall) {
		this.mytvUninstall = mytvUninstall;
	}
	
	@Column(name = "MYTVUNRESPONSIVE")
	public Integer getMytvUnresponsive() {
		return mytvUnresponsive;
	}
	public void setMytvUnresponsive(Integer mytvUnresponsive) {
		this.mytvUnresponsive = mytvUnresponsive;
	}
	
	@Column(name = "IVANDEVELOP")
	public Integer getIvanDevelop() {
		return ivanDevelop;
	}
	public void setIvanDevelop(Integer ivanDevelop) {
		this.ivanDevelop = ivanDevelop;
	}
	
	@Column(name = "IVANRESTORE")
	public Integer getIvanRestore() {
		return ivanRestore;
	}
	public void setIvanRestore(Integer ivanRestore) {
		this.ivanRestore = ivanRestore;
	}
	
	@Column(name = "IVANCUT")
	public Integer getIvanCut() {
		return ivanCut;
	}
	public void setIvanCut(Integer ivanCut) {
		this.ivanCut = ivanCut;
	}
	
	@Column(name = "IVANSTOP")
	public Integer getIvanStop() {
		return ivanStop;
	}
	public void setIvanStop(Integer ivanStop) {
		this.ivanStop = ivanStop;
	}
	
	@Column(name = "IVANUNINSTALL")
	public Integer getIvanUninstall() {
		return ivanUninstall;
	}
	public void setIvanUninstall(Integer ivanUninstall) {
		this.ivanUninstall = ivanUninstall;
	}
	
	@Column(name = "IVANINCREASE")
	public Integer getIvanIncrease() {
		return ivanIncrease;
	}
	public void setIvanIncrease(Integer ivanIncrease) {
		this.ivanIncrease = ivanIncrease;
	}
	
	@Column(name = "IVANUNRESPONSIVE")
	public Integer getIvanUnresponsive() {
		return ivanUnresponsive;
	}
	public void setIvanUnresponsive(Integer ivanUnresponsive) {
		this.ivanUnresponsive = ivanUnresponsive;
	}
	
	@Column(name = "VNEDUDEVELOP")
	public Integer getVneduDevelop() {
		return vneduDevelop;
	}
	public void setVneduDevelop(Integer vneduDevelop) {
		this.vneduDevelop = vneduDevelop;
	}
	
	@Column(name = "VNEDURESTORE")
	public Integer getVneduRestore() {
		return vneduRestore;
	}
	public void setVneduRestore(Integer vneduRestore) {
		this.vneduRestore = vneduRestore;
	}
	
	@Column(name = "VNEDUSTOP")
	public Integer getVneduStop() {
		return vneduStop;
	}
	public void setVneduStop(Integer vneduStop) {
		this.vneduStop = vneduStop;
	}
	
	@Column(name = "VNEDUCUT")
	public Integer getVneduCut() {
		return vneduCut;
	}
	public void setVneduCut(Integer vneduCut) {
		this.vneduCut = vneduCut;
	}
	
	@Column(name = "VNEDUINCREASE")
	public Integer getVneduIncrease() {
		return vneduIncrease;
	}
	public void setVneduIncrease(Integer vneduIncrease) {
		this.vneduIncrease = vneduIncrease;
	}
	
	@Column(name = "VNEDUUNINSTALL")
	public Integer getVneduUninstall() {
		return vneduUninstall;
	}
	public void setVneduUninstall(Integer vneduUninstall) {
		this.vneduUninstall = vneduUninstall;
	}
	
	@Column(name = "VNEDUUNRESPONSIVE")
	public Integer getVneduUnresponsive() {
		return vneduUnresponsive;
	}
	public void setVneduUnresponsive(Integer vneduUnresponsive) {
		this.vneduUnresponsive = vneduUnresponsive;
	}
	
	@Column(name = "CARDDEVELOP")
	public Integer getCardDevelop() {
		return cardDevelop;
	}
	public void setCardDevelop(Integer cardDevelop) {
		this.cardDevelop = cardDevelop;
	}
	
	@Column(name = "CARDRESTORE")
	public Integer getCardRestore() {
		return cardRestore;
	}
	public void setCardRestore(Integer cardRestore) {
		this.cardRestore = cardRestore;
	}
	
	@Column(name = "CARDCUT")
	public Integer getCardCut() {
		return cardCut;
	}
	public void setCardCut(Integer cardCut) {
		this.cardCut = cardCut;
	}
	
	@Column(name = "CARDSTOP")
	public Integer getCardStop() {
		return cardStop;
	}
	public void setCardStop(Integer cardStop) {
		this.cardStop = cardStop;
	}
	
	@Column(name = "CARDINCREASE")
	public Integer getCardIncrease() {
		return cardIncrease;
	}
	public void setCardIncrease(Integer cardIncrease) {
		this.cardIncrease = cardIncrease;
	}
	
	@Column(name = "CARDUNINSTALL")
	public Integer getCardUninstall() {
		return cardUninstall;
	}
	public void setCardUninstall(Integer cardUninstall) {
		this.cardUninstall = cardUninstall;
	}
	
	@Column(name = "CARDUNRESPONSIVE")
	public Integer getCardUnresponsive() {
		return cardUnresponsive;
	}
	public void setCardUnresponsive(Integer cardUnresponsive) {
		this.cardUnresponsive = cardUnresponsive;
	}
	
	@Column(name = "CHARGEDEVELOP")
	public Integer getChargeDevelop() {
		return chargeDevelop;
	}
	public void setChargeDevelop(Integer chargeDevelop) {
		this.chargeDevelop = chargeDevelop;
	}
	
	@Column(name = "CHARGERESTORE")
	public Integer getChargeRestore() {
		return chargeRestore;
	}
	public void setChargeRestore(Integer chargeRestore) {
		this.chargeRestore = chargeRestore;
	}
	
	@Column(name = "CHARGECUT")
	public Integer getChargeCut() {
		return chargeCut;
	}
	public void setChargeCut(Integer chargeCut) {
		this.chargeCut = chargeCut;
	}
	
	@Column(name = "CHARGEINCREASE")
	public Integer getChargeIncrease() {
		return chargeIncrease;
	}
	public void setChargeIncrease(Integer chargeIncrease) {
		this.chargeIncrease = chargeIncrease;
	}
	
	@Column(name = "CHARGESTOP")
	public Integer getChargeStop() {
		return chargeStop;
	}
	public void setChargeStop(Integer chargeStop) {
		this.chargeStop = chargeStop;
	}
	
	@Column(name = "CHARGEUNINSTALL")
	public Integer getChargeUninstall() {
		return chargeUninstall;
	}
	public void setChargeUninstall(Integer chargeUninstall) {
		this.chargeUninstall = chargeUninstall;
	}
	
	@Column(name = "CHARGEUNRESPONSIVE")
	public Integer getChargeUnresponsive() {
		return chargeUnresponsive;
	}
	public void setChargeUnresponsive(Integer chargeUnresponsive) {
		this.chargeUnresponsive = chargeUnresponsive;
	}

}
