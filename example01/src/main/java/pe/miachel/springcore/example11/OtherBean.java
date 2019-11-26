package pe.miachel.springcore.example11;

import org.apache.logging.log4j.core.Logger;
import org.slf4j.LoggerFactory;

public class OtherBean {
	private org.slf4j.Logger logger = LoggerFactory.getLogger(OtherBean.class);
	private SpringManagedBean bean;
	
	public OtherBean() {
		logger.info("inject springManagedBean into no spring managed bean");
		this.bean = (SpringManagedBean) ApplicationContextAwareImpl.getBean("springManagedBean");
	}
	
	public SpringManagedBean get() {
		return this.bean;
	}
}
