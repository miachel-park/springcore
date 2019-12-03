package pe.miachel.springcore.example13;

import org.springframework.beans.factory.annotation.Autowired;

public class Grade {
	@Autowired
	private Student student;
	private int grade;
	//@Autowired(required = false)
	private String subjectName;
	
	public Student getStudent() {
		return student;
	}	
	public void setStudent(Student student) {
		this.student = student;
	}
	
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	
	public String getSubjectName() {
		return this.subjectName;
	}
	public void setSubjectName(String name) {
		this.subjectName = name;
	}
}
