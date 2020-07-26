package com.ymm.page138;

import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import static java.util.stream.Collector.Characteristics.IDENTITY_FINISH;

/**
 * Created by caojidasabi on 2020/7/23.
 */
public class MyPartitioningBy implements Collector<Integer, Map<Boolean, List<Integer>>, Map<Boolean, List<Integer>>> {


    @Override
    public Supplier<Map<Boolean, List<Integer>>> supplier() {
        return () -> new HashMap<Boolean, List<Integer>>() {{
            put(true, new ArrayList<Integer>());
            put(false, new ArrayList<Integer>());
        }};
    }

    @Override
    public BiConsumer<Map<Boolean, List<Integer>>, Integer> accumulator() {
        return (Map<Boolean, List<Integer>> acc, Integer integer) -> {
            acc.get(IsPrimePlus.isPrime(acc.get(true), integer))
                .add(integer);
        };
    }

    @Override
    public BinaryOperator<Map<Boolean, List<Integer>>> combiner() {
        return (map1,map2)->{
            map1.get(true).addAll(map2.get(true));
            map1.get(false).addAll(map2.get(false));
            return  map1;
        };
    }

    @Override
    public Function<Map<Boolean, List<Integer>>, Map<Boolean, List<Integer>>> finisher() {
        return Function.identity();
    }

    @Override
    public Set<Characteristics> characteristics() {
        return Collections.unmodifiableSet(
               EnumSet.of(IDENTITY_FINISH)
        );
    }
}
