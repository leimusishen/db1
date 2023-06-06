package com.demo.controller;


import com.demo.dao.CourceDao;
import com.demo.model.Cource;
import com.demo.service.user.CourceService;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/cource")
public class CourceController {

    @Resource
    private CourceService courceService;

    @Resource
    private CourceDao courceDao;

    @GetMapping("/add")
    public String showAddCourceForm(Model model) {
        model.addAttribute("cource", new Cource());
        return "add-cource";
    }
//
//    @PostMapping("/add")
//    public String addStudent(@ModelAttribute("student") Student student) {
//        studentService.addStudent(student);
//        return "redirect:/student/all";
//    }

    @GetMapping("/all")
    public Object showAllCource(Model model) {
        return courceService.findAll();
    }


    @GetMapping("/all/dao")
    public Object showCourceFromDao(Model model) {
        return courceDao.findAll();
    }

    // Add other methods for updating, deleting, and retrieving students
}
