package com.dpj.spring.aop.math.log;

import java.lang.reflect.Method;

public class MyLogging {

    public static void before(Object obj, Method method, String params){
        System.out.println("对象："+obj +",方法"+method.getName()+",参数"+params);
    }

    public static void after(Object obj,Method method,String result){
        System.out.println("对象："+obj+",方法"+method.getName()+",结果："+result);
    }
}
