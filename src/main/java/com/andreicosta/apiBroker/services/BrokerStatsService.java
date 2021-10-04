package com.andreicosta.apiBroker.services;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

import com.andreicosta.apiBroker.domain.BrokerData;
import com.andreicosta.apiBroker.domain.BrokerStats;

@Service
public class BrokerStatsService {
	
	public ResponseEntity<BrokerStats> getStats(String code){
		
		try {
			RestTemplate template = new RestTemplate();
			
			UriComponents uri= UriComponentsBuilder.newInstance()
					.scheme("https")
					.host("607732991ed0ae0017d6a9b0.mockapi.io")
					.path("/insurance/v1/brokerData/"+code)
					.build();			
			
			ResponseEntity<BrokerStats> stats = template.getForEntity(uri.toUriString(),BrokerStats.class);
			
			if(stats == null) {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}
		return stats;
		
		}catch (Exception e) {			
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
			
		}
	}
}
