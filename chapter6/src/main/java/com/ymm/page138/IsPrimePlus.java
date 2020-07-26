package com.ymm.page138;

import java.util.List;
import java.util.function.Predicate;

/**
 * Created by caojidasabi on 2020/7/23.
 */
public class IsPrimePlus {

    public static boolean isPrime(List<Integer> primeList,int candidate){

        Integer candidateRoot = (int) Math.sqrt(candidate);

        return subPrimeList(primeList,integer -> integer <= candidateRoot)//条件
                .stream()
                .noneMatch(e->candidate%e == 0);

    }

    private static  <A> List<A> subPrimeList(List<A> primeList, Predicate<A> p){

        int i=0;

        for (A item : primeList) {
            if (!p.test(item)) {
                return primeList.subList(0,i);
            }
            i++;
        }

        return primeList;


    }


}
