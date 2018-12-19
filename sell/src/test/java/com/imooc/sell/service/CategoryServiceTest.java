package com.imooc.sell.service;

import com.imooc.sell.pojo.dataobject.ProductCategoryDO;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author tianhuiwen
 * @date 2018/12/19 18:07
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class CategoryServiceTest {

    @Autowired
    private CategoryService categoryService;

    @Test
    public void findOne() throws Exception {
        ProductCategoryDO productCategoryDO = categoryService.findOne(1);
        Assert.assertNotNull(productCategoryDO);
    }

    @Test
    public void findAll() throws Exception {
    }

    @Test
    public void findByCategoryTypeIn() throws Exception {
    }

    @Test
    public void save() throws Exception {
    }

}