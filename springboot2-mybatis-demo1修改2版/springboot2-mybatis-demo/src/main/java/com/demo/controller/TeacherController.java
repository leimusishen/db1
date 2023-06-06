package com.demo.controller;


import com.demo.dao.TeacherDao;
import com.demo.model.Teacher;
import com.demo.service.user.TeacherService;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/teacher")
public class TeacherController {

    @Resource
    private TeacherService teacherService;

    @Resource
    private TeacherDao teacherDao;

    @GetMapping("/add")
    public String showAddTeacherForm(Model model) {
        model.addAttribute("teacher", new Teacher());
        return "add-teacher";
    }
//
//    @PostMapping("/add")
//    public String addStudent(@ModelAttribute("student") Student student) {
//        studentService.addStudent(student);
//        return "redirect:/student/all";
//    }

    @GetMapping("/all")
    public Object showAllTeacher(Model model) {
        return teacherService.findAll();
    }


    @GetMapping("/all/dao")
    public Object showTeacherFromDao(Model model) {
        return teacherDao.findAll();
    }

    // Add other methods for updating, deleting, and retrieving students
}
