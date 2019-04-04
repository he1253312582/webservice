package com.heq.client;

import com.heq.entity.Car;
import com.heq.entity.User;
import org.apache.cxf.jaxrs.client.WebClient;
import org.junit.Test;

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
public class RestfullClient {


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
        WebClient client = WebClient.create("http://localhost:8080/ws/webService/userService/addUser");
        //POST方式请求xml格式的数据，响应xml格式的数据
        client.type(MediaType.APPLICATION_XML_TYPE)
                .accept(MediaType.APPLICATION_XML_TYPE)
                .post(user);
    }

    /**
     * 查询用户
     * type()：请求的数据格式
     * accept():响应的数据格式
     */
    @Test
    public void get_queryUse() {
        WebClient client = WebClient.create("http://localhost:8080/ws/webService/userService/queryUser");
        User user = client.accept(MediaType.APPLICATION_XML_TYPE)
                .type(MediaType.APPLICATION_XML_TYPE).get(User.class);
        System.out.println(user);
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
