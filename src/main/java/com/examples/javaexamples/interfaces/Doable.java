package com.examples.javaexamples.interfaces;

public interface Doable{  
    default void doIt(){  
        System.out.println("Do it now");  
    }  
}  
