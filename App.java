package com.learning.springframework;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	
    	ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
    	
    	Student student = (Student) context.getBean("student");
    			
    	student.getName();
    	
    	student.getSSN();
    	
    	student.toString();
    	
    	((ClassPathXmlApplicationContext) context).close();
    	
    }
}
