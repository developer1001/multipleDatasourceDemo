package com.idea.mulds;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = {"com.idea.mulds.persistent.dao"})
public class MuldsApplication {

	public static void main(String[] args) {
		SpringApplication.run(MuldsApplication.class, args);
	}

}
