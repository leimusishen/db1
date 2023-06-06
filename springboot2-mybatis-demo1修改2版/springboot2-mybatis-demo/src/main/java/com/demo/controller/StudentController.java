package com.demo.controller;


import com.demo.dao.StudentDao;
import com.demo.model.Student;
import com.demo.service.user.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Resource
    private StudentService studentService;

    @Resource
    private StudentDao studentDao;

    @GetMapping("/add")
    public String showAddStudentForm(Model model) {
        model.addAttribute("student", new Student());
        return "add-student";
    }
//
//    @PostMapping("/add")
//    public String addStudent(@ModelAttribute("student") Student student) {
//        studentService.addStudent(student);
//        return "redirect:/student/all";
//    }

    @GetMapping("/all")
    public Object showAllStudents(Model model) {
        return studentService.findAll();
    }


    @GetMapping("/all/dao")
    public Object showStudentFromDao(Model model) {
        return studentDao.findAll();
    }

    // Add other methods for updating, deleting, and retrieving students
}
