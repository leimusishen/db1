package com.demo.controller;


import com.demo.dao.TeacherCourceDao;
import com.demo.model.TeacherCource;
import com.demo.service.user.TeacherCourceService;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/teachercource")
public class TeacherCourceController {

    @Resource
    private TeacherCourceService teachercourceService;

    @Resource
    private TeacherCourceDao teachercourceDao;

    @GetMapping("/add")
    public String showAddCourceForm(Model model) {
        model.addAttribute("teachercource", new TeacherCource());
        return "add-teachercource";
    }
//
//    @PostMapping("/add")
//    public String addStudent(@ModelAttribute("student") Student student) {
//        studentService.addStudent(student);
//        return "redirect:/student/all";
//    }

    @GetMapping("/all")
    public Object showAllTeacherCource(Model model) {
        return teachercourceService.findAll();
    }


    @GetMapping("/all/dao")
    public Object showTeacherCourceFromDao(Model model) {
        return teachercourceDao.findAll();
    }

    // Add other methods for updating, deleting, and retrieving students
}
