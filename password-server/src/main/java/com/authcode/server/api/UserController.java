package com.authcode.server.api;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    /**
     * 资源API
     * @return
     */
	@CrossOrigin
    @RequestMapping("/api/userInfo")
	public ResponseEntity<UserInfo> getUserInfo() {
    	  User user = (User) SecurityContextHolder.getContext()
                  .getAuthentication().getPrincipal();
          String email = user.getUsername() + "@xxyyl.com";

          UserInfo userInfo = new UserInfo();
          userInfo.setName(user.getUsername());
          userInfo.setEmail(email);

          return ResponseEntity.ok(userInfo);
	}

}
