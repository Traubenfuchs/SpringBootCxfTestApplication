package at.loup.cxftest.config;

import javax.xml.ws.Endpoint;

import org.apache.cxf.Bus;
import org.apache.cxf.jaxws.EndpointImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import at.loup.cxftest.services.soapservices.HelloService;

@Configuration
public class CxfConfig {
	@Autowired
	private Bus bus;
	@Autowired
	private HelloService serviceImpl;

	@Bean
	public Endpoint endpoint() {
		EndpointImpl endpoint = new EndpointImpl(bus, serviceImpl);
		endpoint.publish("/hello");
		return endpoint;
	}
}