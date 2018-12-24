package com.imooc.sell.pojo.dto;

import java.math.BigDecimal;

/**
 * @author tianhuiwen
 * @date 2018/12/24 23:54
 */
public class OrderDTO {

    private String orderId;

    private String buyerName;

    private String buyerPhone;

    private String buyerAddress;

    private String buyerOpenid;

    private BigDecimal orderAmount;

    private Integer orderStatus;

    private Integer payStatus;

}
