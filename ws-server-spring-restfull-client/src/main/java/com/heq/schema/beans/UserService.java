
package com.heq.schema.beans;

import com.heq.service.ObjectFactory;
import com.heq.service.User;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "UserService", targetNamespace = "http://service.webservice.heq.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface UserService {


    /**
     * 
     * @param arg0
     */
    @WebMethod
    @RequestWrapper(localName = "addUser", targetNamespace = "http://service.webservice.heq.com/", className = "com.heq.webservice.service.AddUser")
    @ResponseWrapper(localName = "addUserResponse", targetNamespace = "http://service.webservice.heq.com/", className = "com.heq.webservice.service.AddUserResponse")
    public void addUser(
            @WebParam(name = "arg0", targetNamespace = "")
                    User arg0);

    /**
     * 
     * @return
     *     returns com.heq.webservice.service.User
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "queryUser", targetNamespace = "http://service.webservice.heq.com/", className = "com.heq.webservice.service.QueryUser")
    @ResponseWrapper(localName = "queryUserResponse", targetNamespace = "http://service.webservice.heq.com/", className = "com.heq.webservice.service.QueryUserResponse")
    public User queryUser();

    /**
     * 
     * @param arg0
     */
    @WebMethod
    @RequestWrapper(localName = "updateUser", targetNamespace = "http://service.webservice.heq.com/", className = "com.heq.webservice.service.UpdateUser")
    @ResponseWrapper(localName = "updateUserResponse", targetNamespace = "http://service.webservice.heq.com/", className = "com.heq.webservice.service.UpdateUserResponse")
    public void updateUser(
            @WebParam(name = "arg0", targetNamespace = "")
                    User arg0);

    /**
     * 
     * @param arg0
     */
    @WebMethod
    @RequestWrapper(localName = "deleteUser", targetNamespace = "http://service.webservice.heq.com/", className = "com.heq.webservice.service.DeleteUser")
    @ResponseWrapper(localName = "deleteUserResponse", targetNamespace = "http://service.webservice.heq.com/", className = "com.heq.webservice.service.DeleteUserResponse")
    public void deleteUser(
            @WebParam(name = "arg0", targetNamespace = "")
                    Integer arg0);

}
