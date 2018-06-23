package com.authcode.server.api;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    /**
     * 资源API
     * @return
     */
    @RequestMapping("/api/userList")
	public ResponseEntity<List<UserInfo>> getUserInfo() {
		return ResponseEntity.ok(getUsers());
	}
    private List<UserInfo> getUsers() {
        List<UserInfo> users = new ArrayList<>();
        users.add(new UserInfo("yyl", "yyl@xx.com"));
        users.add(new UserInfo("songyi", "songyi@xxo.com"));
        users.add(new UserInfo("ddf", "ddf@xxyy.com"));
        return users;
    }

}
