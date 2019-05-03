package com.gzmu.springboot_project.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @className: LoginController
 * @author: 冫soul丶
 * @version: 1.0
 * @date: created in 下午9:27 19-4-26
 * @modified:
 */
@RestController
public class LoginController {
    @RequestMapping("login")
    public Map<String, Object> login(String name, String password) {
        Map<String, Object> map = new HashMap<>(1);
        if (name.equals("admin") && password.equals("admin")) {
            map.put("message", "true");
            return map;
        } else {
            map.put("message", "false");
            return map;
        }
    }
}
