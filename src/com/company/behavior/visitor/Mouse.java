package com.company.behavior.visitor;

public class Mouse  implements ComputerPart {

   @Override
   public void accept(ComputerPartVisitor computerPartVisitor) {
	   computerPartVisitor.visit(this);
   }
}