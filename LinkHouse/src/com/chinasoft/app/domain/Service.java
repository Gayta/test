package com.chinasoft.app.domain;

import java.io.Serializable;

public class Service implements Serializable{
	private String serviceId;
	private String outline;
	private Customer customer;
	private String state;
	private String serviceRequest;
	private Emp founder;//������
	private String serviceType;
	private String creationTime;
	private String serviceProcessing;
	private Emp distributor;//������
	private Emp assignedTo;//����ʱ��
	private String treatmentResult;
	private String satisfactionDegree;
	private Emp handlePerson;//������
	private String processingTime;
	public String getServiceId() {
		return serviceId;
	}
	public void setServiceId(String serviceId) {
		this.serviceId = serviceId;
	}
	public String getOutline() {
		return outline;
	}
	public void setOutline(String outline) {
		this.outline = outline;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getServiceRequest() {
		return serviceRequest;
	}
	public void setServiceRequest(String serviceRequest) {
		this.serviceRequest = serviceRequest;
	}
	public Emp getFounder() {
		return founder;
	}
	public void setFounder(Emp founder) {
		this.founder = founder;
	}
	public String getServiceType() {
		return serviceType;
	}
	public void setServiceType(String serviceType) {
		this.serviceType = serviceType;
	}
	public String getCreationTime() {
		return creationTime;
	}
	public void setCreationTime(String creationTime) {
		this.creationTime = creationTime;
	}
	public String getServiceProcessing() {
		return serviceProcessing;
	}
	public void setServiceProcessing(String serviceProcessing) {
		this.serviceProcessing = serviceProcessing;
	}
	public Emp getDistributor() {
		return distributor;
	}
	public void setDistributor(Emp distributor) {
		this.distributor = distributor;
	}
	public Emp getAssignedTo() {
		return assignedTo;
	}
	public void setAssignedTo(Emp assignedTo) {
		this.assignedTo = assignedTo;
	}
	public String getTreatmentResult() {
		return treatmentResult;
	}
	public void setTreatmentResult(String treatmentResult) {
		this.treatmentResult = treatmentResult;
	}
	public String getSatisfactionDegree() {
		return satisfactionDegree;
	}
	public void setSatisfactionDegree(String satisfactionDegree) {
		this.satisfactionDegree = satisfactionDegree;
	}
	public Emp getHandlePerson() {
		return handlePerson;
	}
	public void setHandlePerson(Emp handlePerson) {
		this.handlePerson = handlePerson;
	}
	public String getProcessingTime() {
		return processingTime;
	}
	public void setProcessingTime(String processingTime) {
		this.processingTime = processingTime;
	}
	
}
