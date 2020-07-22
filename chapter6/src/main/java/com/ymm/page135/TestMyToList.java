package com.ymm.page135;

import com.ymm.page115.pojo.Dish;
import com.ymm.page115.pojo.Menu;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by caojidasabi on 2020/7/21.
 */
public class TestMyToList {

    public static void main(String[] args) {
        List<Dish> collect = Menu.menu
                .stream()
                .filter(Dish::isVegetarian)
                .collect(new MyToList<Dish>());


        System.out.println(collect);

        List<Dish> collect1 = Menu.menu
                .stream()
                .filter(Dish::isVegetarian)
                .collect(Collectors.toList());
        ArrayList<Object> collect2 = Menu.menu
                .stream()
                .filter(Dish::isVegetarian)
                .collect(ArrayList::new, List::add,
                        List::addAll);
    }

}
