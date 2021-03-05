package com.examples.Java8Examples;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.examples.javaexamples.interfaces.Drawable;

@RestController
public class Java8ExamplesLamdaController {
	@GetMapping("/java8examples/Lambda")
	public String Java8ExamplesLambda(){
		System.out.println("javaexamples...Java8ExamplesLamdaController....");
		
		int width=10;  
		//with lambda  
        Drawable d2=()->{  
            System.out.println("Drawing "+width);  
        };  
        d2.draw();  
        
        
        
        
        
		return "Lambda";
	}
}
