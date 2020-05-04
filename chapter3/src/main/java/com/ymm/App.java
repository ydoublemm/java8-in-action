package com.ymm;

import com.ymm.page40.ProcessFile;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.function.Function;
import java.util.function.IntBinaryOperator;
import java.util.function.IntConsumer;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException {
//		System.out.println(processReadLine(
//				(BufferedReader br) -> br.readLine()
//		));
//
//		System.out.println(processReadLine(
//				(BufferedReader br) -> br.readLine() +"\n" + br.readLine()
//		));

		Function<BigDecimal, String> function = (BigDecimal b) -> b == null ? "" : b.toString()+"nb";
		String apply = function.apply(BigDecimal.valueOf(123));

		System.out.println(apply);
	}

    public static String processReadLine(ProcessFile p)throws  IOException{
		try(BufferedReader reader = new BufferedReader(new FileReader("/Users/yemingming/workspace/ideacode/java8-in-action/chapter3/src/main/java/com/ymm/page40/test.txt"))){
			return p.process(reader);
		}
	}
}
