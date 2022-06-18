package com.surya.test;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.validation.Errors;
import org.springframework.validation.MapBindingResult;
import org.springframework.validation.ObjectError;

import com.surya.beans.Course;
import com.surya.beans.Student;
import com.surya.beans.TokenMachine;
import com.surya.validations.StudentValidator;



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
//		TokenMachine tokenMachine=(TokenMachine)ctx.getBean("tokenmachine");
//		System.out.println(tokenMachine.getToken().getTokenId());
//		System.out.println(tokenMachine.getToken().getTokenId());
		
		Student student1=(Student)ctx.getBean("student");
		StudentValidator studentValidator=(StudentValidator)ctx.getBean("validate");
		Map<String,ObjectError> map=new HashMap();
		MapBindingResult bindingResult=new MapBindingResult(map, "com.surya.beans.Student");
		studentValidator.validate(student1, bindingResult);
		List<ObjectError> errors=bindingResult.getAllErrors();
		for( ObjectError errror: errors)
		{
			System.out.println(errror);
		}
		
		}
	}
