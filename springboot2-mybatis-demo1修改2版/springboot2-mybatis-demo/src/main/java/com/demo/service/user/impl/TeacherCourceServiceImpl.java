package com.demo.service.user.impl;
import com.demo.dao.TeacherCourceDao;
import com.demo.model.TeacherCource;
import com.demo.service.user.TeacherCourceService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service(value = "teachercourceService")
public class TeacherCourceServiceImpl implements TeacherCourceService {
    @Resource
    TeacherCourceDao teachercourceDao;
    @Override
    public List<TeacherCource> findAll() {
        return teachercourceDao.findAll();
    }
}
