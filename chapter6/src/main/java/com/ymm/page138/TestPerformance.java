package com.ymm.page138;

import com.ymm.page128.IsPrime;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Created by caojidasabi on 2020/7/23.
 */
public class TestPerformance {

    public static void main(String[] args) {

        int max = 1_000_000;

        long start = System.nanoTime();

        Map<Boolean, List<Integer>> collect = IntStream
                .range(2, max)
                .boxed()
                .collect(new MyPartitioningBy());

        System.out.println(System.nanoTime()-start);


        start = System.nanoTime();
        Map<Boolean, List<Integer>> collect2 = IntStream
                .range(2, max)
                .boxed()
                .collect(Collectors.partitioningBy(IsPrime::isPrime));

        System.out.println(System.nanoTime()-start  );

    }


}
