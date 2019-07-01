package com.ljw.dubbo;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableDubboConfiguration//开启dubbo自动配置
@ComponentScan(basePackages={"com.ljw.dubbo"})
@MapperScan(basePackages={"com.ljw.dubbo.mapper"})
public class SpringbootDubboProviderApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootDubboProviderApplication.class, args);
	}

}
