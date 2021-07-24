package com.dpj;

import com.dpj.config.FoodConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties({FoodConfig.class})
//告诉主程序入口类要自动引入配置文件  配置文件对应的累作为他的参数
public class ApplicationDemo {

    public static void main(String[] args) {

        SpringApplication.run(ApplicationDemo.class,args);
    }
}
