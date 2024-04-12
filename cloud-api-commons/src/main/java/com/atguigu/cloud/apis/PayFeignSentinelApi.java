package com.atguigu.cloud.apis;

import com.atguigu.cloud.resp.ResultData;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * ClassName: PayFeignSentinelApi
 * Package: com.atguigu.cloud.apis
 * Description:
 *
 * @Author Mr.Hou
 * @Create 2024/4/11 16:17
 * @Version 1.0
 */
@FeignClient(value = "nacos-payment-provider",fallback = PayFeignSentinelApiFallback.class)
public interface PayFeignSentinelApi {

    @GetMapping("/pay/nacos/get/{orderNo}")
    ResultData getPayByOrderNo(@PathVariable("orderNo") String orderNo);
}
