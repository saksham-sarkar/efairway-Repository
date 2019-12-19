package com.efairway.shop.model.security;

import com.efairway.shop.model.entity.Entity;

public class PermissionEntity extends Entity {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
