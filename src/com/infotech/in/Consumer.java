package com.infotech.in;

import java.util.HashMap;
import java.util.Map;

public class Consumer {

	private Integer conId;
	private String conName;
	private String conAddress;
	private Long conPhoneNumber;

	private Map<Integer, Customer> customer = new HashMap<>();

	public Consumer() {
		super();
		// TODO Auto-generated constructor stub
		System.out.println("*****************************");
		System.out.println("This is Consumer class constructor");
		System.out.println("Why i used super constructor::Why i am calling super()");
		System.out.println("WHY I AM CALLING OBJECT CALLS,,IS OBJECT CLASS METHODS SHOULD ALL BE OVERRIDE");
		System.out.println("*****************************");
	}

	public Consumer(Integer conId, String conName, String conAddress, Long conPhoneNumber,
			Map<Integer, Customer> customer) {
		super();
		this.conId = conId;
		this.conName = conName;
		this.conAddress = conAddress;
		this.conPhoneNumber = conPhoneNumber;
		this.customer = customer;
	}

	public Integer getConId() {
		return conId;
	}

	public void setConId(Integer conId) {
		this.conId = conId;
	}

	public String getConName() {
		return conName;
	}

	public void setConName(String conName) {
		this.conName = conName;
	}

	public String getConAddress() {
		return conAddress;
	}

	public void setConAddress(String conAddress) {
		this.conAddress = conAddress;
	}

	public Long getConPhoneNumber() {
		return conPhoneNumber;
	}

	public void setConPhoneNumber(Long conPhoneNumber) {
		this.conPhoneNumber = conPhoneNumber;
	}

	public Map<Integer, Customer> getCustomer() {
		return customer;
	}

	public void setCustomer(Map<Integer, Customer> customer) {
		this.customer = customer;
	}

	@Override
	public String toString() {
		return "Consumer [conId=" + conId + ", conName=" + conName + ", conAddress=" + conAddress + ", conPhoneNumber="
				+ conPhoneNumber + ", customer=" + customer + "]";
	}

}
