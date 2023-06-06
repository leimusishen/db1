package com.demo.service.user;

import com.demo.model.UserDomain;
import com.github.pagehelper.PageInfo;

public interface UserService {

    int addUser(UserDomain user);

    PageInfo<UserDomain> findAllUser(int pageNum, int pageSize);
}
