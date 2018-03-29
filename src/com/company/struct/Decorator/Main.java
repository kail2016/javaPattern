package com.company.struct.Decorator;

/**
 * 意图：动态地给一个对象添加一些额外的职责。就增加功能来说，装饰器模式相比生成子类更为灵活。
 *优点：装饰类和被装饰类可以独立发展，不会相互耦合，装饰模式是继承的一个替代模式，装饰模式可以动态扩展一个实现类的功能。
 缺点：多层装饰比较复杂。
 用场景：在不想增加很多子类的情况下扩展类 1、扩展一个类的功能。 2、动态增加功能，动态撤销。
 */
public class Main {

	public static void main(String[] args) {
		// write your code
		System.out.println("-------装饰者模式开始----------");
		IComponent component = new Component();
		IComponent component1 = new HeaderDecorator(new FooterDecorator(component));
		component1.print();
		System.out.println("-------装饰者模式end----------");
		System.out.println();
	}
}