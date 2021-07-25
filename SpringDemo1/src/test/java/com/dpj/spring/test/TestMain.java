package com.dpj.spring.test;

import com.dpj.spring.aop.math.MathI;
import com.dpj.spring.aop.math.impl.MathImpl;
import com.dpj.spring.aop.math.proxy.MathProxy;
import com.dpj.spring.mod.Person;
import com.dpj.spring.mod.Student;
import com.dpj.spring.mod.Teacher;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {

    private ClassPathXmlApplicationContext classPathXmlApplicationContext;

    @Test
    public void test01() {

//        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("application.xml");
        ApplicationContext ac = new ClassPathXmlApplicationContext("application.xml");
        Person person = ac.getBean("person", Person.class);
        System.out.println(person);
        Student s1 = ac.getBean("s1", Student.class);
        System.out.println(s1);
        Teacher t1 = ac.getBean("t1", Teacher.class);
        System.out.println(t1);
        Teacher t2 = ac.getBean("t2", Teacher.class);
        System.out.println(t2);
        Teacher t3 = ac.getBean("t3", Teacher.class);
        System.out.println(t3);


    }

    @Test
    public void test02(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("factory-bean.xml");
        Object factory = ac.getBean("factory");
        System.out.println(factory);
    }

    @Test
    public void test03(){
        MathI math = new MathImpl();
        int result = math.add(10, 10);
        System.out.println(result);
    }
}
