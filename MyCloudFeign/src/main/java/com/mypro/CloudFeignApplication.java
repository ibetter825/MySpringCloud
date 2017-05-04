package com.mypro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@EnableFeignClients//通过注解@EnableFeignClients来开启feign
@EnableDiscoveryClient
@SpringBootApplication
public class CloudFeignApplication {
	public static void main(String[] args) {
		SpringApplication.run(CloudFeignApplication.class, args);
	}
}
