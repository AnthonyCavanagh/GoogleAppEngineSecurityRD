package com.cav.googlecloud.security.model;

import java.util.ArrayList;
import java.util.List;

public class FundClass {

	private long fundClassId;
	private String fundClassName;
	private long admin;
	
	private List <Fund> funds;
	
	public FundClass(long fundClassId, String fundClassName, long admin) {
		super();
		this.fundClassId = fundClassId;
		this.fundClassName = fundClassName;
		this.admin = admin;
		funds = new ArrayList<Fund>();
	}

	public long getFundClassId() {
		return fundClassId;
	}

	public String getFundClassName() {
		return fundClassName;
	}

	public long getAdmin() {
		return admin;
	}

	public List<Fund> getFunds() {
		return funds;
	}

	@Override
	public String toString() {
		return "FundClass [fundClassId=" + fundClassId + ", fundClassName=" + fundClassName + ", admin=" + admin
				+ ", funds=" + funds + "]";
	}

}
