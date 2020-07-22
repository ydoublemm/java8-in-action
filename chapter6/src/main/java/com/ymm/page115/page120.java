package com.ymm.page115;

import com.ymm.page115.pojo.Dish;
import com.ymm.page115.pojo.Menu;

import java.util.Comparator;
import java.util.List;
import java.util.Map;

import static java.util.stream.Collectors.*;

/**
 * Created by caojidasabi on 2020/7/1.
 */
public class page120 {

    public static void main(String[] args) {
        //分组 ,按Type分组
        Map<Dish.Type, List<Dish>> collect = Menu.menu.stream().collect(groupingBy(Dish::getType));
        collect.forEach((k, v) -> System.out.println(String.format("k:%s,v:%s", k, v)));

        System.out.println(":::");
        //多级分组
        Map<Dish.Type, Map<String, List<Dish>>> collect1 = Menu.menu
                .stream()
                .collect(groupingBy(Dish::getType,
                        groupingBy(
                                e -> {
                                    if (e.getCalories() < 400) return "低热量";
                                    if (e.getCalories() < 700) return "中热量";
                                    else return "高热量";
                                }
                        ))
                );

        //把收集器转换为另一种类型
        Map<Dish.Type, String> collect3 = Menu.menu
                .stream()
                .collect(groupingBy(Dish::getType,
                        collectingAndThen(maxBy(Comparator.comparing(Dish::getCalories)),e->e.get().getName() ))
                );

        Map<Dish.Type, List<String>> collect4 = Menu.menu
                .stream()
                .collect(groupingBy(Dish::getType,
                        mapping(
                                e -> {
                                    if (e.getCalories() < 400) return "低热量--"+e.getName();
                                    if (e.getCalories() < 700) return "中热量--"+e.getName();
                                    else return "高热量--"+e.getName();
                                }, toList()
                        )
                        )
                );


        System.out.println(collect4);

        Map<Dish.Type, Long> collect2 = Menu.menu
                .stream()
                .collect(groupingBy(Dish::getType, counting()));

        /*collect1.forEach((k1, v1) -> {
            System.out.print("type: " + k1);
            v1.forEach((k2, v2) -> {
                        System.out.println("热量: " + k2 + "---" + v2 + ",");
                    }
            );
        });*/


        Map<Boolean, List<Dish>> collect5 = Menu.menu
                .stream()
                .collect(
                        partitioningBy(Dish::isVegetarian)
                );




    }




}
