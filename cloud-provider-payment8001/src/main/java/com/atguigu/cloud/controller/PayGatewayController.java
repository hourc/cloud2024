package com.atguigu.cloud.controller;

import cn.hutool.core.util.IdUtil;
import com.atguigu.cloud.entities.Pay;
import com.atguigu.cloud.resp.ResultData;
import com.atguigu.cloud.service.PayService;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * ClassName: PayGatewayController
 * Package: com.atguigu.cloud.controller
 * Description:
 *
 * @Author Mr.Hou
 * @Create 2024/4/10 7:34
 * @Version 1.0
 */

@RestController
public class PayGatewayController {
    @Resource
    private PayService payService;

    @GetMapping("/pay/gateway/get/{id}")
    public ResultData getById(@PathVariable("id") Integer id){
        Pay pay = payService.getById(id);
        return ResultData.success(pay);
    }

    @GetMapping("/pay/gateway/info")
    public ResultData getGatewayInfo(){
        return ResultData.success("gateway info test " + IdUtil.simpleUUID());
    }
}
