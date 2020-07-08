package ru.springkafka.springkafka.kafka.Config;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.PostConstruct;

import org.apache.kafka.clients.admin.AdminClientConfig;
import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.core.KafkaAdmin;

import ru.springkafka.springkafka.kafka.Properties.KafkaProperties;

@Configuration
@ConfigurationProperties(prefix="kafka")
public class KafkaConfig {

	@Autowired
	private KafkaProperties kafkaProperties;
	
    @Bean
    public KafkaAdmin kafkaAdmin() {
        Map<String, Object> configs = new HashMap<>();
        configs.put(AdminClientConfig.BOOTSTRAP_SERVERS_CONFIG, this.kafkaProperties.getBootstrapServers());
        return new KafkaAdmin(configs);
    }
     
    @Bean
    public NewTopic createTopic() {
         return new NewTopic(this.kafkaProperties.getInfoTopic(), 2, (short) 1);
    }
    

}
	