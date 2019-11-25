package pe.miachel.springcore.example06;

import java.io.IOException;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.MutablePropertySources;
import org.springframework.core.io.support.ResourcePropertySource;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConfigurableApplicationContext ctx = new GenericXmlApplicationContext();
		// context에서 environment object를 얻어서 environmet object에서 복수개의 property를 얻어옴
		ConfigurableEnvironment env = ctx.getEnvironment();
		MutablePropertySources propertySources = env.getPropertySources();
		
		try {
			propertySources.addLast(new ResourcePropertySource("classpath:admin.property"));
			
			System.out.println("admin.id=[" + env.getProperty("admin.id") + "]");
			System.out.println("addmin.pw=[" + env.getProperty("admin.pw") + "]");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		GenericXmlApplicationContext gCtx = (GenericXmlApplicationContext)ctx;
		gCtx.load("classpath:applicationCTX06.xml");
		gCtx.refresh();
		
		AdminConnection adminConn = gCtx.getBean("adminConnection", AdminConnection.class);
		System.out.println("admin.id = [" + adminConn.getAdminID() +"] from AdminConnection");
		System.out.println("admin.pw = [" + adminConn.getAdminPW() +"] from AdminConnection");
		
		gCtx.close();
		ctx.close();
	}

}
