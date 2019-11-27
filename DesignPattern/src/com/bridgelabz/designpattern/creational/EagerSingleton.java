package com.bridgelabz.designpattern.creational;


public class EagerSingleton 
{
	 private static final EagerSingleton instance = new EagerSingleton();
	    
	    //private constructor to avoid client applications to use constructor
	    private EagerSingleton(){}

	    public static EagerSingleton getInstance(){
	        return instance;
	    }
}
