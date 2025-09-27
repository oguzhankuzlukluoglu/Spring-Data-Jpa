package com.oguzhan.controller.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.oguzhan.configuration.DataSource;
import com.oguzhan.configuration.GlobalProperties;
import com.oguzhan.configuration.Server;

@RestController
@RequestMapping("rest/api/property")
public class PropertySourceController {
	
	 @Autowired
	private GlobalProperties globalProperties;

	
	@GetMapping("/datasource")
	public DataSource getDataSource() {
		
		return null;
	}
	
	@GetMapping(value = "/getServers")
	public List<Server> getServers(){
		System.out.println("KEY DEĞERİM : " + globalProperties.getKey());
		return globalProperties.getServers();
	}
	
}
