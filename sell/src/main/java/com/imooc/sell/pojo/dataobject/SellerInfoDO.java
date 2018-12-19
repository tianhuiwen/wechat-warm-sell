package com.imooc.sell.pojo.dataobject;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @author tianhuiwne
 * @date 2018/12/18 21:59
 */
@Data
@Entity
public class SellerInfoDO {

    @Id
    private String sellerId;

    private String username;

    private String password;

    private String openid;
}
