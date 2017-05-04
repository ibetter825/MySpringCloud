package com.mypro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
/**
 * 服务注册中心
 * 参考:http://blog.csdn.net/beyannanfei/article/details/52069725
 * @author user
 *
 */
@EnableEurekaServer         //开启eureka服务
@SpringBootApplication      //springBoot注解,spring在springBoot基础之上来构建项目
public class CloudServerApplication {
	//spirng boot的标准入口
    public static void main(String[] args) {
        SpringApplication.run(CloudServerApplication.class, args);
    }
}
