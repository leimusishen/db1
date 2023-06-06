package com.demo.service.user.impl;
import com.demo.dao.TeacherDao;
import com.demo.model.Teacher;
import com.demo.service.user.TeacherService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service(value = "teacherService")
public class TeacherServiceImpl implements TeacherService {
    @Resource
    TeacherDao teacherDao;
    @Override
    public List<Teacher> findAll() {
        return teacherDao.findAll();
    }
}
