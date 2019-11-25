package pe.miachel.springcore.example08;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(ApplicationConfig.class);
		
		AdminConnection adminConn = ctx.getBean("adminConnection", AdminConnection.class);
		System.out.println(adminConn.getAdminID());
		System.out.println(adminConn.getAdminPW());
		System.out.println(adminConn.getSubAdminID());
		System.out.println(adminConn.getSubAdminPW());
		
		ctx.close();
	}

}
