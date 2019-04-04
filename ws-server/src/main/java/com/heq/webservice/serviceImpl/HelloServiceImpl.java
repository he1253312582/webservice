package com.heq.webservice.serviceImpl;

import com.heq.webservice.service.HelloService;

/**
 * Created user ： heqiang
 * created date : 2019/4/3 11:48
 * Description : No Description
 * version : 1.0
 */
public class HelloServiceImpl implements HelloService {


    @Override
    public String SayHello(String msg) {
        System.out.println(msg);
        return msg+"：Hello！！";
    }
}
