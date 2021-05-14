package com.innervation.order.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.order.ObjectFactory;
import com.example.order.SendOrderRequest;
import com.example.order.SendOrderResponse;
import com.example.order_wsdl.OrderPortType;

@Service
public class InnervationServiceEndpoint implements OrderPortType {

	@Autowired
	OrderBo bo;

	@Override
	public SendOrderResponse sendOrder(SendOrderRequest request) {
		ObjectFactory factory = new ObjectFactory();
		SendOrderResponse response = factory.createSendOrderResponse();
		Orders order = new Orders();
		order.setAmount(request.getAmount());
		order.setDescription(request.getDescription());
		order.setQty(request.getQty());
		
		order.setItemCode(request.getItemCode());
		// TODO Auto-generated method stub
		bo.save(order);
		//pass this to a java bean method
		if("123".equalsIgnoreCase(request.getItemCode())) {
			response.setResponseCode("01");	
			response.setResponseMessage("Out of stock)");
			order.setResponseCode("01");
			bo.save(order);
		}else {
			response.setResponseCode("00");	
			response.setResponseMessage("Success");
			order.setResponseCode("00");
			bo.save(order);
		}
		
		
		
		
		
		return response;
	}

}
