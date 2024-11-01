package com.currencyconversion.conversion_service;

import java.math.BigDecimal;

public class ConvertedCurrency {
	
	private int id;
	private String from;
	private String to;
	private BigDecimal changerate;
	private BigDecimal qunatity;
	private BigDecimal totalAmount;
	
	public ConvertedCurrency() {}
	
	public ConvertedCurrency(int id, String from, String to, BigDecimal changerate, BigDecimal qunatity,
			BigDecimal totalAmount) {
		this.id = id;
		this.from = from;
		this.to = to;
		this.changerate = changerate;
		this.qunatity = qunatity;
		this.totalAmount = totalAmount;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public BigDecimal getChangerate() {
		return changerate;
	}
	public void setChangerate(BigDecimal changerate) {
		this.changerate = changerate;
	}
	public BigDecimal getQunatity() {
		return qunatity;
	}
	public void setQunatity(BigDecimal qunatity) {
		this.qunatity = qunatity;
	}
	public BigDecimal getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(BigDecimal totalAmount) {
		this.totalAmount = totalAmount;
	}
	
	

}
