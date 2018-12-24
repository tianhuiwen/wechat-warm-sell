package com.imooc.sell.service;

import com.imooc.sell.pojo.dto.OrderDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * @author tianhuiwen
 * @date 2018/12/24 23:51
 */
public interface OrderService {

    /**
     * 创建订单
     *
     * @param orderDTO orderDTO
     * @return
     */
    OrderDTO createOrder(OrderDTO orderDTO);

    /**
     * 查询单个订单
     *
     * @param orderId orderId
     * @return
     */
    OrderDTO findOne(String orderId);

    /**
     * 查询订单列表
     *
     * @param buyerOpenid 微信openId
     * @param pageable    分页对象
     * @return
     */
    Page<OrderDTO> findAll(String buyerOpenid, Pageable pageable);

    /**
     * 查询订单列表(全部)
     *
     * @param pageable 分页对象
     * @return
     */
    Page<OrderDTO> findAll(Pageable pageable);

    /**
     * 取消订单
     *
     * @param orderDTO orderDTO
     * @return
     */
    OrderDTO cancelOrder(OrderDTO orderDTO);

    /**
     * 完结订单
     *
     * @param orderDTO orderDTO
     * @return
     */
    OrderDTO finishOrder(OrderDTO orderDTO);

    /**
     * 支付订单
     *
     * @param orderDTO orderDTO
     * @return
     */
    OrderDTO payOrder(OrderDTO orderDTO);
}
