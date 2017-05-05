package com.mypro.web.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@RestController
public class UserController {
	
	@RequestMapping("/user/{name}")
	@HystrixCommand(fallbackMethod = "indexError")
	public String index(@PathVariable("name") String name){
		if(name.equals("null")) throw new RuntimeException();
		return "你好:" + name;
	}
	
	public String indexError(String name){
		return "对不起程序出现错误:" + name;
	}
}
