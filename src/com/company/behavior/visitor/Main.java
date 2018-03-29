package com.company.behavior.visitor;

/**
 * 主要将数据结构与数据操作分离
 * 优点： 1、符合单一职责原则。 2、优秀的扩展性。 3、灵活性。
 * 缺点： 1、具体元素对访问者公布细节，违反了迪米特原则。 2、具体元素变更比较困难。 3、违反了依赖倒置原则，依赖了具体类，没有依赖抽象。
 */

public class Main {

	public static void main(String[] args) {
		// write your code

		ComputerPart computer = new Computer();
		computer.accept(new ComputerPartDisplayVisitor());
	}
}