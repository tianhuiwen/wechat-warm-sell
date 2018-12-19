package com.imooc.sell.dao;

import com.imooc.sell.pojo.dataobject.ProductCategoryDO;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * 商品类目
 *
 * @author tianhuiwen
 * @date 2018/12/19 11:16
 */
public interface ProductCategoryDao extends JpaRepository<ProductCategoryDO, Integer> {

    /**
     * 查询商品类目
     *
     * @param categoryTypeList 目录编号集合
     * @return 商品类目
     */
    List<ProductCategoryDO> findByCategoryTypeIn(List<Integer> categoryTypeList);
}
