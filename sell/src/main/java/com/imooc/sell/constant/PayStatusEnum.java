package com.imooc.sell.constant;

import lombok.Getter;

/**
 * @author tianhuiwen
 * @date 2018/12/24 23:34
 */
@Getter
public enum PayStatusEnum {

    /**
     * 等待支付
     */
    WAIT(0, "等待支付"),

    /**
     * 支付成功
     */
    SUCCESS(1, "支付成功");

    private Integer code;

    private String message;

    PayStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
