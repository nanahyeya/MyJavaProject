package lab.student.entity;

import lab.student.exception.InsufficientGradeException;
import workshop.account.exception.InsufficientBalanceException;

public class Student {
	
	private String studentId;
	private String name;
	private String major;
	private int grade;
	
	
	public Student(String studentId, String name, String major, int grade) {

		this.studentId = studentId;
		this.name = name;
		this.major = major;
		this.grade = grade;
	}
	
	
	public String getStudentId() {
		return studentId;
	}
	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) throws InsufficientGradeException {
		if (grade > 4 || grade < 1) {
			// InsufficientBalanceException 강제로 발생시킴
			String errMessage = String.format("학년은 1 ~ 4 사이여야 합니다.");
			throw new InsufficientGradeException(errMessage);
		}
		this.grade = grade;
	}
	
	

}
