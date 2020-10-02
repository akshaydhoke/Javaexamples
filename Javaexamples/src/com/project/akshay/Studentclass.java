package com.project.akshay;

public class Studentclass {
	
	 int rollno;  
	 String name;  
	 String city;  
	  
	 Studentclass(int rollno, String name, String city){  
	 this.rollno=rollno;  
	 this.name=name;  
	 this.city=city;  
	 }  
	 
	@Override
	public String toString() {
		return "Studentclass [rollno=" + rollno + ", name=" + name + ", city=" + city + "]";
	}

	 public static void main(String[] args) {
		
		   Studentclass s1=new Studentclass(101,"aksahy","maha");  
		   
		   System.out.println(s1);
		   
		}  
}
