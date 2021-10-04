package com.andreicosta.apiBroker.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.andreicosta.apiBroker.domain.BrokerStats;
import com.andreicosta.apiBroker.services.BrokerStatsService;

@RestController
@RequestMapping(value = "/brokerstats/{code}", method = RequestMethod.GET)
public class BrokerStatsResources {

	@Autowired
	BrokerStatsService brokerStatsService;
	
	@GetMapping("/")
	public ResponseEntity<BrokerStats> getStats(@PathVariable String code ){
		
		ResponseEntity<BrokerStats> stats = brokerStatsService.getStats(code);
		
		return stats;
	}
}
