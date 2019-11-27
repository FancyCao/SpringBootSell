package com.fancy.sell.service;

import com.fancy.sell.dataobject.ProductCategory;

import java.util.List;

/**
 * @ClassName CategoryService
 * @Description 类目
 * @Author fancyyyy
 * @Date 2019/11/27 11:02
 * @Version 1.0
 **/
public interface CategoryService {

    ProductCategory findById(Integer categoryId);

    List<ProductCategory> findAll();

    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);

    ProductCategory save(ProductCategory productCategory);
}
