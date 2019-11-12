package com.heq.webservice.server;

import com.heq.webservice.serviceImpl.UserServiceImpl;
import org.apache.cxf.jaxrs.JAXRSServerFactoryBean;

public class ServerStart {

    public static void main(String[] args) {
        JAXRSServerFactoryBean factoryBean = new JAXRSServerFactoryBean();
        factoryBean.setResourceClasses(UserServiceImpl.class);
        factoryBean.setServiceBean(new UserServiceImpl());
        factoryBean.setAddress("http://localhost:8001/ws/");
        factoryBean.create();
        System.out.println("接口发布成功!");
    }

}
