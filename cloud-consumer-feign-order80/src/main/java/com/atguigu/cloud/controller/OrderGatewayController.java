package com.atguigu.cloud.controller;

import com.atguigu.cloud.apis.PayFeignApi;
import com.atguigu.cloud.resp.ResultData;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * ClassName: OrderGatewayController
 * Package: com.atguigu.cloud.controller
 * Description:
 *
 * @Author Mr.Hou
 * @Create 2024/4/10 8:47
 * @Version 1.0
 */
@RestController
public class OrderGatewayController {
    @Resource
    private PayFeignApi payFeignApi;

    @GetMapping("/feign/pay/gateway/get/{id}")
    public ResultData myGatewayGetById(@PathVariable("id") Integer id){
        return payFeignApi.getById(id);
    }

    @GetMapping("/feign/pay/gateway/info")
    public ResultData myGatewayGetInfo(){
        return payFeignApi.getGatewayInfo();
    }
}
