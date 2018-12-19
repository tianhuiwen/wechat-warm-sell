package com.imooc.sell.constant;

import lombok.Getter;

/**
 * 商品状态
 *
 * @author tianhuiwen
 * @date 2018/12/19 21:43
 */
@Getter
public enum ProductStatusEnum {

    /**
     * 商品在架
     */
    UP(0, "在架"),

    /**
     * 商品下架
     */
    DOWN(1, "下架");

    private Integer code;

    private String message;

    ProductStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
