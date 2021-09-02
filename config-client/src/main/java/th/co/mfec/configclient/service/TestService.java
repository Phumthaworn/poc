package th.co.mfec.configclient.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class TestService {
	@Value("${spring.application.name}")
	private String appName;
	@Value("${server.port}")
	private String appPort;
	@Autowired
	private RestTemplate restTemplate;
	
	
	public String returnInfo() {
		return appName + " " + appPort;
	}
	
	public String callEurekaClientTwo() {
		ResponseEntity<String> response = restTemplate.getForEntity("http://eureka-client-two/eureka-client-two/test/returnInfo", String.class);
		return response.getBody();
	}
	
}
