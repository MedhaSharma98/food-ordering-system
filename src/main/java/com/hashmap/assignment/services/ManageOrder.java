package com.hashmap.assignment.services;

import com.hashmap.assignment.model.Customer;

public interface ManageOrder {
    public void placeOrder(Customer customer);
    public void cancel(int orderId);
    public void orderDetails(int orderId);
}


