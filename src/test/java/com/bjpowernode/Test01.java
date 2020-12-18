package com.bjpowernode;

import com.bjpowernode.service.AddStudentService;
import com.bjpowernode.service.AddStudentServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test01 {
    @Test
    public void testAdd(){
        String configLocation = "applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(configLocation);
        AddStudentService addStudentService = (AddStudentService) ac.getBean("AddStudentServiceImpl");

        addStudentService.add((Integer) 10,(Integer) 22);
    }
}
