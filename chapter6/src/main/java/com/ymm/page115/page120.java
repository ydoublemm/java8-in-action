package com.ymm.page115;

import com.ymm.page115.pojo.Dish;
import com.ymm.page115.pojo.Menu;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Collectors.*;

import static java.util.stream.Collectors.groupingBy;

/**
 * Created by caojidasabi on 2020/7/1.
 */
public class page120 {

    public static void main(String[] args) {
        //分组 ,按Type分组
        Map<Dish.Type, List<Dish>> collect = Menu.menu.stream().collect(groupingBy(Dish::getType));
        collect.forEach((k,v)-> System.out.println(String.format("k:%s,v:%s",k,v)));

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

        collect1.forEach((k1, v1) -> {
            System.out.print("type: " + k1);
            v1.forEach((k2, v2) -> {
                        System.out.println("热量: "+k2+"---"+v2+",");
                    }
            );
        });

        
    }

}
