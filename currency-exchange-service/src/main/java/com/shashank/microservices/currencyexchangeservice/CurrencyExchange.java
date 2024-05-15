package com.shashank.microservices.currencyexchangeservice;

import java.math.BigDecimal;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class CurrencyExchange {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String fromC;
	private String toC;
	private BigDecimal conversionMultiple;
	private String environment;
	
	
	public CurrencyExchange() {}
	public CurrencyExchange(Long id, String fromC, String toC, BigDecimal conversionMultiple) {
		super();
		this.id = id;
		this.fromC = fromC;
		this.toC = toC;
		this.conversionMultiple = conversionMultiple;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getFromC() {
		return fromC;
	}
	public void setFromC(String fromC) {
		this.fromC = fromC;
	}
	public String getToC() {
		return toC;
	}
	public void setToC(String toC) {
		this.toC = toC;
	}
	public BigDecimal getConversionMultiple() {
		return conversionMultiple;
	}
	public void setConversionMyltiple(BigDecimal conversionMultiple) {
		this.conversionMultiple = conversionMultiple;
	}
	
	public String getEnvironment() {
		return environment;
	}
	public void setEnvironment(String environment) {
		this.environment = environment;
	}
	
}
