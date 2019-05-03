package com.gzmu.springboot_project.mapper;

import com.gzmu.springboot_project.model.GoodsManage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

/**
 * @author author
 */
@RepositoryRestResource
public interface GoodsManageMapper extends JpaRepository<GoodsManage, Integer> {
    /**
     * 根据名称查询
     * @param goodsName
     * @return List
     */
    List<GoodsManage>findByGoodsName(String goodsName);
}