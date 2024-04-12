package com.atguigu.cloud.service.impl;

import com.atguigu.cloud.mapper.AccountMapper;
import com.atguigu.cloud.service.AccountService;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

/**
 * ClassName: AccountServiceImpl
 * Package: com.atguigu.cloud.service.impl
 * Description:
 *
 * @Author Mr.Hou
 * @Create 2024/4/12 16:32
 * @Version 1.0
 */
@Service
@Slf4j
public class AccountServiceImpl implements AccountService {
    @Resource
    private AccountMapper accountMapper;
    @Override
    public void decrease(Long userId, Long money) {
        log.info("------->account-service中扣减账户余额开始");
        accountMapper.decrease(userId,money);
        //模拟超时异常，全局事务回滚
        myTimeOut();
        // int age = 10/0;
        log.info("------->account-service中扣减账户余额结束");
    }

    private void myTimeOut(){
        try { TimeUnit.SECONDS.sleep(65); } catch (InterruptedException e) { e.printStackTrace(); }
    }
}
