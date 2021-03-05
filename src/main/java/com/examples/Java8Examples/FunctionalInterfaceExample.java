package com.examples.Java8Examples;

import com.examples.javaexamples.interfaces.sayable;

public class FunctionalInterfaceExample implements sayable{  
    public void say(String msg){  
        System.out.println(msg);  
    }  
	/*
	 * public static void main(String[] args) { FunctionalInterfaceExample fie = new
	 * FunctionalInterfaceExample(); fie.say("Hello there"); }
	 */ 
}  
