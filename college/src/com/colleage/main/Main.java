package com.colleage.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.colleage.Student;
import com.college.resorces.Applicationcontext;

public class Main {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx= new AnnotationConfigApplicationContext(Applicationcontext.class);
	 Student du= (Student) ctx.getBean("stu");
	 du.display();
	}

}
