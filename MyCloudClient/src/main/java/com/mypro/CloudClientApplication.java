package com.mypro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * 服务提供者
 * @author user
 *
 */
@EnableDiscoveryClient            //通过该注解，实现服务发现，注册
@SpringBootApplication
@EnableHystrix  //开启断路器
@EnableHystrixDashboard  //开启断路器监控
public class CloudClientApplication {
	public static void main(String[] args) {
        SpringApplication.run(CloudClientApplication.class, args);
    }
}
