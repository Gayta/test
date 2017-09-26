package com.chinasoft.app.domain;

import java.io.Serializable;

public class Order implements Serializable {

	private Integer oid;
	private Customer customer;
	private Emp emp;
	private String address;
	private String flag;
	public Integer getOid() {
		return oid;
	}
	public void setOid(Integer oid) {
		this.oid = oid;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public Emp getEmp() {
		return emp;
	}
	public void setEmp(Emp emp) {
		this.emp = emp;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String isFlag() {
		return flag;
	}
	public void setFlag(String flag) {
		this.flag = flag;
	}
}
