package com.imooc.sell.exception;

import com.imooc.sell.constant.ResultEnum;

/**
 * 自定义异常类
 *
 * @author tianhuiwen
 * @date 2018/12/25 0:16
 */
public class SellException extends RuntimeException {

    private Integer code;

    public SellException(ResultEnum resultEnum) {
        super(resultEnum.getMessage());
        this.code = resultEnum.getCode();
    }

    public SellException(Integer code, String message) {
        super(message);
        this.code = code;
    }
}
