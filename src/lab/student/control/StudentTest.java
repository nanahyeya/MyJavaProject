package lab.student.control;

import java.util.ArrayList;
import java.util.List;

import lab.student.entity.Student;
import lab.student.exception.InsufficientGradeException;

public class StudentTest extends Student {
	
	public static void main(String[] args) { 
	
		
		List<Student> studentList = new ArrayList<>();		
		
		studentList.add(new Student("1", "±è¹Î¼ö", "ÄÄÇ»ÅÍ°øÇĞ", 3));
		try {
			studentList.get(0).setGrade(5); 
			
		} catch(InsufficientGradeException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
}