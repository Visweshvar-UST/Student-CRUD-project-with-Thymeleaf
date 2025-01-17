package com.studentdemo1.studentCRUD1.controller;

import com.studentdemo1.studentCRUD1.model.Student;
import com.studentdemo1.studentCRUD1.service.StudentArrayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/api/v1")
public class StudentViewController {

    @Autowired
    private StudentArrayService studentService;

    @GetMapping("/students")
    public String getAllStudents(Model model) {
        model.addAttribute("students", studentService.getStudents());
        System.out.println("Rendering studentList page");
        return "studentList";
    }

    @PostMapping("/student-view")
    public String createStudent(@ModelAttribute Student student, Model model) {
        studentService.addStudents(student);
        model.addAttribute("students", studentService.getStudents());
        return "redirect:/api/v1/students";
    }
}


