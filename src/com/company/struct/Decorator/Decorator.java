package com.company.struct.Decorator;

/**
 * 抽象装饰者
 * Created by zhouhui on 2018/1/16.
 */
public class Decorator implements IComponent {

	private IComponent mComponet;

	public Decorator(IComponent mComponet) {
		this.mComponet = mComponet;
	}

	@Override
	public void print() {
		mComponet.print();
	}
}
