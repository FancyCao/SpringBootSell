package com.fancy.sell.service;

import com.fancy.sell.dto.OrderDTO;

/**
 * @ClassName PayService
 * @Description 支付
 * @Author fancyyyy
 * @Date 2019/12/31 9:37
 * @Version 1.0
 **/
public interface PayService {
    void create(OrderDTO orderDTO);
}
