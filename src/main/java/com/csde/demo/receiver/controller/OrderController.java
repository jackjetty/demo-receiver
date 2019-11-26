package com.csde.demo.receiver.controller;

import com.csde.demo.receiver.pojo.vo.OrderVo;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class OrderController {

    @GetMapping(value = "order/{orderId}", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public OrderVo getOrder(HttpServletRequest request, HttpServletResponse response,@PathVariable(value="orderId",required = false) String orderId){

        return OrderVo.builder().id(orderId).status(1).customer("10086").build();
    }
}