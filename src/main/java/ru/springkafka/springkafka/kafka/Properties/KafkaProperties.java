package ru.springkafka.springkafka.kafka.Properties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;


@Component
@ConfigurationProperties(prefix="kafka")
public class KafkaProperties {

	private String bootstrapServers;
	private String infoTopic;
	private String infoTopicGroup1;
	public String getBootstrapServers() {
		return bootstrapServers;
	}
	public void setBootstrapServers(String bootstrapServers) {
		this.bootstrapServers = bootstrapServers;
	}
	public String getInfoTopic() {
		return infoTopic;
	}
	public void setInfoTopic(String infoTopic) {
		this.infoTopic = infoTopic;
	}
	public String getInfoTopicGroup1() {
		return infoTopicGroup1;
	}
	public void setInfoTopicGroup1(String infoTopicGroup1) {
		this.infoTopicGroup1 = infoTopicGroup1;
	}
	
	
	
}
