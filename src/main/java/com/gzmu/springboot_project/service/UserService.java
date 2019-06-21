package com.gzmu.springboot_project.service;

import com.gzmu.springboot_project.model.User;

/**
 * @className: UserService
 * @author: 冫soul丶
 * @version: 1.0
 * @date: created in 上午12:46 19-6-22
 * @modified:
 */
public interface UserService {
    User findByUsername (String name);
}
