package com.imooc.sell.dao;

import com.imooc.sell.pojo.dataobject.ProductCategoryDO;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.List;

/**
 * @author tianhuiwen
 * @date 2018/12/19 11:26
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class ProductCategoryDaoTest {

    @Autowired
    private ProductCategoryDao productCategoryDao;

    @Test
    public void findByCategoryTypeIn() throws Exception {
        List<Integer> integers = Arrays.asList(1, 2);
        List<ProductCategoryDO> categoryTypeIn = productCategoryDao.findByCategoryTypeIn(integers);
        Assert.assertNotEquals(0, categoryTypeIn.size());
    }

}