package com.demo.service.user.impl;
import com.demo.dao.StudentCourceDao;
import com.demo.dao.UserDao;
import com.demo.model.StudentCource;
import com.demo.model.UserDomain;
import com.demo.service.user.StudentCourceService;
import com.demo.service.user.UserService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service(value = "studentcourceService")
public class StudentCourceServiceImpl implements StudentCourceService {
    @Resource
    StudentCourceDao studentcourceDao;
    @Override
    public List<StudentCource> findAll() {
        return studentcourceDao.findAll();
    }
}