package com.heq.client;

import com.fasterxml.jackson.jaxrs.json.JacksonJsonProvider;

import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import java.util.List;

/**
 * created date : 2019/4/4 10:37
 * Description : No Description
 * version : 1.0
 */

public class RestFullClient02 {

    // 第二种：JAX-RS 2.0 时代的客户端
    public static void main(String[] args) {

        String baseAddress = "http://localhost:8080/ws/rest";
        WebTarget target = ClientBuilder.newClient().register(new JacksonJsonProvider()).target(baseAddress);
        List<Object> productList = target.path("/products").request(MediaType.APPLICATION_JSON).get(List.class);
        for (Object product : productList) {
            System.out.println(product);
        }
    }


}
