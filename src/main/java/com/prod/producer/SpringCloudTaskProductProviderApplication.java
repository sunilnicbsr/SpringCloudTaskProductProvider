package com.prod.producer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
@EnableHystrix
@EnableFeignClients
public class SpringCloudTaskProductProviderApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudTaskProductProviderApplication.class, args);
	}

}
