package com.imooc.sell.pojo.dataobject;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;

/**
 * @author tianhuiwne
 * @date 2018/12/18 21:59
 */
@Entity
@Data
public class OrderDetailDO {

    @Id
    private String detailId;

    /**
     * 订单id.
     */
    private String orderId;

    /**
     * 商品id.
     */
    private String productId;

    /**
     * 商品名称.
     */
    private String productName;

    /**
     * 商品单价.
     */
    private BigDecimal productPrice;

    /**
     * 商品数量.
     */
    private Integer productQuantity;

    /**
     * 商品小图.
     */
    private String productIcon;
}
