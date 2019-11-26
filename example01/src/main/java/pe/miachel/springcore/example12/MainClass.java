package pe.miachel.springcore.example12;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
		ctx.load("classpath:applicationCTX12.xml");
		ctx.refresh();
		
		CommandManager manager = ctx.getBean("commandManager", CommandManager.class);
		CommandManagerCoupledSpring otherManager = ctx.getBean("commandManager2", CommandManagerCoupledSpring.class);
		for ( int i = 0; i < 10; i++ ) {
			System.out.println("call createCommand() " + i + "th ==> " + manager.createCommand().toString());
			System.out.println("=====================================================================================");
			System.out.println("call createCommand() " + i + "th ==> " + otherManager.createCommand().toString());
			System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		}
		
		
		ctx.close();
	}

}
