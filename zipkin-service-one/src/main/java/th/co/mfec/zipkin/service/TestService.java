package th.co.mfec.zipkin.service;

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
	
	public String callZipkinServiceTwo() {
		ResponseEntity<String> response = restTemplate.getForEntity("http://zipkin-service-two/zipkin-service-two/test/returnInfo", String.class);
		return response.getBody();
	}
	
}
