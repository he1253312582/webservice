
package com.heq.service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.heq.webservice.service package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _AddUser_QNAME = new QName("http://service.webservice.heq.com/", "addUser");
    private final static QName _Car_QNAME = new QName("http://service.webservice.heq.com/", "Car");
    private final static QName _User_QNAME = new QName("http://service.webservice.heq.com/", "User");
    private final static QName _QueryUserResponse_QNAME = new QName("http://service.webservice.heq.com/", "queryUserResponse");
    private final static QName _DeleteUserResponse_QNAME = new QName("http://service.webservice.heq.com/", "deleteUserResponse");
    private final static QName _QueryUser_QNAME = new QName("http://service.webservice.heq.com/", "queryUser");
    private final static QName _AddUserResponse_QNAME = new QName("http://service.webservice.heq.com/", "addUserResponse");
    private final static QName _UpdateUserResponse_QNAME = new QName("http://service.webservice.heq.com/", "updateUserResponse");
    private final static QName _UpdateUser_QNAME = new QName("http://service.webservice.heq.com/", "updateUser");
    private final static QName _DeleteUser_QNAME = new QName("http://service.webservice.heq.com/", "deleteUser");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.heq.webservice.service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link QueryUserResponse }
     * 
     */
    public QueryUserResponse createQueryUserResponse() {
        return new QueryUserResponse();
    }

    /**
     * Create an instance of {@link User }
     * 
     */
    public User createUser() {
        return new User();
    }

    /**
     * Create an instance of {@link Car }
     * 
     */
    public Car createCar() {
        return new Car();
    }

    /**
     * Create an instance of {@link AddUser }
     * 
     */
    public AddUser createAddUser() {
        return new AddUser();
    }

    /**
     * Create an instance of {@link DeleteUser }
     * 
     */
    public DeleteUser createDeleteUser() {
        return new DeleteUser();
    }

    /**
     * Create an instance of {@link UpdateUser }
     * 
     */
    public UpdateUser createUpdateUser() {
        return new UpdateUser();
    }

    /**
     * Create an instance of {@link AddUserResponse }
     * 
     */
    public AddUserResponse createAddUserResponse() {
        return new AddUserResponse();
    }

    /**
     * Create an instance of {@link UpdateUserResponse }
     * 
     */
    public UpdateUserResponse createUpdateUserResponse() {
        return new UpdateUserResponse();
    }

    /**
     * Create an instance of {@link DeleteUserResponse }
     * 
     */
    public DeleteUserResponse createDeleteUserResponse() {
        return new DeleteUserResponse();
    }

    /**
     * Create an instance of {@link QueryUser }
     * 
     */
    public QueryUser createQueryUser() {
        return new QueryUser();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.webservice.heq.com/", name = "addUser")
    public JAXBElement<AddUser> createAddUser(AddUser value) {
        return new JAXBElement<AddUser>(_AddUser_QNAME, AddUser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Car }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.webservice.heq.com/", name = "Car")
    public JAXBElement<Car> createCar(Car value) {
        return new JAXBElement<Car>(_Car_QNAME, Car.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link User }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.webservice.heq.com/", name = "User")
    public JAXBElement<User> createUser(User value) {
        return new JAXBElement<User>(_User_QNAME, User.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryUserResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.webservice.heq.com/", name = "queryUserResponse")
    public JAXBElement<QueryUserResponse> createQueryUserResponse(QueryUserResponse value) {
        return new JAXBElement<QueryUserResponse>(_QueryUserResponse_QNAME, QueryUserResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteUserResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.webservice.heq.com/", name = "deleteUserResponse")
    public JAXBElement<DeleteUserResponse> createDeleteUserResponse(DeleteUserResponse value) {
        return new JAXBElement<DeleteUserResponse>(_DeleteUserResponse_QNAME, DeleteUserResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.webservice.heq.com/", name = "queryUser")
    public JAXBElement<QueryUser> createQueryUser(QueryUser value) {
        return new JAXBElement<QueryUser>(_QueryUser_QNAME, QueryUser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddUserResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.webservice.heq.com/", name = "addUserResponse")
    public JAXBElement<AddUserResponse> createAddUserResponse(AddUserResponse value) {
        return new JAXBElement<AddUserResponse>(_AddUserResponse_QNAME, AddUserResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateUserResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.webservice.heq.com/", name = "updateUserResponse")
    public JAXBElement<UpdateUserResponse> createUpdateUserResponse(UpdateUserResponse value) {
        return new JAXBElement<UpdateUserResponse>(_UpdateUserResponse_QNAME, UpdateUserResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.webservice.heq.com/", name = "updateUser")
    public JAXBElement<UpdateUser> createUpdateUser(UpdateUser value) {
        return new JAXBElement<UpdateUser>(_UpdateUser_QNAME, UpdateUser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.webservice.heq.com/", name = "deleteUser")
    public JAXBElement<DeleteUser> createDeleteUser(DeleteUser value) {
        return new JAXBElement<DeleteUser>(_DeleteUser_QNAME, DeleteUser.class, null, value);
    }

}
