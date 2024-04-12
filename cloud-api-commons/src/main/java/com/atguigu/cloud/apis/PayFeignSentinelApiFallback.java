package com.atguigu.cloud.apis;

import com.atguigu.cloud.resp.ResultCodeEnum;
import com.atguigu.cloud.resp.ResultData;
import org.springframework.stereotype.Component;

/**
 * ClassName: PayFeignSentinelApiFallback
 * Package: com.atguigu.cloud.apis
 * Description:
 *
 * @Author Mr.Hou
 * @Create 2024/4/11 16:20
 * @Version 1.0
 */
@Component
public class PayFeignSentinelApiFallback implements PayFeignSentinelApi{
    @Override
    public ResultData getPayByOrderNo(String orderNo) {
        return ResultData.fail(ResultCodeEnum.RC500.getCode(),"对方服务宕机或不可用，FallBack服务降级o(╥﹏╥)o");
    }
}
