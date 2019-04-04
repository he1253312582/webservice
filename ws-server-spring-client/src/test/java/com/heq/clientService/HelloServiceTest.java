package com.heq.clientService;

import com.heq.client.HelloService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;


/**
 * Created user ： heqiang
 * created date : 2019/4/3 16:58
 * Description : No Description
 * version : 1.0
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-mvc.xml")
public class HelloServiceTest {


    @Resource
    private HelloService helloService;

    @Test
    public void test(){

       String msg = helloService.SayHello("张三");
        System.out.println(msg);
    }

}