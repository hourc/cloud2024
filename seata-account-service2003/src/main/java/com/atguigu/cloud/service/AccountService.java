package com.atguigu.cloud.service;

/**
 * ClassName: AccountService
 * Package: com.atguigu.cloud.service
 * Description:
 *
 * @Author Mr.Hou
 * @Create 2024/4/12 16:31
 * @Version 1.0
 */
public interface AccountService {

    /**
     * 扣减账户money
     * @param userId
     * @param money
     */
    void decrease(Long userId, Long money);
}
