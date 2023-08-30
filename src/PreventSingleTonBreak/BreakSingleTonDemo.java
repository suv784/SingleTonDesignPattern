package PreventSingleTonBreak;

import java.lang.reflect.Constructor;

public class BreakSingleTonDemo {
	public static void main(String[] args) throws Exception {
		Student student5 = Student.getStudent();
		System.out.println(student5.hashCode());
		Constructor<Student> constructor = Student.class.getDeclaredConstructor();
		constructor.setAccessible(true);
		Student s3 = constructor.newInstance();
		System.out.println(s3.hashCode());
		if (student5.hashCode() != s3.hashCode())
			System.out.println("SingleTonClassBreak");
		else
			System.out.println("SingleTonClasNotBreak"); 

	}

}
