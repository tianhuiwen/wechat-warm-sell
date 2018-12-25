package com.imooc.sell.pojo.dto;

import lombok.Data;

/**
 * 购物车
 *
 * @author tianhuiwen
 * @date 2018/12/25 23:03
 */
@Data
public class CartDTO {

    /**
     * 商品ID.
     */
    private String productId;

    /**
     * 数量.
     */
    private Integer productQuantity;

    public CartDTO(String productId, Integer productQuantity) {
        this.productId = productId;
        this.productQuantity = productQuantity;
    }
}
