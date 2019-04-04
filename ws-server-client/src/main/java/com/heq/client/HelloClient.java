package com.heq.client;

import com.heq.webservice.service.HelloService;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import org.junit.Test;

/**
 * Created user ： heqiang
 * created date : 2019/4/3 12:09
 * Description : No Description
 * version : 1.0
 */
public class HelloClient {


    @Test
    public void test(){

        JaxWsProxyFactoryBean factoryBean = new JaxWsProxyFactoryBean();

        factoryBean.setAddress("http://192.168.43.48:8000/ws/hello");

        //设置接口类型
        factoryBean.setServiceClass(HelloService.class);

        //对接口生成代理对象
        HelloService helloService =factoryBean.create(HelloService.class);
        System.out.println(helloService.SayHello("张三"));

        System.out.println(helloService.getClass());
    }

}
