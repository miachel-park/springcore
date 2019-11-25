package pe.miachel.springcore.example09;

import java.util.Scanner;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String config = null;
		
		Scanner scanner = new Scanner(System.in);
		String str = scanner.next();
		
		if ( str.equals("run") ) config = "run";
		else config = "dev";
		
		scanner.close();
		
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
		// Environment에  setActiveProfiles를 설정하여   xml config에 해당하는  설정을 load
		ctx.getEnvironment().setActiveProfiles(config);
		ctx.load("applicationCTX08_dev.xml", "applicationCTX08_run.xml");
		ctx.refresh();
		
		ServerInfo serverInfo = ctx.getBean("serverInfo", ServerInfo.class);
		System.out.println("ip : " + serverInfo.getIp());
		System.out.println("port : " + serverInfo.getPort());
		ctx.close();

	}

}
