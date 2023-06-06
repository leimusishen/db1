package com.demo.dao;


import com.demo.model.Student;

import java.util.List;

public interface StudentDao{
    void insertStudent(Student student);
    void updateStudent(Student student);
    void deleteStudent(int studentId);
    Student getStudentById(int studentId);
    List<Student> getAllStudents();
    List<Student> findAll();
}
