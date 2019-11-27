package com.fancy.sell.VO;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

/**
 * @ClassName ProductVO
 * @Description 商品（包含类目）
 * @Author fancyyyy
 * @Date 2019/11/27 16:32
 * @Version 1.0
 **/
@Data
public class ProductVO {

    @JsonProperty("name")
    private String categoryName;

    @JsonProperty("type")
    private Integer categoryType;

    @JsonProperty("foods")
    private List<ProductInfoVO> productInfoVOList;
}
