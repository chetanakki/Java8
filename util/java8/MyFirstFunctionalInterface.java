package com.util.java8;

@FunctionalInterface
public interface MyFirstFunctionalInterface {
	
	int add(int x, int y);
	
	default void secondMethod()
	{
		System.out.println("Second default method");
	}
	
	default void thirdMethod()
	{
		System.out.println("Third default method");
	}
	
	static void fourthMethod()
	{
		System.out.println("Fourth static method");
	}
	
	static void fifthMethod()
	{
		System.out.println("Fifth static method");
	}
	
	// Object class methods can be added 
	
    @Override
    public String toString();  
    
    @Override
    public boolean equals(Object obj); 
}
