package com.gzmu.springboot_project.service.serviceImpl;

import com.gzmu.springboot_project.mapper.UserMapper;
import com.gzmu.springboot_project.model.User;
import com.gzmu.springboot_project.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @className: UserServiceImpl
 * @author: 冫soul丶
 * @version: 1.0
 * @date: created in 上午12:47 19-6-22
 * @modified:
 */
@Service
public class UserServiceImpl implements UserService {
    final
    UserMapper userMapper;

    @Autowired
    public UserServiceImpl(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    @Override
    public User findByUsername(String name) {
        return userMapper.findByUsername(name);
    }
}
