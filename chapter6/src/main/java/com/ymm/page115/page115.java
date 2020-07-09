package com.ymm.page115;

import com.ymm.page115.pojo.Dish;
import com.ymm.page115.pojo.Menu;

import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * Created by yemingming on 2020-06-27.
 */
public class page115 {

    public static void main(String[] args) {
        //使用多种方法找出热量最小的Dish
        Optional<Dish> min1 = Menu.menu.stream().reduce((a, b) -> a.getCalories() < b.getCalories() ? a : b);

        Optional<Dish> min2 = Menu.menu.stream().collect(Collectors.minBy(Comparator.comparing(Dish::getCalories)));

        Optional<Dish> min3 = Menu.menu.stream().min(Comparator.comparing(Dish::getCalories));

        System.out.println(
                String.format(
                        "min1:%s\nmin2:%s\nmin3:%s\n",
                        min1,min2,min3
                )

        );


    }
}
