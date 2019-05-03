package com.gzmu.springboot_project.service.serviceImpl;

import com.gzmu.springboot_project.mapper.GoodsClassMapper;
import com.gzmu.springboot_project.service.GoodsClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @className: GoodsClassServiceImpl
 * @author: 冫soul丶
 * @version: 1.0
 * @date: created in 下午5:26 19-4-26
 * @modified:
 */
@Service
public class GoodsClassServiceImpl implements GoodsClassService {
    final GoodsClassMapper goodsClassMapper;

    @Autowired
    public GoodsClassServiceImpl(GoodsClassMapper goodsClassMapper) {
        this.goodsClassMapper = goodsClassMapper;
    }
}
