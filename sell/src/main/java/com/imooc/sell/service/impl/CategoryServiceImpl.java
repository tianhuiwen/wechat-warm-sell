package com.imooc.sell.service.impl;

import com.imooc.sell.dao.ProductCategoryDao;
import com.imooc.sell.pojo.dataobject.ProductCategoryDO;
import com.imooc.sell.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author tianhuiwen
 * @date 2018/12/19 18:04
 */
@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private ProductCategoryDao productCategoryDao;

    @Override
    public ProductCategoryDO findOne(Integer categoryId) {
        return productCategoryDao.findOne(categoryId);
    }

    @Override
    public List<ProductCategoryDO> findAll() {
        return productCategoryDao.findAll();
    }

    @Override
    public List<ProductCategoryDO> findByCategoryTypeIn(List<Integer> categoryTypeList) {
        return productCategoryDao.findByCategoryTypeIn(categoryTypeList);
    }

    @Override
    public ProductCategoryDO save(ProductCategoryDO productCategory) {
        return productCategoryDao.save(productCategory);
    }
}
