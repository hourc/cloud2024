package com.atguigu.cloud.controller;

import com.atguigu.cloud.apis.PayFeignApi;
import io.github.resilience4j.bulkhead.annotation.Bulkhead;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import io.github.resilience4j.ratelimiter.annotation.RateLimiter;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;

/**
 * ClassName: OrderCircuitController
 * Package: com.atguigu.cloud.controller
 * Description:
 *
 * @Author Mr.Hou
 * @Create 2024/4/8 21:43
 * @Version 1.0
 */
@RestController
public class OrderCircuitController {

    @Resource
    private PayFeignApi payFeignApi;

    @GetMapping("/feign/pay/circuit/{id}")
    @CircuitBreaker(name = "cloud-payment-service",fallbackMethod = "myFallbackMethod")
    public String myCircuitBreaker(@PathVariable("id") Integer id){
        return payFeignApi.myCircuit(id);
    }

    public String myFallbackMethod(Integer id,Throwable t){
        return "系统繁忙,请稍后重试" + id;
    }

    // @GetMapping("/feign/pay/bulkhead/{id}")
    // @Bulkhead(name = "cloud-payment-service",fallbackMethod = "myFallbackBulkhead",type = Bulkhead.Type.SEMAPHORE)
    // public String myBulkHead(@PathVariable("id") Integer id){
    //     return payFeignApi.myBulkHead(id);
    // }
    //
    // public String myFallbackBulkhead(Integer id,Throwable t){
    //     return "系统限流,请稍后重试,id:" + id;
    // }

    @GetMapping("/feign/pay/bulkhead/{id}")
    @Bulkhead(name = "cloud-payment-service",fallbackMethod = "myFallbackBulkheadThreadPool",type = Bulkhead.Type.THREADPOOL)
    public CompletableFuture<String> myBulkheadThreadPool(@PathVariable("id") Integer id){
        System.out.println(Thread.currentThread().getName() + "进入方法");
        try { TimeUnit.SECONDS.sleep(3); } catch (InterruptedException e) { e.printStackTrace(); }
        System.out.println(Thread.currentThread().getName() + "离开方法");
        return CompletableFuture.supplyAsync(() ->{
            return payFeignApi.myBulkHead(id) + "\t" + Bulkhead.Type.THREADPOOL;
        });
    }

    public CompletableFuture<String> myFallbackBulkheadThreadPool(Integer id,Throwable t){
        return CompletableFuture.supplyAsync(() -> "Bulkhead.Type.THREADPOOL，系统繁忙，请稍后再试-----/(ㄒoㄒ)/~~");
    }

    @GetMapping("/feign/pay/ratelimiter/{id}")
    @RateLimiter(name = "cloud-payment-service",fallbackMethod = "myFallBackRatelimiter")
    public String myRatelimiter(@PathVariable("id") Integer id){
        return payFeignApi.myRateLimiter(id);
    }

    public String myFallBackRatelimiter(Integer id,Throwable t){
        return "系统限流,您被先溜了..............." + id;
    }

}
