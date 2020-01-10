package com.fancy.sell.controller;

import com.fancy.sell.dto.OrderDTO;
import com.fancy.sell.enums.ResultEnum;
import com.fancy.sell.exception.SellException;
import com.fancy.sell.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @ClassName PayController
 * @Description TODO
 * @Author fancyyyy
 * @Date 2019/12/31 9:30
 * @Version 1.0
 **/
@Controller
@RequestMapping("/pay")
public class PayController {
    @Autowired
    private OrderService orderService;

    @GetMapping("/create")
    public void create(@RequestParam("orderId") String orderId,
                       @RequestParam("returnUrl") String returnUrl) {
        //1. 查询订单
        OrderDTO orderDTO = orderService.findById(orderId);
        if (orderDTO == null) {
            throw new SellException(ResultEnum.ORDER_NOT_EXIST);
        }

    }
}
