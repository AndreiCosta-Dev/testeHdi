package com.andreicosta.apiBroker.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.andreicosta.apiBroker.domain.BrokerData;
import com.andreicosta.apiBroker.services.BrokerDataService;
import java.util.List;
import java.util.Arrays;



@RestController
@RequestMapping(value = "/brokerdata/{document}/", method = RequestMethod.GET)
public class BrokerDataResources {
	
	@Autowired
	BrokerDataService brokerDataService;
	
	@GetMapping("/")
	public ResponseEntity<BrokerData> getBrokerData(@PathVariable String document) {
		
		ResponseEntity<BrokerData> corretor = brokerDataService.buscaBrokerData(document);

		return corretor;
	}

}
