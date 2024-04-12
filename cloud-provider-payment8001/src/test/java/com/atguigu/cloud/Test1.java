package com.atguigu.cloud;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * ClassName: Test1
 * Package: com.atguigu.cloud
 * Description:
 *
 * @Author Mr.Hou
 * @Create 2024/4/9 12:26
 * @Version 1.0
 */

@SpringBootTest
public class Test1 {

    @Test
    public void test1(){
        int i = 1;
        i = i++;
        int j = i++;
        int k = i + ++i * i++;

        System.out.println(i);//4
        System.out.println(j);//1
        System.out.println(k);//11
    }
}
