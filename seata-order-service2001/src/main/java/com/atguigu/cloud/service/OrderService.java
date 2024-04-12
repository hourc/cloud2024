package com.atguigu.cloud.service;

import com.atguigu.cloud.entities.Order;

/**
 * ClassName: OrderService
 * Package: com.atguigu.cloud.service
 * Description:
 *
 * @Author Mr.Hou
 * @Create 2024/4/12 10:29
 * @Version 1.0
 */
public interface OrderService {
    /**
     * 创建订单
     * @param order
     */
    void create(Order order);
}
