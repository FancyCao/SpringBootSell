package com.fancy.sell.service.impl;

import com.fancy.sell.dataobject.OrderDetail;
import com.fancy.sell.dataobject.ProductInfo;
import com.fancy.sell.dto.OrderDTO;
import com.fancy.sell.enums.ResultEnum;
import com.fancy.sell.exception.SellException;
import com.fancy.sell.repository.OrderDetailRepository;
import com.fancy.sell.service.OrderService;
import com.fancy.sell.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * @ClassName OrderServiceImpl
 * @Description TODO
 * @Author fancyyyy
 * @Date 2019/11/28 15:28
 * @Version 1.0
 **/
@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private ProductService productService;

    @Autowired
    private OrderDetailRepository orderDetailRepository;

    @Override
    public OrderDTO create(OrderDTO orderDTO) {

        BigDecimal orderAmount = new BigDecimal(BigInteger.ZERO);

        // 1. 查询商品（数量，价格）
        for (OrderDetail orderDetail:
             orderDTO.getOrderDetailList()) {
            ProductInfo productInfo = productService.findById(orderDetail.getProductId());
            if (productInfo == null) {
                //如果数据库中没有这条信息则抛出异常
                throw new SellException(ResultEnum.PRODUCT_NOT_EXIST);
            }
            // 2. 计算订单总价
            orderAmount = orderDetail.getProductPrice()
                    .multiply(new BigDecimal(orderDetail.getProductQuantity()))
                    .add(orderAmount);

            // 订单详情入库

            orderDetailRepository.save(orderDetail);
        }

        // 3. 写入订单数据库（orderMaster和orderDetail）

        // 4. 扣库存

        return null;
    }

    @Override
    public OrderDTO findById(String orderId) {
        return null;
    }

    @Override
    public Page<OrderDTO> findList(String buyerOpenid, Pageable pageable) {
        return null;
    }

    @Override
    public OrderDTO cancel(OrderDTO orderDTO) {
        return null;
    }

    @Override
    public OrderDTO finish(OrderDTO orderDTO) {
        return null;
    }

    @Override
    public OrderDTO paid(OrderDTO orderDTO) {
        return null;
    }
}
