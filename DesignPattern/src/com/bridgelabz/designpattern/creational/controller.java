package com.bridgelabz.designpattern.creational;

public class controller {

	public static void main(String[] args) 
	{
		//Eager pattern
		EagerSingleton eager = EagerSingleton.getInstance();
    	EagerSingleton eager2 = EagerSingleton.getInstance();
    	System.out.println(eager);
    	System.out.println(eager2);
    	
    	//StaticBlock pattern
    	StaticBlockSingleton staticblock = StaticBlockSingleton.getInstance();
		StaticBlockSingleton staticblock1 = StaticBlockSingleton.getInstance();
		System.out.println(staticblock);
		System.out.println(staticblock1);
		System.out.println();
		
		//Lazy pattern
		LazySingleton lazy = LazySingleton.getInstance();
		LazySingleton lazy2 = LazySingleton.getInstance();
		System.out.println(lazy);
		System.out.println(lazy2);
		System.out.println();
		
		//ThreadSafe pattern
		ThreadSafe thread1 = ThreadSafe.getInstance();
		ThreadSafe thread2 = ThreadSafe.getInstance();
		System.out.println(thread1);
		System.out.println(thread2);
		System.out.println();
		
		//BillPugh patterns
		BillPugh billpugh = BillPugh.getInstance();
		BillPugh billpugh1 = BillPugh.getInstance();
		System.out.println(billpugh);
		System.out.println(billpugh1);
		System.out.println();
		
		//EnumSingleton pattern
		EnumSingleton.doSomething();
		System.out.println();
		
	}


}
