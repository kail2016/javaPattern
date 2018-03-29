package com.company.struct.Decorator;

/**
 * 具体装饰者
 * Created by zhouhui on 2018/1/16.
 */
public class HeaderDecorator extends Decorator{

	public HeaderDecorator(IComponent mComponet) {
		super(mComponet);
	}

	@Override
	public void print() {
		printHeader();
		super.print();
	}

	 private void printHeader(){
		System.out.println("header........");
	 }
}

