package com.mypro.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mypro.service.HiService;

@RestController
public class HiController {
	
	@Autowired
	private HiService hiService;
	
	@RequestMapping("/hi/{name}")
	public String hi(@PathVariable("name") String name){
		return hiService.sayHiFromClient(name);
	}
}
