package com.fancy.sell.dto;

import lombok.Data;

/**
 * @ClassName CartDTO
 * @Description TODO
 * @Author fancyyyy
 * @Date 2019/11/29 9:25
 * @Version 1.0
 **/
@Data
public class CartDTO {

    /** 商品Id. */
    private String productId;

    /** 数量. */
    private Integer productQuantity;

    public CartDTO(String productId, Integer productQuantity) {
        this.productId = productId;
        this.productQuantity = productQuantity;
    }
}
