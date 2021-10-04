package com.andreicosta.apiBroker.domain;

import java.util.Objects;

public class BrokerStats {
	
	private String code;
	private Boolean active;
	private Double commissionRate;
	
	public BrokerStats() {
		
	}

	public BrokerStats(String code, Boolean active, Double commissionRate) {
		super();
		this.code = code;
		this.active = active;
		this.commissionRate = commissionRate;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Boolean getActive() {
		return active;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}

	public Double getCommissionRate() {
		return commissionRate;
	}

	public void setCommissionRate(Double commissionRate) {
		this.commissionRate = commissionRate;
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
		BrokerStats other = (BrokerStats) obj;
		return Objects.equals(code, other.code);
	}

}
