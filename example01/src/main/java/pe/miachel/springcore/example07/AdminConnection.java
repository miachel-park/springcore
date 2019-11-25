package pe.miachel.springcore.example07;

import java.util.Map;
import java.util.Map.Entry;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.EnvironmentAware;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.Environment;

// Environment interface의 setEnvironmet()를 implement하면 bean이 생설될 때 environment object를 설정해줌
// 해당 Environment object로 부터 container로 로드된 전체 Environment를 얻어올 수 있음
public class AdminConnection implements DisposableBean, InitializingBean {
	
	private String adminID;
	private String adminPW;
	private String subAdminID;
	private String subAdminPW;
	
	public String getAdminID() {
		return adminID;
	}

	public void setAdminID(String adminID) {
		this.adminID = adminID;
	}

	public String getAdminPW() {
		return adminPW;
	}

	public void setAdminPW(String adminPW) {
		this.adminPW = adminPW;
	}

	public String getSubAdminID() {
		return subAdminID;
	}

	public void setSubAdminID(String subAdminID) {
		this.subAdminID = subAdminID;
	}

	public String getSubAdminPW() {
		return subAdminPW;
	}

	public void setSubAdminPW(String subAdminPW) {
		this.subAdminPW = subAdminPW;
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
	}

	@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub

	}

}
