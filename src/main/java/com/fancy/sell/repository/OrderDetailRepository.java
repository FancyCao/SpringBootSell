package com.fancy.sell.repository;

import com.fancy.sell.dataobject.OrderDetail;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @ClassName OrderDetailRepository
 * @Description 订单详情
 * @Author fancyyyy
 * @Date 2019/11/28 10:07
 * @Version 1.0
 **/
public interface OrderDetailRepository extends JpaRepository<OrderDetail, String> {

    List<OrderDetail> findByOrderId(String orderId);

}
