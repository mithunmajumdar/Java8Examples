package com.examples.Java8Examples;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.examples.javaexamples.bean.Product;

@RestController
public class Java8ExamplesStreamController {

	@GetMapping("/java8examples/stream")
	public String Java8ExamplesStream(){
		System.out.println("javaexamples...Java8ExamplesStream....");
		
		
		List<Product> productsList = new ArrayList<Product>();  
        //Adding Products  
        productsList.add(new Product(1,"HP Laptop",25000f));  
        productsList.add(new Product(2,"Dell Laptop",30000f));  
        productsList.add(new Product(3,"Lenevo Laptop",28000f));  
        productsList.add(new Product(4,"Sony Laptop",28000f));  
        productsList.add(new Product(5,"Apple Laptop",90000f));  
        
        System.out.println("\nFiltering Collection by using Stream\n");
        List<Float> productPriceList2 =productsList.stream()
                                     .filter(p -> p.price > 30000)// filtering data  
                                     .map(p->p.price)        // fetching price  
                                     .collect(Collectors.toList()); // collecting as list  
        System.out.println(productPriceList2);  
    
        
        System.out.println("\n Stream Iterating Example \n");
        Stream.iterate(1, element->element+1)  
        .filter(element->element%5==0)  
        .limit(5)  
        .forEach(System.out::println);  
		
        System.out.println("\n Filtering and Iterating Collection \n");
        productsList.stream()  
        .filter(product -> product.price == 30000)  
        .forEach(product -> System.out.println(product.name));  
        
        System.out.println("\n reduce() Method in Collection \n");
        Float totalPrice = productsList.stream()  
                .map(product->product.price)  
                .reduce(0.0f,(sum, price)->sum+price);   // accumulating price  
	    System.out.println(totalPrice);  
	    // More precise code   
	    float totalPrice2 = productsList.stream()  
	            .map(product->product.price)  
	            .reduce(0.0f,Float::sum);   // accumulating price, by referring method of Float class  
	    System.out.println(totalPrice2);  
        
	    System.out.println("\n Sum by using Collectors Methods \n");
	    double totalPrice3 = productsList.stream()  
                .collect(Collectors.summingDouble(product->product.price));  
	    System.out.println(totalPrice3);
	    
	    
	    System.out.println("\n Find Max and Min Product Price \n");
	    // max() method to get max Product price   
        Product productA = productsList.stream()  
                        .max((product1, product2)->   
                        product1.price > product2.price ? 1: -1).get();  
          
        System.out.println(productA.price);  
        // min() method to get min Product price  
        Product productB = productsList.stream()  
                .max((product1, product2)->   
                product1.price < product2.price ? 1: -1).get();  
        System.out.println(productB.price);  
        
        System.out.println("\n count() Method in Collection \n");
        // count number of products based on the filter  
        long count = productsList.stream()  
                    .filter(product->product.price<30000)  
                    .count();  
        System.out.println(count);  
        
        System.out.println("\n Convert List into Set \n");
        // Converting product List into Set  
        Set<Float> productPriceList =   
            productsList.stream()  
            .filter(product->product.price < 30000)   // filter product on the base of price  
            .map(product->product.price)  
            .collect(Collectors.toSet());   // collect it as Set(remove duplicate elements)  
        System.out.println(productPriceList);  
	    
        System.out.println("\n Convert List into Map \n");
        // Converting Product List into a Map  
        Map<Integer,String> productPriceMap =   
            productsList.stream()  
                        .collect(Collectors.toMap(p->p.id, p->p.name));  
              
        System.out.println(productPriceMap);  
        
        System.out.println("\n Method Reference in stream \n");
        List<Float> productPriceList1 =   
                productsList.stream()  
                            .filter(p -> p.price > 30000) // filtering data  
                            .map(Product::getPrice)         // fetching price by referring getPrice method  
                            .collect(Collectors.toList());  // collecting as list  
        System.out.println(productPriceList1);  
        
        
        
	    
	    return "Stream";
	}
}
