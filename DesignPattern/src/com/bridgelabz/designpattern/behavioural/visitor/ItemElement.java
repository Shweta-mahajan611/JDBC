package com.bridgelabz.designpattern.behavioural.visitor;


public interface ItemElement 
{

	public int accept(ShoppingCartVisitor visitor);
}
