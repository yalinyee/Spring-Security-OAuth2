package com.jwt.authserver.api;

import lombok.Data;

/**
 * @author yeyalin
 * <p>lombok加上@Data注解
 * <p>自动生成geter/setter方法
 *
 */
@Data
public class UserInfo {
	private String name;
	private String email;
	
	public UserInfo() {
		
	}
	public UserInfo(String name, String email) {
		super();
		this.name = name;
		this.email = email;
	}
	
}
