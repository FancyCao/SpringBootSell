package com.fancy.sell.controller;

import com.fancy.sell.VO.ResultVO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName BuyerProductController
 * @Description 买家商品
 * @Author fancyyyy
 * @Date 2019/11/27 16:02
 * @Version 1.0
 **/
@RestController
@RequestMapping("/buyer/product")
public class BuyerProductController {

    @GetMapping("/list")
    public ResultVO list() {
        ResultVO resultVO = new ResultVO();
        resultVO.setCode(0);
        resultVO.setMsg("成功");
        return resultVO;
    }
}
