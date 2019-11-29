package com.neo.eureka.client.two;

import org.springframework.stereotype.Component;

@Component
public class FeignClientTestImpl implements IFeignClientTest{

	@Override
	public Data getData123() {
		Data data = new Data();
		data.setId(0);
		data.setName("FeignClientTestImpl fall back.");
		return data;
	}
	
	@Override
	public String getObject() {
		return "asdfasdfas";
	}
}
