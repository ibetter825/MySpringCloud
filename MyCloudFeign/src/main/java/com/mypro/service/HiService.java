package com.mypro.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.mypro.service.hystric.ServiceHiHystric;

@FeignClient(value = "CLOUD-CLIENT-01", fallback = ServiceHiHystric.class) //@ FeignClient("服务名")，来指定调用哪个服务，Feign自带断路器
public interface HiService {
	@RequestMapping("/hi")
	public String sayHiFromClient(@RequestParam(value = "name") String name);
}
