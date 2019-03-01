package com.hashmap.assignment.model;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;

import java.util.HashMap;
import java.util.Map;

@Getter
@EqualsAndHashCode
@AllArgsConstructor
public class Hotel {
    private String name;
    private int rating;
    private Map<Food,Integer> menu =new HashMap<Food,Integer>();

}
