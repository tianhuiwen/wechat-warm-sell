package com.imooc.sell.service;

import com.imooc.sell.pojo.dataobject.ProductCategoryDO;

import java.util.List;

/**
 * @author tianhuiwen
 * @date 2018/12/19 17:37
 */
public interface CategoryService {

    /**
     * 查询单个商品类目
     *
     * @param categoryId 类目Id
     * @return 商品类目
     */
    ProductCategoryDO findOne(Integer categoryId);

    /**
     * 查询全部类目
     *
     * @return 全部类目
     */
    List<ProductCategoryDO> findAll();

    /**
     * 根据商品类目id查询类目
     *
     * @param categoryTypeList 类目Id的List
     * @return 商品类目list
     */
    List<ProductCategoryDO> findByCategoryTypeIn(List<Integer> categoryTypeList);

    /**
     * 插入商品类目
     *
     * @param productCategory 商品类目DO
     * @return 商品类目DO
     */
    ProductCategoryDO save(ProductCategoryDO productCategory);
}
