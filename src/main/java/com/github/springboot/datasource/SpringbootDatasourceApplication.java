package com.github.springboot.datasource;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = {"com.github.springboot.datasource.mapper"})
public class SpringbootDatasourceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootDatasourceApplication.class, args);
	}
}
