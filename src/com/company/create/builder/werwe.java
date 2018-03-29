package com.company.create.builder;

/**
 * 何时使用：一些基本部件不会变，而其组合经常变化的时候
 * 优点： 1、建造者独立，易扩展。 2、便于控制细节风险。
 * 缺点： 1、产品必须有共同点，范围有限制。 2、如内部变化复杂，会有很多的建造类。
 * 注意事项：与工厂模式的区别是：建造者模式更加关注与零件装配的顺序。
 */

public class werwe {
	private static werwe ourInstance = new werwe();

	public static werwe getInstance() {
		return ourInstance;
	}

	private werwe() {
	}
}
