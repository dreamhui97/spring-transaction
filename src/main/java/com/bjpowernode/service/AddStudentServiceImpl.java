package com.bjpowernode.service;

import com.bjpowernode.dao.SchoolDao;
import com.bjpowernode.dao.StudentDao;
import com.bjpowernode.domain.School;
import com.bjpowernode.domain.Student;
import com.bjpowernode.excep.NotEnoughException;
import org.springframework.transaction.annotation.Transactional;


public class AddStudentServiceImpl implements AddStudentService {
    private SchoolDao schoolDao;
    private StudentDao studentDao;

    public void setSchoolDao(SchoolDao schoolDao) {
        this.schoolDao = schoolDao;
    }

    public void setStudentDao(StudentDao studentDao) {
        this.studentDao = studentDao;
    }
    //@Transactional
    public void add(Integer age, Integer stuid) {
        School school = new School();
        school.setAge(age);
        school.setStuid(stuid);

        schoolDao.insertSchool(school);
        Student student = studentDao.selectStudent(stuid);
        if (student==null){
            throw new NullPointerException("查询不到该学生");
        }else if (student.getAge().intValue() < age.intValue()){
            throw new NotEnoughException("提供的修改年龄值过高");
        }
        student.setAge(age);
        studentDao.updateStudent(student);
    }


}
