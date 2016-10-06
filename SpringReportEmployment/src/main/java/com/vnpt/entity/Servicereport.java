package com.vnpt.entity;

public class Servicereport {

	public Servicereport(String username, String nameService,
			Integer develop, Integer restore, Integer cut, Integer stop, Integer increase,
			Integer uninstall, Integer unresponsive) {
		super();
		this.username = username;
		this.setNameService(nameService);
		this.develop = develop;
		this.restore = restore;
		this.cut = cut;
		this.stop = stop;
		this.increase = increase;
		this.uninstall = uninstall;
		this.unresponsive = unresponsive;

	}
	
	
	private String username;
	private String nameService;
    private Integer develop;
    private Integer restore;
    private Integer cut;
    private Integer stop;
    private Integer increase;
    private Integer uninstall;
    private Integer unresponsive;
    
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public Integer getDevelop() {
		return develop;
	}
	public void setDevelop(Integer develop) {
		this.develop = develop;
	}
	public Integer getRestore() {
		return restore;
	}
	public void setRestore(Integer restore) {
		this.restore = restore;
	}
	public Integer getStop() {
		return stop;
	}
	public void setStop(Integer stop) {
		this.stop = stop;
	}
	public Integer getCut() {
		return cut;
	}
	public void setCut(Integer cut) {
		this.cut = cut;
	}
	public Integer getUninstall() {
		return uninstall;
	}
	public void setUninstall(Integer uninstall) {
		this.uninstall = uninstall;
	}
	public Integer getIncrease() {
		return increase;
	}
	public void setIncrease(Integer increase) {
		this.increase = increase;
	}
	public Integer getUnresponsive() {
		return unresponsive;
	}
	public void setUnresponsive(Integer unresponsive) {
		this.unresponsive = unresponsive;
	}
	public String getNameService() {
		return nameService;
	}
	public void setNameService(String nameService) {
		this.nameService = nameService;
	}
	
}
