package com.andreicosta.apiBroker.domain;


import java.util.Objects;

public class BrokerData {
	
	private String name;
	private String document;
	private String code;
	private String createDate;
	
	public BrokerData() {
		
	}

	public BrokerData(String name, String document, String code, String createDate) {
		super();
		this.name = name;
		this.document = document;
		this.code = code;
		this.createDate = createDate;
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
		BrokerData other = (BrokerData) obj;
		return Objects.equals(code, other.code);
	}
	
}
