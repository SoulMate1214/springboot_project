package com.gzmu.springboot_project.controller;

import com.gzmu.springboot_project.service.AlipayService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@RestController

public class AlipayController {
    final AlipayService alipayService;

    public AlipayController(AlipayService alipayService) {
        this.alipayService = alipayService;
    }

    @RequestMapping("pay")
    public void pay(HttpServletResponse response, HttpServletRequest request) {
        try {
            alipayService.aliPay(response,request);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
