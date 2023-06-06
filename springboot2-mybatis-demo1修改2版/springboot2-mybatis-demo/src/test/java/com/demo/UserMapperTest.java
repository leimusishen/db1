package com.demo;

import com.demo.dao.UserDao;
import com.demo.model.UserDomain;
import org.junit.Test;

import javax.annotation.Resource;

public class UserMapperTest extends ApplicationTests {
    @Resource
    UserDao userDao;

    @Test
    public void test() {
        userDao.insert(new UserDomain());
    }
}
