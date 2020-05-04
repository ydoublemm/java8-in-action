package com.ymm.page89;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by yemingming on 2019-11-28.
 * 给定两个数组，列出所有匹配
 */
public class MapTest1 {




	public static void main(String[] args) {
		List<String> list1 = Arrays.asList("1", "2", "3");
		List<String> list2 = Arrays.asList("4", "5");

		List<String[]> collect = list1.stream()
				.flatMap(s -> list2.stream().map(s2 -> new String[]{s, s2}))
				.filter(s->(Integer.parseInt(s[0])+Integer.parseInt(s[1                                       ]))%3==0)
				.collect(Collectors.toList());

		collect.forEach(s->{
			for (String s1 : s) {
				System.out.print(s1);
			}
			System.out.println();
		});

	}
}
