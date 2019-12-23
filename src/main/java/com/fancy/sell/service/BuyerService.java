package com.fancy.sell.service;

import com.fancy.sell.dto.OrderDTO;

/**
 * @ClassName BuyerService
 * @Description 买家
 * @Author fancyyyy
 * @Date 2019/12/23 16:23
 * @Version 1.0
 **/
public interface BuyerService {

    //查询一个订单
    OrderDTO findOrderOne(String openid, String orderId);

    //取消订单
    OrderDTO cancelOrder(String openid, String orderId);
}
