package com.egen.model;

public class Order {
    private String order_id;
    private OrderStatus order_status;
    private String customer_id;
    private double order_subtotal;
    private double order_tax;
    private double order_shipping_charges;
    private double order_total;
    private Billing billing;
    private Shipping shipping;

    public String getOrder_id() {
        return order_id;
    }

    public void setOrder_id(String order_id) {
        this.order_id = order_id;
    }

    public OrderStatus getOrder_status() {
        return order_status;
    }

    public void setOrder_status(OrderStatus order_status) {
        this.order_status = order_status;
    }

    public String getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(String customer_id) {
        this.customer_id = customer_id;
    }

    public double getOrder_subtotal() {
        return order_subtotal;
    }

    public void setOrder_subtotal(double order_subtotal) {
        this.order_subtotal = order_subtotal;
    }

    public double getOrder_tax() {
        return order_tax;
    }

    public void setOrder_tax(double order_tax) {
        this.order_tax = order_tax;
    }

    public double getOrder_shipping_charges() {
        return order_shipping_charges;
    }

    public void setOrder_shipping_charges(double order_shipping_charges) {
        this.order_shipping_charges = order_shipping_charges;
    }

    public double getOrder_total() {
        return order_total;
    }

    public void setOrder_total(double order_total) {
        this.order_total = order_total;
    }

    public Billing getBilling() {
        return billing;
    }

    public void setBilling(Billing billing) {
        this.billing = billing;
    }

    public Shipping getShipping() {
        return shipping;
    }

    public void setShipping(Shipping shipping) {
        this.shipping = shipping;
    }
}
