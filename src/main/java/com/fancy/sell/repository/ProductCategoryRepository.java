package com.fancy.sell.repository;

import com.fancy.sell.dataobject.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @ClassName ProductCategoryRepository
 * @Description 类目
 * @Author fancyyyy
 * @Date 2019/11/27 8:46
 * @Version 1.0
 **/
public interface ProductCategoryRepository extends JpaRepository<ProductCategory, Integer> {

    /** 根据类目编号的集合查找类目集合. */
    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);
}
