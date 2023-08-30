package DemoSingleTon;

import PreventSingleTonBreak.Student;

public class Driver { 
	public static void main(String[] args) {   
		Student s1=Student.getStudent(); 
		System.out.println(s1.hashCode());
		Student s2=Student.getStudent(); 
		System.out.println(s2.hashCode());   
		
	
		 
		
		
		
	}

}
