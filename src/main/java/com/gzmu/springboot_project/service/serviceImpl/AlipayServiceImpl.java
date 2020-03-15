package com.gzmu.springboot_project.service.serviceImpl;

import com.alipay.api.AlipayApiException;
import com.alipay.api.AlipayClient;
import com.alipay.api.DefaultAlipayClient;
import com.alipay.api.request.AlipayTradePagePayRequest;
import com.gzmu.springboot_project.service.AlipayService;
import com.gzmu.springboot_project.tools.AlipayConfig;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@Service
@Slf4j
public class AlipayServiceImpl implements AlipayService {
    @Override
    public void aliPay(HttpServletResponse response, HttpServletRequest request) throws IOException {
        // 字符集
        response.setContentType("text/html;charset=utf-8");
        //获得初始化的AlipayClient
        AlipayClient alipayClient = new DefaultAlipayClient(AlipayConfig.gatewayUrl, AlipayConfig.app_id, AlipayConfig.merchant_private_key, "json", AlipayConfig.charset, AlipayConfig.alipay_public_key, AlipayConfig.sign_type);
        //设置请求参数
        AlipayTradePagePayRequest aliPayRequest = new AlipayTradePagePayRequest();
        // 支付跳转时的页面
        aliPayRequest.setReturnUrl(AlipayConfig.return_url);
        // 支付成功/失败后的页面
        aliPayRequest.setNotifyUrl(AlipayConfig.notify_url);
        //商户订单号，后台可以写一个工具类生成一个订单号，必填
        String order_number = new String("00001");
        //付款金额，从前台获取，必填
        String total_amount = new String("100");
        //订单名称，必填
        String subject = new String("沙箱测试");
        // 该笔订单允许的最晚付款时间，逾期将关闭交易。取值范围：1m～15d。m-分钟，h-小时，d-天，1c-当天（1c-当天的情况下，无论交易何时创建，都在0点关闭）。 该参数数值不接受小数点， 如 1.5h，可转换为 90m。
        String timeout_express = "1c";
        //请求
        String result = null;

        aliPayRequest.setBizContent("{\"out_trade_no\":\"" + order_number + "\","
                + "\"total_amount\":\"" + total_amount + "\","
                + "\"subject\":\"" + subject + "\","
                + "\"timeout_express\":\""+ timeout_express +"\","
                + "\"product_code\":\"FAST_INSTANT_TRADE_PAY\"}");
        try {
            result = alipayClient.pageExecute(aliPayRequest).getBody();
        } catch (AlipayApiException e) {
            e.printStackTrace();
        }
        //输出
        PrintWriter out = response.getWriter();
        out.println(result);
        log.info("返回结果={}",result);
    }
}
