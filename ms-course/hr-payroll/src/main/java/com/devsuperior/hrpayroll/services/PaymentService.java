package com.devsuperior.hrpayroll.services;

//import java.util.HashMap;
//import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.devsuperior.hrpayroll.entities.Payment;
import com.devsuperior.hrpayroll.entities.Worker;
import com.devsuperior.hrpayroll.feignclients.WorkerFeignClient;

@Service
public class PaymentService {

	@Autowired
	private WorkerFeignClient workerFeignClient;

//	@Value("${hr-worker.host}")
//	private String workerHost;

//	@Autowired
//	private RestTemplate restTemplate;

	public Payment getPayment(long workerId, int days) {

		Worker worker = workerFeignClient.findById(workerId).getBody();
		return new Payment(worker.getName(), worker.getDailyIncome(), days);
		
//		return new Payment("Maria Luiza", 200.0, days);

//		Map<String, String> uriVariables = new HashMap<>();
//		uriVariables.put("id", "" + workerId);

//		Worker worker = restTemplate.getForObject(workerHost + "/workers/{id}", Worker.class, uriVariables);
//		return new Payment(worker.getName(), worker.getDailyIncome(), days);
	}
}
