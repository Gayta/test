package com.chinasoft.app.domain;

import java.io.Serializable;

public class System implements Serializable {
	private String sysytemId;
	private String logo;
	private String title;
	private String copyright;
	public String getSysytemId() {
		return sysytemId;
	}
	public void setSysytemId(String sysytemId) {
		this.sysytemId = sysytemId;
	}
	public String getLogo() {
		return logo;
	}
	public void setLogo(String logo) {
		this.logo = logo;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getCopyright() {
		return copyright;
	}
	public void setCopyright(String copyright) {
		this.copyright = copyright;
	}
	
	
}
