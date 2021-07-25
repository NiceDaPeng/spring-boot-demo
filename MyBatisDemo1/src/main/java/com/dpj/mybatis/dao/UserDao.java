package com.dpj.mybatis.dao;

import com.dpj.mybatis.bean.User;

public interface UserDao {

    User getUserByName(String uname);
}
