package com.neo.eureka.client.two;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Client2Controller {
	
	@Autowired
    private Client1Resource client1Resource;
	
	@RequestMapping("getDataOfData")
	public DataOfData getDataOfData(){
		DataOfData dataOfData = new DataOfData() ;
		dataOfData.setCreatedAt(new Date());
		dataOfData.setCreater("personB");
		dataOfData.setId(1);
		//Data data = client1Resource.getData();
		dataOfData.setData(new Data());
		return dataOfData;
	}
}
