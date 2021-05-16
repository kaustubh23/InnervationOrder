package com.innervation.order.testconfig;

import javax.xml.ws.Endpoint;

import org.apache.cxf.Bus;
import org.apache.cxf.bus.spring.SpringBus;
import org.apache.cxf.ext.logging.LoggingFeature;
import org.apache.cxf.jaxws.EndpointImpl;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.example.order.ObjectFactory;
import com.innervation.order.service.InnervationServiceEndpoint;

@Configuration
@ComponentScan("com.blog.demo.service")
public class TestConfig {

	private static final String SERVICE_URL = "http://localhost:8080/soap-api/service/order";
	
	@Bean("objectFactory")
	public ObjectFactory orderServiceClient() {

		JaxWsProxyFactoryBean jaxWsProxyFactoryBean = new JaxWsProxyFactoryBean();
		jaxWsProxyFactoryBean.setServiceClass(ObjectFactory.class);
		jaxWsProxyFactoryBean.setAddress(SERVICE_URL);		    
		return (ObjectFactory) jaxWsProxyFactoryBean.create();
	}
	
	@Bean(name=Bus.DEFAULT_BUS_ID)
	public SpringBus springBus(LoggingFeature loggingFeature) {
		
		SpringBus bus = new  SpringBus();
		bus.getFeatures().add(loggingFeature);
		
		return bus;
	}

	@Bean
	public LoggingFeature loggingFeature() {
		
		LoggingFeature loggingFeature = new LoggingFeature();
		loggingFeature.setPrettyLogging(true);
		
		return loggingFeature;
	}
	
	@Bean
	public Endpoint endpoint(Bus bus, LoggingFeature loggingFeature, InnervationServiceEndpoint innervationServiceEndpoint) {
		
		EndpointImpl endpoint = new EndpointImpl(bus, innervationServiceEndpoint);
		endpoint.publish(SERVICE_URL);
		
		return endpoint;
	}
	
}