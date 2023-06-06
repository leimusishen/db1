package com.demo;

import com.demo.dao.StudentDao;
import com.demo.dao.UserDao;
import com.demo.model.UserDomain;
import net.minidev.json.JSONArray;
import org.junit.Test;

import javax.annotation.Resource;

public class StudentMapperTest extends ApplicationTests {
    @Resource
    StudentDao studentDao;

    @Test
    public void test() {
        System.out.println(JSONArray.toJSONString(studentDao.findAll()));
    }
}
