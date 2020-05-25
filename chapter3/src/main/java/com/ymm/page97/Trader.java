package com.ymm.page97;

/**
 * Created by yemingming on 2019-12-01.
 */
public class Trader {

	private final String name;

	private final String city;

	public Trader(String name, String city) {
		this.name = name;
		this.city = city;
	}

	public String getName() {
		return name;
	}

	public String getCity() {
		return city;
	}


	@Override
	public String toString() {
		return "Trader{" + "name='" + name + '\'' + ", city='" + city + '\'' + '}';
	}
}