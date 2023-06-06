package com.demo.service.user.impl;
import com.demo.dao.CourceDao;
import com.demo.dao.UserDao;
import com.demo.model.Cource;
import com.demo.model.UserDomain;
import com.demo.service.user.CourceService;
import com.demo.service.user.UserService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service(value = "courceService")
public class CourceServiceImpl implements CourceService {
    @Resource
    CourceDao courceDao;
    @Override
    public List<Cource> findAll() {
        return courceDao.findAll();
    }
}
