package com.heq.client;

import com.fasterxml.jackson.jaxrs.json.JacksonJsonProvider;
import org.apache.cxf.jaxrs.client.WebClient;

import javax.ws.rs.core.MediaType;
import java.util.ArrayList;
import java.util.List;

/**
 * created date : 2019/4/4 10:37
 * Description : No Description
 * version : 1.0
 */

//第三种：通用的WebClient客户端
public class RestFullClient04 {

    public static void main(String[] args) {
        String baseAddress = "http://localhost:8080/ws/rest";

        List<Object> providerList = new ArrayList<Object>();
        providerList.add(new JacksonJsonProvider());


        WebClient client = WebClient.create(baseAddress, providerList);
        List productList = client.path("/products").accept(MediaType.APPLICATION_JSON).get(List.class);
        for(Object product : productList){
            System.out.println(product);
        }
    }


}
