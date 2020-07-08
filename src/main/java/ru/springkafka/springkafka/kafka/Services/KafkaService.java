package ru.springkafka.springkafka.kafka.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;
import ru.springkafka.springkafka.Classes.MicroserviceInfo;
import ru.springkafka.springkafka.kafka.Properties.KafkaProperties;

@Service
public class KafkaService {

	@Autowired
	public KafkaProperties kafkaProperties;
	
	@KafkaListener(topics = "#{kafkaProperties.getInfoTopic()}", groupId ="#{kafkaProperties.getInfoTopicGroup1()}")
    public void consume(String message) {
		
        System.out.println("message: " + message);
    }
	 
	 
	@KafkaListener(topics = "#{kafkaProperties.getInfoTopic()}", groupId ="#{kafkaProperties.getInfoTopicGroup1()}",containerFactory = "microserviceInfoListenerFactory")
    public void consumeMicroserviceInfo(MicroserviceInfo info) {
        System.out.println("Consumed message: " + info.toString());
    }
}
