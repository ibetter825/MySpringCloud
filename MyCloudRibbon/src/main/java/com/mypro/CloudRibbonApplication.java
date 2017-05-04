package com.mypro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@EnableDiscoveryClient            //通过该注解，实现服务发现，注册
@SpringBootApplication
@EnableHystrix // 启用断路器，Netflix已经创建了一个名为Hystrix的库来实现断路器模式。 在微服务架构中，多层服务调用是非常常见的。较底层的服务如果出现故障，会导致连锁故障。当对特定的服务的调用达到一个阀值（hystric 是5秒20次） 断路器将会被打开。
public class CloudRibbonApplication {
	public static void main(String[] args) {
        SpringApplication.run(CloudRibbonApplication.class, args);
	}
	
	@Bean
	@LoadBalanced//@LoadBalanced注册表明，这个restRemplate是负载均衡的
	public RestTemplate restTemplate(){
		return new RestTemplate();
	}
}
