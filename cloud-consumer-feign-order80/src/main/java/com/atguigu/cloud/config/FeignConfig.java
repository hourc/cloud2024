package com.atguigu.cloud.config;

import feign.Logger;
import feign.Retryer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * ClassName: FeignConfig
 * Package: com.atguigu.cloud.config
 * Description:
 *
 * @Author Mr.Hou
 * @Create 2024/4/7 9:28
 * @Version 1.0
 */
@Configuration
public class FeignConfig {

    @Bean
    public Retryer myRetryer(){
        //最大请求次数为3次,初始间隔时间为100ms,最大间隔时间1s
        // return new Retryer.Default(100,1,3);
        return Retryer.NEVER_RETRY;
    }

    @Bean
    public Logger.Level feignLoggerLevel(){
        return Logger.Level.FULL;
    }
}
