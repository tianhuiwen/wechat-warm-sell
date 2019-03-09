package com.imooc.sell.pojo.dto;

import com.imooc.sell.pojo.dob.OrderDetailDO;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

/**
 * @author tianhuiwen
 * @date 2018/12/24 23:54
 */
@Data
public class OrderDTO {

    private String orderId;

    private String buyerName;

    private String buyerPhone;

    private String buyerAddress;

    private String buyerOpenid;

    private BigDecimal orderAmount;

    private Integer orderStatus;

    private Integer payStatus;

    private List<OrderDetailDO> orderDetailList;

}
