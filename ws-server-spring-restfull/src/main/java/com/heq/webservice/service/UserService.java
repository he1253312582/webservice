package com.heq.webservice.service;

import com.heq.entity.User;

import javax.jws.WebService;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.xml.ws.BindingType;
import javax.xml.ws.soap.SOAPBinding;

/**
 * @Path：请求路径
 * @Produces ：服务器支持的返回数据的结构类型
 * @Consumes ：服务器支持的请求数据的结构类型
 */
@WebService
@BindingType(value = SOAPBinding.SOAP12HTTP_BINDING)
//@Path("/userService")
public interface UserService {

    /**
     * Post请求来添加用户
     */
    @POST
    @Path("/addUser")
    @Produces(MediaType.APPLICATION_XML)
    public void addUser(User user);

    /**
     * PUT请求来更新用户
     */
    @PUT
    @Path("/updateUser")
    @Produces(MediaType.APPLICATION_XML)
    public void updateUser(User user);

    /**
     * GET请求来查询用户
     */
    @GET
    @Path("/queryUser")
    @Produces(MediaType.APPLICATION_XML)
    public User queryUser();

    /**
     * DELETE请求来删除用户
     */
    @DELETE
    @Path("/delete/{id}")
    @Produces(MediaType.APPLICATION_XML)
    public void deleteUser(@PathParam("id") Integer id);
}

