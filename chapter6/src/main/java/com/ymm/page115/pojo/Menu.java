package com.ymm.page115.pojo;

import java.util.Arrays;
import java.util.List;

/**
 * Created by caojidasabi on 2020/7/1.
 */
public interface Menu {

    List<Dish> menu = Arrays.asList(
            new Dish("pork", false, 800, Dish.Type.Meat),
            new Dish("beef", false, 700, Dish.Type.Meat),
            new Dish("chicken", false, 400, Dish.Type.Fish),
            new Dish("french fries", true, 530, Dish.Type.Other),
            new Dish("rice", true, 350, Dish.Type.Other));

}
