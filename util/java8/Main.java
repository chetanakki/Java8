package com.util.java8;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

class MyClass
{
	public int myMethod(int x, int y)
	{
		System.out.println("This is my method");
		return x+y;
	}
}
public class Main {

	public static void main(String[] args) {
		
		// Lambda expression 
		
		MyFirstFunctionalInterface fobj = ( x,  y) ->   x+y ; 
		System.out.println(fobj.add(4, 5));
		
		// default and static methods in interfaces
		
		fobj.secondMethod();
		fobj.thirdMethod();
		MyFirstFunctionalInterface.fifthMethod();
		MyFirstFunctionalInterface.fourthMethod();
		
		// foreach method
		
		List<String> subList = new ArrayList<String>();  
        subList.add("Maths");  
        subList.add("English");  
        subList.add("French");  
        subList.add("Sanskrit");
        subList.add("Abacus");
        System.out.println("------------Subject List--------------");  
        subList.forEach(sub -> System.out.println(sub));  
        
        Map<String,String> myMap = new HashMap<>();
        System.out.println("------------Number Map--------------");   
        myMap.put("one", "one");
        myMap.put("two", "two");
        myMap.put("three", "three");
        
        myMap.forEach((key, value ) -> System.out.println(key+" , value: "+ value) );
        
        // Optional class
        
        String[] str = new String[10];   
        Optional<String>checkNull =  
                       Optional.ofNullable(str[5]); 
        if(checkNull.isPresent())
        {
        	String word = str[5].toLowerCase();   
            System.out.print(word); 
        }
        else
        {
        	System.out.println("string is null");  
        }
        
        // Method reference
        MyClass myClass = new MyClass();
        
        MyFirstFunctionalInterface obj = myClass::myMethod;
        System.out.println( obj.add(4, 4));
        
        // Java Date Time API
        
        LocalDate date = LocalDate.now();
        System.out.println(date);
        
        LocalTime time = LocalTime.now();
        System.out.println(time);
        
        //Nashorn JavaScript Engine

       // Base64 Encode Decode
	}

}
