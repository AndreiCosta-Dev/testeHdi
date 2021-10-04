package com.andreicosta.apiBroker.domain;

import java.io.Serializable;
import java.util.Objects;

public class Broker implements Serializable {

	private static final long serialVersionUID = 1L;
	private String name;
	private String document;
	private String code;
	private String createDate;
	private Double commissionRate;
	private Boolean active;
	
	public Broker() {
		
	}

	public Broker(String name, String document, String code, String createDate, Double commissionRate, Boolean active) {
		super();
		this.name = name;
		this.document = document;
		this.code = code;
		this.createDate = createDate;
		this.commissionRate = commissionRate;
		this.active = active;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDocument() {
		return document;
	}

	public void setDocument(String document) {
		this.document = document;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getCreateDate() {
		return createDate;
	}

	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}

	public Double getCommissionRate() {
		return commissionRate;
	}

	public void setCommissionRate(Double commissionRate) {
		this.commissionRate = commissionRate;
	}

	public Boolean getActive() {
		return active;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}

	@Override
	public int hashCode() {
		return Objects.hash(code);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Broker other = (Broker) obj;
		return Objects.equals(code, other.code);
	}
	
}
