package com.demo;

import com.info.Student;

public class App 
{
    public static void main( String[] args )
    {
    	Student s=new Student(20, null, null, 60.40);
    	s.setSid(10);
    	s.setScity("pune"); 
    	s.setSname("lover");
    	s.setSpercetnage(20.30);
    	System.out.println("Id="+s.getSid());
    	System.out.println("Name="+s.getSname());
    	System.out.println("City="+s.getScity());
    	System.out.println("per="+s.getSpercetnage());
    	
    }
}
