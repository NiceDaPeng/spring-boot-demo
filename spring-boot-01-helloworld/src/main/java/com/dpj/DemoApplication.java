package com.dpj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @SpringBootApplication
 * 声明springboot的入口类、说明这个项目是一个springboot项目
 */
@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {

        //使用SpringApplication的静态方法run来启动springboot程序
        SpringApplication.run(DemoApplication.class,args);
    }
}
