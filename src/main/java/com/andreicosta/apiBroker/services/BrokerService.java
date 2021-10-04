package com.andreicosta.apiBroker.services;

import com.andreicosta.apiBroker.domain.BrokerData;
import com.andreicosta.apiBroker.domain.BrokerStats;
import com.andreicosta.apiBroker.domain.ErrorMenssage;
import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.andreicosta.apiBroker.domain.Broker;


@Service
public class BrokerService {

	@Autowired
	private BrokerDataService brokerDataService;

	@Autowired
	private BrokerStatsService brokerStatsService;

	private Broker broker;

	public ResponseEntity<Broker> buscar(String documento) {


			ResponseEntity<BrokerData> dadosCorretor = brokerDataService.buscaBrokerData(documento);
			String code = dadosCorretor.getBody().getCode();
			ResponseEntity<BrokerStats> statusCorretor = brokerStatsService.getStats(code);

			if (statusCorretor.getBody().getActive().equals(true)) {
				String name = dadosCorretor.getBody().getName();
				String document = dadosCorretor.getBody().getDocument();
				String codeBroker = dadosCorretor.getBody().getCode();
				String createDate = dadosCorretor.getBody().getCreateDate();
				Double commissionRate = statusCorretor.getBody().getCommissionRate();
				Boolean active = statusCorretor.getBody().getActive();
				Broker broker = new Broker(name, document, codeBroker, createDate, commissionRate, active);

				return ResponseEntity.ok().body(broker);

			}return null;
	}
}
