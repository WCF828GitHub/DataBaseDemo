package com.example.databasedemo.mapper;


import com.example.databasedemo.entity.Student;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author apple
 * @title: StudentMapper
 * @projectName DataBaseDemo
 * @description: TODO
 * @date 2022/4/415:39
 */
@Mapper
public interface StudentMapper {
    Student login(Student student);
}
