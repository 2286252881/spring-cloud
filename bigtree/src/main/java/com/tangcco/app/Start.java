package com.tangcco.app;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableAsync;

@EnableAutoConfiguration
@ComponentScan(basePackages = { "com.tangcco.news.service", "com.tangcco.news.controller", "com.tangcco.other.service",
		"com.tangcco.other.controller", "com.tangcco.cases.service", "com.tangcco.cases.controller",
		"com.tangcco.employee.service", "com.tangcco.employee.controller", "com.tangcco.manager.service",
		"com.tangcco.manager.controller", "com.tangcco.log" })
@MapperScan(basePackages = { "com.tangcco.news.mapper", "com.tangcco.other.mapper", "com.tangcco.cases.mapper",
		"com.tangcco.employee.mapper", "com.tangcco.manager.mapper" })
@EnableCaching // 开启缓存
@EnableAsync // 开启多线程
public class Start {

	public static void main(String[] args) {
		SpringApplication.run(Start.class, args);
	}

}
