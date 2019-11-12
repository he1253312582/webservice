
package com.heq.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>car complex type�� Java �ࡣ
 *
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 *
 * <pre>
 * &lt;complexType name="car">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="carName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="price" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "car", propOrder = {
        "carName",
        "id",
        "price"
})
@XmlRootElement
public class Car {

    protected String carName;
    protected Integer id;
    protected Double price;

    public Car() {
    }

    public Car(Integer id, String carName, Double price) {
        this.carName = carName;
        this.id = id;
        this.price = price;
    }

    /**
     * ��ȡcarName���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getCarName() {
        return carName;
    }

    /**
     * ����carName���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setCarName(String value) {
        this.carName = value;
    }

    /**
     * ��ȡid���Ե�ֵ��
     *
     * @return possible object is
     * {@link Integer }
     */
    public Integer getId() {
        return id;
    }

    /**
     * ����id���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link Integer }
     */
    public void setId(Integer value) {
        this.id = value;
    }

    /**
     * ��ȡprice���Ե�ֵ��
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getPrice() {
        return price;
    }

    /**
     * ����price���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link Double }
     */
    public void setPrice(Double value) {
        this.price = value;
    }

}
