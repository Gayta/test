package com.chinasoft.app.domain;

import java.io.Serializable;

public class Price implements Serializable {

	private Integer priceid;
	private String priductName;
	private double price;
	private double productPrice;
	private double implementPrice;
	private double operationPrice;
	private double specialPrice;
	private double profitLossPrice;
	private double total;
	public Integer getPriceid() {
		return priceid;
	}
	public void setPriceid(Integer priceid) {
		this.priceid = priceid;
	}
	public String getPriductName() {
		return priductName;
	}
	public void setPriductName(String priductName) {
		this.priductName = priductName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}
	public double getImplementPrice() {
		return implementPrice;
	}
	public void setImplementPrice(double implementPrice) {
		this.implementPrice = implementPrice;
	}
	public double getOperationPrice() {
		return operationPrice;
	}
	public void setOperationPrice(double operationPrice) {
		this.operationPrice = operationPrice;
	}
	public double getSpecialPrice() {
		return specialPrice;
	}
	public void setSpecialPrice(double specialPrice) {
		this.specialPrice = specialPrice;
	}
	public double getProfitLossPrice() {
		return profitLossPrice;
	}
	public void setProfitLossPrice(double profitLossPrice) {
		this.profitLossPrice = profitLossPrice;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	
	
	
}
