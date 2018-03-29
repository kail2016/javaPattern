package com.company.struct.bridge;

/**
 * 在有多种可能会变化的情况下，用继承会造成类爆炸问题，扩展起来不灵活。
 * 优点： 1、抽象和实现的分离。 2、优秀的扩展能力。 3、实现细节对客户透明。
 	缺点：桥接模式的引入会增加系统的理解与设计难度，由于聚合关联关系建立在抽象层，要求开发者针对抽象进行设计与编程。
 */

public class Main {

	public static void main(String[] args) {
		// write your code
		Shape redCircle = new Circle(100, 100, 10, new RedCircle());
		Shape greenCircle = new Circle(100, 100, 10, new GreenCircle());
		redCircle.draw();
		greenCircle.draw();
	}
}