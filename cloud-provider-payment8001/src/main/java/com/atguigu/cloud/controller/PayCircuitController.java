package com.atguigu.cloud.controller;

import cn.hutool.core.util.IdUtil;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.TimeUnit;

/**
 * ClassName: PayCircuitController
 * Package: com.atguigu.cloud.controller
 * Description:
 *
 * @Author Mr.Hou
 * @Create 2024/4/8 21:36
 * @Version 1.0
 */
@RestController
public class PayCircuitController {

    @GetMapping("/pay/circuit/{id}")
    public String myCircuit(@PathVariable("id") Integer id){
        if(id == -4){
            throw new RuntimeException("id不能为负数~~~");
        }
        if(id == 999){
            try { TimeUnit.SECONDS.sleep(5); } catch (InterruptedException e) { e.printStackTrace(); }
        }
        return "hello,circuit id = " + id + "," + IdUtil.simpleUUID();
    }

    @GetMapping("/pay/bulkhead/{id}")
    public String myBulkHead(@PathVariable("id") Integer id){
        if(id == -4){
            throw new RuntimeException(" bulkhead...id不能为-4~~~");
        }
        if(id == 999){
            try { TimeUnit.SECONDS.sleep(5); } catch (InterruptedException e) { e.printStackTrace(); }
        }
        return "hello,bulkhead id = " + id + "," + IdUtil.simpleUUID();
    }

    @GetMapping("/pay/ratelimiter/{id}")
    public String myRateLimiter(@PathVariable("id") Integer id){
        return "hello ratelimiter id= " + id;
    }
}
