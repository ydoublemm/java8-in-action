package com.ymm.page128;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Created by caojidasabi on 2020/7/20.
 */

//寻找质数
public class IsPrime {
    public static boolean isPrime(int candidate) {

        int sqrt = (int) Math.sqrt(candidate);

        return IntStream.range(2, sqrt).noneMatch(i -> candidate % i == 0);


    }

    public static void main(String[] args) {

        Map<Boolean, List<Integer>> collect = IntStream.range(2, 100)
                .boxed()
                .collect(
                        Collectors.partitioningBy(IsPrime::isPrime)
                );

        System.out.println(collect.get(false));


    }

}
