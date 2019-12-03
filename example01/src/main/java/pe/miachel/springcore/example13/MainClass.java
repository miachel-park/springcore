<<<<<<< HEAD
package pe.miachel.springcore.example13;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenericXmlApplicationContext ctx01 = new GenericXmlApplicationContext();
		ctx01.load("classpath:applicationCTX13.xml");
		ctx01.refresh();
		
		GenericXmlApplicationContext ctx02 = new GenericXmlApplicationContext();
		ctx02.load("classpath:applicationCTX13.xml");
		ctx02.refresh();
		
		System.out.println("Singleton myBean in container01 :" + ctx01.getBean("myBean", OneBean.class).getCreatedTime());
		System.out.println("Singleton myBean in container01 :" + ctx01.getBean("myBean", OneBean.class).toString());
		
		System.out.println("Singleton myBean in container02 :" + ctx02.getBean("myBean", OneBean.class).getCreatedTime());
		System.out.println("Singleton myBean in container02 :" + ctx02.getBean("myBean", OneBean.class).toString());
		
		ctx01.close();
		ctx02.close();
	}

}
=======
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
>>>>>>> branch 'master' of http://github.com/miachel-park/springcore
