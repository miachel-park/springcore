package pe.miachel.springcore.example03;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(ApplicationConfig.class);
		Student student10 = ctx.getBean("student10", Student.class);
		System.out.println(student10.getName());
		System.out.println(student10.getAge());
		System.out.println(student10.getHobbys());
		System.out.println(student10.getHeight());
		System.out.println(student10.getWeight());

		Student student20 = ctx.getBean("student20", Student.class);
		System.out.println(student20.getName());
		System.out.println(student20.getAge());
		System.out.println(student20.getHobbys());
		System.out.println(student20.getHeight());
		System.out.println(student20.getWeight());
		
		ctx.close();
	}

}
