package com.demo.dao;


import com.demo.model.Teacher;

import java.util.List;

public interface TeacherDao {
    void insertTeacher(Teacher teacher);
    void updateTeacher(Teacher teacher);
    void deleteTeacher(int teacherId);
    Teacher getTeacherById(int teacherId);
    List<Teacher> getAllTeacher();
    List<Teacher> findAll();
}
