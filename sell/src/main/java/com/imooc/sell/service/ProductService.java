package com.imooc.sell.service;

import com.imooc.sell.pojo.dob.ProductInfoDO;
import com.imooc.sell.pojo.dto.CartDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * 商品
 *
 * @author tianhuiwen
 * @date 2018/12/19 21:34
 */
public interface ProductService {


    /**
     * 查询所有在架商品列表
     *
     * @return
     */
    List<ProductInfoDO> findUpAll();

    Page<ProductInfoDO> findAll(Pageable pageable);

    ProductInfoDO save(ProductInfoDO productInfo);

    /**
     * 加库存
     *
     * @param
     */
    void increaseStock();

    /**
     * 减库存
     *
     * @param cartDTOList
     */
    void decreaseStock(List<CartDTO> cartDTOList);

    /**
     * 上架
     *
     * @param productId
     * @return
     */
    ProductInfoDO onSale(String productId);

    /**
     * 下架
     *
     * @param productId
     * @return
     */
    ProductInfoDO offSale(String productId);

    ProductInfoDO findOne(String productId);
}
