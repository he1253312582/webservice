package com.heq.server;

import com.heq.webservice.serviceImpl.HelloServiceImpl;
import org.apache.cxf.interceptor.LoggingInInterceptor;
import org.apache.cxf.jaxws.JaxWsServerFactoryBean;

/**
 * Created user ： heqiang
 * created date : 2019/4/3 13:08
 * Description : No Description
 * version : 1.0
 */
public class HelloServer {
    public static void main(String[] args) {
        JaxWsServerFactoryBean factoryBean=new JaxWsServerFactoryBean();
        factoryBean.getInInterceptors().add(new LoggingInInterceptor());
        factoryBean.getOutInterceptors().add(new LoggingInInterceptor());
        factoryBean.setAddress("http://192.168.43.48:8000/ws/hello");
        factoryBean.setServiceBean(new HelloServiceImpl());
        factoryBean.create();
        System.out.println("服务发布成功！");
    }
}
