package com.ymm;

import com.ymm.page11.Apple;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

/**
 * Created by yemingming on 2019-11-15.
 */
public class GoodApp {

	public static List<Apple> list = new ArrayList<>();

	static {
		list.add(new Apple("red",10));
		list.add(new Apple("yellow",20));
		list.add(new Apple("green",200));
		list.add(new Apple("red",100));
		list.add(new Apple("green",50));
		list.add(new Apple("yellow",160));
		list.add(new Apple("red",120));
		list.add(new Apple("green",30));

	}


	public static void main(String[] args) {
		List<Apple> list = filterApple(GoodApp.list, Apple::isGreen);
		//List<Apple> list1 = filterApple(GoodApp.list, apple -> apple.getColor().equals("red"));

		//System.out.println(list);
	}


	/**
	 *
	 * @param inventory
	 * @param p
	 * @return
	 *
	 * 把结果拿到，要怎么做留给你去定义
	 */
	public static  List<Apple> filterApple(List<Apple> inventory, Predicate<Apple> p){
		List<Apple> list = new ArrayList<>();

		for(Apple apple : inventory){
			if(p.test(apple)){
				list.add(apple);
			}
		}
		Collections.sort(inventory, new Comparator<Apple>() {
			@Override
			public int compare(Apple o1, Apple o2) {
				return o1.getWeight()-o2.getWeight();
			}
		});

		Collections.sort(inventory, Comparator.comparingInt(Apple::getWeight));

		inventory.sort(Comparator.comparingInt(Apple::getWeight));

		inventory.sort(Comparator.comparing(Apple::getColor).thenComparing(Apple::getWeight));



		System.out.println(inventory);

		Runnable runnable = () -> System.out.println(11);



		return list;
	}
}
