package com.heq.client;

import com.fasterxml.jackson.jaxrs.json.JacksonJsonProvider;
import com.heq.service.Car;
import com.heq.service.User;
import org.apache.cxf.jaxrs.client.WebClient;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.MediaType;
import java.util.ArrayList;
import java.util.List;

/**
 * Created user ： heqiang
 * created date : 2019/4/4 10:37
 * Description : No Description
 * version : 1.0
 */
@SuppressWarnings("all")
public class RestfullClient01 {
    Logger log = LoggerFactory.getLogger(this.getClass());
    private String baseAddress = "http://localhost:8080/ws/webService";
    private JacksonJsonProvider jsonProvider = new JacksonJsonProvider();


    /**
     * 添加用户
     * type()：请求的数据格式
     * accept():响应的数据格式
     */


    @Test
    public void post_addUser() {
        List<Car> cars = new ArrayList<Car>();
        cars.add(new Car(101, "速腾", 100.24));
        cars.add(new Car(101, "别克", 500.69));
        User user = new User(1001, "阿强", "南京", cars);

        ClientBuilder.newClient()
                .register(jsonProvider)
                .target(baseAddress)
                .path("/addUser?wsdl")
                .request(MediaType.APPLICATION_XML)
                .post(Entity.entity(user, MediaType.APPLICATION_XML), new GenericType<User>(){});
    }

    /**
     * 查询用户
     * type()：请求的数据格式
     * accept():响应的数据格式
     */
    @Test
    public void get_queryUse() {
        WebClient client = WebClient.create("http://localhost:8080/ws/webService/userService/queryUser");
        User user = client.accept(MediaType.APPLICATION_XML_TYPE).type(MediaType.APPLICATION_XML_TYPE).get(User.class);
        log.info(user.toString());



    }


    /**
     * 查询用户
     * type()：请求的数据格式
     * accept():响应的数据格式
     */
    @Test
    public void put_updateUser() {
        List<Car> cars = new ArrayList<Car>();
        cars.add(new Car(101, "速腾", 100.24));
        cars.add(new Car(101, "别克", 500.69));
        User user = new User(1001, "阿强", "南京", cars);

        WebClient client = WebClient.create("http://localhost:8080/ws/webService/userService/updateUser");
        client.accept(MediaType.APPLICATION_XML_TYPE)
                .type(MediaType.APPLICATION_XML_TYPE)
                .put(user);
    }


    /**
     * 查询用户
     * type()：请求的数据格式
     * accept():响应的数据格式
     */
    @Test
    public void delete_deleteUser() {

        WebClient client = WebClient.create("http://localhost:8080/ws/webService/userService/deleteUser?id=10001");
        client.delete();
    }
}
