package pe.miachel.springcore.example12;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class CommandManagerCoupledSpring implements ApplicationContextAware {
	private Logger logger = LoggerFactory.getLogger(CommandManagerCoupledSpring.class);
	private ApplicationContext appCtx;
	
	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		// TODO Auto-generated method stub
		this.appCtx = applicationContext;
	}

	public AsyncCommand createCommand( ) {
		logger.info("get Bean with ApplicationContextAware");
		return this.appCtx.getBean("myCommand", AsyncCommand.class);
	}
}
