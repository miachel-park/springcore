package pe.miachel.springcore.example13;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Required;

public class Student {
	Logger logger = LoggerFactory.getLogger(Student.class);
	
	private String name;
	private int age;
	
	public String getName() {
		return name;
	}
	@SuppressWarnings("deprecation")
	@Required
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	@SuppressWarnings("deprecation")
	@Required
	public void setAge(int age) {
		this.age = age;
	}

	
}
