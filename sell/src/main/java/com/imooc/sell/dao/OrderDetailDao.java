package com.imooc.sell.dao;

import com.imooc.sell.pojo.dob.OrderDetailDO;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author tianhuiwen
 * @date 2018/12/24 23:46
 */
public interface OrderDetailDao extends JpaRepository<OrderDetailDO, String> {

    /**
     * 根据订单id，查订单详情
     *
     * @param orderId 微信openId
     * @return OrderDetails
     */
    List<OrderDetailDO> findByOrderId(String orderId);
}
