package com.heq.client;

import com.heq.service.HelloService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-mvc.xml")
public class HelloClient {


    @Resource
    private HelloService helloService;

    @Test
    public void test(){

        String msg = helloService.SayHello("张三");
        System.out.println(msg);
    }

}
