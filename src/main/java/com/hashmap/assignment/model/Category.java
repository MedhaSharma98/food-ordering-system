package com.hashmap.assignment.model;

import com.hashmap.assignment.Utilty.Themes;
import com.hashmap.assignment.Utilty.Type;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@Getter
@AllArgsConstructor
@EqualsAndHashCode
public class Category {
    private Themes theme;
    private Type type;
}
