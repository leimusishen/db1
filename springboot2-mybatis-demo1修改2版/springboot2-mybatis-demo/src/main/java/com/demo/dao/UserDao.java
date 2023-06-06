package com.demo.dao;


import com.demo.model.UserDomain;

import java.util.List;

public interface UserDao {


    int insert(UserDomain record);



    List<UserDomain> selectUsers();
}