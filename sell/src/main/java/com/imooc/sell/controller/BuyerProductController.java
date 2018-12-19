package com.imooc.sell.controller;

import com.imooc.sell.pojo.dataobject.ProductCategoryDO;
import com.imooc.sell.pojo.dataobject.ProductInfoDO;
import com.imooc.sell.pojo.vo.ProductInfoVO;
import com.imooc.sell.pojo.vo.ProductVO;
import com.imooc.sell.pojo.vo.ResultVO;
import com.imooc.sell.service.CategoryService;
import com.imooc.sell.service.ProductService;
import com.imooc.sell.utils.ResultVOUtil;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 买家商品
 *
 * @author tianhuiwen
 * @date 2018/12/19 22:00
 */
@RestController
@RequestMapping("/buyer/product")
public class BuyerProductController {

    @Autowired
    private ProductService productService;

    @Autowired
    private CategoryService categoryService;

    @GetMapping("/list")
    public ResultVO list() {
        // 查询所有的上架商品
        List<ProductInfoDO> productInfoList = productService.findUpAll();

        // 查询类目(一次性查询)
        List<Integer> categoryTypeList = productInfoList.stream()
                .map(ProductInfoDO::getCategoryType)
                .collect(Collectors.toList());
        List<ProductCategoryDO> productCategoryList = categoryService.findByCategoryTypeIn(categoryTypeList);

        // 数据拼装
        List<ProductVO> productVOList = new ArrayList<>();
        for (ProductCategoryDO productCategory : productCategoryList) {
            ProductVO productVO = new ProductVO();
            productVO.setCategoryType(productCategory.getCategoryType());
            productVO.setCategoryName(productCategory.getCategoryName());

            List<ProductInfoVO> productInfoVOList = new ArrayList<>();
            for (ProductInfoDO productInfo : productInfoList) {
                if (productInfo.getCategoryType().equals(productCategory.getCategoryType())) {
                    ProductInfoVO productInfoVO = new ProductInfoVO();
                    BeanUtils.copyProperties(productInfo, productInfoVO);
                    productInfoVOList.add(productInfoVO);
                }
            }
            productVO.setProductInfoVOList(productInfoVOList);
            productVOList.add(productVO);
        }

        return ResultVOUtil.success(productVOList);
    }

}
