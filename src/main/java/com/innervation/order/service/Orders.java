package com.innervation.order.service;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="orders")
public class Orders {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private String orderNumber; 
	private String itemCode;
	private String	description;
	private String qty;
	private String amount;
	private String responseCode;
	public String getOrderNumber() {
		return orderNumber;
	}
	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
	}
	public String getItemCode() {
		return itemCode;
	}
	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getQty() {
		return qty;
	}
	public void setQty(String qty) {
		this.qty = qty;
	}
	public String getAmount() {
		return amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}
	public String getResponseCode() {
		return responseCode;
	}
	public void setResponseCode(String responseCode) {
		this.responseCode = responseCode;
	}
	@Override
	public String toString() {
		return "Orders [orderNumber=" + orderNumber + ", itemCode=" + itemCode + ", description=" + description
				+ ", qty=" + qty + ", amount=" + amount + ", responseCode=" + responseCode + "]";
	}

	
}
