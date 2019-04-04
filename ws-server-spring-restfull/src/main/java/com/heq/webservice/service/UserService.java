package com.heq.webservice.service;

import com.heq.entity.User;

import javax.ws.rs.*;

/**
 * Created user ： heqiang
 * created date : 2019/4/4 9:19
 * Description : No Description
 * version : 1.0
 */


/**
 * @Path：请求路径
 * @Produces ：服务器支持的返回数据的结构类型
 * @Consumes ：服务器支持的请求数据的结构类型
 */
@Path("/userService")
@Produces("*/*")
public interface UserService {


    /**
     * Post请求来添加用户
     */
    @POST
    @Path("/addUser")
    @Consumes({"application/xml", "application/json"})
    public abstract void addUser(User user);

    /**
     * PUT请求来更新用户
     */
    @PUT
    @Path("/updateUser")
    @Consumes({"application/xml", "application/json"})
    public abstract void updateUser(User user);


    /**
     * GET请求来查询用户
     */
    @GET
    @Path("/queryUser")
    @Produces({"application/xml", "application/json"})
    public abstract User queryUser();

    /**
     * DELETE请求来删除用户
     */
    @DELETE
    @Path("/deleteUser")
    @Produces({"application/xml", "application/json"})
    public abstract void deleteUser(@PathParam(value = "id")Integer id);
}
