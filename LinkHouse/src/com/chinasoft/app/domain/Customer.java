package com.chinasoft.app.domain;

import java.io.Serializable;

public class Customer implements Serializable{

	private String customerid;
	private String compary;
	private String region;
	private Emp emp;
	private Integer customerLevel;
	private String creationTime;
	private Integer satisfactionDegree;
	private Integer credit;
	private String address;
	private String deathState;
	private Integer postalCode;
	private String tel;
	private String fax;
	private String web;
	private String businessLicense;	
	private String legalPerson;
	private String registeredCapital;
	private String turnover;
	private String bank;
	private Integer bankAccount;
	private Integer localTax;
	private Integer stateTax;
	public String getCustomerid() {
		return customerid;
	}
	public void setCustomerid(String customerid) {
		this.customerid = customerid;
	}
	public String getCompary() {
		return compary;
	}
	public void setCompary(String compary) {
		this.compary = compary;
	}
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}
	public Emp getEmp() {
		return emp;
	}
	public void setEmp(Emp emp) {
		this.emp = emp;
	}
	public Integer getCustomerLevel() {
		return customerLevel;
	}
	public void setCustomerLevel(Integer customerLevel) {
		this.customerLevel = customerLevel;
	}
	public String getCreationTime() {
		return creationTime;
	}
	public void setCreationTime(String creationTime) {
		this.creationTime = creationTime;
	}
	public Integer getSatisfactionDegree() {
		return satisfactionDegree;
	}
	public void setSatisfactionDegree(Integer satisfactionDegree) {
		this.satisfactionDegree = satisfactionDegree;
	}
	public Integer getCredit() {
		return credit;
	}
	public void setCredit(Integer credit) {
		this.credit = credit;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getDeathState() {
		return deathState;
	}
	public void setDeathState(String deathState) {
		this.deathState = deathState;
	}
	public Integer getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(Integer postalCode) {
		this.postalCode = postalCode;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getFax() {
		return fax;
	}
	public void setFax(String fax) {
		this.fax = fax;
	}
	public String getWeb() {
		return web;
	}
	public void setWeb(String web) {
		this.web = web;
	}
	public String getBusinessLicense() {
		return businessLicense;
	}
	public void setBusinessLicense(String businessLicense) {
		this.businessLicense = businessLicense;
	}
	public String getLegalPerson() {
		return legalPerson;
	}
	public void setLegalPerson(String legalPerson) {
		this.legalPerson = legalPerson;
	}
	public String getRegisteredCapital() {
		return registeredCapital;
	}
	public void setRegisteredCapital(String registeredCapital) {
		this.registeredCapital = registeredCapital;
	}
	public String getTurnover() {
		return turnover;
	}
	public void setTurnover(String turnover) {
		this.turnover = turnover;
	}
	public String getBank() {
		return bank;
	}
	public void setBank(String bank) {
		this.bank = bank;
	}
	public Integer getBankAccount() {
		return bankAccount;
	}
	public void setBankAccount(Integer bankAccount) {
		this.bankAccount = bankAccount;
	}
	public Integer getLocalTax() {
		return localTax;
	}
	public void setLocalTax(Integer localTax) {
		this.localTax = localTax;
	}
	public Integer getStateTax() {
		return stateTax;
	}
	public void setStateTax(Integer stateTax) {
		this.stateTax = stateTax;
	}
	
}
