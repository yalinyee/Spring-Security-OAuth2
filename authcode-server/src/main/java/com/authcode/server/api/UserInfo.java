package com.authcode.server.api;

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
}
