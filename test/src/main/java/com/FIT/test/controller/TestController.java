package com.FIT.test.controller;



import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.FIT.test.businessObjects.Data;

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
	public String HighestAmongNeighbours(int[] arr) { 
    	
    	String ans = "";
    	return ans;
	
	}
    
    @RequestMapping("/returnAll")
	public List<Data> returnAll() { 
    	
    	List<Data> ans = new ArrayList<>();
    	return ans;
	
	}
}