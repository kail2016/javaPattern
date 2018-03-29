package com.company.behavior.visitor;

public class Keyboard  implements ComputerPart {

   @Override
   public void accept(ComputerPartVisitor computerPartVisitor) {
	   computerPartVisitor.visit(this);
   }
}