package com.hashmap.assignment.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Order{
    private int orderId;
    private Customer customer;
    private double totalCost;
}
