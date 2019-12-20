package com.fancy.sell.exception;

import com.fancy.sell.enums.ResultEnum;

/**
 * @ClassName SellException
 * @Description TODO
 * @Author fancyyyy
 * @Date 2019/11/28 16:23
 * @Version 1.0
 **/
public class SellException extends RuntimeException {

    private Integer code;

    public SellException(ResultEnum resultEnum) {
        super(resultEnum.getMessage());

        this.code = resultEnum.getCode();
    }

    public SellException(Integer code, String message) {
        super(message);
        this.code = code;
    }
}
