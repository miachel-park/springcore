package pe.miachel.springcore.example02;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractApplicationContext ctx = new GenericXmlApplicationContext(
				"classpath:applicationCTX01.xml", "classpath:applicationCTX02.xml");
		
		Student student01 = ctx.getBean("student1", Student.class);
		System.out.println(student01.getName());
		System.out.println(student01.getHobbys());
		
		StudentInfo studentInfo = ctx.getBean("studentInfo01", StudentInfo.class);
		Student student02 = studentInfo.getStudent();
		System.out.println(student02.getName());
		System.out.println(student02.getHobbys());
		
		if ( student02.equals(student01) ) {
			System.out.println("student01 == student02");
		}
		
		Student student03 = ctx.getBean("student3", Student.class);
		System.out.println(student03.getName());
		System.out.println(student03.getHobbys());
		
		if ( student01.equals(student03) ) {
			System.out.println("student01 == student03");
		} else {
			System.out.println("student01 != student03");
		}
		
		Family family = ctx.getBean("family", Family.class);
		System.out.println(family.getPapaName());
		System.out.println(family.getMamiName());
		System.out.println(family.getSisterName());
		System.out.println(family.getBrotherName());
		
		ctx.close();

	}

}
