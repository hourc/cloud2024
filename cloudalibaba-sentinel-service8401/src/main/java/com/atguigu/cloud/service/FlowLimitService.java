package com.atguigu.cloud.service;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import org.springframework.stereotype.Service;

/**
 * ClassName: FlowLimitService
 * Package: com.atguigu.cloud.service
 * Description:
 *
 * @Author Mr.Hou
 * @Create 2024/4/11 8:46
 * @Version 1.0
 */
@Service
public class FlowLimitService {

    @SentinelResource("common")
    public void common(){
        System.out.println("------FLowLimitService come in");
    }
}
