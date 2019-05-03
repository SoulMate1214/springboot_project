package com.gzmu.springboot_project.mapper;

import com.gzmu.springboot_project.model.GoodsClass;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

/**
 * @author author
 */
@RepositoryRestResource
public interface GoodsClassMapper extends JpaRepository<GoodsClass, Integer> {
    /**
     * 根据名称查询
     * @param className
     * @return List
     */
    List<GoodsClass> findByClassName(String className);
}