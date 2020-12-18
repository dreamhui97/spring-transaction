package com.bjpowernode.dao;

import com.bjpowernode.domain.Student;

public interface StudentDao {
    int updateStudent(Student student);//修改年龄
    Student selectStudent(Integer studentId);
}
