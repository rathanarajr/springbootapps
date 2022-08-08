package com.dxc.rest.spec;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LMAARController {
	
	@RequestMapping(method = RequestMethod.GET, value = "/api/lm/ar")
	public String sayHello() {
		return "Hello LMA AR Stakeholder, Containerized version of Sample Application is running on JBOSS EAP 7.4. Please load other applications binary/archive on LIBO to containerize other applications";
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/api/lm/ar")
	public String add(String umrId) {
		return "Request submitted successfully";
	}
	
	@RequestMapping(method = RequestMethod.DELETE, value = "/api/lm/ar")
	public String delete(String umrId) {
		return "Request deleted successfully";
	}
}
