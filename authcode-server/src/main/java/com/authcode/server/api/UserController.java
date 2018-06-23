package com.authcode.server.api;

import org.springframework.http.ResponseEntity;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

	// 资源API
    @RequestMapping("/api/userinfo")
	public ResponseEntity<UserInfo> getUserInfo() {
		User user = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();

		String email = user.getUsername() + "lover_ya@sina.com";

		UserInfo userInfo = new UserInfo();
		userInfo.setEmail(email);
		userInfo.setName(user.getUsername());

		return ResponseEntity.ok(userInfo);
	}

}
