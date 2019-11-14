package com.ymm.page11;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * Created by yemingming on 2019-11-15.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Apple {

	private String color;
	private Integer weight;

	public static boolean isGreen(Apple apple){
		return "green".equals(apple.getColor());
	}

	public static boolean moreWeight(Apple apple,Integer weight){
		return apple.getWeight() > weight;
	}
}
