package pe.miachel.springcore.example10;

import org.springframework.context.support.GenericXmlApplicationContext;

/*
 * depended-on, lazy-initialized bean에 대한 example
 * bean의 간접적인 의존관계 즉 singleton bean의 생성 순서를 정의한다.
 */
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
		ctx.load("classpath:applicationCTX10.xml");
		ctx.refresh();
		
		FirstBean fBean = ctx.getBean("firstBean", FirstBean.class);
		System.out.println("First Bean created at " + fBean.getCreatedTime());
		
		SecondBean sBean = ctx.getBean("secondBean", SecondBean.class);
		System.out.println("Second Bean created at " + sBean.getCreatedTime());
		
		// wait for five second
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		LazyBean lazyBean = ctx.getBean("lazyBean", LazyBean.class);
		System.out.println("lazyBean create at " + lazyBean.getCreatedTime());
		
		NormalBean normalBean = ctx.getBean("normalBean", NormalBean.class);
		System.out.println("normalBean created at " + normalBean.getCreatedTime());
		ctx.close();
	}

}
