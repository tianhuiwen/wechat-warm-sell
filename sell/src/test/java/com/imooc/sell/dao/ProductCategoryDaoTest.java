package com.imooc.sell.dao;

import com.imooc.sell.pojo.dataobject.ProductCategoryDO;
import lombok.extern.slf4j.Slf4j;
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
@Slf4j
public class ProductCategoryDaoTest {

    @Autowired
    private ProductCategoryDao productCategoryDao;

    @Test
    public void findByCategoryTypeIn() throws Exception {
        List<Integer> integers = Arrays.asList(1, 2);
        List<ProductCategoryDO> categoryTypeIn = productCategoryDao.findByCategoryTypeIn(integers);
        Assert.assertNotEquals(0, categoryTypeIn.size());
    }

    @Test
    public void findOne(){
        ProductCategoryDO productCategoryDO = productCategoryDao.findOne(10);
        //log.info(productCategoryDO.toString());
        //Assert.assertNotEquals(null,productCategoryDO);
        Assert.assertNotNull(productCategoryDO);
    }

    @Test
    public void insert(){
        ProductCategoryDO productCategoryDO = new ProductCategoryDO();
        productCategoryDO.setCategoryName("男生最爱");
        productCategoryDO.setCategoryType(1);
        productCategoryDao.save(productCategoryDO);
    }

}