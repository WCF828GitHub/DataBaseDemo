package com.example.databasedemo.service;

import com.example.databasedemo.entity.Student;
import org.springframework.stereotype.Service;

/**
 * @author apple
 * @title: StudentService
 * @projectName DataBaseDemo
 * @description: TODO
 * @date 2022/4/415:25
 */

public interface StudentService {
    Student login(Student student);
}
