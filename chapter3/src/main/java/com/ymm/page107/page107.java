package com.ymm.page107;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.UUID;
import java.util.stream.Stream;

/**
 * Created by yemingming on 2019-12-02.
 */
public class page107 {

	public static void main(String[] args) {



		Stream.iterate(
				new int[]{0, 1},
				t -> new int[]{t[1],t[0] +t[1]}
		).limit(20).forEach(n->System.out.println(n[0]+","+n[1]));


		Stream.generate(
				()-> UUID.randomUUID()
						.toString()
						.replace("-","")
						.substring(16)
						.toUpperCase())
				.limit(10)
				.forEach(System.out::println);


		Stream.generate(
				Math::random)
				.forEach(System.out::println);
	}


}
