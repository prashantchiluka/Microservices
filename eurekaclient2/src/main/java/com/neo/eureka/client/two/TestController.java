package com.neo.eureka.client.two;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class TestController {

	@Autowired
	private IFeignClientTest feignClientTest;
	
//	@Autowired
//	private RestTemplate restTemplate;
	
	
	/*@RequestMapping("getDataFromClient1")
	public Data getDataFromClient1(){
		Data data =	restTemplate.getForObject("http://service-one/getData", Data.class);
		return data;
	}*/
	
	@RequestMapping("getDataFromFeignClient")
	public Data getDataFromFeignClient(){
		return feignClientTest.getData123();
	}
}
