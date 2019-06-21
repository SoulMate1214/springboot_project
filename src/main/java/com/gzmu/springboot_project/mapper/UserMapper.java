package com.gzmu.springboot_project.mapper;

import com.gzmu.springboot_project.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * @className: UserMapper
 * @author: 冫soul丶
 * @version: 1.0
 * @date: created in 上午12:43 19-6-22
 * @modified:
 */
@RepositoryRestResource
public interface UserMapper extends JpaRepository<User, Integer> {
    User findByUsername(String name);
}
