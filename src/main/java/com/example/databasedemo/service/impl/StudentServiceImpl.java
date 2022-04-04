package com.example.databasedemo.service.impl;

import com.example.databasedemo.entity.Student;
import com.example.databasedemo.mapper.StudentMapper;
import com.example.databasedemo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author apple
 * @title: StudentServiceImpl
 * @projectName DataBaseDemo
 * @description: TODO
 * @date 2022/4/415:28
 */
@Service
public class StudentServiceImpl implements StudentService {
@Autowired
private StudentMapper studentMapper;
    @Override
    public Student login(Student student) {
        return studentMapper.login(student);
    }
}
