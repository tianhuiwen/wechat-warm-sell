package com.imooc.sell.dao;

import com.imooc.sell.pojo.dataobject.ProductInfoDO;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * @author tianhuiwen
 * @date 2018/12/19 21:29
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class ProductInfoDaoTest {

    @Autowired
    private ProductInfoDao productInfoDao;

    @Test
    public void findByProductStatus() throws Exception {
        List<ProductInfoDO> productInfoList = productInfoDao.findByProductStatus(0);
        Assert.assertNotEquals(0, productInfoList.size());
    }

}