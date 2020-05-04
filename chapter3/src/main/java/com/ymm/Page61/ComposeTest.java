package com.ymm.Page61;

import java.util.function.IntUnaryOperator;

/**
 * Created by yemingming on 2019-11-25.
 */
public class ComposeTest {

	public static void main(String[] args) {
		IntUnaryOperator f1 = x -> x + 1;
		IntUnaryOperator f2 = x -> x * 2;


		//先计算f2，再计算f1
		IntUnaryOperator f3 = f1.compose(f2);
		int i = f3.applyAsInt(2);
		System.out.println(i);
	}
}
