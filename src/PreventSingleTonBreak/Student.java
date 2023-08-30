package PreventSingleTonBreak;

public class Student {   
	private static Student student;
	
	private Student(){  
		if(student!=null) 
			throw new RuntimeException("message:You are trying to break singleTonclass your laptop will crash");
		
		
	}  
	
	
	public static Student getStudent() { 
		if(student==null) {
			 student=new Student();
		}
		return  student;
		
	} 
	
	
	
	

}
