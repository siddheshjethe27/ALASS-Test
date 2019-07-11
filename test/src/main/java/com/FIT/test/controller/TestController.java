package com.FIT.test.controller;



import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class TestController 
{
    @CrossOrigin()
    @RequestMapping("/home")
	public String HelloWorld() { 
    	return "Hello World" ;
	
	}
    
    @RequestMapping("/HighestAmongNeighbours")
	public int[] HighestAmongNeighbours(int[] numbers) { 
    	
    	int[] ans = new int[numbers.length];

    	return ans;
	
	}
}