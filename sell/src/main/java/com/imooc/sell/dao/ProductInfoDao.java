package com.imooc.sell.dao;

import com.imooc.sell.pojo.dataobject.ProductInfoDO;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author tianhuiwen
 * @date 2018/12/19 21:25
 */
public interface ProductInfoDao extends JpaRepository<ProductInfoDO, String> {

    /**
     * 通过状态(上下架)查询商品
     *
     * @param productStatus 0,1(上下架)
     * @return 商品信息list
     */
    List<ProductInfoDO> findByProductStatus(Integer productStatus);
}
