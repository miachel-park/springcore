package pe.miachel.springcore.example13;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
	private static Logger logger = LoggerFactory.getLogger(MainClass.class);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
		ctx.load("classpath:applicationCTX13.xml");
		ctx.refresh();
		
		Grade myGrade = ctx.getBean("myGrade", Grade.class);
		System.out.println("Name : " + myGrade.getStudent().getName());
		System.out.println("Age  : " + myGrade.getStudent().getAge());
		System.out.println("Subject Name : " + myGrade.getSubjectName());
		
		ctx.close();

	}

}
