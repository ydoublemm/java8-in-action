package com.ymm.page89;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by yemingming on 2019-11-28.
 */
public class FlatMapGO {


	public static String[] str = {"hellow","word"};


	public static void main(String[] args) {

		List<String> list = Arrays.asList(str);
		List<String> collect =
				list.stream()
				.map(s -> s.split(""))
				.flatMap(Arrays::stream)
				.distinct()
				.collect(Collectors.toList());



		System.out.println(collect);

	}
}
