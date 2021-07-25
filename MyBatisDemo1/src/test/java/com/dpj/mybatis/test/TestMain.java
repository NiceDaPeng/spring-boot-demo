package com.dpj.mybatis.test;

import com.dpj.mybatis.bean.User;
import com.dpj.mybatis.dao.UserDao;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import javax.xml.bind.annotation.XmlAnyAttribute;

public class TestMain {


    @Test
    public void test01(){
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(Thread.currentThread().getContextClassLoader().getResourceAsStream("mybatis-config.xml"));
        SqlSession sqlSession = sqlSessionFactory.openSession(true);
        UserDao mapper = sqlSession.getMapper(UserDao.class);
        User lisi = mapper.getUserByName("qianqi");
        System.out.println("lisi = " + lisi);
    }
}
