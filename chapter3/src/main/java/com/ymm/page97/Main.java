package com.ymm.page97;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by yemingming on 2019-12-01.
 */
public class Main {

	static {



	}





	public static void main(String[] args) {
		Trader roul =new Trader("Roul", "上海");
		Trader mario =new Trader("Mario", "北京");
		Trader alan =new Trader("Alan", "上海");
		Trader brian =new Trader("Brian", "上海");


		List<Transacaion> transacaions = Arrays
				.asList(new Transacaion(brian, 2011, 300), new Transacaion(roul, 2012, 1000),
						new Transacaion(roul, 2011, 400), new Transacaion(mario, 2012, 710),
						new Transacaion(mario, 2012, 700), new Transacaion(alan, 2012, 950)

				);


		//找出2011年发生的所有交易，并按交易额排序，从低到高
		List<Transacaion> list1 = transacaions.stream()
				.filter(e-> e.getYear() == 2011)
				.sorted(Comparator.comparingInt(Transacaion::getValue))
				.collect(Collectors.toList());

		System.out.println("1\n" + list1);


		//交易员都在那些不同的城市工作过
		List<String> list2 = transacaions.stream()
				.map(Transacaion::getTrader)
				.map(Trader::getCity)
				.distinct()
				.collect(Collectors.toList());


		System.out.println("2\n" + list2);

		//查找来自上海的交易员，并按姓名排序
		List<Trader> list3 = transacaions.stream()
				.map(Transacaion::getTrader)
				.filter(e -> e.getCity().equals("上海"))
				.sorted(Comparator.comparing(Trader::getName))
				.collect(Collectors.toList());
		System.out.println("3\n" + list3);


		//返回所有交易员姓名字符串，并按名字进行排序
		String list4 = transacaions.stream()
				.map(e -> e.getTrader().getName())
				.distinct()
				.sorted(String::compareTo)
				.reduce("" ,(s1,s2) -> s1+" -- "+s2);

		System.out.println("4\n" + list4);

		//有没有交易员在杭州工作过

		transacaions.stream()
				.anyMatch(e->e.getTrader().getCity().equals("杭州"));

		//上海交易员的所有交易额
		transacaions.stream()
				.filter(e -> e.getTrader().getCity().equals("上海"))
				.map(Transacaion::getValue)
				.forEach(System.out::println);

		//所有交易员中的最高交易额
		transacaions.stream()
				.map(Transacaion::getValue)
				.reduce(Integer::max);

		//交易额最小的交易
		Optional<Transacaion> reduce = transacaions.stream()
				.reduce((t1, t2) -> t1.getValue() < t1.getValue() ? t1 : t2);

		Optional<Transacaion> min = transacaions.stream().min(Comparator.comparing(Transacaion::getValue));





	}
}
