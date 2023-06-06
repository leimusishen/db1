package com.demo.dao;


import com.demo.model.StudentCource;

import java.util.List;

public interface StudentCourceDao {

    void insertStudentCource(StudentCource studentcource);
    void updateStudentCource(StudentCource studentcource);
    void deleteStudentCource(int studentcourceId);
    StudentCource getStudentCourceById(int studentcourceId);
    List<StudentCource> getAllStudentsCource();
    List<StudentCource> findAll();
}