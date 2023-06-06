package com.demo.service.user;

import com.demo.model.Student;
import com.demo.model.UserDomain;
import com.github.pagehelper.PageInfo;

import java.util.List;

public interface StudentService {
    List<Student> findAll();
}
