package pe.miachel.springcore.example04;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("create application context");
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
		
		System.out.println("load application context");
		ctx.load("classpath:applicationCTX03.xml");
		
		System.out.println("refresh appliation context");
		ctx.refresh();

		System.out.println("get Student01 bean");
		Student student01 = ctx.getBean("student01", Student.class);
		
		ctx.close();
	}

}
