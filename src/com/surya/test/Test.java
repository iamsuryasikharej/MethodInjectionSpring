package com.surya.test;


import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.surya.beans.Course;
import com.surya.beans.Student;
import com.surya.beans.TokenMachine;



public class Test {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("/com/surya/test/applicationContext.xml");
//		Student student1=(Student)ctx.getBean("student");
//		Student student2=(Student)ctx.getBean("student");
//		Student student3=(Student)ctx.getBean("student");
//		Student student4=(Student)ctx.getBean("student");
//		System.out.println(student1.hashCode());
//		System.out.println(student2.hashCode());
//		System.out.println(student3.hashCode());
//		System.out.println(student4.hashCode());
//		System.out.println(student1.getCourse().hashCode());
//		System.out.println(student2.getCourse().hashCode());
//		System.out.println(student3.getCourse().hashCode());
//		System.out.println(student4.getCourse().hashCode());
		TokenMachine tokenMachine=(TokenMachine)ctx.getBean("tokenmachine");
		System.out.println(tokenMachine.getToken().getTokenId());
		System.out.println(tokenMachine.getToken().getTokenId());

		}
	}
