package com.innervation.order.test;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.aspectj.lang.annotation.Before;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.example.order.ObjectFactory;
import com.example.order.SendOrderRequest;
import com.example.order.SendOrderResponse;
import com.innervation.order.service.InnervationServiceEndpoint;
import com.innervation.order.testconfig.TestConfig;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { TestConfig.class })
public class OrderServiceEndpointTest {

	@Autowired
	@Qualifier("objectFactory")
	private ObjectFactory objectFactory;
	
	@Test
	public void testGetOrdrDetails() throws Exception {

		SendOrderRequest sendOrderRequest = new SendOrderRequest();
		ObjectFactory objectFactory = new ObjectFactory();
		sendOrderRequest = objectFactory.createSendOrderRequest();
		sendOrderRequest.setAmount("200");
		sendOrderRequest.setDescription("test");
		sendOrderRequest.setItemCode("232");
		sendOrderRequest.setOrderNumber("1246");
		sendOrderRequest.setQty("10");

		InnervationServiceEndpoint endpoint = new InnervationServiceEndpoint();
		SendOrderResponse response = endpoint.sendOrder(sendOrderRequest);
		assertTrue(response.getResponseCode().equals("00"));
		assertTrue(response.getResponseMessage().equals("Success"));
	}

}