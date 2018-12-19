package com.imooc.sell.pojo.dataobject;

import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 商品详细
 *
 * @author tianhuiwen
 * @date 2018/12/19 21:19
 */
@Entity
@Data
@DynamicUpdate
@Table(name = "product_info")
public class ProductInfoDO {

    @Id
    private String productId;

    /**
     * 名字.
     */
    private String productName;

    /**
     * 单价.
     */
    private BigDecimal productPrice;

    /**
     * 库存.
     */
    private Integer productStock;

    /**
     * 描述.
     */
    private String productDescription;

    /**
     * 小图.
     */
    private String productIcon;

    /**
     * 状态, 0正常1下架.
     */
    private Integer productStatus;

    /**
     * 类目编号.
     */
    private Integer categoryType;

    private Date createTime;

    private Date updateTime;
}
