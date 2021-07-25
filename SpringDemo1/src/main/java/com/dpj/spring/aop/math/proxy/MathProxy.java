package com.dpj.spring.aop.math.proxy;

import com.dpj.spring.aop.math.impl.MathImpl;
import com.dpj.spring.aop.math.log.MyLogging;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

public class MathProxy {
    //获取目标对象
    private MathImpl mathImpl;

    public Object getProxy(){
        //获取类加载器
        ClassLoader loader = this.getClass().getClassLoader();
        //获取对象实现的所有接口，只有知道实现了哪些接口才知道要实现什么样的功能。
        Class[] inerfaces = mathImpl.getClass().getInterfaces();
        Object o = Proxy.newProxyInstance(loader, inerfaces, new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                MyLogging.before(mathImpl, method, Arrays.toString(args));
                Object result = method.invoke(mathImpl, args);
                MyLogging.after(mathImpl, method, result.toString());
                return result;
            }
        });
        System.out.println(o);
        return o;
    }
}
