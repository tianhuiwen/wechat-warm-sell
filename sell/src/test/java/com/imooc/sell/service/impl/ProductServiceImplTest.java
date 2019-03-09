package com.imooc.sell.service.impl;

import com.imooc.sell.pojo.dob.ProductInfoDO;
import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author tianhuiwen
 * @date 2018/12/19 21:58
 */
@SpringBootTest
@RunWith(SpringRunner.class)
@Slf4j
public class ProductServiceImplTest {

    @Autowired
    private ProductServiceImpl productService;

    @Test
    public void findUpAll() throws Exception {
    }

    @Test
    public void findAll() throws Exception {
        PageRequest pageRequest = new PageRequest(0, 2);
        Page<ProductInfoDO> productInfoDOS = productService.findAll(pageRequest);
        Assert.assertNotEquals(0, productInfoDOS.getTotalElements());
    }

    @Test
    public void save() throws Exception {
    }

    @Test
    public void onSale() throws Exception {
    }

    @Test
    public void offSale() throws Exception {
    }

}