package com.optum.provider;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/kafka")
public class KafkaController {
	
	@Autowired
	KafkaTemplate<String, String> kafkaTemplate;
	private static final String TOPIC = "CRED_TEST_V2";
	
	
	@GetMapping("/publish/{message}")
	public String post(@PathVariable String message)
	{
		kafkaTemplate.send(TOPIC,message);
		return "Messge Posted";
	}

}
