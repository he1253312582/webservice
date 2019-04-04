package com.heq.webservice.service;


import com.heq.webservice.serviceImpl.HelloServiceImpl;
import org.apache.cxf.jaxws.JaxWsServerFactoryBean;


/**
 * Created user ： heqiang
 * created date : 2019/4/3 11:51
 * Description : No Description
 * version : 1.0
 */
public class HelloServiceTest {

    public static void main(String[] args) {
        JaxWsServerFactoryBean factoryBean=new JaxWsServerFactoryBean();
        factoryBean.setAddress("http://192.168.43.48:8000/ws/hello");
        factoryBean.setServiceBean(new HelloServiceImpl());
        factoryBean.create();
        System.out.println("服务发布成功！");
    }


}