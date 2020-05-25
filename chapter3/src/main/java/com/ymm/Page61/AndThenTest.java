package com.ymm.Page61;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.function.DoubleToIntFunction;
import java.util.function.Function;
import java.util.function.IntUnaryOperator;
import java.util.function.Supplier;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/**
 * Created by yemingming on 2019-11-25.
 */
public class AndThenTest {

	public static void main(String[] args) {

		IntUnaryOperator f1 = x -> x + 1;
		IntUnaryOperator f2 = x -> x * 2;

		//先计算f1，再计算f2
		IntUnaryOperator f3 = f1.andThen(f2);
		int i = f3.applyAsInt(2);
		System.out.println(i);


		Function<String, Integer> bitCount = Integer::parseInt;


		new HashSet<String>()
				.stream()
				.mapToInt(Integer::parseInt)
				.boxed()
				.findAny()





	}
}
