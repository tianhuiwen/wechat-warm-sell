package com.imooc.sell.dao;

import cn.hutool.core.util.IdUtil;
import com.imooc.sell.pojo.dob.OrderMasterDO;
import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

/**
 * @author tianhuiwen
 * @date 2019/4/19 11:38
 */
@SpringBootTest
@RunWith(SpringRunner.class)
@Slf4j
public class OrderMasterDaoTest {

    private final String OPENID = "123456";

    @Autowired
    private OrderMasterDao orderMasterDao;

    @Test
    public void saveTest() {
        OrderMasterDO orderMasterDO = new OrderMasterDO();
        orderMasterDO.setOrderId(IdUtil.fastSimpleUUID());
        orderMasterDO.setBuyerName("kk");
        orderMasterDO.setBuyerPhone("18623654925");
        orderMasterDO.setBuyerAddress("光电园");
        orderMasterDO.setOrderAmount(new BigDecimal(5.3));
        orderMasterDO.setBuyerOpenid(OPENID);
        OrderMasterDO masterDO = orderMasterDao.save(orderMasterDO);
        Assert.assertNotNull(masterDO);
    }

    @Test
    public void findByBuyerOpenid() throws Exception {
        PageRequest pageRequest = new PageRequest(0, 2);
        Page<OrderMasterDO> orderMasterDOS = orderMasterDao.findByBuyerOpenid(OPENID, pageRequest);
        log.info("result total:{} ; page:{}",orderMasterDOS.getTotalElements(),orderMasterDOS.getTotalPages());
    }

}