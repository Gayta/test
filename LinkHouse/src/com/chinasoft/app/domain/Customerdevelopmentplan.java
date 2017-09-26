package com.chinasoft.app.domain;

import java.io.Serializable;

public class Customerdevelopmentplan implements Serializable{
	private Integer planid;
	private Customer customer;
	private String planItem;
	private String scheduleTime;
	private String executionEffect;
	public Integer getPlanid() {
		return planid;
	}
	public void setPlanid(Integer planid) {
		this.planid = planid;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public String getPlanItem() {
		return planItem;
	}
	public void setPlanItem(String planItem) {
		this.planItem = planItem;
	}
	public String getScheduleTime() {
		return scheduleTime;
	}
	public void setScheduleTime(String scheduleTime) {
		this.scheduleTime = scheduleTime;
	}
	public String getExecutionEffect() {
		return executionEffect;
	}
	public void setExecutionEffect(String executionEffect) {
		this.executionEffect = executionEffect;
	}
	
}
