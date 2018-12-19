package com.imooc.sell.service.impl;

import com.imooc.sell.constant.ProductStatusEnum;
import com.imooc.sell.dao.ProductInfoDao;
import com.imooc.sell.pojo.dataobject.ProductInfoDO;
import com.imooc.sell.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author tianhuiwen
 * @date 2018/12/19 21:50
 */
@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductInfoDao productInfoDao;

    @Override
    public List<ProductInfoDO> findUpAll() {
        return productInfoDao.findByProductStatus(ProductStatusEnum.UP.getCode());
    }

    @Override
    public Page<ProductInfoDO> findAll(Pageable pageable) {
        return productInfoDao.findAll(pageable);
    }

    @Override
    public ProductInfoDO save(ProductInfoDO productInfo) {
        return null;
    }

    @Override
    public void increaseStock() {

    }

    @Override
    public void decreaseStock() {

    }

    @Override
    public ProductInfoDO onSale(String productId) {
        return null;
    }

    @Override
    public ProductInfoDO offSale(String productId) {
        return null;
    }
}
