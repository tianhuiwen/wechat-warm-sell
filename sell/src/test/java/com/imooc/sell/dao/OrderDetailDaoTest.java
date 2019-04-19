package com.imooc.sell.dao;

import cn.hutool.core.util.IdUtil;
import com.imooc.sell.pojo.dob.OrderDetailDO;
import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.List;

/**
 * @author tianhuiwen
 * @date 2019/4/19 14:20
 */
@SpringBootTest
@RunWith(SpringRunner.class)
@Slf4j
public class OrderDetailDaoTest {

    @Autowired
    private OrderDetailDao orderDetailDao;

    @Test
    public void saveTest() {
        OrderDetailDO orderDetailDO = new OrderDetailDO();
        orderDetailDO.setDetailId(IdUtil.fastSimpleUUID());
        orderDetailDO.setOrderId("123123");
        orderDetailDO.setProductIcon("http://xxx.jpg");
        orderDetailDO.setProductId("122112");
        orderDetailDO.setProductName("燕窝");
        orderDetailDO.setProductPrice(new BigDecimal(2.46));
        orderDetailDO.setProductQuantity(3);
        OrderDetailDO save = orderDetailDao.save(orderDetailDO);
        Assert.assertNotNull(save);
    }

    @Test
    public void findByOrderId() throws Exception {
        List<OrderDetailDO> result = orderDetailDao.findByOrderId("123123");
        Assert.assertNotEquals("0", result.size());
    }

}