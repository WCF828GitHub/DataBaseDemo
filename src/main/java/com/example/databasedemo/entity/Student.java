package com.example.databasedemo.entity;

import lombok.Data;

import java.util.Date;

/**
 * @author apple
 * @title: Student
 * @projectName DataBaseDemo
 * @description: TODO
 * @date 2022/4/415:06
 */
@Data
public class Student {
   private int id;
   private String name;
   private String address;
   private int mobile;
   private Date  birthday;
   private String passWord;
}
