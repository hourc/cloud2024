package com.atguigu.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * ClassName: ${NAME}
 * Package: com.atguigu.cloud
 * Description:
 *
 * @Author Mr.Hou
 * @Create 2024/4/10 7:28
 * @Version 1.0
 */
@SpringBootApplication
@EnableDiscoveryClient
public class Main9527 {
    public static void main(String[] args) {
        SpringApplication.run(Main9527.class,args);
    }
}