package th.co.mfec.eurekaclient.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import th.co.mfec.eurekaclient.service.TestService;

@RestController
public class TestController {
	@Autowired
	private TestService testService;
	
	
	@GetMapping("/test/returnInfo")
	public String returnInfo(){
		return  testService.returnInfo();
	}
	
	
}
