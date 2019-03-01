package com.hashmap.assignment.services;

import com.hashmap.assignment.model.*;

import java.util.ArrayList;
import java.util.List;

public class OrderService implements ManageOrder {
    private List<Order> orderList = new ArrayList<Order>();

    private int i = 0;

    public void placeOrder(Customer customer){
        orderList.add(new Order(++i, customer,customer.getCart().getTotal()));
    }

    public void cancel(int orderId) {
        for(Order o : orderList) {
            if(o.getOrderId() == orderId) {
                orderList.remove(o);
            } }
    }

    public void orderDetails(int id){
        for(Order order: orderList){
            if(order.getOrderId()==id){

            } }

    }
}
