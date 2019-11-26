package pe.miachel.springcore.example11;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
		ctx.load("classpath:applicationCTX11.xml");
		ctx.refresh();
		
		OtherBean myBean = new OtherBean();
		System.out.println("Injected from ApplicationContextAware" + myBean.get().getName());
		
		ctx.close();
	}

}
