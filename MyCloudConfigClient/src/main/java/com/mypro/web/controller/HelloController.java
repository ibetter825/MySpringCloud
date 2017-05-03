package com.mypro.web.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	/**
	 * 此处可能会报错：*Could not resolve placeholder 'foo' in value "${foo}"
	 * 解决：client的application中name的名字必须与config server连接的git地址的配置文件名一致, 此处的名字就为: config-client-dev.properties, 对应git仓库的文件名
	 */
	@Value("${foo}")
    String foo;
	
	@RequestMapping("/hi")
	public String hi(){
		return "cloud config client:" + foo;
	}
}
