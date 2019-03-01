package com.hashmap.assignment.services;


import com.hashmap.assignment.model.*;

import java.util.List;

public class FoodPanda{
   private OrderService orderServiceImplementation = new OrderService();
   private List<Hotel> hotelList;

    public FoodPanda(List<Hotel> hotelList){
     this.hotelList=hotelList;
    }

    public void placeOrder(Customer customer) {
     orderServiceImplementation.placeOrder(customer);
    }


    public void cancelOrder(int orderId) {
     orderServiceImplementation.cancel(orderId);
    }


    public void getOrderDetails(int orderId) {
     orderServiceImplementation.orderDetails(orderId);
    }

    public double getTotal(Cart cart){
        cart.calculateTotal(hotelList);
        return cart.getTotal();
    }
}

