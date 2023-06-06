package com.demo.controller;


import com.demo.dao.StudentCourceDao;
import com.demo.model.StudentCource;
import com.demo.service.user.StudentCourceService;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/studentcource")
public class StudentCourceController {

    @Resource
    private StudentCourceService studentcourceService;

    @Resource
    private StudentCourceDao studentcourceDao;

    @GetMapping("/add")
    public String showAddStudentCourceForm(Model model) {
        model.addAttribute("studentcource", new StudentCource());
        return "add-studentcource";
    }
//
//    @PostMapping("/add")
//    public String addStudent(@ModelAttribute("student") Student student) {
//        studentService.addStudent(student);
//        return "redirect:/student/all";
//    }

    @GetMapping("/all")
    public Object showAllStudentCource(Model model) {
        return studentcourceService.findAll();
    }


    @GetMapping("/all/dao")
    public Object showCourceFromDao(Model model) {
        return studentcourceDao.findAll();
    }

    // Add other methods for updating, deleting, and retrieving students
}
