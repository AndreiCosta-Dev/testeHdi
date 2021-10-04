package com.andreicosta.apiBroker.resources;

import java.util.ArrayList;
import java.util.List;

import com.andreicosta.apiBroker.services.BrokerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.andreicosta.apiBroker.domain.Broker;

@RestController
@RequestMapping(value = "/broker/{document}/", method = RequestMethod.GET)
public class BrokerResources {

	@Autowired
	BrokerService brokerService;

	@GetMapping("/")
	public ResponseEntity<Broker> listar(@PathVariable String document) {
		ResponseEntity broker = brokerService.buscar(document);

		return broker;
	}

}
