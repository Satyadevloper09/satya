package com.college.resorces;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.colleage.Adress;
import com.colleage.Student;

@Configuration
public class Applicationcontext 
{
	
	@Bean
	public Student stu()
	{
		
		 Student st=new Student();
		 st.setName("satyavrta");
		 st.setRollno("21cs56");
		 st.setDept("cse");
		 return st;
	}

	@Bean
	public Adress ade()
	{
		 Adress ad=new Adress();
		    ad.setDis("bls");
		    ad.setPin("756026");
		    ad.setBlock("bpl");
		 return ad;
	}
}
