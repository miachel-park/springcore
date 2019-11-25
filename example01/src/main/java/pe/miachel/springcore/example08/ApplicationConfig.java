package pe.miachel.springcore.example08;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

@Configuration
public class ApplicationConfig {
	
	@Value("${admin.id}")
	String adminID;
	@Value("${admin.pw}")
	String adminPW;
	@Value("${sub_admin.id}")
	String subAdminID;
	@Value("${sub_admin.pw}")
	String subAdminPW;
	
	@Bean
	public static PropertySourcesPlaceholderConfigurer Properties() {
		PropertySourcesPlaceholderConfigurer configurer = new PropertySourcesPlaceholderConfigurer();
		
		Resource[] locations = new Resource[2];
		locations[0] = new ClassPathResource("admin.property");
		locations[1] = new ClassPathResource("sub_admin.property");
		configurer.setLocations(locations);
		
		return configurer;
	}
	
	@Bean
	public AdminConnection adminConnection() {
		AdminConnection adminConn = new AdminConnection();
		
		adminConn.setAdminID(adminID);
		adminConn.setAdminPW(adminPW);
		adminConn.setSubAdminID(subAdminID);
		adminConn.setSubAdminPW(subAdminPW);
		
		return adminConn;
	}

}
