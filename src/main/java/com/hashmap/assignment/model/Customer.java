package com.hashmap.assignment.model;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@Getter
@AllArgsConstructor
@EqualsAndHashCode
public class Customer {
    private String name;
    private long phoneno;
    private String address;
    private Cart cart;

    public void showCustomerDetails(){
        System.out.println("NAME :"+name);
        System.out.println("PHONE NO :"+phoneno);
        System.out.println("ADDRESS :"+address);
    }


}
