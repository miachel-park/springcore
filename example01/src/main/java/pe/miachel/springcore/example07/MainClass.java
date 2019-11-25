package pe.miachel.springcore.example07;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:applicationCTX07.xml");
		
		AdminConnection adminConn = ctx.getBean("adminConnection", AdminConnection.class);
		System.out.println(adminConn.getAdminID());
		System.out.println(adminConn.getAdminPW());
		System.out.println(adminConn.getSubAdminID());
		System.out.println(adminConn.getSubAdminPW());
		
		ctx.close();
	}

}
