package com.company.struct.Decorator;

/**
 * Created by zhouhui on 2018/1/16.
 */
public class FooterDecorator  extends Decorator{

	public FooterDecorator(IComponent mComponet) {
		super(mComponet);
	}


	@Override
	public void print() {
		super.print();
		printFoot();
	}

	private void printFoot(){
		System.out.println("foot.....");
	}
}
