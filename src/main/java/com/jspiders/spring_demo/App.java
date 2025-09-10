package com.jspiders.spring_demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.jspiders.spring_demo.dto.Student;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
    	
    	ApplicationContext context=new ClassPathXmlApplicationContext("META-INF/beans.xml");
    	System.out.println("ioc contaner created");
    	System.out.println(context.getBean(Student.class));
    	
//    	context =new FileSystemXmlApplicationContext();
//    	context =new AnnotationConfigApplicationContext();
    }
}
