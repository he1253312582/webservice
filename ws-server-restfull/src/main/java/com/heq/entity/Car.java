package com.heq.entity;

import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

/**
 * Created user ： heqiang
 * created date : 2019/4/4 9:14
 * Description : No Description
 * version : 1.0
 */

/**
 * 基于restFull风格的webService
 * 可以传输Xml和Json两种格式的数据
 */
@XmlRootElement(name = "Car")
public class Car implements Serializable {



   private Integer id;
   private String carName;
   private Double price;

    public Car() {
    }

    public Car(Integer id, String carName, Double price) {
        this.id = id;
        this.carName = carName;
        this.price = price;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", carName='" + carName + '\'' +
                ", price=" + price +
                '}';
    }
}
