package com.mypro.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@Service
public class HelloService {
	@Autowired
	RestTemplate restTemplate;
	
	@HystrixCommand(fallbackMethod = "hiError") //加上@HystrixCommand，并指定fallbackMethod方法。
	public String hiService(String name){
		return restTemplate.getForObject("http://CLOUD-CLIENT-01/hi?name="+name, String.class);
	}
	
	/**
	 * 当service调用服务出错时，会调用此方法并返回固定内容
	 * @param name
	 * @return
	 */
	public String hiError(String name){
		return "Hi," + name + ",调用服务出错！";
	}
}
