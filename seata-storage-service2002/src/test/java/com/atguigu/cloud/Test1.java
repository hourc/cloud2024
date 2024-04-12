package com.atguigu.cloud;

import com.atguigu.cloud.mapper.StorageMapper;
import jakarta.annotation.Resource;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * ClassName: Test1
 * Package: com.atguigu.cloud
 * Description:
 *
 * @Author Mr.Hou
 * @Create 2024/4/12 13:57
 * @Version 1.0
 */
@SpringBootTest
public class Test1 {
    
    @Resource
    private StorageMapper storageMapper;
    
    @Test
    public void test1(){
        storageMapper.decrease(1L,20);
    }
}
