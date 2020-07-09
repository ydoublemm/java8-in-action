package com.ymm.page115.pojo;

import lombok.Data;
import lombok.ToString;

/**
 * Created by caojidasabi on 2020/7/1.
 */
@Data
@ToString
public class Dish {

    private String name;
    private boolean vegetarian;
    private int calories;
    private Type type;

    public enum Type {Meat, Fish, Other}

    public Dish(String name, boolean vegetarian, int calories, Type type) {
        super();
        this.name = name;
        this.vegetarian = vegetarian;
        this.calories = calories;
        this.type = type;
    }




}