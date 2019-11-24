package pe.miachel.springcore.example03;

import java.util.ArrayList;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {
	
	@Bean
	public Student student10() {
		ArrayList<String> hobbys = new ArrayList<String>();
		hobbys.add("수영");
		hobbys.add("요리");
		
		Student student = new Student("홍길동", 20, hobbys);
		student.setHeight(160);
		student.setWeight(65);
		
		return student;
	}

	@Bean
	public Student student20() {
		ArrayList<String> hobbys = new ArrayList<String>();
		hobbys.add("줄넘기");
		hobbys.add("고무줄놀이");
		
		Student student = new Student("홍길순", 8, hobbys);
		student.setHeight(120);
		student.setWeight(23);
		
		return student;
	}
}
