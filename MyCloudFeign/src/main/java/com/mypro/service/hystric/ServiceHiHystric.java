package com.mypro.service.hystric;

import org.springframework.stereotype.Component;

import com.mypro.service.HiService;

@Component
public class ServiceHiHystric implements HiService {

	public String sayHiFromClient(String name) {
		return "sorry " + name + "调用服务失败，进入断路器";
	}

}
