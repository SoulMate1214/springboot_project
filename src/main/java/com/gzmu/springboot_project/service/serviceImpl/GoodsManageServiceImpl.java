package com.gzmu.springboot_project.service.serviceImpl;

import com.gzmu.springboot_project.mapper.GoodsManageMapper;
import com.gzmu.springboot_project.service.GoodsManageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @className: GoodsManageServiceImpl
 * @author: 冫soul丶
 * @version: 1.0
 * @date: created in 下午5:27 19-4-26
 * @modified:
 */
@Service
public class GoodsManageServiceImpl implements GoodsManageService {
    final GoodsManageMapper goodsManageMapper;

    @Autowired
    public GoodsManageServiceImpl(GoodsManageMapper goodsManageMapper) {
        this.goodsManageMapper = goodsManageMapper;
    }
}
