package com.company.struct.Decorator;

/**
 * Created by zhouhui on 2018/1/16.
 */
public class Component implements IComponent {
	@Override
	public void print() {
		System.out.println("我是悟空本体");
	}
}
