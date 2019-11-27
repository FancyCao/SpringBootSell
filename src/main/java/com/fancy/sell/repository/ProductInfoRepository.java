package com.fancy.sell.repository;

import com.fancy.sell.dataobject.ProductInfo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @ClassName ProductInfoRepository
 * @Description TODO
 * @Author fancyyyy
 * @Date 2019/11/27 13:41
 * @Version 1.0
 **/
public interface ProductInfoRepository extends JpaRepository<ProductInfo, String> {

    /** 查询已上架商品 */
    List<ProductInfo> findByProductStatus(Integer productStatus);
}
