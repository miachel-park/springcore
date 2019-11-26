package pe.miachel.springcore.example11;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class ApplicationContextAwareImpl implements ApplicationContextAware {

	private Logger logger = LoggerFactory.getLogger(ApplicationContextAwareImpl.class);
	private static ApplicationContext ctx;
	
	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		// TODO Auto-generated method stub
		logger.info("inject applicationContext from Spring container");
		this.ctx = applicationContext;
	}

	public static Object getBean(String name) {
		return ctx.getBean(name);
	}
	
	public static <T> T getBean(String name, Class<T> type) {
		return ctx.getBean(name, type);
	}
}
