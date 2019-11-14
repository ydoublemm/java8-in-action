package com.ymm;

import com.ymm.page11.Apple;

import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class BadApp
{

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


    public static void main( String[] args ) {
		//List<Apple> apples = filterGreenApple(list);
		List<Apple> apples = filterBigApple(list);
		System.out.println(apples);
	}


	/**
	 * 筛选一个绿色的苹果
	 * @param inventory
	 * @return
	 */
    public static List<Apple> filterGreenApple(List<Apple> inventory){
    	List<Apple> list = new ArrayList<>();
    	for(Apple apple	: inventory){
    		if("green".equals(apple.getColor())){
    			list.add(apple);
			}
		}

    	return list;
	}

	public static List<Apple> filterBigApple(List<Apple> inventory){
		List<Apple> list = new ArrayList<>();
		for(Apple apple	: inventory){
			if(apple.getWeight()>150){
				list.add(apple);
			}
		}

		return list;
	}
}
