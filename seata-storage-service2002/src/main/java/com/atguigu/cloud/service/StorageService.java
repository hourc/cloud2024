package com.atguigu.cloud.service;

/**
 * ClassName: StorageService
 * Package: com.atguigu.cloud.service
 * Description:
 *
 * @Author Mr.Hou
 * @Create 2024/4/12 13:42
 * @Version 1.0
 */
public interface StorageService {

    /**
     * 扣减库存
     * @param productId
     * @param count
     */
    void decrease(Long productId,Integer count);
}
