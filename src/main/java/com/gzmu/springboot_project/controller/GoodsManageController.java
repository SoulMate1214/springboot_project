package com.gzmu.springboot_project.controller;

import com.gzmu.springboot_project.service.GoodsManageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @className: GoodsManageController
 * @author: 冫soul丶
 * @version: 1.0
 * @date: created in 下午5:36 19-4-26
 * @modified:
 */
@RestController
@RequestMapping("goodsManage")
public class GoodsManageController {
    @Autowired
    GoodsManageService goodsManageService;
}
