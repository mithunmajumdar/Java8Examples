package com.examples.Java8Examples;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Java8ExamplesFunctionalInterfacesController {

	@GetMapping("/java8examples/FunctionalInterfaces")
	public String Java8ExamplesFunctionalInterfaces(){
		System.out.println("javaexamples...Functional Interfaces....");
		
		FunctionalInterfaceExample fie = new FunctionalInterfaceExample();  
        fie.say("Hello there");  
        
        fie.doIt();
		
		return "Functional Interfaces";
	}
	
	
}
