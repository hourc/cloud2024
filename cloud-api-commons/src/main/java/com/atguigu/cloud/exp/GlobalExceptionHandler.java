package com.atguigu.cloud.exp;

import com.atguigu.cloud.resp.ResultCodeEnum;
import com.atguigu.cloud.resp.ResultData;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * ClassName: GlobalExceptionHandler
 * Package: com.atguigu.cloud.exp
 * Description:
 *
 * @Author Mr.Hou
 * @Create 2024/4/6 8:03
 * @Version 1.0
 */

@Slf4j
// @RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(RuntimeException.class)
    public ResultData<String> exception(Exception e){
        System.out.println("######come in GlobalExceptionHandler");
        log.error("全局异常信息:{}",e.getMessage(),e);
        return ResultData.fail(ResultCodeEnum.RC500.getCode(), e.getMessage());
    }
}
