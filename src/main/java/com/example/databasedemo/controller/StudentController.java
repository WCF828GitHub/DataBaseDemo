package com.example.databasedemo.controller;

import com.example.databasedemo.entity.Student;
import com.example.databasedemo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author apple
 * @title: StudentController
 * @projectName DataBaseDemo
 * @description: TODO
 * @date 2022/4/414:54
 */
@Controller
public class StudentController {
    @Autowired
    StudentService studentService;
    @RequestMapping("login")
    @ResponseBody
    public String login(Student student){
        if(!StringUtils.isEmpty(student.getName()) && !StringUtils.isEmpty(student.getPassWord())){
            System.out.println(student);
        Student student1= studentService.login(studentService.login(student));
            System.out.println(student1);
        }
        return "helloWorld";
    };
}
