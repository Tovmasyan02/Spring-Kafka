package ru.springkafka.springkafka.Classes;

public class MicroserviceInfo  {

	private String microserviceName;
	private String ip;
	private Long port;
	
	
	public MicroserviceInfo() { super();}
	
	public MicroserviceInfo(String microserviceName, String ip, Long port) {
		super();
		this.microserviceName = microserviceName;
		this.ip = ip;
		this.port = port;
	}
	
	
	public String getMicroserviceName() {
		return microserviceName;
	}
	public void setMicroserviceName(String microserviceName) {
		this.microserviceName = microserviceName;
	}
	public String getIp() {
		return ip;
	}
	public void setIp(String ip) {
		this.ip = ip;
	}
	public Long getPort() {
		return port;
	}
	public void setPort(Long port) {
		this.port = port;
	}
	
	
}
