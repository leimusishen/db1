package com.demo.dao;


import com.demo.model.TeacherCource;

import java.util.List;

public interface TeacherCourceDao {
    void insertTeacherCource( TeacherCource teachercource);
    void updateTeacherCource(TeacherCource teachercource);
    void deleteTeacherCource(int teachercourceId);
    TeacherCource getTeacherCourceById(int teachercourceId);
    List<TeacherCource> getAllTeacherCource();
    List<TeacherCource> findAll();
}
