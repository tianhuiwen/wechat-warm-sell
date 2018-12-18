package com.imooc.sell.repository;

import com.imooc.sell.dataobject.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * 持久层jpa
 *
 * @author tianhuiwen
 * @date 2018/12/18 21:59
 */
public interface ProductCategoryRepository extends JpaRepository<ProductCategory, Integer> {

    /**
     * 根据类目编码获取类目
     *
     * @param categoryTypeList 类目编码
     * @return 类目
     */
    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);
}
