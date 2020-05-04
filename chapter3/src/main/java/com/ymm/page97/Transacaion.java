package com.ymm.page97;

/**
 * Created by yemingming on 2019-12-01.
 */
public class Transacaion {

	private final Trader trader;

	private final int year;

	private final int value;


	public Transacaion(Trader trader, int year, int value) {
		this.trader = trader;
		this.year = year;
		this.value = value;
	}

	public Trader getTrader() {
		return trader;
	}

	public int getYear() {
		return year;
	}

	public int getValue() {
		return value;
	}

	@Override
	public String toString() {
		return "Transacaion{" + "trader=" + trader + ", year=" + year + ", value=" + value + '}';
	}
}
