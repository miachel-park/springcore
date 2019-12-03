package pe.miachel.springcore.example13;

import java.sql.Timestamp;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.DisposableBean;

public class OneBean implements DisposableBean {
	private Logger logger = LoggerFactory.getLogger(OneBean.class);
	final private Timestamp createdTime = new Timestamp(System.currentTimeMillis());
	
	public OneBean() {
		logger.info("OneBean created");
	}
	public String getCreatedTime() {
		return createdTime.toString();
	}
	@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		logger.info("OneBean destoryed" + toString());
	}
}
