package com.fancy.sell.utils;

import com.fancy.sell.VO.ResultVO;

/**
 * @ClassName ResultVOUtil
 * @Description TODO
 * @Author caoyi
 * @Date 2019/11/27 21:11
 * @Version 1.0
 **/
public class ResultVOUtil {
    public static ResultVO success(Object object) {
        ResultVO resultVO = new ResultVO();
        resultVO.setData(object);
        resultVO.setCode(0);
        resultVO.setMsg("成功");
        return resultVO;
    }

    public static ResultVO success() {
        return success(null);
    }

    public static ResultVO error(Integer code, String msg) {
        ResultVO resultVO = new ResultVO();
        resultVO.setCode(code);
        resultVO.setMsg(msg);
        return resultVO;
    }
}
