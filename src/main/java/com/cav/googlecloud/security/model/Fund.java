package com.cav.googlecloud.security.model;

import java.math.BigDecimal;

public class Fund {

	private Long fundId;
	private String fundName;
	private BigDecimal ammount;
	
	public Fund(Long fundId, String fundName, BigDecimal ammount) {
		super();
		this.fundId = fundId;
		this.fundName = fundName;
		this.ammount = ammount;
	}

	public Long getFundId() {
		return fundId;
	}

	public String getFundName() {
		return fundName;
	}

	public BigDecimal getAmmount() {
		return ammount;
	}

	@Override
	public String toString() {
		return "Fund [fundId=" + fundId + ", fundName=" + fundName + ", ammount=" + ammount + "]";
	}
}
