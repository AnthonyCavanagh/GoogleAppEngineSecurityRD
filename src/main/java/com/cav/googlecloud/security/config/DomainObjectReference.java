package com.cav.googlecloud.security.config;

import java.io.Serializable;

public class DomainObjectReference {

	private final Serializable targetId;
	private final String targetType;
	public DomainObjectReference(Serializable targetId, String targetType) {
		super();
		this.targetId = targetId;
		this.targetType = targetType;
	}
	public Serializable getTargetId() {
		return targetId;
	}
	public String getTargetType() {
		return targetType;
	}
}
