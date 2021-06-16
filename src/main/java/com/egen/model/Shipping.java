package com.egen.model;

import javax.persistence.Entity;
import java.util.UUID;

@Entity
public class Shipping {
    private String shipping_id;
    private String order_id;
    private String order_shipping_addressline1;
    private String order_shipping_addressline2;
    private String order_shipping_city;
    private String order_shipping_state;
    private String order_shipping_zip;

    public Shipping(String shipping_id, String order_id, String order_shipping_addressline1, String order_shipping_addressline2, String order_shipping_city, String order_shipping_state, String order_shipping_zip) {
        this.order_id = order_id;
        this.shipping_id = UUID.randomUUID().toString();
        this.order_shipping_addressline1 = order_shipping_addressline1;
        this.order_shipping_addressline2 = order_shipping_addressline2;
        this.order_shipping_city = order_shipping_city;
        this.order_shipping_state = order_shipping_state;
        this.order_shipping_zip = order_shipping_zip;
    }
    
    public String getOrder_id() {
        return order_id;
    }

    public void setOrder_id(String order_id) {
        this.order_id = order_id;
    }

    public String getShipping_id() {
        return shipping_id;
    }

    public void setShipping_id(String shipping_id) {
        this.shipping_id = shipping_id;
    }

    public String getOrder_shipping_addressline1() {
        return order_shipping_addressline1;
    }

    public void setOrder_shipping_addressline1(String order_shipping_addressline1) {
        this.order_shipping_addressline1 = order_shipping_addressline1;
    }

    public String getOrder_shipping_addressline2() {
        return order_shipping_addressline2;
    }

    public void setOrder_shipping_addressline2(String order_shipping_addressline2) {
        this.order_shipping_addressline2 = order_shipping_addressline2;
    }

    public String getOrder_shipping_city() {
        return order_shipping_city;
    }

    public void setOrder_shipping_city(String order_shipping_city) {
        this.order_shipping_city = order_shipping_city;
    }

    public String getOrder_shipping_state() {
        return order_shipping_state;
    }

    public void setOrder_shipping_state(String order_shipping_state) {
        this.order_shipping_state = order_shipping_state;
    }

    public String getOrder_shipping_zip() {
        return order_shipping_zip;
    }

    public void setOrder_shipping_zip(String order_shipping_zip) {
        this.order_shipping_zip = order_shipping_zip;
    }
}
