package com.gzmu.springboot_project.controller;

import com.gzmu.springboot_project.service.GoodsClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @className: GoodsClassController
 * @author: 冫soul丶
 * @version: 1.0
 * @date: created in 下午5:36 19-4-26
 * @modified:
 */
@RestController
@RequestMapping("goodsClass")
public class GoodsClassController {
    final
    GoodsClassService goodsClassService;

    @Autowired
    public GoodsClassController(GoodsClassService goodsClassService) {
        this.goodsClassService = goodsClassService;
    }
}