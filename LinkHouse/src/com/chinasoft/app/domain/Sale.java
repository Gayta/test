package com.chinasoft.app.domain;

import java.io.Serializable;

public class Sale implements Serializable{
	private Integer saleId;
	private String opportunitySource;
	private Customer customer;
	private Integer probability;
	private String outline;
	private String contacts;
	private Integer contactsPhone;
	private String opportunityDescription;
	private Emp founder;//������
	private Integer Creationdate;
	private Emp assigns;//ָ����
	private String assignmentTime;
	private Emp assignid;//ָ���˱��
	private Emp executorId;//ִ���˱��
	private String state;
	public Integer getSaleId() {
		return saleId;
	}
	public void setSaleId(Integer saleId) {
		this.saleId = saleId;
	}
	public String getOpportunitySource() {
		return opportunitySource;
	}
	public void setOpportunitySource(String opportunitySource) {
		this.opportunitySource = opportunitySource;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public Integer getProbability() {
		return probability;
	}
	public void setProbability(Integer probability) {
		this.probability = probability;
	}
	public String getOutline() {
		return outline;
	}
	public void setOutline(String outline) {
		this.outline = outline;
	}
	public String getContacts() {
		return contacts;
	}
	public void setContacts(String contacts) {
		this.contacts = contacts;
	}
	public Integer getContactsPhone() {
		return contactsPhone;
	}
	public void setContactsPhone(Integer contactsPhone) {
		this.contactsPhone = contactsPhone;
	}
	public String getOpportunityDescription() {
		return opportunityDescription;
	}
	public void setOpportunityDescription(String opportunityDescription) {
		this.opportunityDescription = opportunityDescription;
	}
	public Emp getFounder() {
		return founder;
	}
	public void setFounder(Emp founder) {
		this.founder = founder;
	}
	public Integer getCreationdate() {
		return Creationdate;
	}
	public void setCreationdate(Integer creationdate) {
		Creationdate = creationdate;
	}
	public Emp getAssigns() {
		return assigns;
	}
	public void setAssigns(Emp assigns) {
		this.assigns = assigns;
	}
	public String getAssignmentTime() {
		return assignmentTime;
	}
	public void setAssignmentTime(String assignmentTime) {
		this.assignmentTime = assignmentTime;
	}
	public Emp getAssignid() {
		return assignid;
	}
	public void setAssignid(Emp assignid) {
		this.assignid = assignid;
	}
	public Emp getExecutorId() {
		return executorId;
	}
	public void setExecutorId(Emp executorId) {
		this.executorId = executorId;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
}
