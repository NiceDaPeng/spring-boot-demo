package com.dpj.spring.factory;

import com.dpj.spring.mod.Teacher;
import org.springframework.beans.factory.FactoryBean;

public class MyFactory implements FactoryBean<Teacher> {
    @Override
    public Teacher getObject() throws Exception {
        Teacher teacher = new Teacher();
        teacher.setTname("洪七公");
        teacher.setTsex("男");
        teacher.setTage(30);
        return teacher;
    }

    @Override
    public Class<?> getObjectType() {
        return Teacher.class;
    }
}
