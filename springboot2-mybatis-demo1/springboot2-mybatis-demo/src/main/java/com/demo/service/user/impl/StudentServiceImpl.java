package com.demo.service.user.impl;

import com.demo.dao.StudentDao;
import com.demo.dao.UserDao;
import com.demo.model.Student;
import com.demo.model.UserDomain;
import com.demo.service.user.StudentService;
import com.demo.service.user.UserService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service(value = "studentService ")
public class StudentServiceImpl implements StudentService {
    @Resource
    StudentDao studentDao;
    @Override
    public List<Student> findAll() {
        return studentDao.findAll();
    }
}
