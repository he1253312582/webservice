package com.heq.server;

import com.heq.service.ServiceImpl;
import org.apache.cxf.interceptor.LoggingInInterceptor;
import org.apache.cxf.interceptor.LoggingOutInterceptor;
import org.apache.cxf.jaxrs.JAXRSServerFactoryBean;

/**
 * Created user ： heqiang
 * created date : 2019/4/4 9:56
 * Description : No Description
 * version : 1.0
 */
public class ServerStart {

public static void main(String[] args) {

    JAXRSServerFactoryBean factoryBean = new JAXRSServerFactoryBean();
    factoryBean.setAddress("http://127.0.0.1:8081/ws/");
    factoryBean.setServiceClass(ServiceImpl.class);
    factoryBean.create();

    factoryBean.getInInterceptors().add(new LoggingInInterceptor());
    factoryBean.getOutInterceptors().add(new LoggingOutInterceptor());

    System.out.println("服务器RestFull风格的WesService服务器启动成功！");
}

}
