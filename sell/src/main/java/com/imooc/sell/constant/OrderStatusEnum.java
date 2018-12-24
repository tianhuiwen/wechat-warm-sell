package com.imooc.sell.constant;

import lombok.Getter;

/**
 * @author tianhuiwen
 * @date 2018/12/24 23:31
 */
@Getter
public enum OrderStatusEnum {

    /**
     * 新订单
     */
    NEW(0, "新订单"),
    /**
     * 完结订单
     */
    FINISH(1, "完结订单"),
    /**
     * 已取消订单
     */
    CANCEL(2, "已取消订单");
    private Integer code;

    private String message;

    OrderStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
