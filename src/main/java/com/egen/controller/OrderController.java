package com.egen.controller;

import com.egen.model.Order;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.time.ZonedDateTime;
import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping(value = "order")
public class OrderController {
    /**
     * implement the following endpoints
     */

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<List<Order>> getAllOrders(){
        //TODO
        return ResponseEntity.ok(Collections.singletonList(new Order()));
    }

    @RequestMapping(method = RequestMethod.GET, value = "{id}")
    public ResponseEntity<List<Order>> getOrderById(@PathVariable("id") String id){
        //TODO
        return null;
    }

    public ResponseEntity<List<Order>> getAllOrdersWithInInterval(ZonedDateTime startTime, ZonedDateTime endTime){
        //TODO
        return null;
    }

    public ResponseEntity<List<Order>> top10OrdersWithHighestDollarAmountInZip(String zip){
        //TODO
        return null;
    }

    public ResponseEntity<Order> placeOrder(Order order){
        return null;
    }

    public ResponseEntity<Order> cancelOrder(Order order){
        return null;
    }

    public ResponseEntity<Order> updateOrder(Order order){
        return null;
    }
}
