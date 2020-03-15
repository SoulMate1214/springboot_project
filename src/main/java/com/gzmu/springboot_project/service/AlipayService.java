package com.gzmu.springboot_project.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@FunctionalInterface
public interface AlipayService {
    void  aliPay(HttpServletResponse response, HttpServletRequest request) throws IOException;
}
