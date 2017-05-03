package com.mypro.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mypro.service.HelloService;

@RestController
public class HelloController {
	@Autowired
	private HelloService helloService;
	
	@RequestMapping("/")
	public String index(){
		return "This is ribbon index page";
	}
	
	@RequestMapping("/hi/{name}")
	public String hi(@PathVariable("name") String name){
		return helloService.hiService(name);
	}
}
