package com.mypro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * 参考: http://blog.csdn.net/liaokailin/article/details/51307215
 * 	    http://blog.csdn.net/column/details/15197.html
 * @author user
 *
 */
@EnableConfigServer //开启配置服务器
@SpringBootApplication
public class Application {
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
