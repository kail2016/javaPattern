package com.company.behavior.visitor;

public class Monitor  implements ComputerPart {

   @Override
   public void accept(ComputerPartVisitor computerPartVisitor) {
	   computerPartVisitor.visit(this);
   }
}