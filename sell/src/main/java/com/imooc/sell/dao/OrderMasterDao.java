package com.imooc.sell.dao;

import com.imooc.sell.pojo.dataobject.OrderMasterDO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author tianhuiwen
 * @date 2018/12/24 23:43
 */
public interface OrderMasterDao extends JpaRepository<OrderMasterDO, String> {

    /**
     * 通过微信openId查询买家
     *
     * @param buyerOpenid 微信openId
     * @param pageable    分页对象
     * @return
     */
    Page<OrderMasterDO> findByBuyerOpenid(String buyerOpenid, Pageable pageable);
}
