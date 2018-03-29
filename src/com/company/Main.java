package com.company;

import com.company.dispatch.Dispatch;

public class Main {

	public static void main(String[] args) {
		// write your code
//		System.out.println("-------装饰者模式开始----------");
//		IComponent component = new Component();
//		IComponent component1 = new HeaderDecorator(new FooterDecorator(component));
//		component1.print();
//		System.out.println("-------装饰者模式end----------");
//		System.out.println();

//		new Dispatch().test();
//		vvv("aa","bb","cc");
		vvv();

	}

	public static String vvv(String... ars) {
		int len = ars.length;
		for (String s : ars) {
			System.out.println(s);
		}
		return null;
	}
}