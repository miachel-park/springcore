package pe.miachel.springcore.example05;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
		ctx.load("classpath:applicationCTX05.xml");
		ctx.refresh();
		
		Student student1 = ctx.getBean("student01", Student.class);
		System.out.println("name : " + student1.getName());
		System.out.println("age  : " + student1.getAge());
		System.out.println("===================================================");

		Student student2 = ctx.getBean("student01", Student.class);
		student2.setName("홍순자");
		student2.setAge(89);
		System.out.println("name of student1  : " + student1.getName());
		System.out.println("age  of student1  : " + student1.getAge());
		System.out.println("name of student2  : " + student2.getName());
		System.out.println("age  of student2  : " + student2.getAge());
		System.out.println("===================================================");
		
		if ( student1.equals(student2) ) {
			System.out.println("student1 == student2 ");
		} else {
			System.out.println("student1 != student2 ");
		}
		
		Student student3 = ctx.getBean("student02", Student.class);
		System.out.println("name : " + student3.getName());
		System.out.println("age  : " + student3.getAge());
		System.out.println("===================================================");
		
		
		Student student4 = ctx.getBean("student02", Student.class);
		student4.setName("홍순자");
		student4.setAge(89);
		System.out.println("name of student3 : " + student3.getName());
		System.out.println("age  of student3 : " + student3.getAge());
		System.out.println("name of student4 : " + student4.getName());
		System.out.println("age  of student4 : " + student4.getAge());
		System.out.println("===================================================");
		
		if ( student3.equals(student4) ) {
			System.out.println("student3 == student4 ");
		} else {
			System.out.println("student3 != student4 ");
		}
		ctx.close();
	}

}
