package com.heq.entity;

import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created user ： heqiang
 * created date : 2019/4/4 9:12
 * Description : No Description
 * version : 1.0
 */

/**
 * 基于restFull风格的webService,客户端与服务端之间可以以xml或者json的格式来传递数据
 *
 * @XmlRootElement(name = "User")指定对象序列化为xml或者json数据时的根节点名称
 */
@XmlRootElement(name = "User")
public class User implements Serializable {

    private Integer id;
    private String name;
    private String city;
    private List<Car> carList = new ArrayList<Car>();
    public User() {
    }
    public User(Integer id, String name, String city, List<Car> carList) {
        this.id = id;
        this.name = name;
        this.city = city;
        this.carList = carList;
    }
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public List<Car> getCarList() {
        return carList;
    }

    public void setCarList(List<Car> carList) {
        this.carList = carList;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", carList=" + carList +
                '}';
    }
}
