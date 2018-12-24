package com.imooc.sell.constant;

import lombok.Getter;

/**
 * @author tianhuiwen
 * @date 2018/12/25 0:17
 */
@Getter
public enum ResultEnum {

    /**
     * 商品不存在
     */
    PRODUCT_NOT_EXIST(10, "商品不存在");

    private Integer code;

    private String message;

    ResultEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
