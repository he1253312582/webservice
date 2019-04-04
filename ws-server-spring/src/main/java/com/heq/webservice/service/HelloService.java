package com.heq.webservice.service;

import javax.jws.WebService;

/**
 * Created user ： heqiang
 * created date : 2019/4/3 11:41
 * Description : 对外发布的接口
 * version : 1.0
 */

@WebService(targetNamespace = "http://com.heq.webservice.service")
public interface HelloService {


    /**
     * 对外发布的接口方法
     * @return
     */
    public abstract String SayHello(String msg);


}
