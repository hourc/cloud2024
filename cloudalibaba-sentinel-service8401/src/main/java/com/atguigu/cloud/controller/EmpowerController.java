package com.atguigu.cloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * ClassName: EmpowerController
 * Package: com.atguigu.cloud.controller
 * Description:
 *
 * @Author Mr.Hou
 * @Create 2024/4/11 14:17
 * @Version 1.0
 */
@RestController
@Slf4j
public class EmpowerController {

    @GetMapping("/empower")
    public String requestSentinel4(){
        log.info("测试Sentinel授权规则empower");
        return "Sentinel授权规则";
    }
}
