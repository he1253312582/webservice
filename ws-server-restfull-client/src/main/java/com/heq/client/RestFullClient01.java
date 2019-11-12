package com.heq.client;

import com.fasterxml.jackson.jaxrs.json.JacksonJsonProvider;
import com.heq.entity.Product;
import com.heq.service.ProductService;
import org.apache.cxf.jaxrs.client.JAXRSClientFactory;
import org.apache.cxf.jaxrs.client.WebClient;
import org.junit.Test;

import javax.ws.rs.core.MediaType;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * created date : 2019/4/4 10:37
 * Description : No Description
 * version : 1.0
 */

public class RestFullClient01 {


    // 第一种：JAX-RS 1.0 时代的客户端
    public static void main(String[] args) {
        String baseAddress = "http://localhost:8080/ws/rest";
        List<Object> providerList = new ArrayList<Object>();
        providerList.add(new JacksonJsonProvider());
        ProductService productService = JAXRSClientFactory.create(baseAddress, ProductService.class, providerList);

        List<Product> productList = productService.retrieveAllProducts();
        for (Product product : productList) {
            System.out.println(product);
        }
    }



}
