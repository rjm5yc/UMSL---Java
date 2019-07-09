package com.learning.springframework;

public class Student {

	private String address;
	private String GPA;
	
	public Student(){
	
	}
	
	public Student(String address, GPA){
			this.address = address;
			this.GPA = GPA;
	}
	
	public void getName(){
		System.out.println("Rich Mehan");
	}
	public void getSSN(){
		System.out.println("642189473");
	}

	@Override
	public String toString() {
		
		System.out.println("Address : "+address+" GPA : "+GPA);
		return super.toString();
	}
}
