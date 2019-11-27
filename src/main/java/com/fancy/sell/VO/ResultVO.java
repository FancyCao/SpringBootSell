package com.fancy.sell.VO;

import lombok.Data;

/**
 * @ClassName ResultVO
 * @Description http请求返回的最外层对象
 * @Author fancyyyy
 * @Date 2019/11/27 16:08
 * @Version 1.0
 **/
@Data
public class ResultVO<T> {

    /** 错误码. */
    private Integer code;

    /** 提示信息. */
    private String msg;

    /** 具体内容. */
    private T data;
}
