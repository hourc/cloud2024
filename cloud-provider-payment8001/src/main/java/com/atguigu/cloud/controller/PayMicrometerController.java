package com.atguigu.cloud.controller;

import cn.hutool.core.util.IdUtil;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * ClassName: PayMicrometerController
 * Package: com.atguigu.cloud.controller
 * Description:
 *
 * @Author Mr.Hou
 * @Create 2024/4/9 21:50
 * @Version 1.0
 */
@RestController
public class PayMicrometerController {


    /**
     * micrometer(sleuth)进行链路监控的例子
     * @param id
     * @return
     */
    @GetMapping("/pay/micrometer/{id}")
    public String myMicrometer(@PathVariable("id") Integer id){
        return "hello ,欢迎来到micrometer inpuitId:" + id + "\t" + IdUtil.simpleUUID();
    }
}
