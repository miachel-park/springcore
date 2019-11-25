package pe.miachel.springcore.example06;

import java.util.Map;
import java.util.Map.Entry;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.EnvironmentAware;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.Environment;

// Environment interface의 setEnvironmet()를 implement하면 bean이 생설될 때 environment object를 설정해줌
// 해당 Environment object로 부터 container로 로드된 전체 Environment를 얻어올 수 있음
public class AdminConnection implements DisposableBean, InitializingBean, EnvironmentAware {
	private Environment env;
	private String adminID;
	private String adminPW;
	
	@Override
	public void setEnvironment(Environment environment) {
		// TODO Auto-generated method stub
		this.env = environment;
		System.out.println("assign environment object");
		
		Map<String, Object> systemEnv = ((ConfigurableEnvironment)this.env).getSystemEnvironment();
		for (Entry<String, Object> elem : systemEnv.entrySet()) {
			System.out.println(elem.getKey() +"=[" + elem.getValue().toString() + "]");
			
		}
		
		System.out.println("==============================================================================================");
		Map<String, Object> systemProperties = ((ConfigurableEnvironment)this.env).getSystemProperties();
		for (Entry<String, Object> elem : systemProperties.entrySet()) {
			System.out.println(elem.getKey() +"=[" + elem.getValue().toString() + "]");
			
		}
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Set admin ID/PW from enviroment");
		this.adminID = env.getProperty("admin.id");
		this.adminID = env.getProperty("admin.pw");
	}

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

	@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub

	}

}
