package com.fancy.sell.enums;

import lombok.Getter;

/**
 * @ClassName ProductStatusEnum
 * @Description 商品状态
 * @Author fancyyyy
 * @Date 2019/11/27 14:51
 * @Version 1.0
 **/
@Getter
public enum ProductStatusEnum {
    UP(0,"在架"),
    DOWN(1,"下架")
    ;

    private Integer code;

    private String message;

    ProductStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
