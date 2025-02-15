package com.neo.eureka.client.two;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(value="http://service-one",fallback=FeignClientTestImpl.class)
public interface IFeignClientTest {

	@RequestMapping("/getData")
	public Data getData123();
	@RequestMapping("/getObject")
	public String getObject();
}
