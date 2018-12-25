package com.imooc.sell.utils;

import java.util.UUID;

/**
 * @author tianhuiwen
 * @date 2018/12/25 23:57
 */
public class KeyUtil {

    /**
     * 获取uuid
     *
     * @return uuid
     */
    public static String genUniqueKey() {
        return UUID.randomUUID().toString().replace("-", "").toLowerCase();
    }
}
