package com.ymm;

import javafx.util.Callback;

import java.nio.file.DirectoryStream;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by yemingming on 2019-11-20.
 */
public class Test {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		Callback<String, Boolean> stringFilter = (String s) -> list.add(s);

		Boolean aaa = stringFilter.call("aaa");

		System.out.println(list);
	}
}
