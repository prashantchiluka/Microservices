package com.neo.eureka.client.one;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@RestController
public class ClientOneController {

	@RequestMapping("getData")
	@HystrixCommand(fallbackMethod="getFallBackData")
	public Data getData(){
		if(true){
			throw new RuntimeException();
		}
		
		Data data = new Data();
		data.setDataType("String");
		data.setId(1);
		data.setName("name");
		data.setValue("value");
		return data;
	}
	
	public Data getFallBackData(){
		Data data = new Data();
		data.setDataType("ClientOneController Fall Back String");
		data.setId(2);
		data.setName("ClientOneController Fall Back name");
		data.setValue(" ClientOneController Fall Back value");
		return data;
	}
	
	
}
