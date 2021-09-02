package th.co.mfec.eurekaclient.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class TestService {
	@Value("${spring.application.name}")
	private String appName;
	@Value("${server.port}")
	private String appPort;
	
	public String returnInfo() {
		return appName + " " + appPort;
	}
	
}
