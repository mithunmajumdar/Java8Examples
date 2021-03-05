package com.examples.javaexamples.interfaces;

@FunctionalInterface  
public interface sayable extends Doable{  
	void say(String msg);   // abstract method  
    // It can contain any number of Object class methods.  
    int hashCode();  
    String toString();  
    boolean equals(Object obj);    
}  