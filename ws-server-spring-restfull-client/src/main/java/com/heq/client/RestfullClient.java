package com.heq.client;

import com.heq.entity.Car;
import com.heq.entity.User;
import org.apache.cxf.jaxrs.client.WebClient;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.ws.rs.client.ClientBuilder;
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
public class RestfullClient {

    @Test
    public void test() {
        WebClient.create("http://localhost:8001/ws/userService/addUser").post(new User());

    }


}
