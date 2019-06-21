package com.gzmu.springboot_project.controller;

import com.gzmu.springboot_project.model.User;
import com.gzmu.springboot_project.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @className: UserController
 * @author: 冫soul丶
 * @version: 1.0
 * @date: created in 上午12:49 19-6-22
 * @modified:
 */
@RestController
@RequestMapping("user")
public class UserController {
    final
    UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping("login")
    public Map<String, Object> login(String name, String password) {
        User user = userService.findByUsername(name);
        Map<String, Object> map = new HashMap<>(1);
        if (name.equals(user.getUsername()) && password.equals(user.getUserpwd())) {
            map.put("message", "true");
            return map;
        } else {
            map.put("message", "false");
            return map;
        }
    }
}
