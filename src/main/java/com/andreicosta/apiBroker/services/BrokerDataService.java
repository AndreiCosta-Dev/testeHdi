package com.andreicosta.apiBroker.services;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

import com.andreicosta.apiBroker.domain.BrokerData;

@Service
public class BrokerDataService {


	public ResponseEntity<BrokerData> buscaBrokerData(String document) {
		
		try {
			RestTemplate template = new RestTemplate();

			UriComponents uri= UriComponentsBuilder.newInstance()
					.scheme("https")
					.host("607732991ed0ae0017d6a9b0.mockapi.io")
					.path("/insurance/v1/broker/"+document)
					.build();					

			ResponseEntity<BrokerData> broker = template.getForEntity(uri.toUriString(),BrokerData.class);
		
			if(broker == null) {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}
		return broker;
		
		}catch (Exception e) {			
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
			
		}

	}


}
