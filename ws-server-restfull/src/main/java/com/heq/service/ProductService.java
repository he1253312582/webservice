package com.heq.service;

import com.heq.entity.Product;

import javax.jws.WebService;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.HashMap;
import java.util.List;

@WebService
public interface ProductService {

    @GET
    @Path("/products")
    @Produces(MediaType.APPLICATION_JSON)
    List<Product> retrieveAllProducts();

    @GET
    @Path("/product/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    Product retrieveProductById(@PathParam("id") long id);

    /**
     * 参数查询
     *
     * @param name
     * @return
     */
    @GET
    @Path("/products/name")
    @Produces(MediaType.APPLICATION_JSON)
    List<Product> retrieveProductsByName_param(@QueryParam("name") String name);

    /**
     * 提交表单查询
     *
     * @param name
     * @return
     */
    @POST
    @Path("/products/form/name")
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    @Produces(MediaType.APPLICATION_JSON)
    List<Product> retrieveProductsByName_form(@FormParam("name") String name);


    @POST
    @Path("/product")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    Product createProduct(Product product);

    @PUT
    @Path("/product/{id}")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    Product updateProductById(@PathParam("id") Long id, HashMap<String, Object> fieldMap);

    @PUT
    @Path("/product")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    Product updateProduct(Product product);

    @DELETE
    @Path("/product/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    Product deleteProductById(@PathParam("id") long id);

    @DELETE
    @Path("/product")
    @Produces(MediaType.APPLICATION_JSON)
    Product deleteProductById_param(@QueryParam("id") long id);
}
