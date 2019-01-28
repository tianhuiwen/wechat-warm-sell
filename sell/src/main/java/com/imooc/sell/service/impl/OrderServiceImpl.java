package com.imooc.sell.service.impl;

import cn.hutool.core.util.IdUtil;
import com.imooc.sell.constant.OrderStatusEnum;
import com.imooc.sell.constant.PayStatusEnum;
import com.imooc.sell.constant.ResultEnum;
import com.imooc.sell.dao.OrderDetailDao;
import com.imooc.sell.dao.OrderMasterDao;
import com.imooc.sell.exception.SellException;
import com.imooc.sell.pojo.dataobject.OrderDetailDO;
import com.imooc.sell.pojo.dataobject.OrderMasterDO;
import com.imooc.sell.pojo.dataobject.ProductInfoDO;
import com.imooc.sell.pojo.dto.CartDTO;
import com.imooc.sell.pojo.dto.OrderDTO;
import com.imooc.sell.service.OrderService;
import com.imooc.sell.service.ProductService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author tianhuiwen
 * @date 2018/12/25 0:02
 */
@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private ProductService productService;

    @Autowired
    private OrderMasterDao orderMasterDao;

    @Autowired
    private OrderDetailDao orderDetailDao;

    @Override
    public OrderDTO createOrder(OrderDTO orderDTO) {
        String orderId = IdUtil.simpleUUID();
        BigDecimal orderAmount = new BigDecimal(BigInteger.ZERO);

        //查询商品信息
        for (OrderDetailDO orderDetail : orderDTO.getOrderDetailList()) {
            ProductInfoDO productInfo = productService.findOne(orderDetail.getProductId());
            if (productInfo == null) {
                throw new SellException(ResultEnum.PRODUCT_NOT_EXIST);
            }
            //计算订单总价
            orderAmount = productInfo.getProductPrice().multiply(new BigDecimal(orderDetail.getProductQuantity()))
                    .add(orderAmount);
            //订单详情入库
            orderDetail.setDetailId(IdUtil.simpleUUID());
            orderDetail.setOrderId(orderId);
            BeanUtils.copyProperties(productInfo, orderDetail);
            orderDetailDao.save(orderDetail);
        }

        //写入订单数据库
        OrderMasterDO orderMasterDO = new OrderMasterDO();
        orderDTO.setOrderId(orderId);
        BeanUtils.copyProperties(orderDTO, orderMasterDO);
        orderMasterDO.setOrderAmount(orderAmount);
        orderMasterDO.setOrderStatus(OrderStatusEnum.NEW.getCode());
        orderMasterDO.setPayStatus(PayStatusEnum.WAIT.getCode());
        orderMasterDao.save(orderMasterDO);

        //扣库存
        List<CartDTO> cartDTOList = orderDTO.getOrderDetailList().stream()
                .map(e -> new CartDTO(e.getProductId(), e.getProductQuantity())).collect(Collectors.toList());
        productService.decreaseStock(cartDTOList);

        return orderDTO;
    }

    @Override
    public OrderDTO findOne(String orderId) {
        return null;
    }

    @Override
    public Page<OrderDTO> findAll(String buyerOpenid, Pageable pageable) {
        return null;
    }

    @Override
    public Page<OrderDTO> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public OrderDTO cancelOrder(OrderDTO orderDTO) {
        return null;
    }

    @Override
    public OrderDTO finishOrder(OrderDTO orderDTO) {
        return null;
    }

    @Override
    public OrderDTO payOrder(OrderDTO orderDTO) {
        return null;
    }
}
